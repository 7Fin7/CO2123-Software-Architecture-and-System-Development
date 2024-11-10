package com.example.lab4_ex.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.lab4_ex.Lab4ExApplication;
import com.example.lab4_ex.model.Exercise;
import com.example.lab4_ex.model.Goal;

@Controller
public class GoalController {

    /**
     * Retrieves and stores all goals in the model attribute "goals" for display in the view.
     *
     * @param model  The Model object that will hold data for the view layer.
     * @return   The name of the view ("getGoals") that displays the list of goals.
     */
    @GetMapping("/getGoals")    // Maps HTTP GET requests to the "/getGoals" URL to this method
    public String getGoals(Model model) {
        List<Goal> goals = Lab4ExApplication.goalList;   // Get the list of goals from the main application

        model.addAttribute("goals", goals);  // Add the goals list to the model with the attribute name "goals"

        return "getGoals";  // Return the view name that will render the goals
    }

    /**
     * Adds a new goal with an initial exercise description.
     *
     * @param goal  The Goal object populated from form data or request parameters
     * @param exerciseDesc  A description of the initial exercise to add to the new goal.
     * @return  A redirect to the root URL ("/"), which usually reloads the main page or list.
     */
    @GetMapping("addGoal")  // Maps HTTP GET requests to the "/addGoal" URL to this method
    public String updateGoal(@ModelAttribute Goal goal, @RequestParam String exerciseDesc) {

        Exercise exercise = new Exercise(); // Create a new Exercise object
        exercise.setActivity(exerciseDesc);  // Set the activity description for the exercise

        List<Exercise> list = new ArrayList<Exercise>();    // Create a new list to hold exercises
        list.add(exercise);                          // Add the new exercise to the list
        goal.setExercises(list);                     // Associate the exercise list with the new goal

        Lab4ExApplication.goalList.add(goal);   // Add the new goal to the application's goal list

        return "redirect:/";    // Redirect to the root URL, refreshing the page or returning to the main view
    }
}
