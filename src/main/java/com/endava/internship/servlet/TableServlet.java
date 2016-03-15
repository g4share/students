package com.endava.internship.servlet;

import java.util.List;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.endava.internship.student.Student;
import com.endava.internship.student.StudentStorage;

public class TableServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private StudentStorage storage = new StudentStorage();	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		List<Student> student = storage.getStudents();
		
		out.print("<html><head><title>TableServlet</title><link href=styles.css rel=stylesheet type=text/css></head><body>");
		out.print("<table><tr>");
		out.print("<th>ID</th><th>First Name</th><th>Last Name</th><th>Speciality</th>");
		out.print("</tr>");
		for(Student st : student){
			out.print("<tr><td>" + st.getId() + "</td><td>"
								 + st.getFirstName() + "</td><td>"
								 + st.getLastName() + "</td><td>" 
								 + st.getSpeciality() + "</td></tr>");
		}
		out.print("</table></body></html>");
	}
}
