package com.student.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.student.model.Student;

public class StudentMapper implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student s=new Student();
		s.setRollNo(rs.getInt("roll_no"));
		s.setName(rs.getString("name"));
		return s;
	}

}
