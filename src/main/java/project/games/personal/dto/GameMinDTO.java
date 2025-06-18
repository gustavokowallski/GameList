package project.games.personal.dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import project.games.personal.entities.Games;
import project.games.personal.projections.GameMinProjection;

public class GameMinDTO {


    private Long id;

    private String title;

    private Integer year;

    private String imgUrl;

    private String shortDescription;

    public GameMinDTO(){

    }

    public GameMinDTO(Games entity) {
        this.id = entity.getId();
        this.shortDescription = entity.getShortDescription();
        this.imgUrl = entity.getImgUrl();
        this.year = entity.getYear();
        this.title = entity.getTitle();
    }
    public GameMinDTO(GameMinProjection projection) {
        this.id = projection.getId();
        this.shortDescription = projection.getShortDescription();
        this.imgUrl = projection.getImgUrl();
        this.year = projection.getGameYear();
        this.title = projection.getTitle();

    }

    public Long getId() {
        return id;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public Integer getYear() {
        return year;
    }

    public String getTitle() {
        return title;
    }
}
