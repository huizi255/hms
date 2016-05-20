package com.rj1.TVManager.web.action.manager;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.rj1.TVManager.bean.Category;
import com.rj1.TVManager.bean.Vedio;
import com.rj1.TVManager.service.ICategoryService;
import com.rj1.TVManager.service.IVedioService;
import com.rj1.TVManager.service.impl.CategoryServiceImpl;
import com.rj1.TVManager.service.impl.VedioServiceImpl;
import com.rj1.TVManager.bean.Article;
import com.rj1.TVManager.service.IArticleService;
import com.rj1.TVManager.service.impl.ArticleServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class BaseAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private ICategoryService categoryService = 
			                  new CategoryServiceImpl();
	private IArticleService articleService = 
	                        new ArticleServiceImpl();
	private IVedioService vedioService = 
			                new VedioServiceImpl();
	private List<Category> categoryList;
	private List<Article> articleList;
	private List<Vedio> vedioList;

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
		categoryList = categoryService.list();
		return "success";
	}

	/**
	 * 信息发布页面跳转
	 * */
	@Action(value = "toMessagePublish", results = {
			@Result(name = "success", location = "/WEB-INF/jsp/manager/MessagePublish.jsp") })
	public String toMessagePublish() {
		categoryList = categoryService.list();
		return "success";
	}
	
	/**
	 * 信息管理页面跳转
	 * */
	@Action(value = "toMessageManager", results = {
			@Result(name = "success", location = "/WEB-INF/jsp/manager/MessageManager.jsp") })
	public String toMessageManager() {
		articleList = articleService.list();
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
	/**
	 * 视频发布页面跳转
	 * */
	@Action(value = "toMoviePublish", results = { 
			@Result(name = "success", location = "/WEB-INF/jsp/manager/PublishVedio.jsp") })
	public String toMoviePublish() {
		categoryList = categoryService.list();
		return "success";
	}
	/**
	 * 视频管理页面跳转
	 * */
	@Action(value = "toMovieManager", results = { 
			@Result(name = "success", location = "/WEB-INF/jsp/manager/VedioManager.jsp") })
	public String toMovieManager() {
		vedioList = vedioService.list();
		return "success";
	}
	public List<Category> getCategoryList() {
		return categoryList;
	}

	public void setCategoryList(List<Category> categoryList) {
		this.categoryList = categoryList;
	}

	public List<Article> getArticleList() {
		return articleList;
	}

	public void setArticleList(List<Article> articleList) {
		this.articleList = articleList;
	}

	public List<Vedio> getVedioList() {
		return vedioList;
	}

	public void setVedioList(List<Vedio> vedioList) {
		this.vedioList = vedioList;
	}
	
}
