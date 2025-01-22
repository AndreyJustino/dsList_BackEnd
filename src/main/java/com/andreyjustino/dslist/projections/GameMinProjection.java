package com.andreyjustino.dslist.projections;

public interface GameMinProjection { //apenas metodos getters para aquela consulta

    Long getId();
    String getTitle();
    Integer getGameYear();
    String getImgUrl();
    String getShortDescription();
    Integer getPosition();
}
