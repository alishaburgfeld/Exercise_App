package com.allyoucanexercise.Exercise_App.dao;

import java.util.List;

import com.javainuse.model.Exercise

public interface ExerciseDao {
	List<Exercise> getAllExercises();
	void insertExercise(Exercise Exercise);
}