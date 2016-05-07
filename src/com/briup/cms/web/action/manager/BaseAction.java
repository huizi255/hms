package com.briup.cms.web.action.manager;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

public class BaseAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	/**
	 * author:辉子 后台页面跳转 * ip:port/命名空间/url
	 * http://localhost:8888/manager/toIndex.action
	 * */
	@Action(value = "toIndex", results = { @Result(name = "success", location = "/WEB-INF/jsp/manager/index.jsp") })
	public String toIndex() {
		return "success";
	}

	/**
	 * 添加栏目页面跳转
	 * */
	@Action(value = "toAddCategory", results = { 
			@Result(name = "success", location = "/WEB-INF/jsp/manager/AddCategory.jsp") })
	public String toAddCategory() {
		return "success";
	}

	/**
	 * 栏目管理页面跳转
	 * */
	@Action(value = "toCategoryManager", results = {
			@Result(name = "success", location = "/WEB-INF/jsp/manager/CategoryManager.jsp") })
	public String toCategoryManager() {
		return "success";
	}

	/**
	 * 添加学生页面跳转
	 * */
	@Action(value = "toAddStudent", results = { 
			@Result(name = "success", location = "/WEB-INF/jsp/manager/AddStudent.jsp") })
	public String toAddStudent() {
		return "success";
	}
}
