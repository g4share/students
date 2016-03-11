public class Students {	
	String firstname;
	String lastname;
	String speciality;
	int nrExam;
	double[] notes;
	
	public Students(){
		firstname = "Mihai";
		lastname = "Iftodii";
		nrExam = 9;
		speciality = "Applied Informatics";
		for(int i=0; i<nrExam; i+=3 ){
			notes[i] = 9;
			notes[i+1] = 8;
			notes[i+2] =10;
		}
	}	
	public void set_firstname(String new_firstname){
		firstname = new_firstname;
	}
	public String get_firstname(){
		return firstname;
	}
	public void printInfo(){
		System.out.println("Firstname: " + firstname);
		System.out.println("Lastname: " + lastname);
		System.out.println("Speciality: " + speciality);
		for(int i=0; i<nrExam; i++){
			System.out.println("Note: " + notes[i]);
		}
	}
	public static void main(String[] args) {
		Students student1 = new Students();
		student1.printInfo();
		student1.get_firstname();
		student1.set_firstname("Alexandru");
		student1.printInfo();
	}
}
