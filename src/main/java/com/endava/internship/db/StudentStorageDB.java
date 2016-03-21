package com.endava.internship.db;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.endava.internship.student.Student;
import com.endava.internship.student.StudentStore;

public class StudentStorageDB implements StudentStore {

	private ConectionDB conn;

	public StudentStorageDB(ConectionDB conn) {
		this.conn = conn;
	}

	public List<Student> getStudents() throws SQLException, ClassNotFoundException {
		CallableStatement pstmt = conn.getConn().prepareCall("{call getStudents()}");
		return getStudent(pstmt);
	}

	public Student getStudent(int id) throws SQLException {
		PreparedStatement pstmt = conn.getConn().prepareStatement("SELECT * FROM studentstorage WHERE id=?");
		List<Student> list = getStudent(pstmt);
		return list == null || list.isEmpty() ? null : list.get(0);
	}

	public List<Student> getStudent(PreparedStatement pstmt) throws SQLException {
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
