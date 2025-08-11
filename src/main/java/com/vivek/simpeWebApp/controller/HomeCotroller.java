package com.vivek.simpeWebApp.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeCotroller {

    @RequestMapping("/")
    public String greet(){
        return "welcome to spring booot guys";
    }
    @RequestMapping("/about")
    public String about(){
        return "Ye about page hai guys";
    }
}
