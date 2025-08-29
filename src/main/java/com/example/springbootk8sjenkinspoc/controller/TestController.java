package com.example.springbootk8sjenkinspoc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/first")
    public String first() {
        return "Endpoint 1";
    }

    @GetMapping("/second")
    public String second() {
        return "Endpoint 2";
    }
    @GetMapping("/third")
    public String third(){
        return "Endpoint 3";
    }
}
