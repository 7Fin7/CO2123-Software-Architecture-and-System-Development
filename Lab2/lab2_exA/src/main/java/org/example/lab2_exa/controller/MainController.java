package org.example.lab2_exa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    // This annotation maps the HTTP request to the "/greet" URL to this method
    @RequestMapping("/greet")
    public String greetWorld(Model model) {
        // Adds an attribute "name" with the value "World" to the model
        model.addAttribute("name", "World");

        // Returns the name of the view to be rendered (in this case, "greeting")
        return "greeting";
    }
}
