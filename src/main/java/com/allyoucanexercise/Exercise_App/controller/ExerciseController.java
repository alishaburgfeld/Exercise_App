package com.allyoucanexercise.Exercise_App.controller;

public class Exercise {

	private String exerciseId;
	private String exerciseName;

	public String getExerciseId() {
		return exerciseId;
	}

	public void setExerciseId(String exerciseId) {
		this.exerciseId = exerciseId;
	}

	public String getExerciseName() {
		return exerciseName;
	}

	public void setExerciseName(String exerciseName) {
		this.exerciseName = exerciseName;
	}

	@Override
	public String toString() {
		return "Exercise [exerciseId=" + exerciseId + ", exerciseName=" + exerciseName + "]";
	}

}