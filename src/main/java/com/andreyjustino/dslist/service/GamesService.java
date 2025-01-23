package com.andreyjustino.dslist.service;

import com.andreyjustino.dslist.dto.GameDTO;
import com.andreyjustino.dslist.dto.GamesMinDto;
import com.andreyjustino.dslist.entities.Games;
import com.andreyjustino.dslist.projections.GameMinProjection;
import com.andreyjustino.dslist.repositories.GameListRepository;
import com.andreyjustino.dslist.repositories.GamesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GamesService {

    @Autowired
    private GamesRepository gamesRepository;

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GamesMinDto> findAll(){

       List<Games> listGames = this.gamesRepository.findAll();

        List<GamesMinDto> dto = listGames.stream().map(value -> {

            GamesMinDto gamesMinDto = GamesMinDto.builder()
                    .id(value.getId())
                    .title(value.getTitle())
                    .year(value.getYear())
                    .imgUrl(value.getImgUrl())
                    .shortDescription(value.getShortDescription())
                    .build();

            return gamesMinDto;
        }).toList();

        return dto;
    }

    @Transactional(readOnly = true)
    public GameDTO findId(Long id){
        Games games = this.gamesRepository.findById(id).orElseThrow(() -> {
            throw new IllegalArgumentException("ID não encontrado.");
        });

        return new GameDTO(games);
    }

    @Transactional(readOnly = true)
    public List<GamesMinDto> findListId(Long listId){
        List<GameMinProjection> result = this.gameListRepository.searchByList(listId);

        return result.stream().map(value -> new GamesMinDto(value)).toList();
    }
}
