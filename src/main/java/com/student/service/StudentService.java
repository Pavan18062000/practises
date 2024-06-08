package com.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.dao.StudentDao;
import com.student.model.Student;

@Service("studentService")
public class StudentService {
	@Autowired
	StudentDao studentDao;

	public Student addStudent(Student student) {
		return studentDao.addStudent(student);
	}

	public List<Student> getAllStudent(){
		return studentDao.getAllStudent();
	}

}
