package com.northcoders.drinksapi.controller;


import org.json.JSONObject;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "Welcome to the Drinks API!";
    }



    }

