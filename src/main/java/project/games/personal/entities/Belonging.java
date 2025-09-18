package project.games.personal.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name = "tb_belonging")
public class Belonging {
    @EmbeddedId
    private BelongPK id = new BelongPK();

    private Integer position;

    public Belonging(Games game, GameList gameList, Integer position) {
        id.setGameList(gameList);
        id.setGame(game);
        this.position = position;
    }

    public BelongPK getId() {
        return id;
    }



    public Integer getPosition() {
        return position;
    }



    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Belonging belonging = (Belonging) o;
        return Objects.equals(id, belonging.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
