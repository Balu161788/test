package controller;

import model.Student;
import service.StudentServiceImpl;

public class StrudentMain {

	public static void main(String[] args) {
		
			Student s=new Student(1,"A",67);
			Student s1=new Student(2,"B",34);
			
			StudentServiceImpl obj=new StudentServiceImpl();
			
			if(obj.isPass(s)) {
				System.out.println("Student "+s.getName()+" passed the exam");
			}
			else 
				System.out.println("Student "+s.getName()+" failed the exam");
			
			if(obj.isPass(s1)) {
				System.out.println("Student "+s1.getName()+" passed the exam");
			}
			else 
				System.out.println("Student "+s1.getName()+" failed the exam");
			
			
	}

}
