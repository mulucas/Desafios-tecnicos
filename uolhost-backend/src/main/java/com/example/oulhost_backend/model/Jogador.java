package com.example.oulhost_backend.model;

import com.example.oulhost_backend.dtos.JogadorDTO;
import com.example.oulhost_backend.enums.TipoGrupo;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Entity(name = "jogadores")
@Table(name = "jogadores")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Jogador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String nome;
    @NotBlank
    private String email;
    private String telefone;
    private String codiname;
    private TipoGrupo tipoGrupo;

    public Jogador(JogadorDTO dto) {
        this.nome = dto.nome();
        this.email = dto.email();
        this.telefone = dto.telefone();
        this.tipoGrupo = dto.tipoGrupo();
    }
}
