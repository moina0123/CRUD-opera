package com.tnsif.Service;
import com.tnsif.Entity.Student;
import com.tnsif.dao.StudentDao;
import com.tnsif.dao.StudentDaoImpl;


public   class StudentServiceImpl implements StudentService
{
	private StudentDao dao;
	public StudentServiceImpl()
	 {
	dao = new StudentDaoImpl();
	}
	public void addStudent(Student student) {
	dao.beginTransaction();
	dao.addStudent(student);
	dao.commitTransaction();
	}
	@Override
	public void updateStudent(Student student) {
	dao.beginTransaction();
	dao.updateStudent(student);
	dao.commitTransaction();
	}
	@Override
	public void removeStudent(Student student) {
	dao.beginTransaction();
	dao.removeStudent(student);
	dao.commitTransaction();
	}
	@Override
	public Student findStudentById(int id) {
	//no need of transaction, as it's an read operation
	Student student = dao.getStudentById(id);
	return student;
		
	}
}