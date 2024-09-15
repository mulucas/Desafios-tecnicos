package com.example.oulhost_backend.dtos;

import com.example.oulhost_backend.enums.TipoGrupo;

public record JogadorDTO(

        String nome,
        String email,
        String telefone,
        TipoGrupo tipoGrupo
) {
}
