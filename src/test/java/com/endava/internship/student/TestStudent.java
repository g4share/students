package com.endava.internship.student;

import static org.junit.Assert.*;

import java.io.IOException;
import java.sql.SQLException;
import org.junit.Test;

import com.endava.internship.db.DbConection;
import com.endava.internship.model.Student;
import com.endava.internship.service.DbStudentsService;

public class TestStudent {
	private DbConection conn;
	private DbStudentsService storage;

	@Test
	public void testGetStudent() throws SQLException, ClassNotFoundException, IOException {
		conn = new DbConection();
		conn.init();
		storage = new DbStudentsService(conn);
		Student studentA = storage.getStudent(2);
		Student studentB = new Student(2);
		studentB.setFirstName("Bob");
		studentB.setLastName("Weasley");
		assertEquals(studentA, studentB);
	}

	@Test
	public void testGetUnexistingStudent() throws SQLException, ClassNotFoundException, IOException {
		conn = new DbConection();
		conn.init();
		storage = new DbStudentsService(conn);
		Student studentA = storage.getStudent(-1);
		assertNull(studentA);
	}
}
