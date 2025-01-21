package com.andreyjustino.dslist.service;

import com.andreyjustino.dslist.dto.GameListDTO;
import com.andreyjustino.dslist.entities.GameList;
import com.andreyjustino.dslist.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {
    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){

        List<GameList> result = this.gameListRepository.findAll();

        return result.stream().map((value) -> {
            return new GameListDTO(value);
        }).toList();
    }
}
