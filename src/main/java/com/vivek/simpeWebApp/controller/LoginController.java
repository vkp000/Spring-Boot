package com.vivek.simpeWebApp.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @RequestMapping("/login")
    public String Login(){
        return "Login page bhi chal gaya hai guys ! ! ! !";
    }
}
