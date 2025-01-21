package com.andreyjustino.dslist.controller;

import com.andreyjustino.dslist.service.GamesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/games")
public class GamesController {

    @Autowired
    private GamesService gamesService;

    @GetMapping
    public ResponseEntity<Object> findAllController(){

        return ResponseEntity.ok().body(this.gamesService.findAll());
    }
}
