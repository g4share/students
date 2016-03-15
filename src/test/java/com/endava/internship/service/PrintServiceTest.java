package com.endava.internship.service;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.endava.internship.student.Student;
import com.endava.internship.student.StudentStorage;

public class PrintServiceTest {
	private StudentStorage storage = new StudentStorage();
	private List<Student> students = new ArrayList<>();
	private static String v1 = "<html><head><title>TableServlet</title><link href=styles.css rel=stylesheet type=text/css></head><body><table><tr><th>ID</th><th>First Name</th><th>Last Name</th><th>Speciality</th></tr><tr><td>1</td><td>Bob</td><td>Mackenzie</td><td>IA</td></tr><tr><td>2</td><td>Charlie</td><td>Weasley</td><td>MA</td></tr><tr><td>3</td><td>Dean</td><td>Thomas</td><td>MnI</td></tr></table></body></html>";
	private static String v2 = "<html><head><title>TableServlet</title><link href=styles.css rel=stylesheet type=text/css></head><body>No student found</body></html>";

	@Test
	public void getHtmlTest(){
		students = storage.getStudents();
		PrintService printservice = new PrintService();
		String html = printservice.getHtml(students);
		assertEquals(html, v1);
	}
	
	@Test
	public void getHtmlTest1(){
		PrintService printservice = new PrintService();
		String html = printservice.getHtml(new ArrayList<Student>());
		assertEquals(html, v2);
	}
}