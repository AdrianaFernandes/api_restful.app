package com.example.api_restful.app.controller;

import com.baseproject.projectswagger.VendedorApi;
import com.baseproject.projectswagger.model.SalvarVendedorDTO;
import com.baseproject.projectswagger.model.VendedorDTO;
import com.baseproject.projectswagger.model.VendedorIdDTO;
import com.example.api_restful.app.service.impl.VendedorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VendedorController implements VendedorApi {

    @Autowired
     private VendedorServiceImpl vendedorServiceImpl;

    @Override
    public void save(SalvarVendedorDTO body) {

        ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @Override
    public ResponseEntity<VendedorDTO> getVendedor() {

        return ResponseEntity.ok(vendedorServiceImpl.getVendedor());
    }

    @Override
    public ResponseEntity<VendedorIdDTO> getVendedorId(Long id) {
        return ResponseEntity.ok(vendedorServiceImpl.getVendedorId());
    }

}
