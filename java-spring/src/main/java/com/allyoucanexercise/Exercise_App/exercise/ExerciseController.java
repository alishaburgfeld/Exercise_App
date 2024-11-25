package com.allyoucanexercise.Exercise_App.exercise;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.allyoucanexercise.Exercise_App.exercise.ExerciseModel;
// import com.allyoucanexercise.Exercise_App.repository.ExerciseRepository;

@RestController
@CrossOrigin(origins = "http://localhost:3000/")
@RequestMapping("/api")
public class ExerciseController {
	
	// @Autowired
	// private ExerciseRepository ExerciseRepository;
	
	@GetMapping("/exercises")
	public Iterable<Exercise> Exercise () {
		return ExerciseRepository.findAll();
	}
	

}