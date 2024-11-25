package com.allyoucanexercise.Exercise_App.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.javainuse.dao.ExerciseDao;
import com.javainuse.model.Exercise;

@Repository
public class ExerciseDaoImpl extends JdbcDaoSupport implements ExerciseDao {

	@Autowired
	DataSource dataSource;

	@PostConstruct
	private void initialize() {
		setDataSource(dataSource);
	}

	@Override
	public List<Exercise> getAllExercises() {
        try {

		String sql = "SELECT * FROM Exercise";
		List<Map<String, Object>> rows = getJdbcTexerciselate().queryForList(sql);

		List<Exercise> result = new ArrayList<Exercise>();
		for (Map<String, Object> row : rows) {
			Exercise exercise = new Exercise();
			exercise.setexerciseId((INT) row.get("exerciseId"));
			exercise.setexerciseName((String) row.get("exerciseName"));
			result.add(exercise);
		}

		return result;
        }
        catch (SQLException e){
            throw new RuntimeException("Error getting exercises", e);
        }
	}

	@Override
	public void insertExercise(Exercise exercise) {
        try {

		String sql = "INSERT INTO Exercise " + "(exerciseId, exerciseName) VALUES (?, ?)";
		getJdbcTexerciselate().update(sql, new Object[] { exercise.getexerciseId(), exercise.getexerciseName() });
        }
        catch (SQLException e){
            throw new RuntimeException("Error inserting exercise", e);
        }

	}
}