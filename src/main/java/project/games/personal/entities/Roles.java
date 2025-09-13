package project.games.personal.entities;

public class Roles {
    private Long id;
    private String authorities;

    public Roles(){}

    public Roles(Long id, String authorities) {
        this.id = id;
        this.authorities = authorities;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuthorities() {
        return authorities;
    }

    public void setAuthorities(String authorities) {
        this.authorities = authorities;
    }
}
