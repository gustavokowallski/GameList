package project.games.personal.dto.security;

import jakarta.validation.constraints.NotBlank;

import java.io.Serializable;

public class AccountCredentialsDTO implements Serializable {
    @NotBlank(message = "Email cant be null")
    private String email;
    @NotBlank(message = "Password cant be null")
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
