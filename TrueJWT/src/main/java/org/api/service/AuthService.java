package org.api.service;

import lombok.extern.slf4j.Slf4j;
import org.api.dto.Role;
import org.api.dto.SignInRequest;
import org.api.dto.SignUpRequest;
import org.api.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
@Slf4j
public class AuthService {
    @Autowired
    private UserService userService;
    @Autowired
    private JwtService jwtService;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private AuthenticationManager authenticationManager;

    public ResponseEntity<?> signUp(SignUpRequest request) {
        if (!Objects.equals(userService.getByUsername(request.getUsername()), null)) {
            return ResponseEntity.badRequest().body("Пользователь с таким именем уже существует");
        }

        User user = User.builder()
                .username(request.getUsername())
                .email(request.getEmail())
                .password(passwordEncoder.encode(request.getPassword()))
                .role(Role.ROLE_USER)
                .build();

        String signupResult = userService.create(user);

        return ResponseEntity.status(201).body(jwtService.generateToken(user));
    }

    public ResponseEntity<?> signIn(SignInRequest request) {
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
                request.getUsername(),
                request.getPassword()
        ));

        UserDetails user = userService
                .userDetailsService()
                .loadUserByUsername(request.getUsername());

        var jwt = jwtService.generateToken(user);
        return ResponseEntity.status(200).body(jwt);
    }
}
