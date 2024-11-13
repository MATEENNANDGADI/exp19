package com.example.mateen;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping("/")
    public String showit(){
        return "ALLAH HU AKBAR !";
    }
    @GetMapping("/admin")
    public String showitt(){
        return "ALLAH HU AKBAR !!";
    }
    @GetMapping("/user")
    public String showittt(){
        return "ALLAH HU AKBAR !!!";
    }
}

