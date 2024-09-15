package com.example.oulhost_backend.repositorio;

import com.example.oulhost_backend.model.Jogador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JogadorRepositorio extends JpaRepository<Jogador, Long> {
}
