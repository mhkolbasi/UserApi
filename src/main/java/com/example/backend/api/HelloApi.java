package com.example.backend.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloApi {

    @GetMapping("/")
    public String welcome(){
        final String message = "Welcome";
        return message;
    }

}
