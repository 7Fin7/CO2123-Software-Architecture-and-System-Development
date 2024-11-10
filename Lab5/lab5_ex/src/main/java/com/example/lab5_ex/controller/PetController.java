package com.example.lab5_ex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.lab5_ex.model.Pet;

@Controller
public class PetController {

    @RequestMapping("/pet")
    public String addPet(Model model) {
        model.addAttribute("pet", new Pet());
        return "pet/form";
    }

    @RequestMapping("/showPet")
    public String showGreeting(@ModelAttribute Pet pet) {
        return "pet/show";
    }
}
