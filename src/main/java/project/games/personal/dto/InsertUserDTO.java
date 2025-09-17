package project.games.personal.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class InsertUserDTO {

    @NotBlank(message = "Name cannot be empty")
    private String name;
    @NotBlank(message = "Email cannot be empty")
    @Email(message = "Invalid Format")
    private String email;
    @NotBlank(message = "Password cannot be empty")
    private String password;

    public InsertUserDTO(){

    }

    public InsertUserDTO( String email, String name, String password) {

        this.email = email;
        this.name = name;
        this.password = password;
    }



    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }


}
