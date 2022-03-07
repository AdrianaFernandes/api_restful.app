package com.example.api_restful.app.service.impl;

import com.baseproject.projectswagger.model.AtuacaoDTO;
import com.example.api_restful.app.repositories.AtuacaoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AtuacaoServiceImpl {

    @Autowired
    private AtuacaoRepository atuacaoRepository;

    Logger log = LoggerFactory.getLogger(VendedorServiceImpl.class);

    @Override
    public void postAtuacao(AtuacaoDTO body){



    }
}
