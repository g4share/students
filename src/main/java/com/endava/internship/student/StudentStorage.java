package com.endava.internship.student;

import java.util.ArrayList;
import java.util.List;

public class StudentStorage implements StudentStore {
	private List<Student> students = new ArrayList<>();
	
	public StudentStorage(){
		Student studentA = new Student(1);
		studentA.setFirstName("Bob");
		studentA.setLastName("Mackenzie");
		studentA.setSpeciality("IA");
		
		Student studentB = new Student(2);
		studentB.setFirstName("Charlie");
		studentB.setLastName("Weasley");
		studentB.setSpeciality("MA");
		
		Student studentC = new Student(3);
		studentC.setFirstName("Dean");
		studentC.setLastName("Thomas");
		studentC.setSpeciality("MnI");
		
		add(studentA);
		add(studentB);
		add(studentC);
	}
	
	public List<Student> getStudents(){
		return students;
	}
	
	public void add(Student student){
		students.add(student);
	}
	
	public void remove(Student student){
		students.remove(student);
	}

	@Override
	public Student getStudent(int id){
		for(Student student : students){
			if(student.getId() == id){
				return student;
			}
		}
		return null;
	}
}