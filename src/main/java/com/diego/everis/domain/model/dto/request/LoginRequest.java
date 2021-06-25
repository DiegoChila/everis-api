package com.diego.everis.domain.model.dto.request;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class LoginRequest {
    @NotNull(message = "El usuario no puede ser vacío")
    @Size(min = 4, max = 10, message = "El usuario debe contener entre 4 y 10 caracteres")
    private String username;

    @NotNull(message = "La contraseña no puede ser vacía")
    @Size(min = 4, max = 20, message = "La contraseña debe contener entre 8 y 20 caracteres")
    private String password;

    public LoginRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
