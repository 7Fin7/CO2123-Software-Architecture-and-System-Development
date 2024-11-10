package com.example.lab5_ex.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.lab5_ex.Lab5ExApplication;
import com.example.lab5_ex.model.Exercise;
import com.example.lab5_ex.model.Goal;

@Controller
public class GoalController {

    /**
     * Stores all goals in the model attribute goals
     *
     * @param model
     * @return
     */
    @GetMapping("/getGoals")
    public String getGoals(Model model) {
        List<Goal> goals = Lab5ExApplication.goalList;

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
    public String updateGoal(@ModelAttribute Goal goal, @RequestParam String exerciseDesc) {

        for(Goal g: Lab5ExApplication.goalList) {
            if(goal.getId() != null && goal.getId().equals(g.getId())) {
                return "fitness/goalExError";
            }
        }

        Exercise exercise = new Exercise();
        exercise.setActivity(exerciseDesc);
        List<Exercise> list = new ArrayList<Exercise>();
        list.add(exercise);
        goal.setExercises(list);

        Lab5ExApplication.goalList.add(goal);

        return "redirect:/";
    }

    /**
     * Show a form to create a new goal
     * @param model
     * @return
     */
    @GetMapping("/goal")
    public String goal(Model model) {
        model.addAttribute("goal", new Goal());
        return "fitness/goal";
    }
}
