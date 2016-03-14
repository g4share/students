package com.endava.internship.student;

import java.util.ArrayList;
import java.util.List;

public class GetStudents implements StudentStore{
	private List<Student> students = new ArrayList<>();
		
	public List<Student> getStudents() {
		return students;
	}
	
	public void add(Student student){
		students.add(student);
	}
	
	public void remove(Student student){
		students.remove(student);
	}
}