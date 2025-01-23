package com.andreyjustino.dslist.controller;

import com.andreyjustino.dslist.dto.ReplacementDTO;
import com.andreyjustino.dslist.dto.GamesMinDto;
import com.andreyjustino.dslist.service.GameListService;
import com.andreyjustino.dslist.service.GamesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/gamesList")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @Autowired
    private GamesService gamesService;

    @GetMapping
    public ResponseEntity<Object> findAll(){
        var result = this.gameListService.findAll();

        return ResponseEntity.status(HttpStatus.OK).body(result);
    }

    @GetMapping("/{listId}/games")
    public ResponseEntity<Object> findListId(@PathVariable Long listId){
        List<GamesMinDto> result = this.gamesService.findListId(listId);

        return ResponseEntity.status(HttpStatus.OK).body(result);
    }

    @PostMapping("/{listId}/replacement")
    public ResponseEntity<Object> replacementList(@PathVariable Long listId, @RequestBody ReplacementDTO replacementDTO){

        gameListService.move(listId, replacementDTO.getSourceIndex(), replacementDTO.getDestinationIndex());

        return ResponseEntity.ok().body("Operação de troca realizada.");
    }
}
