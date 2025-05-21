package project.games.personal.controller;

import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import project.games.personal.dto.GameMinDTO;
import project.games.personal.entities.Games;
import project.games.personal.service.GameService;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {
    @Autowired
    private GameService gameService;




    @GetMapping
    public List<GameMinDTO> findAll(){
        return gameService.findAll();

    }
}
