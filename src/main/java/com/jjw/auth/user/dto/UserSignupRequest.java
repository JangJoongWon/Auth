package com.jjw.auth.user.dto;

import lombok.Data;

import java.util.Set;

@Data
public class UserSignupRequest {

    private String email;
    private String password;
    private Set<AuthorityDto> authorityDtoSet;
}
