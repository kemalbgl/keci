package com.denemekeci.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

public class Login {
    @GetMapping("/login")
    public String login(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("<h1>Hello %s!</h1>", name);
    }
}
