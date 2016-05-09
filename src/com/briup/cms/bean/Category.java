package com.briup.cms.bean;
/**
 * @author huizi
 * 栏目
 * */
public class Category {
	private Long id;
	private String name;
	private String code;
	
	public Category() {
		
	}
	
	public Category(String name, String code) {
		super();
		this.name = name;
		this.code = code;
	}


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
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	

}
