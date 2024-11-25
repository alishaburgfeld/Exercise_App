package com.allyoucanexercise.Exercise_App.model;

public class Exercise {

    private INT exerciseId;
    private String exerciseName;

    public String getexerciseId() {
        return exerciseId
    }

    public void setexerciseId(INT exerciseId) {
        this.exerciseId= exerciseId;
    }

    public String getexerciseName() {
        return exerciseName
    }

    public void setexerciseName(INT exerciseName) {
        this.exerciseName= exercise;
    }

    @Override
	public String toString() {
		return "Exercise [exerciseId=" + exerciseId + ", exerciseName=" + exerciseName + "]";
	}

}