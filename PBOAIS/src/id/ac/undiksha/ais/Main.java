package id.ac.undiksha.ais;

import id.ac.undiksha.ais.people.student;
import id.ac.undiksha.ais.people.Lecturer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		student student1 = new student();
		
		student1.setStudentId("2215101035");
		student1.setName("Restu");
		student1.setBirthDate("22 Desember 2003");
		student1.setGender(true);
		student1.setAddress("Jl. Srikandi");
		student1.setSmtr(6);
		
		student1.printAll();
		
		Lecturer lecturer1 = new Lecturer();
		
		
		lecturer1.setName("Cahyana");
		lecturer1.setLecturerId("22151010025");
		lecturer1.setAddress("Jl. Mawar1");
		lecturer1.setBirthDate("1995-04-03");
		lecturer1.setGender(true);
		lecturer1.setFaculty("FTK");
		lecturer1.setDepartmen("TI");
		lecturer1.setStudyProgram("Ilkom");
		lecturer1.printAll();

		
		
	

	}

}