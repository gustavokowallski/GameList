package project.games.personal.mapper;

import project.games.personal.dto.GameDTO;
import project.games.personal.dto.GameMinDTO;
import project.games.personal.entities.Games;
import project.games.personal.projections.GameMinProjection;

public class GameMapper {

    public static GameDTO entityToFullDto(Games game){
        return new GameDTO(
                game.getId(),
                game.getTitle(),
                game.getGenre(),
                game.getYear(),
                game.getPlatforms(),
                game.getImgUrl(),
                game.getScore(),
                game.getLongDescription(),
                game.getShortDescription());

    }
    public static GameMinDTO projectionToMinDto(GameMinProjection game){
        return new GameMinDTO(game.getId(),
                game.getTitle(),
                game.getGameYear(),
                game.getImgUrl(),
                game.getShortDescription());
    }
    public static GameMinDTO entityToMinDto(Games game){
        return new GameMinDTO(
                game.getId(),
                game.getTitle(),
                game.getYear(),
                game.getImgUrl(),
                game.getShortDescription());
    }
}
