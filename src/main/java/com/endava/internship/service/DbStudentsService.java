package com.endava.internship.service;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.endava.internship.db.DbConection;
import com.endava.internship.model.Student;

public class DbStudentsService implements StudentService {

	private DbConection conn;

	public DbStudentsService(DbConection conn) {
		this.conn = conn;
	}

	public List<Student> getStudents() throws SQLException, ClassNotFoundException {
		CallableStatement pstmt = conn.getConn().prepareCall("{call getStudents()}");
		return getStudents(pstmt);
	}

	public Student getStudent(int id) throws SQLException {
		PreparedStatement pstmt = conn.getConn().prepareStatement("SELECT * FROM studentstorage WHERE id=?");
		pstmt.setInt(1, id);
		List<Student> list = getStudents(pstmt);
		return list == null || list.isEmpty() ? null : list.get(0);
	}

	public List<Student> getStudents(PreparedStatement pstmt) throws SQLException {
		List<Student> list = new ArrayList<>();

		ResultSet rs = null;
		rs = pstmt.executeQuery();

		try {
			while (rs.next()) {
				int id = rs.getInt("id");
				String firstName = rs.getString("firstname");
				String lastName = rs.getString("lastname");
				Student student = new Student(id);
				student.setFirstName(firstName);
				student.setLastName(lastName);
				list.add(student);
			}
		} finally {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	public void add(Student student) {
	}

	public void remove(Student student) {
	}
}
