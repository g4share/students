package com.endava.internship;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyFile {
	private Properties prop = new Properties();

	public PropertyFile(String resourceName) throws FileNotFoundException, IOException {
		try (InputStream input = this.getClass().getClassLoader().getResourceAsStream(resourceName)) {
			prop.load(input);
		}
	}

	public String getProperty(String propertyName) {
		return prop.getProperty(propertyName);
	}
}