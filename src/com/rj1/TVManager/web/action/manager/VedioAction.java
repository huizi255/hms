package com.rj1.TVManager.web.action.manager;

import java.util.Date;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;
import com.rj1.TVManager.bean.Vedio;
import com.rj1.TVManager.service.IVedioService;
import com.rj1.TVManager.service.impl.VedioServiceImpl;

public class VedioAction extends ActionSupport{

	private static final long serialVersionUID = 1L;
	private IVedioService vedioService = new VedioServiceImpl();
	private Vedio vedio;
	private Long id;
	private String name;  //名称
	private String type;  //类型（avi，RMVB）
	private Long  memory;  //内存大小
	private Date publisureDate;  //创建时间
	private Long c_id;    //所属栏目
	private String content; //视频简介
	
	/**
	 * 视频的发布
	 * */
	@Action(value="AddVedio")
	public void AddVedio(){
		Vedio vedio = new Vedio();
		vedio.setId(id);
		vedio.setName(name);
		vedio.setType(type);
		vedio.setMemory(memory);
		vedio.setContent(content);
		vedio.setC_id(c_id);
		vedio.setPublisureDate(new Date());
		vedioService.save(vedio);
	}
	/**
	 * 视频的删除
	 * */
	@Action("delVedio")
	public void delVedio(){
		vedioService.delete(id);
	}
	/**
	 * 跳转到修改视频界面
	 * */
	@Action(value="toUpdVedio",results={
			@Result(name="success",location="/WEB-INF/jsp/manager/UpdVedio.jsp")})
	public String toUpdVedio(){
		vedio = vedioService.findById(id);
		return "success";
	}
	/**
	 * 视频的修改
	 * */
	@Action("updVedio")
	public void updVedio(){
		Vedio vedio = new Vedio();
		vedio.setId(id);
		vedio.setName(name);
		vedio.setType(type);
		vedio.setMemory(memory);
		vedio.setContent(content);
		vedioService.update(vedio);
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
	public Vedio getVedio() {
		return vedio;
	}
	public void setVedio(Vedio vedio) {
		this.vedio = vedio;
	}

}
