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
		List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);

		List<Exercise> result = new ArrayList<Exercise>();
		for (Map<String, Object> row : rows) {
			Exercise emp = new Exercise();
			emp.setEmpId((String) row.get("empId"));
			emp.setEmpName((String) row.get("empName"));
			result.add(emp);
		}

		return result;
        }
        catch (SQLException e){
            throw new RuntimeException("Error getting exercises", e);
        }
	}

	@Override
	public void insertExercise(Exercise Exercise) {
        try {

		String sql = "INSERT INTO Exercise " + "(empId, empName) VALUES (?, ?)";
		getJdbcTemplate().update(sql, new Object[] { Exercise.getEmpId(), Exercise.getEmpName() });
        }
        catch (SQLException e){
            throw new RuntimeException("Error inserting exercise", e);
        }

	}
}