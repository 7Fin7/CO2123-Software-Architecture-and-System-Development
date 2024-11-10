package com.example.lab4_ex;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.lab4_ex.model.Exercise;
import com.example.lab4_ex.model.Goal;

@SpringBootApplication
public class Lab4ExApplication implements CommandLineRunner {

	/**
	 * Local data storage for goals, where each goal can contain multiple exercises.
	 */
	public static List<Goal> goalList = new ArrayList<>();

	public static void main(String[] args) {
		// Starts the Spring Boot application
		SpringApplication.run(Lab4ExApplication.class, args);
	}

	@Override
	public void run(String... args) {
		// Creates and populates sample data for goals and exercises

		// First Goal: 60 minutes with two exercises (running and walking)
		Goal goal = new Goal();
		goal.setId(Long.valueOf(0));	// Unique ID for Goal 1
		goal.setMinutes(60);	// Sets goal duration to 60 minutes

		List<Exercise> exerciseList = new ArrayList<>();	// List to hold exercises for this goal

		// First Exercise for Goal 1
		Exercise exercise = new Exercise();
		exercise.setId(Long.valueOf(1));	// Unique ID for Exercise 1
		exercise.setActivity("running");	// Activity type
		exercise.setGoal(goal);	// Associates the exercise with Goal 1
		exercise.setMinutes(30);	// Sets exercise duration to 30 minutes
		exerciseList.add(exercise);	// Adds exercise to the list

		// Second Exercise for Goal 1
		exercise = new Exercise();
		exercise.setId(Long.valueOf(2));	// Unique ID for Exercise 2
		exercise.setActivity("walking");	// Activity type
		exercise.setGoal(goal);	// Associates the exercise with Goal 1
		exercise.setMinutes(30);	// Sets exercise duration to 30 minutes
		exerciseList.add(exercise);	// Adds exercise to the list

		// Associates the list of exercises with Goal 1
		goal.setExercises(exerciseList);
		goalList.add(goal);	// Adds Goal 1 to the goal list

		// Second Goal: 30 minutes with one exercise (running)
		goal = new Goal();
		goal.setId(Long.valueOf(3));	// Unique ID for Goal 2
		goal.setMinutes(30);	// Sets goal duration to 30 minutes

		exerciseList = new ArrayList<>();	// New list for Goal 2's exercises

		// Only Exercise for Goal 2
		exercise = new Exercise();
		exercise.setId(Long.valueOf(4));	// Unique ID for Exercise 3
		exercise.setActivity("running");	// Activity type
		exercise.setGoal(goal);	// Associates the exercise with Goal 2
		exercise.setMinutes(30);	// Sets exercise duration to 30 minutes
		exerciseList.add(exercise);	// Adds exercise to the list

		// Associates the list of exercises with Goal 2
		goal.setExercises(exerciseList);
		goalList.add(goal);	// Adds Goal 2 to the goal list

	}
}