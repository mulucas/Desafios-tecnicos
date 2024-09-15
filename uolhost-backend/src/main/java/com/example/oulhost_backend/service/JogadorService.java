package com.example.oulhost_backend.service;

import com.example.oulhost_backend.dtos.JogadorDTO;
import com.example.oulhost_backend.enums.TipoGrupo;
import com.example.oulhost_backend.infra.CodiNameHandler;
import com.example.oulhost_backend.model.Jogador;
import com.example.oulhost_backend.repositorio.JogadorRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JogadorService {

    @Autowired
    private JogadorRepositorio repository;

    @Autowired
    private CodiNameHandler handler;

    public Jogador criarJogador(JogadorDTO dto) {
        Jogador jogador = new Jogador(dto);
        String codiname = getCodiname(dto.tipoGrupo());
        jogador.setCodiname(codiname);
        return repository.save(jogador);
    }

    private String getCodiname(TipoGrupo tipoGrupo){
        return handler.findCodiName(tipoGrupo);
    }

    public List<Jogador> obterTodosJogadores() {
        return repository.findAll();
    }
}
