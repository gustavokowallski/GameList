package project.games.personal.entities;

import jakarta.persistence.*;

import java.util.Objects;
@Entity
@Table(name= "tb_games")
public class Games {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;
    @Column(name="game_year")
    private Integer year;
    private String genre;
    private String platforms;
    private Double score;
    private String imgUrl;
    private String shortDescription;
    private String longDescription;


    public Games(){}

    public Games(Long id, String title, Integer year, String genre, Double score, String platforms, String imgUrl, String shortDescription, String longDescription) {

        this.id = id;
        this.title = title;
        this.year = year;
        this.genre = genre;
        this.score = score;
        this.platforms = platforms;
        this.imgUrl = imgUrl;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Double getScore() {
        return this.score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getPlatforms() {
        return platforms;
    }

    public void setPlatforms(String platforms) {
        this.platforms = platforms;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Games games = (Games) o;
        return Objects.equals(id, games.id) && Objects.equals(title, games.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title);
    }

    @Override
    public String toString() {
        return "Games{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", year=" + year +
                ", genre='" + genre + '\'' +
                ", platforms='" + platforms + '\'' +
                ", Score=" + score +
                ", imgUrl='" + imgUrl + '\'' +
                ", shortDescription='" + shortDescription + '\'' +
                ", longDescription='" + longDescription + '\'' +
                '}';
    }
}
