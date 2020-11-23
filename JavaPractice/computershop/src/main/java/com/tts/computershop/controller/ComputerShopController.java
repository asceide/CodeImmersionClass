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
import org.springframework.web.bind.annotation.ModelAttribute;
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
    //In addition, if you're going to be using multiple databases and they are going to be accessed, EACH ENTITY MUST BE INCLUDED AS A PARAMETER FOR THE PAGES WHERE THE ENTITY MAY BE ACCESSED FROM
    public String index(Subscriber subscriber, ComputerShop computerShop, Model model){
        model.addAttribute("R75950X", repository.findQuantityByProduct("5950X"));
        model.addAttribute("I910850", repository.findQuantityByProduct("i9-10850"));
        return "computershop/index";
    }
    @GetMapping(value="/index.html")
    public String navigation (Subscriber subscriber, ComputerShop computerShop){
        return "computershop/index";
    }
    @GetMapping(value="/navigation.html")
    public String navigation (ComputerShop computerShop){
        return "computershop/navigation";
    }
    @GetMapping(value="/signupfoot.html")
    public String footer(ComputerShop computerShop){ return "computershop/signupfoot";
    }

    @GetMapping(value="/amdinfo.html")
    public String amdInfo(Subscriber subscriber, ComputerShop computerShop){
        return "computershop/amdinfo.html";
    }

    @GetMapping(value="/intelinfo.html")
    public String intelInfo(Subscriber subscriber, ComputerShop computerShop){return "computershop/intelinfo.html";}
    //A Postmapping for getting information from the forms/etc and sent to the database
    @PostMapping(value="/")
    public String addNewSubscriber(Subscriber subscriber, Model model){
        subscriberRepository.save(new Subscriber(subscriber.getEmail(), subscriber.isAmdNews(), subscriber.isIntelNews())); //A new entry in the databse is added
        model.addAttribute("email", subscriber.getEmail());
        return "computershop/success";
    }


}
