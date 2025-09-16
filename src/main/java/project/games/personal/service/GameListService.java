package project.games.personal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import project.games.personal.dto.GameListDTO;
import project.games.personal.entities.GameList;
import project.games.personal.exception.ConflictException;
import project.games.personal.projections.GameMinProjection;
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
    @Transactional
    public void movePosition(Long listId, int sourceIndex, int destinationIndex){
        if(sourceIndex == destinationIndex){
            throw new ConflictException("Positions cant be same");
        }

        List<GameMinProjection> list = gameRepository.searchByList(listId);
        GameMinProjection index = list.remove(sourceIndex);
        list.add(destinationIndex, index);

        int min = Math.min(sourceIndex, destinationIndex);
        int max = Math.max(sourceIndex, destinationIndex);

        for (int i = min; i <= max; i++){
            gameListRepository.updateBelongingPosition(listId, list.get(i).getId(), i);
        }
    }



}
