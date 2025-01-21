package com.andreyjustino.dslist.repositories;

import com.andreyjustino.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
