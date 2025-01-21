package com.andreyjustino.dslist.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Embeddable //Indica que essa classe será usada como uma chave primária embutida (composta)
public class BelongingPK {

    @ManyToOne
    @JoinColumn(name = "game_id")
    private Games games;

    @ManyToOne
    @JoinColumn(name = "list_id")
    private GameList gameList;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        BelongingPK that = (BelongingPK) o;
        return Objects.equals(games, that.games) && Objects.equals(gameList, that.gameList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(games, gameList);
    }
}
