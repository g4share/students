package com.endava.internship.service;

import java.util.List;

import com.endava.internship.student.Student;

public class PrintService {
	
	public String getHtml(List<Student> students){
		StringBuilder sb = new StringBuilder();
		sb.append("<html><head><title>TableServlet</title><link href=styles.css rel=stylesheet type=text/css></head><body>");
		addStudent(sb, students);
		sb.append("</body></html>");
		return sb.toString();
	}

	private void addStudent(StringBuilder sb, List<Student> students) {
		if(students == null || students.isEmpty()){
			sb.append("No student found");
			return ;
		}
		sb.append("<table><tr>")
			.append("<th>ID</th><th>First Name</th><th>Last Name</th><th>Speciality</th>")
			.append("</tr>");
		for(Student st : students){
			sb.append("<tr><td>")
				.append(st.getId() + "</td><td>")
				.append(st.getFirstName() + "</td><td>")
				.append(st.getLastName() + "</td><td>") 
				.append(st.getSpeciality() + "</td></tr>");
		}
		sb.append("</table>");
	}
}
