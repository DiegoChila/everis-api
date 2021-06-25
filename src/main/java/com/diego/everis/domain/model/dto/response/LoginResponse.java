package com.diego.everis.domain.model.dto.response;

import java.util.List;

public class LoginResponse {
    private boolean success;
    private List<String> errors;
    private String token;

    public LoginResponse(boolean success, List<String> errors, String token) {
        this.success = success;
        this.errors = errors;
        this.token = token;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public List<String> getErrors() {
        return errors;
    }

    public void setErrors(List<String> errors) {
        this.errors = errors;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
