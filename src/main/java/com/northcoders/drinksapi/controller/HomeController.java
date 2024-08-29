package com.northcoders.drinksapi.controller;


import org.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

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

    @GetMapping("/coffee")
    public Map<String, String> coffee (@RequestParam(value = "name", defaultValue = "latte") String name) {
        Map<String, String> expectedContent = new HashMap<>();
        expectedContent.put("1", "id");
        expectedContent.put("name", name);
        return expectedContent;


    }

}
