package com.endava.internship.student;

public class Student {
	private String firstName;
	private String lastName;
	private String speciality;
	private int notes[];
	private int id;
	
	public int getId() {
		return id;
	}

	public Student(int id){
		this.id = id;
	}
	
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
	
	@Override
	public boolean equals(Object obj) {
	    if (obj == null) {
	        return false;
	    }
	    if (!Student.class.isAssignableFrom(obj.getClass())) {
	        return false;
	    }
	    final Student other = (Student) obj;
	    if ((this.firstName == null) ? (other.firstName != null) : !this.firstName.equals(other.firstName)) {
	        return false;
	    }
	    if (this.lastName != other.lastName) {
	        return false;
	    }
	    if (this.id != other.id) {
	        return false;
	    }
	    if (this.speciality != other.speciality) {
	        return false;
	    }
	    return true;
	}
}