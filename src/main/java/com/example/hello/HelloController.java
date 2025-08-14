package com.example.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/play")
    public String playGame() {
        return "Welcome to the Big Java Game! Let's start your adventure.";
    }
}
