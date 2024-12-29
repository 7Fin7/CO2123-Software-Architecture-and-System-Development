package com.example.lab6_ex.controller;

import com.example.lab6_ex.Lab6ExApplication;
import com.example.lab6_ex.model.Exercise;
import com.example.lab6_ex.model.Goal;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 * Created in Exercise F
 */

public class ExerciseValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return Exercise.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Exercise exercise = (Exercise) target;

        for (Goal g : Lab6ExApplication.goalList) {
            for (Exercise e : g.getExercises()) {
                if (e.getId() == exercise.getId()) {
                    errors.rejectValue("id", "", "The ID of the exercise is already taken.");
                }
            }
        }

        if (exercise.getMinutes() < 10 || exercise.getMinutes() > 180) {
            errors.rejectValue("minutes", "", "The number of minutes must be between 10 and 180 (inclusive).");
        }
    }
}
