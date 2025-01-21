package com.andreyjustino.dslist.repositories;

import com.andreyjustino.dslist.entities.Games;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GamesRepository extends JpaRepository<Games, Long> {
}
