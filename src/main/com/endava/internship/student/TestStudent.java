package com.endava.internship.student;

import static org.junit.Assert.*;
import java.util.List;
import org.junit.Test;

public class TestStudent {
	Student student = new Student(1);
	Student student1 = new Student(1);
	StudentStorage storage = new StudentStorage();
	List<Student> st = storage.getStudents();
	
	@Test
	public void testAdd(){
		storage.add(student);
		storage.add(student1);
		assertEquals(st.size(), 2);
	}
		
	@Test
	public void testAdd1(){
		student.setFirstName("John");
		student.setLastName("Crickk");
		student.setSpeciality("IA");
		student1.setFirstName("John");
		student1.setLastName("Crick");
		student1.setSpeciality("IA");
		student.equals(student1);
		assertEquals(student, student1);
	}
	
	@Test
	public void testRemove(){
		storage.add(student);
		Student studentA = new Student(1);
		storage.remove(studentA);
		assertEquals(st.size(), 0);
	}
		
}
