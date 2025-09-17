package project.games.personal.dto.security;

import java.io.Serializable;

public class AccountCredentialsDTO implements Serializable {
    private String email;
    private String password;

    public AccountCredentialsDTO(){}

    public AccountCredentialsDTO(String email, String password){
        this.email =email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
