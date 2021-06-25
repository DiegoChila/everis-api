package com.diego.everis.security.service;

import com.diego.everis.domain.model.dto.request.LoginRequest;
import com.diego.everis.domain.model.dto.response.LoginResponse;
import com.diego.everis.security.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AuthService {
    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private UserDetailService userDetailService;

    public LoginResponse login(LoginRequest loginRequest) {
        if (loginRequest.getUsername().equals("root") && loginRequest.getPassword().equals("Diego123456")) {
            UserDetails userDetails = userDetailService.loadUserByUsername(loginRequest.getUsername());
            String jwt = jwtUtil.generateToken(userDetails);
            return new LoginResponse(true, null, jwt);
        } else {
            List<String> errors = new ArrayList<>();
            errors.add("Credenciales incorrectas");
            return new LoginResponse(false, errors, null);
        }
    }

}
