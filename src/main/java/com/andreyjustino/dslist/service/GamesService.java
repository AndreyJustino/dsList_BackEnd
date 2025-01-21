package com.andreyjustino.dslist.service;

import com.andreyjustino.dslist.dto.GamesMinDto;
import com.andreyjustino.dslist.entities.Games;
import com.andreyjustino.dslist.repositories.GamesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GamesService {

    @Autowired
    private GamesRepository gamesRepository;

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
}
