package project.games.personal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
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

    @PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_USER')")
    @GetMapping
    public ResponseEntity<List<GameListDTO>> findAll() {
        List<GameListDTO> result = gameListService.findAll();
        return ResponseEntity.ok(result);
    }

    @PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_USER')")
    @GetMapping(value = "/{listId}/games")
    public ResponseEntity<List<GameMinDTO>> findByList(@PathVariable Long listId) {
        List<GameMinDTO> result = gameService.findByList(listId);
        return ResponseEntity.ok(result);
    }

    @PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_USER')")
    @PostMapping(value = "/{listId}/replacement")
    public ResponseEntity<Void> replacePosition(@PathVariable Long listId, @RequestBody ReplacementDTO source) {
        gameListService.movePosition(listId, source.getSourceIndex(), source.getDestinationIndex());
        return ResponseEntity.noContent().build();
    }


}
