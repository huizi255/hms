package com.briup.cms.service.impl;

import com.briup.cms.bean.Student;
import com.briup.cms.dao.StudentDao;
import com.briup.cms.service.IStudentService;

public class StudentServiceImpl implements IStudentService{
	private StudentDao studentDao 
	                      = new StudentDao();

	@Override
	public void save(Student student) {
		studentDao.save(student);
	}
	

}
