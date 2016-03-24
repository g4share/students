package com.endava.internship.service;

import java.sql.SQLException;
import java.util.List;

import com.endava.internship.model.Student;

public interface StudentService {
	public List<Student> getStudents() throws Exception;
	public void add(Student student);	
	public void remove(Student student);
	public Student getStudent(int id) throws SQLException;
}