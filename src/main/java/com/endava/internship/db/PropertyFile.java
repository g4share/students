package com.endava.internship.db;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyFile {
	private Properties prop = new Properties();

	public PropertyFile(String fileName) throws FileNotFoundException, IOException {
		try (InputStream input = new FileInputStream(fileName)) {
			prop.load(input);
		}
	}

	public String getProperty(String propertyName) {
		return prop.getProperty(propertyName);
	}
}