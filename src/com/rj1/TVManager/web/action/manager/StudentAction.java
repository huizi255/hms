package com.rj1.TVManager.web.action.manager;

import org.apache.struts2.convention.annotation.Action;

import com.rj1.TVManager.bean.Student;
import com.rj1.TVManager.service.IStudentService;
import com.rj1.TVManager.service.impl.StudentServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class StudentAction extends ActionSupport{

	private static final long serialVersionUID = 1L;
	private IStudentService studentService 
	                   = new StudentServiceImpl();
	private String name;
	private String grade;
	private String number;
	
	
	/**
	 * @author huizi;
	 * 
	 * */
	
	@Action(value="AddStudent")
	public void AddStudent(){
		Student student = new Student(name, grade, number);
		studentService.save(student);
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getGrade() {
		return grade;
	}


	public void setGrade(String grade) {
		this.grade = grade;
	}


	public String getNumber() {
		return number;
	}


	public void setNumber(String number) {
		this.number = number;
	}

	
}
