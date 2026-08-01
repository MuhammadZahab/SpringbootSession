package com.zahab.spring.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

    @Value("${coach.name}")
    private String name;

    @Value("${team.name}")
    private String teamName;

    @GetMapping("teamInfo")
    public String teamInfo() {
        return "Coach is " + name + ", Team is " + teamName;
    }

    @GetMapping("/")
    public String helloJava() {
        return "Hello Java! I am up";
    }
}
