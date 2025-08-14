package com.example.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Welcome to My Java Game!";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello Player!";
    }
}
