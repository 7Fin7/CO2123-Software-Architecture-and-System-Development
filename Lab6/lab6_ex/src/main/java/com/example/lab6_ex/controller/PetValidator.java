package com.example.lab6_ex.controller;

import com.example.lab6_ex.Lab6ExApplication;
import com.example.lab6_ex.model.Pet;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import java.util.Arrays;

public class PetValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return Pet.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        // Exercise A
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "", "Your pet needs a name!");

        Pet pet = (Pet) target;

        // Exercise B
        if (!Arrays.asList(Lab6ExApplication.species).contains(pet.getSpecies())) {
            errors.rejectValue("species", "", "Invalid species");
        }

        // Exercise C
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "food", "", "Your pet needs food");

        // Exercise D
        if (Arrays.asList(Lab6ExApplication.species).contains(pet.getFood())) {
            errors.rejectValue("food", "", "Your pet cannot eat another species!");
        }
    }

}
