package com.andreyjustino.dslist.service;

import com.andreyjustino.dslist.dto.GameListDTO;
import com.andreyjustino.dslist.entities.GameList;
import com.andreyjustino.dslist.projections.GameMinProjection;
import com.andreyjustino.dslist.repositories.GameListRepository;
import com.andreyjustino.dslist.repositories.GamesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {
    @Autowired
    private GameListRepository gameListRepository;

    @Autowired
    private GamesRepository gamesRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){

        List<GameList> result = this.gameListRepository.findAll();

        return result.stream().map((value) -> {
            return new GameListDTO(value);
        }).toList();
    }

    @Transactional
    public void move(Long listId, int sourceIndex, int destinationIndex){
        List<GameMinProjection> list = this.gameListRepository.searchByList(listId);

        GameMinProjection obj = list.remove(sourceIndex);

        list.add(destinationIndex, obj);

        int min = sourceIndex < destinationIndex ? sourceIndex : destinationIndex;
        int max = sourceIndex < destinationIndex ? destinationIndex : sourceIndex;

        for (int i = min; i <= max; i++) {
            gameListRepository.updateBelongingPosition(listId, list.get(i).getId(), i);
        }

    }
}
