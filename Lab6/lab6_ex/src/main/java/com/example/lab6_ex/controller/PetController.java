package com.example.lab6_ex.controller;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.lab6_ex.Lab6ExApplication;
import com.example.lab6_ex.model.Pet;

@Controller
public class PetController {

    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        binder.addValidators(new PetValidator());
    }

    @RequestMapping("/pet")
    public String pet(Model model) {
        model.addAttribute("pet", new Pet());
        model.addAttribute("allSpecies", Lab6ExApplication.species);
        return "pet/form";
    }

    @RequestMapping("/showPet")
    public String showPet(@Valid @ModelAttribute Pet pet, BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("allSpecies", Lab6ExApplication.species);
            return "pet/form";
        }
        return "pet/show";
    }
}
