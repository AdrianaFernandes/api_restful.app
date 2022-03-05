package com.example.api_restful.app.controller;

import com.baseproject.projectswagger.VendedorApi;
import com.baseproject.projectswagger.model.SaveSellerDTO;
import com.baseproject.projectswagger.model.SellerDTO;
import com.baseproject.projectswagger.model.SellerIdDTO;
import com.example.api_restful.app.service.impl.SellerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SellerController implements VendedorApi {

    @Autowired
     private SellerServiceImpl sellerServiceImpl;

    @Override
    public void save(SaveSellerDTO body) {
        ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @Override
    public ResponseEntity<SellerDTO> getSeller() {
        return ResponseEntity.ok(sellerServiceImpl.getSeller());
    }

    @Override
    public ResponseEntity<SellerIdDTO> getVendedorId(Long id) {
        return ResponseEntity.ok(sellerServiceImpl.getSellerId());
    }

}
