package com.endava.internship.student;

import java.sql.SQLException;
import java.util.List;

public interface StudentStore {
	List<Student> getStudents() throws Exception;
	void add(Student student);	
	void remove(Student student);
	Student getStudent(int id) throws SQLException;
}