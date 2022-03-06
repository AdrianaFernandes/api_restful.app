package com.example.api_restful.app.service;

import com.baseproject.projectswagger.model.SalvarVendedorDTO;
import com.baseproject.projectswagger.model.VendedorDTO;
import com.baseproject.projectswagger.model.VendedorIdDTO;

public interface VendedorService {

    public void postSalvarVendedor(SalvarVendedorDTO body);

    public VendedorDTO getVendedor();

    public VendedorIdDTO getVendedorId();

}