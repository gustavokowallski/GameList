package project.games.personal.dto.security;

import java.io.Serializable;
import java.util.Date;

public class TokenDTO implements Serializable {

    private String email;
    private Boolean authenticated;
    private Date createdAt;
    private Date expiration;
    private String token;
    private String refreshToken;

    public TokenDTO(String username, boolean b, Date now, Date validity, String acessToken, String refreshToken){}

    public TokenDTO(String email, String refreshToken, String token, Date expiration,
                    Date createdAt, Boolean authenticated) {
        this.email = email;
        this.refreshToken = refreshToken;
        this.token = token;
        this.expiration = expiration;
        this.createdAt = createdAt;
        this.authenticated = authenticated;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getAuthenticated() {
        return authenticated;
    }

    public void setAuthenticated(Boolean authenticated) {
        this.authenticated = authenticated;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getExpiration() {
        return expiration;
    }

    public void setExpiration(Date expiration) {
        this.expiration = expiration;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }
}
