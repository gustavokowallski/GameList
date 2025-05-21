package project.games.personal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.games.personal.dto.GameMinDTO;
import project.games.personal.entities.Games;
import project.games.personal.repository.GameRepository;

import java.util.ArrayList;
import java.util.List;
//


@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;


    /*public Games createGame(Games game){
        gameRepository.save(game);
        return game;

    }
    public void deleteGame(Long id){
        gameRepository.deleteById(id);

*

     */

    public List<GameMinDTO> findAll() {

        List<Games> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();

    }
}






