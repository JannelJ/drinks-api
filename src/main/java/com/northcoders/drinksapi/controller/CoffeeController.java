package com.northcoders.drinksapi.controller;

import com.northcoders.drinksapi.model.Coffee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

public class CoffeeController {


    @GetMapping("/coffeelover")
    public String getCoffeeLover() {
        return "I love coffee!";
    }

    private static int lastId = 0;

    @GetMapping("/coffee")
    public Coffee coffee(@RequestParam(value = "name", defaultValue = "latte") String name) {
        lastId++;
        return new Coffee(1, name);

    }
}
