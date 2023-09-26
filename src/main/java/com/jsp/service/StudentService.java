package com.jsp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.dto.Student;
import com.jsp.dao.StudentDao;
@Component
public class StudentService {
	@Autowired
	StudentDao dao;
	public Student saveStudent(Student student) {
		return dao.saveStudent(student);
	}
	
	public Student deleteStudent(int id) {
		return dao.deleteStudent(id);
	}
	
	public Student upadateStudent(Student student) {
		return dao.updateStudent(student);
	}
	
	public Student getById(int id) {
		return dao.getStudentById(id);
	}
	
	public List<Student> getAllStudent(){
		return dao.getAllStudent();
	}
}