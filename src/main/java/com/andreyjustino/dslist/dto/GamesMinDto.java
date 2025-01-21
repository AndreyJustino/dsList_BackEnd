package com.andreyjustino.dslist.dto;

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
}
