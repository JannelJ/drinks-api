package com.northcoders.drinksapi.controller;

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
    public Map<String, Object> coffee(@RequestParam(value = "name", defaultValue = "latte") String name) {
        lastId++;
        Map<String, Object> expectedValue = new HashMap<>();
        expectedValue.put("id", lastId);
        expectedValue.put("name", name);
        return expectedValue;

    }
}
