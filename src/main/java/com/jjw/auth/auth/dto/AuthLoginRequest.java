package com.jjw.auth.auth.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class AuthLoginRequest {

    @NotNull
    private String email;

    @NotNull
    private String password;
}
