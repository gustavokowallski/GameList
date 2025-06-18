package project.games.personal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import project.games.personal.dto.GameListDTO;
import project.games.personal.dto.GameMinDTO;
import project.games.personal.dto.ReplacementDTO;
import project.games.personal.service.GameListService;
import project.games.personal.service.GameService;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
    @Autowired
    private GameListService gameListService;
    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameListDTO> findALl(){
        return gameListService.findAll();

    }

    @GetMapping(value = "/{listId}/games")
    public List<GameMinDTO> findByList(@PathVariable Long listId){
        return gameService.findByList(listId);

    }
    @PostMapping(value = "/{listId}/replacement")
    public void replacePosition(@PathVariable Long listId,@RequestBody ReplacementDTO source){
        gameListService.movePosition(listId, source.getSourceIndex(), source.getDestinationIndex());



    }

}
