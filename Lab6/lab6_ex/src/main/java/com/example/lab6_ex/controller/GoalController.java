package com.example.lab6_ex.controller;

import java.util.ArrayList;
import java.util.List;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import com.example.lab6_ex.Lab6ExApplication;
import com.example.lab6_ex.model.Exercise;
import com.example.lab6_ex.model.Goal;

@Controller
public class GoalController {

    // The @InitBinder annotation is used to customize the way data is bound to the model in Spring MVC
    @InitBinder
    // Adds the GoalValidator to the WebDataBinder
    // This ensures that the GoalValidator will automatically validate Goal objects
    protected void initBinder(WebDataBinder binder) {
        binder.addValidators(new GoalValidator());
    }

    /**
     * Stores all goals in the model attribute goals
     *
     * @param model
     * @return
     */
    @GetMapping("/getGoals")
    public String getGoals(Model model) {
        List<Goal> goals = Lab6ExApplication.goalList;

        model.addAttribute("goals", goals);

        return "fitness/listGoals";
    }

    /**
     * Adds a new goal
     *
     * @param goal
     * @param exerciseDesc
     * @return
     */
    @PostMapping("/addGoal")
    public String updateGoal(@Valid @ModelAttribute Goal goal, BindingResult result, @RequestParam String exerciseDesc) {

        if (result.hasErrors()) {   // Check if there are validation errors in the 'goal' object
            return "fitness/goal";  // If there are errors, return to the form page (to allow the user to correct input).
        }

        for (Goal exG : Lab6ExApplication.goalList) {
            if (goal.getId() == exG.getId()) {
                return "fitness/goalExError";
            }
        }

        Exercise exercise = new Exercise();
        exercise.setActivity(exerciseDesc);
        List<Exercise> list = new ArrayList<Exercise>();
        list.add(exercise);
        goal.setExercises(list);

        Lab6ExApplication.goalList.add(goal);

        return "redirect:/";
    }

    @GetMapping("/goal")
    public String goal(Model model) {
        model.addAttribute("goal", new Goal());
        return "fitness/goal";
    }

}

