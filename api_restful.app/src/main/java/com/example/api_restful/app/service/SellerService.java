package com.example.api_restful.app.service;

import com.baseproject.projectswagger.model.ActingDTO;
import com.baseproject.projectswagger.model.SaveSellerDTO;
import com.baseproject.projectswagger.model.SellerDTO;
import com.baseproject.projectswagger.model.SellerIdDTO;

public interface SellerService {

    public void postSaveSeller(SaveSellerDTO body);

    public SellerDTO getSeller();

    public SellerIdDTO getSellerId();

}
