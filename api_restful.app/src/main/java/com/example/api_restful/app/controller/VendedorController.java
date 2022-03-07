package com.example.api_restful.app.controller;

import com.baseproject.projectswagger.VendedorApi;
import com.baseproject.projectswagger.model.SalvarVendedorDTO;
import com.baseproject.projectswagger.model.VendedorDTO;
import com.baseproject.projectswagger.model.VendedorIdDTO;
import com.example.api_restful.app.service.VendedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VendedorController implements VendedorApi {

    @Autowired
     private VendedorService vendedorService;

    @Override
    public ResponseEntity<Void> salvar(SalvarVendedorDTO body) {
        vendedorService.postSalvarVendedor(body);
        return ResponseEntity.ok().build();
    }

    @Override
    public ResponseEntity<VendedorDTO> getVendedor() {
        return VendedorApi.super.getVendedor();
    }

    @Override
    public ResponseEntity<VendedorIdDTO> getVendedorId(Long id) {

        return VendedorApi.super.getVendedorId(id);
    }


}
