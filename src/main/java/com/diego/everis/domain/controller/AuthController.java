package com.diego.everis.domain.controller;

import com.diego.everis.domain.model.dto.request.LoginRequest;
import com.diego.everis.domain.model.dto.response.LoginResponse;
import com.diego.everis.security.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/auth")
@CrossOrigin(origins = "*")
public class AuthController {
    @Autowired
    private AuthService authService;

    @PostMapping("/login")
    public LoginResponse login(@RequestBody @Valid LoginRequest request, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            List<ObjectError> objectsErrors = bindingResult.getAllErrors();
            List<String> errors = new ArrayList<String>();
            for (ObjectError error: objectsErrors) {
                errors.add(error.getDefaultMessage());
            }
            return new LoginResponse(false, errors, null);
        } else {
            return authService.login(request);
        }
    }
}
