package com.example.lab4_ex.model;

// Represents an individual exercise with attributes and methods for setting and retrieving values
public class Exercise {

    private Long id;    // Unique identifier for the exercise
    private int minutes;    // Duration of the exercise in minutes
    private String activity;    // Type or name of the exercise activity
    private Goal goal;  // Reference to the Goal associated with this exercise

    // Getter method for retrieving the activity name or type
    public String getActivity() {
        return activity;
    }

    // Getter method for retrieving the unique identifier
    public Long getId() {
        return id;
    }

    // Getter method for retrieving the duration in minutes
    public int getMinutes() {
        return minutes;
    }

    // Setter method for setting the activity name or type
    public void setActivity(String activity) {
        this.activity = activity;
    }

    // Setter method for setting the unique identifier
    public void setId(Long id) {
        this.id = id;
    }

    // Setter method for setting the duration in minutes
    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    // Getter method for retrieving the associated Goal object
    public Goal getGoal() {
        return goal;
    }

    // Setter method for setting the associated Goal object
    public void setGoal(Goal goal) {
        this.goal = goal;
    }

}

/*
    Fields in the Exercise Class
    The Exercise class has the following fields:
        id: A Long type field, likely serving as a unique identifier for an exercise.
        minutes: An int type field that represents the duration of the exercise in minutes.
        activity: A String that specifies the name or type of activity for the exercise.
        goal: A Goal type field that links each exercise to a specific goal.
 */