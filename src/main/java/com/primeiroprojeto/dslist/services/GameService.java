package com.primeiroprojeto.dslist.services;

// import com.primeiroprojeto.dslist.dto.GameMinDTO;
import com.primeiroprojeto.dslist.dto.GameMinDTO;
import com.primeiroprojeto.dslist.entities.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.primeiroprojeto.dslist.repositories.GameRepository;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }
}
