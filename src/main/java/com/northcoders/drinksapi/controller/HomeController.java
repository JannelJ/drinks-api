package com.northcoders.drinksapi.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "Welcome to the Drinks API!";
    }

    @GetMapping("/coffeelover")
    public String getCoffeeLover(){
        return "I love coffee!";
    }

}
