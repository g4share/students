package com.endava.internship.student;

import java.util.List;

public interface StudentStore {
	List<Student> getStudents();
	void add(Student student);	
	void remove(Student student);
	Student getStudent(int id);
}