package project.games.personal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import project.games.personal.dto.GameDTO;
import project.games.personal.dto.GameMinDTO;
import project.games.personal.entities.Games;
import project.games.personal.projections.GameMinProjection;
import project.games.personal.repository.GameRepository;

import java.util.ArrayList;
import java.util.List;
//


@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
   public GameDTO findById(Long id){
       Games games = gameRepository.findById(id).get();
       return new GameDTO(games);

   }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findByList(Long listid) {

        List<GameMinProjection> result = gameRepository.searchByList(listid);
        return result.stream().map(x -> new GameMinDTO(x)).toList();

    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {

        List<Games> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();

    }
}






