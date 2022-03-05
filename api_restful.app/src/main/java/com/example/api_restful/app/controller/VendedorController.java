package com.example.api_restful.app.controller;

import com.baseproject.projectswagger.VendedorApi;
import com.baseproject.projectswagger.model.SaveSellerDTO;
import com.baseproject.projectswagger.model.SellerDTO;
import com.baseproject.projectswagger.model.SellerIdDTO;
import com.example.api_restful.app.service.VendedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VendedorController implements VendedorApi {

    @Autowired
     private VendedorService vendedorService;

    @Override
    public ResponseEntity<SaveSellerDTO> save(SaveSellerDTO body) {
        return ResponseEntity.ok(vendedorService.postSaveSeller());
    }

    @Override
    public ResponseEntity<SellerDTO> getSeller() {
        return ResponseEntity.ok(vendedorService.getSeller());
    }

    @Override
    public ResponseEntity<SellerIdDTO> getVendedorId(Long id) {
        return ResponseEntity.ok(vendedorService.getSellerId());
    }


}
