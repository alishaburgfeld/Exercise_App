package com.allyoucanexercise.Exercise_App.service;

import java.util.List;

import com.javainuse.model.Exercise

public interface ExerciseService {
	List<Exercise> getAllExercises();
	void insertExercise(Exercise exercise);
}