package com.example.api_restful.app.entity;

import lombok.Data;
import org.hibernate.annotations.Entity;

import java.io.Serializable;

@Data
@Entity
//@Table(name = "")
public class SellerIdEntity implements Serializable {

//    @id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence_id")
//    @SequenceGenerator(name = "sequence_id", sequenceName = "seq_cli_ref_bancaria", allocationSize=1)
//    @Column(name="id")
    private Long id = null;

//    @Column(name="name")
    private String name;

//    @Column(name="dateIncluded")
    private String dateIncluded;

//    @ColumnSA
//    private List<StateDTO> state;
}
