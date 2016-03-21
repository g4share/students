package com.endava.internship.student;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

import com.endava.internship.db.ConectionDB;
import com.endava.internship.db.StudentStorageDB;

public class TestStudent {
	private ConectionDB conn;
	private StudentStore storage = new StudentStorageDB(conn);
	
	@Test
	public void testAdd() throws Exception{
		/*Student student = new Student(1);
		storage.add(student);
		List<Student> st = new ArrayList<>();
		st = storage.getStudents();
		assertEquals(st.size(), 1);*/
	}
		
	@Test
	public void testGetStudent(){
		/*Student studentA = storage.getStudent(2);
		Student studentB = new Student(2);
		studentB.setFirstName("Charlie");
		studentB.setLastName("Weasley");
		studentB.setSpeciality("MA");
		assertEquals(studentA, studentB);*/
	}
	
	@Test
	public void testGetUnexistingStudent(){
		/*Student studentA = storage.getStudent(-1);
		assertNull(studentA);*/
	}
	
	@Test
	public void testRemove() throws Exception{
		/*Student student = new Student(1);
		storage.add(student);
		Student studentA = new Student(1);
		storage.remove(studentA);
		List<Student> st = storage.getStudents();
		assertEquals(st.size(), 3);*/
	}
}
