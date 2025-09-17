package project.games.personal.dto;

import project.games.personal.projections.GameMinProjection;

public class GameMinDTO {

    private Long id;

    private String title;

    private Integer year;

    private String imgUrl;

    private String shortDescription;

    public GameMinDTO(Long id, String title, Integer year, String imgUrl, String shortDescription){
        this.id = id;
        this.shortDescription = shortDescription;
        this.imgUrl = imgUrl;
        this.year = year;
        this.title = title;
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
