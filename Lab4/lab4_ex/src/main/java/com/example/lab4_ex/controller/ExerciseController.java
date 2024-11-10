package com.example.lab4_ex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.lab4_ex.Lab4ExApplication;
import com.example.lab4_ex.model.Exercise;
import com.example.lab4_ex.model.Goal;

@Controller
public class ExerciseController {

    /**
     * This method allows the user to add an exercise to an existing goal
     * by looking up the goal via its ID and adding the provided exercise.
     *
     * @param exercise  The exercise object to be added to the goal (populated from form or request parameters).
     * @param goalId    The ID of the goal to which the exercise should be added (extracted from the request).
     * @return  A view name ("showExercise") to display the updated exercise details.
     */
    @GetMapping("/addExercise") // This method handles HTTP GET requests to the "/addExercise" URL
    public String addMinutes(@ModelAttribute Exercise exercise, @RequestParam Long goalId) {

        // Initialize a variable to hold the goal object
        Goal goal = null;

        // Iterate through all the goals in the static goalList from Lab4ExApplication
        for (Goal g : Lab4ExApplication.goalList) {
            if (g.getId() == goalId) {  // Check if the goal ID matches the one provided in the request
                goal = g;   // Assign the matching goal to the goal variable
                break;  // Exit the loop once the goal is found
            }
        }

        if (goal != null) {  // If a matching goal was found
            goal.getExercises().add(exercise);  // Add the exercise to the exercises list of the goal
            exercise.setGoal(goal);  // Set the goal of the exercise to the found goal
        }

        return "showExercise";
    }

}
