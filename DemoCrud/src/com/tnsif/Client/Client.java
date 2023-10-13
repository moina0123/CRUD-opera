package com.tnsif.Client;
import com.tnsif.Entity.Student;
import com.tnsif.Service.StudentServiceImpl;;
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentServiceImpl service = new StudentServiceImpl();
		Student student = new Student();
		// Create Operation
		student.setStudentId(100);
		student.setName("sachin");
		service.addStudent(student);
		
		// Retrieve Operation
	   student = service.findStudentById(100);
	   System.out.print("ID:"+student.getStudentId());
	   System.out.println(" Name:"+student.getName());
		
		// Update Operation
		//student = service.findStudentById(100);
		//student.setName("Sachin");
		//service.updateStudent(student);
		
		//student = service.findStudentById(100);
		//System.out.print("ID:"+student.getStudentId());
		//System.out.println(" Name:"+student.getName());

		// Delete Operation
		//student = service.findStudentById(100);
		//service.removeStudent(student);
		//System.out.println("End of program/Life cycle completed...");
		
	}

}
