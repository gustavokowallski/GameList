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

    public GameDTO(){

    }

    public GameDTO(Long id, String title, String genre, Integer year, String platforms, String imgUrl, Double score, String longDescription, String shortDescription) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.year = year;
        this.platforms = platforms;
        this.imgUrl = imgUrl;
        this.score = score;
        this.longDescription = longDescription;
        this.shortDescription = shortDescription;
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


}
