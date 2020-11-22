package com.tts.computershop.controller;

import com.tts.computershop.domain.ComputerShop;
import com.tts.computershop.domain.Subscriber;
import com.tts.computershop.repository.ComputerShopRepository;
import com.tts.computershop.repository.SubscriberRepository;
import com.tts.computershop.service.ComputerShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller //Specifies that this is the controller
public class ComputerShopController {
    @Autowired//Wires the ComputerShopRepository to this controller
    private ComputerShopRepository repository;
    @Autowired
    private SubscriberRepository subscriberRepository;
    //GetMappings
    @GetMapping(value="/")
    //Since we are going to be grabbing data from the database, we have to use a Model object to add the information from the database into. read more about MVC
    public String index(ComputerShop computerShop, Model model){
        model.addAttribute("quant", repository.findQuantityByProduct("5950X"));
        return "computershop/index";
    }
    @GetMapping(value="/navigation.html")
    public String navigation (ComputerShop computerShop){
        return "computershop/navigation";
    }

    @GetMapping(value="/amdinfo.html")
    public String amdInfo(ComputerShop computerShop){
        return "computershop/amdinfo.html";
    }


}
