package com.jshsb.sm.DAO;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.jshsb.sm.api.Student;
import com.jshsb.sm.rowMapper.StudentRowMapper;

@Repository
public class StudentDAOImpl implements StudentDAO{
	
	JdbcTemplate jdbcTemplate;

	@Override
	public List<Student> loadStudents() {
		String sql="select * from student";
		jdbcTemplate.query(sql, new StudentRowMapper());
		return null;
	}

}
