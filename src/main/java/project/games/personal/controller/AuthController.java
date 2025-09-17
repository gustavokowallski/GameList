package project.games.personal.controller;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.games.personal.dto.security.AccountCredentialsDTO;
import project.games.personal.dto.security.TokenDTO;
import project.games.personal.service.AuthService;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }


    @PostMapping("/login")
    public ResponseEntity<TokenDTO> login(@Valid @RequestBody AccountCredentialsDTO dto) {
        TokenDTO tokenDTO = authService.login(dto);
        return ResponseEntity.ok(tokenDTO);
    }

}

