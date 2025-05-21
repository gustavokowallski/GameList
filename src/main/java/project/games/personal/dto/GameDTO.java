package project.games.personal.dto;

import org.springframework.beans.BeanUtils;
import project.games.personal.entities.Games;

import java.util.Optional;

public class GameDTO {

    private Long id;

    private String title;

    private Integer year;
    private String genre;
    private String platforms;
    private Double score;
    private String imgUrl;
    private String shortDescription;
    private String longDescription;

    public GameDTO(Games game) {
        BeanUtils.copyProperties(game, this);
    }

    public Long getId() {
        return id;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public Double getScore() {
        return score;
    }

    public String getPlatforms() {
        return platforms;
    }

    public String getGenre() {
        return genre;
    }

    public Integer getYear() {
        return year;
    }

    public String getTitle() {
        return title;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public void setPlatforms(String platforms) {
        this.platforms = platforms;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }
}
