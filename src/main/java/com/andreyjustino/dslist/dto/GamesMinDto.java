package com.andreyjustino.dslist.dto;

import com.andreyjustino.dslist.projections.GameMinProjection;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GamesMinDto {
    private Long id;

    private String title;

    private Integer year;

    private String imgUrl;

    private String shortDescription;

    public GamesMinDto(GameMinProjection object){
        id = object.getId();
        title = object.getTitle();
        year = object.getGameYear();
        imgUrl = object.getImgUrl();;
        shortDescription = object.getShortDescription();
    }
}
