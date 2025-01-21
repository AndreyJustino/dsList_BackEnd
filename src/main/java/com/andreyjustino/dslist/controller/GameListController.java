package com.andreyjustino.dslist.controller;

import com.andreyjustino.dslist.service.GameListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gamesList")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @GetMapping
    public ResponseEntity<Object> findAll(){
        var result = this.gameListService.findAll();

        return ResponseEntity.status(HttpStatus.OK).body(result);
    }
}
