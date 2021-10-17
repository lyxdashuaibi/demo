package com.example.demo.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloworld {
    @RequestMapping(value = "/home")
    public String toHome() {
        return "Home";
    }
}
