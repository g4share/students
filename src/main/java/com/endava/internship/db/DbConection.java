package com.endava.internship.db;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.endava.internship.PropertyFile;

public class DbConection implements AutoCloseable {
	private Connection conn = null;

	public void init() throws SQLException, ClassNotFoundException, IOException {
		Class.forName("org.mariadb.jdbc.Driver");
		PropertyFile p = new PropertyFile("config.properties");

		conn = DriverManager.getConnection(
				p.getProperty("jdbc.url"), 
				p.getProperty("jdbc.username"),
				p.getProperty("jdbc.password"));
	}

	public void close() throws Exception {
		if (conn != null) {
			conn.close();
			conn = null;
		}
	}

	public Connection getConn() {
		return conn;
	}
}