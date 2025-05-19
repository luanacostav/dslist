package com.primeiroprojeto.dslist.repositories;

import com.primeiroprojeto.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
