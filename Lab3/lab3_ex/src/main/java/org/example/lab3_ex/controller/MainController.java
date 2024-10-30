package org.example.lab3_ex.controller;

import org.example.lab3_ex.Pet;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;
import java.util.List;

@Controller
public class MainController {

    @RequestMapping("/greeting")
    public String exA(Model model) {
        model.addAttribute("value", "Hello World!");
        return "show";
    }

    @RequestMapping("/greeting/{intro}/{name}")
    public String exB(@PathVariable String intro,
                      @PathVariable String name, Model model) {
        model.addAttribute("intro", intro);
        model.addAttribute("name", name);
        return "show";
    }

    @RequestMapping("/hello")
    public String exC(@RequestParam(value = "name", defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        return "hello";
    }

    @RequestMapping("/greeting/{number}")
    public String exD(@PathVariable int number, Model model) {

        // Initialize an empty string to store the repeated "Hello. " sequence
        String sequence = "";

        // Loop "number" times to build the sequence string by concatenating "Hello. "
        for (int i = 0; i < number; i++) {
            // Concatenate "Hello. " to the sequence on each iteration
            sequence = sequence.concat("Hello. ");
        }
        model.addAttribute("total", sequence);  // Add the repeated string to the model
        // ALTERNATIVE METHOD
        // String repeatedValue = "Hello. ".repeat(number);  // Repeat "Hello. " based on the number
        return "number";
    }

    @RequestMapping("/sum")
    public String exE(@RequestParam("values") List<Integer> values, Model model) {

        // Initialise a variable to store sum
        int sum = 0;

        // Loop through list of values and add to sum
        for (int value: values) {
            sum += value;   // Add each value to total
        }

        // Add calculated sum to total, so can be used in view
        model.addAttribute("sum", sum);

        return "sum";
    }

    @RequestMapping("/myPet/{name}/{species}")
    public String exF(@ModelAttribute Pet pet, Model model) {
        model.addAttribute("pet", pet);
        return "pet";
    }
}
