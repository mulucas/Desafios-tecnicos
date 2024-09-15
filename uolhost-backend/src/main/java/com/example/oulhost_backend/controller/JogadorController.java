package com.example.oulhost_backend.controller;

import com.example.oulhost_backend.dtos.JogadorDTO;
import com.example.oulhost_backend.model.Jogador;
import com.example.oulhost_backend.service.JogadorService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jogadores")
public class JogadorController {

    @Autowired
    private JogadorService service;

    @PostMapping
    public ResponseEntity<Jogador> criarJogador(@RequestBody @Valid JogadorDTO jogadorDTO){
        Jogador jogador = service.criarJogador(jogadorDTO);
        return new ResponseEntity<>(jogador, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Jogador>> obterTodosOsJogadores(){
        return new ResponseEntity<>(service.obterTodosJogadores(), HttpStatus.OK);
    }

}
