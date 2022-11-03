package com.mjvgames.appmjvgames.services;

import com.mjvgames.appmjvgames.model.Game;
import com.mjvgames.appmjvgames.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GameServices {

    @Autowired
    private GameRepository gameRepository;

    public List<Game> listAll() {
        return gameRepository.findAll();
    }

    public Game gameById(Integer id) {
        Optional<Game> game = gameRepository.findById(id);
        return game.get();
    }

    public Game insert(Game obj) {
        return gameRepository.save(obj);
    }
}
