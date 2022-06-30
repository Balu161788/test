package service;

import model.Student;
import repository.StudentRepo;

public class StudentServiceImpl implements StudentService {
	
	StudentRepo obj=new StudentRepo();
	
	public boolean isPass(Student s) {
		
		obj.addStudent(s);
		if(obj.getMarksDetails(s)>35) {
			return true;
		}
		else 
			return false;
	}

}
