package com.example.api_restful.app.entity;

import lombok.Data;
import org.hibernate.annotations.Entity;

import java.io.Serializable;

@Data
@Entity
//@Table(name = "")
public class SellerEntity implements Serializable {

//    @Column(name="name")
    private String name;

//    @Column(name="telephones:")
    private String telephones;

//    @Column(name="age")
    private String age;

//    @Column(name="city")
    private String city;

//    @Column(name="state")
    private String state;

//    @Column
//    private List<StateDTO> states = null;


}
