package com.example.lab5_ex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @RequestMapping("/greet")   // Maps the "/greet" URL to this method
    public String greet() {
        return "greet/form";    // Returns the view name "greet/form"
    }

    @RequestMapping("/showGreeting")    // Maps the "/showGreeting" URL to this method and expects a "user" parameter
    public String showGreeting(@RequestParam String user, Model model) {
        model.addAttribute("user", user);
        return "greet/show";
    }
}
