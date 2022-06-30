package repository;

import java.util.ArrayList;

import model.Student;

public class StudentRepo {
	
	ArrayList<Student> al=new ArrayList<Student> ();
	
	public void addStudent(Student s) {
		al.add(s);
		
	}
	public int getMarksDetails(Student objs) {
		
		
		for(Student s: al) {
			if(s.getRno()==objs.getRno())
				return objs.getMarks();
			else
				return -1;
		}
		return 0;
	}
	
	

}
