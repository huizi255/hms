package com.rj1.TVManager.web.action;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.rj1.TVManager.bean.Category;
import com.rj1.TVManager.bean.Vedio;
import com.rj1.TVManager.model.CategoryModel;
import com.rj1.TVManager.service.ICategoryService;
import com.rj1.TVManager.service.IVedioService;
import com.rj1.TVManager.service.impl.CategoryServiceImpl;
import com.rj1.TVManager.service.impl.VedioServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class BaseAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private ICategoryService categoryService = new CategoryServiceImpl();
	private IVedioService vedioService = new VedioServiceImpl();
	
	private List<Category> categoryList;
	private List<Vedio> vedioList;
	private Long c_id;
	private Long id;
	private Vedio vedio;
	private List<CategoryModel> vmList;
	/**
	 * 跳转到首页
	 * ip:port/命名空间/url
	 * http://localhost:8888/toIndex.action
	 * */
	/**
	 * 调用service层方法，查询所有栏目信息，并把值赋给categoryList；
	 * */
	@Action(value="toIndex",results={
			@Result(name="success",location="/WEB-INF/jsp/index.jsp")})
	public String toIndex(){
		loadCategory();
		vmList = vedioService.listAll();
		return "success";
	}
	/**
	 * 前台跳转页面都加载查询栏目信息
	 * */
	public void loadCategory(){
		categoryList = categoryService.list();
	}
	/**
	 * 跳转到列表页
	 * */
	@Action(value="toList",results={
			@Result(name="success",location="/WEB-INF/jsp/list.jsp")})
	public String toList(){
		loadCategory();
		vedioList = vedioService.listByCategory(c_id);
		return "success";
	}
	
	/**
	 * 跳转到内容页
	 * */
	@Action(value="toContent",results={
			@Result(name="success",location="/WEB-INF/jsp/content.jsp")})
	public String toContent(){
		loadCategory();
		vedio = vedioService.scanner(id);
		return "success";
	}

	public List<Category> getCategoryList() {
		return categoryList;
	}

	public void setCategoryList(List<Category> categoryList) {
		this.categoryList = categoryList;
	}

	public Long getC_id() {
		return c_id;
	}

	public void setC_id(Long c_id) {
		this.c_id = c_id;
	}

	public List<Vedio> getVedioList() {
		return vedioList;
	}

	public void setVedioList(List<Vedio> vedioList) {
		this.vedioList = vedioList;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Vedio getVedio() {
		return vedio;
	}
	public void setVedio(Vedio vedio) {
		this.vedio = vedio;
	}
	public List<CategoryModel> getVmList() {
		return vmList;
	}
	public void setVmList(List<CategoryModel> vmList) {
		this.vmList = vmList;
	}

}
