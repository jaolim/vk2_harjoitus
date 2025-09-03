package com.example.vk2_harjoitus.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String returnHome() {
        return "home";
    }

}
