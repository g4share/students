package com.endava.internship.servlet;

import java.util.List;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.endava.internship.service.PrintService;
import com.endava.internship.student.Student;
import com.endava.internship.student.StudentStorage;

public class TableServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private StudentStorage storage = new StudentStorage();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		response.setContentType("text/html");
		
		List<Student> students = storage.getStudents();
		
		PrintService printService = new PrintService();
		String html = printService.getHtml(students);
		PrintWriter out = response.getWriter();
		out.print(html);
	}
}