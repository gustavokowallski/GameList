package project.games.personal.entities;

import jakarta.persistence.*;

import java.util.Objects;
@Entity
@Table(name= "tb_game")
public class Games {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    @Column(name="game_year")
    private Integer year;
    private String genre;
    private String platforms;
    private Double score;
    private String imgUrl;
    @Column(columnDefinition = "TEXT")
    private String shortDescription;
    @Column(columnDefinition = "TEXT")
    private String longDescription;


    public Games(){}

    public Games(Long id, String title, Integer year, String genre, Double score, String platforms, String imgUrl, String shortDescription, String longDescription) {

        this.id = id;
        this.title = title;
        this.year = year;
        this.genre = genre;

        this.platforms = platforms;
        this.score = score;
        this.imgUrl = imgUrl;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getGenre() {
        return genre;
    }

    public String getPlatforms() {
        return platforms;
    }

    public Double getScore() {
        return score;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
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
