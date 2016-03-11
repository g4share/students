public class Students {
	
	private String firstname;
	private String lastname;
	private String speciality;
	private int nrExam;
	private int notes[];
	
public Students(){
	firstname = "Mihai";
	lastname = "Iftodii";
	nrExam = 9;
	speciality = "Applied Informatics";
	notes = new int[nrExam];
	for(int i=0; i<nrExam; i+=3 ){
	notes[i] = 9;
	notes[i+1] = 8;
	notes[i+2] =10;
	}
}	
public void setFirstname(String firstname){
	this.firstname = firstname;
}
public String getFirstname(){
	return firstname;
}
public void setLastname(String lastname){
	this.lastname = lastname;
}
public String getLastname(){
	return lastname;
}
public void setSpeciality(String speciality){
	this.speciality = speciality;
}
public String getSpeciality(){
	return speciality;
}
public void setNrExam(int nrExam){
	if((nrExam > 0) && (nrExam < 9) && (nrExam != this.nrExam)){
	int tmp[]= new int [this.nrExam];
	for(int i=0; i<this.nrExam; i++)
	tmp[i] = notes[i];
	notes= new int[nrExam];
	if(nrExam>this.nrExam)
	for(int i=0; i<this.nrExam;i++)
	notes[i]=tmp[i];
	else
	for(int i=0; i<nrExam;i++)
	notes[i]=tmp[i];
	this.nrExam = nrExam;
	}
}
public int getNrExam(){
	return nrExam;
}
public void setNotes(int index, int notes){
	if((index >= 0) && (index < nrExam)){
	this.notes[index] = notes;
	}
}
public int getNotes(int index){
	if((index >= 0) && (index < nrExam)){
	return notes[index];
	}
	else
	return -1;	
}
}