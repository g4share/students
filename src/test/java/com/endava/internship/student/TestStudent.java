package com.endava.internship.student;

import static org.junit.Assert.*;
import java.util.List;
import org.junit.Test;

public class TestStudent {
	private StudentStorage storage = new StudentStorage();
	
	@Test
	public void testAdd(){
		Student student = new Student(1);
		storage.add(student);
		List<Student> st = storage.getStudents();
		assertEquals(st.size(), 4);
	}
		
	@Test
	public void testGetStudent(){
		Student studentA = storage.getStudent(2);
		Student studentB = new Student(2);
		studentB.setFirstName("Charlie");
		studentB.setLastName("Weasley");
		studentB.setSpeciality("MA");
		assertEquals(studentA, studentB);
	}
	
	@Test
	public void testGetUnexistingStudent(){
		Student studentA = storage.getStudent(-1);
		assertNull(studentA);
	}
	
	@Test
	public void testRemove(){
		Student student = new Student(1);
		storage.add(student);
		Student studentA = new Student(1);
		storage.remove(studentA);
		List<Student> st = storage.getStudents();
		assertEquals(st.size(), 3);
	}
}
