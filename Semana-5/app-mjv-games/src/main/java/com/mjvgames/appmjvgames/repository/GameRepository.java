package com.mjvgames.appmjvgames.repository;

import com.mjvgames.appmjvgames.model.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Integer> {
}
