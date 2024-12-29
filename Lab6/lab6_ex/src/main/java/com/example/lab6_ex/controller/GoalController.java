package com.example.lab6_ex.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.lab6_ex.Lab6ExApplication;
import com.example.lab6_ex.model.Exercise;
import com.example.lab6_ex.model.Goal;

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
    public String updateGoal(@ModelAttribute Goal goal, @RequestParam String exerciseDesc) {

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

