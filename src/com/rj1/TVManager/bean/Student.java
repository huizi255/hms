package com.rj1.TVManager.bean;

public class Student {
	private Long id;
	private String name;
	private String grade;
	private String number;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	
	public Student() {
		
	}
	
	public Student(String name, String grade, String number) {
		super();
		this.name = name;
		this.grade = grade;
		this.number = number;
	}
	
}
