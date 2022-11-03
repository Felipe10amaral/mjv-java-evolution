package com.mjvgames.appmjvgames.controller;

import com.mjvgames.appmjvgames.model.Game;
import com.mjvgames.appmjvgames.services.GameServices;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    private GameServices gameService;

    @GetMapping
    public ResponseEntity<List<Game>> findAll() {
        List<Game> list = gameService.listAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Game> findById(@PathVariable Integer id) {
        Game game = gameService.gameById(id);
        return ResponseEntity.ok().body(game);
    }

    @PostMapping
    public ResponseEntity<Game> insert(@RequestBody Game game) {
        game = gameService.insert(game);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(game.getId()).toUri();
        return ResponseEntity.created(uri).body(game);
    }
}
