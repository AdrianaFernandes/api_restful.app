package com.example.api_restful.app.entity;

import lombok.Data;
import javax.persistence.*;
import javax.validation.constraints.Pattern;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "Vendedor")
public class VendedorEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(name = "vendedor_seq", sequenceName = "vendedor_seq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "vendedor_seq")
    @Column(name = "id_vendedor")
    private Long id;

    @Column(name="nome")
    private String nome;

    @Column(name="telefone")
    @Pattern(regexp = "\\ \\d{3}\\ \\d{5}-\\d{4}", message="formato XX XXXX-XXXX")
    private String telefone;

    @Column(name="idade")
    private String idade;

    @Column(name="cidade")
    private String cidade;

    @Column(name="estado", length = 2)
    private String estado;

    @Column(name="data_inclusao")
    private LocalDate dataInclusao = LocalDate.now();

    @Column(name="regiao")
    private String regiao;

}
