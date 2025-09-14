package project.games.personal.dto.security;

import java.io.Serializable;
import java.time.Instant;
import java.util.Date;

public class TokenDTO implements Serializable {

    private String email;
    private Instant createdAt;

    private String token;
    private Instant expiresAt;

    public TokenDTO(){}

    public TokenDTO(String email, String token, Instant createdAt, Instant expiresAt) {
        this.email = email;
        this.token = token;
        this.createdAt = createdAt;
        this.expiresAt = expiresAt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public Instant getExpiresAt() {
        return expiresAt;
    }

    public void setExpiresAt(Instant expiresAt) {
        this.expiresAt = expiresAt;
    }
}
