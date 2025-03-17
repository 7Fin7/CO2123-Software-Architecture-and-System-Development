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

    // The @InitBinder annotation is used to customize the way data is bound to the model in Spring MVC
    @InitBinder
    // Adds the PetValidator to the WebDataBinder
    // This ensures that the PetValidator will automatically validate Pet objects
    protected void initBinder(WebDataBinder binder) {
        binder.addValidators(new PetValidator());
    }

    @RequestMapping("/pet")
    public String pet(Model model) {

        model.addAttribute("pet", new Pet());
        model.addAttribute("allSpecies", Lab6ExApplication.species);
        return "pet/form";
    }

    // @Valid: This annotation triggers the validation of the 'pet' object before entering the method.
    // BindingResult result: Holds the result of the validation. If there are validation errors,
    // they will be captured in this object.
    @RequestMapping("/showPet")
    public String showPet(@Valid @ModelAttribute Pet pet, BindingResult result, Model model) {

        if (result.hasErrors()) {  // Check if there are validation errors in the 'pet' object
            model.addAttribute("allSpecies", Lab6ExApplication.species);  // Add a list of species to the model.
            return "pet/form";  // If there are errors, return to the form page (to allow the user to correct input).
        }

        // If there are no errors, proceed to the 'show' page to display the valid 'pet' object.
        return "pet/show";
    }
}
