package com.example.api_restful.app.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "Vendedor")
public class VendedorIdEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
//    @GeneratedValue(strategy = GeneratedValue.SEQUENCE)
    @Column(name="id")
    private Long id;

    @Column(name="nome")
    private String nome;

    @Column(name="data inclusao")
    private LocalDate dataInclusao = LocalDate.now();

//    @ColumnSA
//    private List<StateDTO> state;
//    @OneToOne
//    private Atuacao regiao;

}
