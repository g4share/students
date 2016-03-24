package com.endava.internship.servlet;

import java.util.List;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.endava.internship.db.DbConection;
import com.endava.internship.model.Student;
import com.endava.internship.service.DbStudentsService;
import com.endava.internship.service.PrintService;
import com.endava.internship.service.StudentService;

public class StudentsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private StudentService studentService;

	public void init(ServletConfig config) throws ServletException {
		super.init(config);

		DbConection conn = new DbConection();
		try {
			conn.init();
			studentService = new DbStudentsService(conn);
		} catch (ClassNotFoundException 
				| SQLException 
				| IOException e) {
			e.printStackTrace();
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");

		List<Student> students = null;
		PrintService printService = new PrintService();
		PrintWriter out = response.getWriter();

		try {
			students = studentService.getStudents();
			String html = printService.getHtml(students);
			out.print(html);
		} catch (Exception e) {
			out.print(printService.showException());
		}
	}
}