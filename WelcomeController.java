package com.example.w2hw1.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class WelcomeController {



    @GetMapping("/hey")
    public String getMessage(){
        return "Hey from spring";
    }

    @GetMapping("/bye")
    public  String getBuy(){
        return "Bye";
    }

    @GetMapping("/check/status")
    public String getCheck() {
        return "Everything OK";
    }

    @GetMapping("/health")
    public String checkS(){
        return "Server health is up and running";
    }

}
