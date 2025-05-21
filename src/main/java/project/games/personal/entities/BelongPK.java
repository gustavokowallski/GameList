package project.games.personal.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.Objects;
//classe auxiliar, para pegar os ids dos objetos relacionados
@Embeddable
public class BelongPK {
    @ManyToOne
    @JoinColumn(name = "list_id")
    private GameList gameList;
    @ManyToOne
    @JoinColumn(name = "game_id")
    private Games game;

    public BelongPK(){

    }

    public BelongPK(GameList gameList, Games game) {
        this.gameList = gameList;
        this.game = game;
    }

    public GameList getGameList() {
        return gameList;
    }

    public void setGameList(GameList gameList) {
        this.gameList = gameList;
    }

    public Games getGame() {
        return game;
    }

    public void setGame(Games game) {
        this.game = game;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        BelongPK belongPK = (BelongPK) o;
        return Objects.equals(gameList, belongPK.gameList) && Objects.equals(game, belongPK.game);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gameList, game);
    }
}

