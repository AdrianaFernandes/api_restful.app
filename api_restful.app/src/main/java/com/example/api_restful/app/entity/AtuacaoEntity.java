package com.example.api_restful.app.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;


@Data
@Entity
@Table(name = "Atuacao")
public class AtuacaoEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="regiao")
    private String regiao;

    @Column(name="estados")
    private List<String> estados;
}
