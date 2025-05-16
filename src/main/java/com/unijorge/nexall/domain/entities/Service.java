package com.unijorge.nexall.domain.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Servico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String descricao;
    private LocalDateTime dataSolicitacao;
    private boolean finalizado;
    private double valor;

    @ManyToOne
    private Usuario cliente;

    @ManyToOne
    private Profissional profissional;
}
