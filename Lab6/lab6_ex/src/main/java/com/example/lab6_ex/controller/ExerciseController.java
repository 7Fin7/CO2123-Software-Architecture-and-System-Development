package com.example.lab6_ex.controller;

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
public class ExerciseController {

    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        binder.addValidators(new ExerciseValidator());
    }

    /**
     * Look up a goal by goalId and add the provided exercise to it
     *
     * @param exercise
     * @param goalId
     * @return
     */
    @RequestMapping(path="/addExercise", method=RequestMethod.POST)
    public String addMinutes(@Valid @ModelAttribute Exercise exercise, BindingResult result,
                             @RequestParam(defaultValue = "-1") Long goalId) {

        // If no goalId is typed, the default value for it is -1 (see above)

        if (result.hasErrors()) {
            return "fitness/exercise";
        }

        Goal goal = null;

        for (Goal g : Lab6ExApplication.goalList) {
            if (g.getId() == goalId) {
                goal = g;
                break;
            }
        }

        if (goal != null) {
            goal.getExercises().add(exercise);
            exercise.setGoal(goal);
        }

        return "fitness/showExercise";
    }

    @RequestMapping("/exercise")
    public String exercise(Model model) {
        model.addAttribute("exercise", new Exercise());
        return "fitness/exercise";
    }

}