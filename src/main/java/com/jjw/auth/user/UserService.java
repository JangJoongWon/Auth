package com.jjw.auth.user;

import com.jjw.auth.user.dto.UserSignupRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public void signup(UserSignupRequest userSignupRequest) {
        String email = userSignupRequest.getEmail();

        if (userRepository.findOneWithAuthoritiesByEmail(email).orElse(null) != null) {
            throw new
        }


    }
}
