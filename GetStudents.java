package com.endava.internship.student;

public class GetStudents implements StudentStore{
	private int[] student;
	
	GetStudents(){
		student = new int[30];
	}
	
	public int[] getStudents() {
		return student;
	}
	
	public void add(int index){
		if(index > student.length){
			student = new int[index];
		}
		/*for(int i=0; i<student.length; i++){
			student[i]=i;
		}*/
	}
	
	public void remove(int index){
		if(index < student.length){
			student = new int[index];
		}
	}
	
	public void print(){
		for(int i=0; i<student.length; i++){
			System.out.println(student[i]);
		}
	}
	
	public static void main(String[] args){
		GetStudents student = new GetStudents();
		student.getStudents();
		student.add(40);
		student.print();
	}
}