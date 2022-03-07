package com.example.api_restful.app.entity;

import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Data
@Entity
@Table(name = "Atuacao")
public class AtuacaoEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(name = "atuacao_seq", sequenceName = "atuacao_seq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "atuacao_seq")
    @Column(name = "ID_ATUACAO")
    private Long id;

    @Column(name="regiao")
    private String regiao;

    @Column(name="estado", length = 2)
    private String estado;
}
