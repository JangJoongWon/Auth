package com.jjw.auth.auth;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
@Table(name = "authorities")
public class AuthorityEntity {

    @Id
    @Column(length = 50)
    private String authority;
}
