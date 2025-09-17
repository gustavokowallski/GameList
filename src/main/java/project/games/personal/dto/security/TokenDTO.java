package project.games.personal.dto.security;

import java.io.Serializable;
import java.time.Instant;

public class TokenDTO implements Serializable {

    private String email;
    private Instant createdAt;

    private String token;
    private Instant expiresAt;

    public TokenDTO(){}

    public TokenDTO(String email, String token, Instant expiresAt) {
        this.email = email;
        this.token = token;
        this.createdAt = Instant.now();
        this.expiresAt = expiresAt;
    }

    public String getEmail() {
        return email;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public String getToken() {
        return token;
    }

    public Instant getExpiresAt() {
        return expiresAt;
    }
}
