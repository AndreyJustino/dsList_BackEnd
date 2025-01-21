package com.andreyjustino.dslist.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Entity(name = "tb_belonging")
@NoArgsConstructor
@Data
public class Belonging {

    @EmbeddedId // usada para marcar um atributo de uma entidade como sendo uma chave primária composta.
    private BelongingPK id = new BelongingPK(); //nos da acesso as duas classes que estão aqui

    private Integer position;

    public Belonging(Games games, GameList gameList,Integer position) {
        id.setGames(games);
        id.setGameList(gameList);

        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Belonging belonging = (Belonging) o;
        return Objects.equals(id, belonging.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
