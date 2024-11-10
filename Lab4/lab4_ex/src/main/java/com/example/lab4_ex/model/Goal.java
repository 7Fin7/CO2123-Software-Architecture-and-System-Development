package com.example.lab4_ex.model;

import java.util.ArrayList;
import java.util.List;

// Represents a goal that consists of a specified duration and a list of associated exercises
public class Goal {

    private Long id;    // Unique identifier for the goal
    private int minutes;    // Total time goal in minutes
    private List<Exercise> exercises = new ArrayList<Exercise>();   // List of exercises that are part of this goal

    // Getter method for retrieving the list of exercises
    public List<Exercise> getExercises() {
        return exercises;
    }

    // Getter method for retrieving the unique identifier of the goal
    public Long getId() {
        return id;
    }

    // Getter method for retrieving the total time goal in minutes
    public int getMinutes() {
        return minutes;
    }

    // Setter method for setting the list of exercises
    public void setExercises(List<Exercise> exercises) {
        this.exercises = exercises;
    }

    // Setter method for setting the unique identifier of the goal
    public void setId(Long id) {
        this.id = id;
    }

    // Setter method for setting the total time goal in minutes
    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

}

/*
    Fields in the Goal Class
    The Goal class has the following fields:
        id: A Long type field, likely representing the unique identifier for a goal.
        minutes: An int type field that represents the time associated with the goal.
        exercises: A List<Exercise> that holds multiple Exercise objects associated with this goal.

    Relationship Between Goal and Exercise Classes
    The Goal and Exercise classes have a bidirectional relationship:
        One-to-Many Relationship: A Goal can be associated with multiple Exercise objects, represented
        by the exercises list in the Goal class.
        Many-to-One Relationship: Each Exercise object references a single Goal through the goal field,
        indicating that multiple exercises can belong to the same goal.
 */