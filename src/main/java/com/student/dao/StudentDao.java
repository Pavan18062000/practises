package com.student.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.student.mapper.StudentMapper;
import com.student.model.Student;

@Repository("studentDao")
public class StudentDao {
	@Autowired
	NamedParameterJdbcTemplate jdbcTemplate;
	
	public Student addStudent(Student student) {
		String sql= "insert into student(name,roll_no) values(:name,:rollNo)";
		try {
			Map<String,Object> args=new HashMap<String, Object>();
			args.put("name", student.getName());
			args.put("rollNo", student.getRollNo());
			jdbcTemplate.update(sql, args);
			return student;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
		
	}
	
	public List<Student> getAllStudent(){
		String sql="select * from student";
		return jdbcTemplate.query(sql, new StudentMapper());
	}
}
