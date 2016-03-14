package com.endava.internship.student;

import static org.junit.Assert.*;
import java.util.List;
import org.junit.Test;

public class TestStudent {
	StudentStorage storage = new StudentStorage();
	
	@Test
	public void testAdd(){
		Student student = new Student(1);
		storage.add(student);
		List<Student> st = storage.getStudents();
		assertEquals(st.size(), 1);
	}
		
	@Test
	public void testAdd1(){
		Student student1 = new Student(1);
		Student student2 = new Student(1);
		student1.setFirstName("John");
		student1.setLastName("Crickk");
		student1.setSpeciality("MA");
		student2.setFirstName("John");
		student2.setLastName("Crickk");
		student2.setSpeciality("IA");
		student1.equals(student2);
		assertEquals(student1, student2);
	}
	
	@Test
	public void testRemove(){
		Student student = new Student(1);
		storage.add(student);
		Student studentA = new Student(1);
		storage.remove(studentA);
		List<Student> st = storage.getStudents();
		assertEquals(st.size(), 0);
	}
}
