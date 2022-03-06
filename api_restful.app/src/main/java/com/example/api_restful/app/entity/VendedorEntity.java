package com.example.api_restful.app.entity;

import lombok.Data;
import javax.persistence.*;
import javax.validation.constraints.Pattern;

import java.io.Serializable;

@Data
@Entity
//@Table(name = "")
public class VendedorEntity implements Serializable {

    private static final long serialVersionUID = 1L;

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

    //    @Column
    //    private List<StateDTO> states = null;
//    @OneToOne
//    private Atuacao regiao;

}
