package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String homePage(){
        return "/home";
    }

    @GetMapping("/c0322g1")
    public String loginPage(){
        return "/myLogin";
    }
}
