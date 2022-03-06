package com.example.api_restful.app.controller;

import com.baseproject.projectswagger.AtuacaoApi;
import com.baseproject.projectswagger.model.AtuacaoDTO;
import com.example.api_restful.app.service.AtuacaoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AtuacaoController implements AtuacaoApi {

    private AtuacaoService atuacaoService;

    @Override
    public ResponseEntity<AtuacaoDTO> atuacao(AtuacaoDTO body) {
        return ResponseEntity.ok(atuacaoService.postAtuacao());
    }
}
