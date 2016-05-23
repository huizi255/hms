package com.rj1.TVManager.bean;

import java.util.Date;

public class Vedio {
	private Long id;
	private String name;  //名称
	private String type;  //类型（avi，RMVB）
	private Long  memory;  //内存大小
	private Date publisureDate;  //创建时间
	private Long c_id;    //所属栏目
	private String content; //视频简介
	
	public Vedio() {
		
	}
	public Vedio(String name, String type, Long memory,
			Date publisureDate, Long c_id, String content) {
		super();
		this.name = name;
		this.type = type;
		this.memory = memory;
		this.publisureDate = publisureDate;
		this.c_id = c_id;
		this.content = content;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Long getMemory() {
		return memory;
	}
	public void setMemory(Long memory) {
		this.memory = memory;
	}
	public Date getPublisureDate() {
		return publisureDate;
	}
	public void setPublisureDate(Date publisureDate) {
		this.publisureDate = publisureDate;
	}
	public Long getC_id() {
		return c_id;
	}
	public void setC_id(Long c_id) {
		this.c_id = c_id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "Vedio [id=" + id + ", name=" + name + ", type=" + type
				+ ", memory=" + memory + ", publisureDate=" + publisureDate
				+ ", c_id=" + c_id + ", content=" + content + "]";
	}
}
