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

import com.endava.internship.db.ConectionDB;
import com.endava.internship.db.StudentStorageDB;
import com.endava.internship.service.PrintService;
import com.endava.internship.student.Student;
import com.endava.internship.student.StudentStore;

public class StudentsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private StudentStore storage;

	public void init(ServletConfig config) throws ServletException {
		super.init(config);

		ConectionDB conn = new ConectionDB();
		try {
			conn.init();
		} catch (ClassNotFoundException | SQLException | IOException e) {
			e.printStackTrace();
			return;
		}
		storage = new StudentStorageDB(conn);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");

		List<Student> students = null;
		PrintService printService = new PrintService();
		PrintWriter out = response.getWriter();

		try {
			students = storage.getStudents();
			String html = printService.getHtml(students);
			out.print(html);
		} catch (Exception e) {
			out.print(printService.showException());

		}
	}
}