package ru.polyakov.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting(
            @RequestParam(name = "name", required = false, defaultValue = "World") String name,
            Map<String,Object> model
    ) {
        model.put("name", name);
        return "greeting";
    }

    @GetMapping()
    public  String index (Map <String,Object> model){
        String hello = "Hello";
        model.put("hello",hello);
        return "index";
    }

}