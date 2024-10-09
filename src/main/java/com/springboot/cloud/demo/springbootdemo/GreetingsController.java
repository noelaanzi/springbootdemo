package com.springboot.cloud.demo.springbootdemo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class GreetingsController {

    @GetMapping("/info")
    public String getInfo() {
        return "Welcome to Spring Boot";
    }

}
