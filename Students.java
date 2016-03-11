package com.endava.internship.student;

public class Students {
	private String firstName;
	private String lastName;
	private String speciality;
	private int notes[];
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getSpeciality() {
		return speciality;
	}
	
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	
	public int[] getNotes() {
		return notes;
	}
	
	public void setNotes(int[] notes) {
		this.notes = notes;
	}	
}