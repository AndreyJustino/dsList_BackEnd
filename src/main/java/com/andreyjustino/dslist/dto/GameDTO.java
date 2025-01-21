package com.andreyjustino.dslist.dto;

import com.andreyjustino.dslist.entities.Games;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

@Data
@NoArgsConstructor
public class GameDTO {
    private Long id;

    private String title;

    private Integer year;

    private String genre;

    private String platforms;

    private Double score;

    private String imgUrl;

    private String shortDescription;

    private String longDescription;

    public GameDTO(Games games){
        BeanUtils.copyProperties(games,this);
    }

}
