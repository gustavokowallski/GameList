package project.games.personal.dto;

public class UserDTO {
    private Long id;
    private String name;
    private String email;

    public UserDTO(){

    }

    public UserDTO(Long id, String email, String name) {
        this.id = id;
        this.email = email;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

}
