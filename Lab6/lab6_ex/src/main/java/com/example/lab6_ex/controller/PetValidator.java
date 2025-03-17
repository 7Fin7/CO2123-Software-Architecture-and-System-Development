package com.example.lab6_ex.controller;

import com.example.lab6_ex.Lab6ExApplication;
import com.example.lab6_ex.model.Pet;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import java.util.Arrays;

public class PetValidator implements Validator {

    /**
     * Determines if this validator can validate instances of the given class.
     *
     * @param clazz The class type to check.
     * @return true if the given class is of type Pet, otherwise false.
     */
    @Override
    public boolean supports(Class<?> clazz) {
        return Pet.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        // Exercise A:
        // This line checks if the 'name' field is empty or contains only whitespace.
        // If true, it registers an error with no custom error code (empty string)
        // and the message "Your pet needs a name!".
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "", "Your pet needs a name!");

        // Cast the 'target' object to a Pet. In the context of validation, 'target' is the object being
        // validated (in this case, a 'Pet' object)
        Pet pet = (Pet) target;

        // Exercise B:
        // Check if the 'species' of the pet is in the list of valid species
        if (!Arrays.asList(Lab6ExApplication.species).contains(pet.getSpecies())) {
            errors.rejectValue("species", "", "Invalid species");
        }

        // Exercise C:
        // Validate that the 'food' field is not empty or just whitespace
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "food", "", "Your pet needs food");

        // Exercise D:
        // Check if the 'food' field (the food the pet eats) is the same as a species
        if (Arrays.asList(Lab6ExApplication.species).contains(pet.getFood())) {
            errors.rejectValue("food", "", "Your pet cannot eat another species!");
        }
    }

}
