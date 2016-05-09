package com.briup.cms.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.briup.cms.bean.Category;
import com.briup.cms.dao.CategoryDao;
import com.briup.cms.service.ICategoryService;

public class CategoryServiceImpl implements ICategoryService {
	private CategoryDao categoryDao = new CategoryDao();

	@Override
	public void save(Category category) {
		categoryDao.save(category);
	}

	public List<Category> list() {
		List<Category> list = new ArrayList<Category>();
		list = this.getCategoryDao().findAll();
		return list;
	}
	public CategoryDao getCategoryDao(){
		return categoryDao;
	}

}
