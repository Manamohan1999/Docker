package com.example.spring_boot_app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class WebController {
    
    @GetMapping("/hello")
    public String welcome(){
        return "Welcome to my Spring App";
    }
    
}
