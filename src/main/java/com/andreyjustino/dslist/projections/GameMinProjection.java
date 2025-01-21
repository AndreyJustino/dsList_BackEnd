package com.andreyjustino.dslist.projections;

public interface GameMinProjection { //apenas metodos getters para aquela consulta

    Long getId();
    String getTitle();
    Integer getYear();
    String getImgUrl();
    String getShortDescription();
    Integer getPosition();
}
