package com.andreyjustino.dslist.controller;

import com.andreyjustino.dslist.service.GamesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping("/{id}")
    public ResponseEntity<Object> findId(@PathVariable Long id){

        try{
            var result = this.gamesService.findId(id);

            return ResponseEntity.ok().body(result);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }

    }
}
