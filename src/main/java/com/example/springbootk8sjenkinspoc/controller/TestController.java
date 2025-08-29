package com.example.springbootk8sjenkinspoc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/first")
    public String first() {
        return "Hello, World";
    }

    @GetMapping("/second")
    public String second() {
        return "Hello, World";
    }
}
