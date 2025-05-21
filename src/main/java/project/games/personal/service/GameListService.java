package project.games.personal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import project.games.personal.dto.GameDTO;
import project.games.personal.dto.GameListDTO;
import project.games.personal.dto.GameMinDTO;
import project.games.personal.entities.GameList;
import project.games.personal.entities.Games;
import project.games.personal.repository.GameListRepository;
import project.games.personal.repository.GameRepository;

import java.util.List;

@Service
public class GameListService {
    @Autowired
    private GameListRepository gameListRepository;

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(GameListDTO::new).toList();
    }

}
