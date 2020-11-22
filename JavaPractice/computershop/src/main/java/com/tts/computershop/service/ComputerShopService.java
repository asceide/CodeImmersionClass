/*
    Service is optional but you should use it for getting queries.
 */

package com.tts.computershop.service;

import com.tts.computershop.domain.ComputerShop;
import com.tts.computershop.repository.ComputerShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ComputerShopService {
    @Autowired
    ComputerShopRepository repository;

    public List<ComputerShop> getAllInfo(){
        List<ComputerShop> productList= (List<ComputerShop>) repository.findAll();
        if(productList.size()>0){
            return productList;
        }else
            return new ArrayList<ComputerShop>();
    }

}
