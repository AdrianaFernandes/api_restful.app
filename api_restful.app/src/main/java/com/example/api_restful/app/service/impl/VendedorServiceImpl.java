package com.example.api_restful.app.service.impl;

import com.baseproject.projectswagger.model.SalvarVendedorDTO;
import com.baseproject.projectswagger.model.VendedorDTO;
import com.baseproject.projectswagger.model.VendedorIdDTO;
import com.example.api_restful.app.entity.VendedorEntity;
import com.example.api_restful.app.repositories.VendedorRepository;
import com.example.api_restful.app.service.VendedorService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VendedorServiceImpl implements VendedorService {

    @Autowired
    private VendedorRepository vendedorRepository;

    Logger log = LoggerFactory.getLogger(VendedorServiceImpl.class);

    @Override
    public void postSalvarVendedor(SalvarVendedorDTO body) {

        try {
            VendedorEntity vendedorEntity = new VendedorEntity();

            vendedorEntity.setNome(body.getNome());
            vendedorEntity.setTelefone(body.getTelefone());
            vendedorEntity.setIdade(body.getIdade());
            vendedorEntity.setCidade(body.getCidade());
            vendedorEntity.setEstado(body.getEstado());
            vendedorEntity.setRegiao(body.getRegiao());

            vendedorRepository.save(vendedorEntity);
        } catch (Exception e){
            log.error("Não possivel salvar os dados do vendedor");
        }
    }

    @Override
    public VendedorDTO getVendedor() {
        return null;
    }

    @Override
    public VendedorIdDTO getVendedorId() {
        return null;
    }
}
