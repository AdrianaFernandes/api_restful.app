package com.example.api_restful.app.entity;

import com.baseproject.projectswagger.model.StateDTO;
import lombok.Data;
import org.hibernate.annotations.Entity;

import java.io.Serializable;
import java.util.List;


@Data
@Entity
//@Table(name = "")
public class ActingEntity implements Serializable {

//    @Column(name="region")
    private String region;

//    @Column(name="state")
    private List<StateDTO> state;
}
