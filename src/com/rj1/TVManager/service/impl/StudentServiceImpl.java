package com.rj1.TVManager.service.impl;

import com.rj1.TVManager.bean.Student;
import com.rj1.TVManager.dao.StudentDao;
import com.rj1.TVManager.service.IStudentService;

public class StudentServiceImpl implements IStudentService{
	private StudentDao studentDao 
	                      = new StudentDao();

	@Override
	public void save(Student student) {
		studentDao.save(student);
	}
	

}
