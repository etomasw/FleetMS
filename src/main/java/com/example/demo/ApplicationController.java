package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {

    @GetMapping("/index")
    public String home() {
        return "index";
    }

    @GetMapping("/widgets")
    public String widgets() {
        return "widgets";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }
}
