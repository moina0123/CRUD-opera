package com.tnsif.Service;
import com.tnsif.Entity.Student;
import com.tnsif.Service.StudentService;

public interface StudentService {
	public  void addStudent(Student student);
	public abstract void updateStudent(Student student);
	public abstract void removeStudent(Student student);
	public abstract Student findStudentById(int id);
	
}
