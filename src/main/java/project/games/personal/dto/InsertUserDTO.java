package project.games.personal.dto;

public class InsertUserDTO {

    private String name;
    private String email;
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

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
