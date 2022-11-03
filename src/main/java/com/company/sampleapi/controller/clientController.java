package com.company.sampleapi.controller;

import com.company.sampleapi.entity.Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class clientController {

   /* private static final String template = "API REST es retrieving";
    private final AtomicLong counter = new AtomicLong();*/


    @GetMapping("/clients")
    public Client listClients(@RequestParam ( value = "firstname", defaultValue = "Jose") String firstname){
        Date date_var = new Date();

        return  new Client(firstname,"","",date_var);
    }

}
