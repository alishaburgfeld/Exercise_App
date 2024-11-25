package com.allyoucanexercise.Exercise_App.dao;

import java.util.List;

import com.allyoucanexercise.Exercise_App.model.Exercise

public interface ExerciseDao {
	List<Exercise> getAllExercises();
	void insertExercise(Exercise exercise);
}