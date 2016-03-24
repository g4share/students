package com.endava.internship.service;

import static org.junit.Assert.*;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.endava.internship.db.DbConection;
import com.endava.internship.model.Student;

public class PrintServiceTest {
	private DbConection conn;
	private DbStudentsService storage;
	private List<Student> students = new ArrayList<>();
	private static String v1 = "<html><head><title>TableServlet</title><link href=styles.css rel=stylesheet type=text/css></head><body><table><tr><th>ID</th><th>First Name</th><th>Last Name</th></tr><tr><td>1</td><td>John</td><td>Snow</td><td><tr><td>2</td><td>Bob</td><td>Weasley</td><td></table></body></html>";
	private static String v2 = "<html><head><title>TableServlet</title><link href=styles.css rel=stylesheet type=text/css></head><body>No student found</body></html>";

	@Test
	public void getHtmlTest() throws ClassNotFoundException, SQLException, IOException {
		conn = new DbConection();
		conn.init();
		storage = new DbStudentsService(conn);
		students = storage.getStudents();
		PrintService printservice = new PrintService();
		String html = printservice.getHtml(students);
		assertEquals(html, v1);
	}

	@Test
	public void getHtmlTest1() {
		PrintService printservice = new PrintService();
		String html = printservice.getHtml(new ArrayList<Student>());
		assertEquals(html, v2);
	}
}