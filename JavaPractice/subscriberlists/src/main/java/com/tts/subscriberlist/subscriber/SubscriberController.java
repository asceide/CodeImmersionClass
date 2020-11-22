package com.tts.subscriberlist.subscriber;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

//declares that this is the controller
@Controller
public class SubscriberController {
    @Autowired //Adds the SubscriberRepository interface to the controller
    private SubscriberRepository subscriberRepository;
    //This GetMapping annotation is used for the index method, which will return a template called index in the subscriber template directory.
    @GetMapping(value="/")
    public String index(Subscriber subscriber){
        return "subscriber/index";
    }
    //Takes in data from the form and adds it into the database
    private Subscriber subscriber;
    @PostMapping(value="/") //Part of GET/POST, this is the updating part of CRUD
    public String addNewSubscriber(Subscriber subscriber, Model model){
        subscriberRepository.save(new Subscriber(subscriber.getFirstName(),subscriber.getLastName(),subscriber.getUserName(), subscriber.getSignedUp()));
        model.addAttribute("firstName", subscriber.getFirstName());
        model.addAttribute("lastName", subscriber.getLastName());
        model.addAttribute("userName", subscriber.getUserName());
        return "subscriber/result";
    }
}
