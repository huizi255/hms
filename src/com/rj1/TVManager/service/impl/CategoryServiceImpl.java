package com.rj1.TVManager.service.impl;

import java.util.List;

import com.rj1.TVManager.bean.Category;
import com.rj1.TVManager.dao.CategoryDao;
import com.rj1.TVManager.service.ICategoryService;

public class CategoryServiceImpl implements ICategoryService {
	private CategoryDao categoryDao = new CategoryDao();

	@Override
	public void save(Category category) {
		categoryDao.save(category);
	}

	@Override
	public List<Category> list() {
		List<Category> list = categoryDao.findAll();
		return list;
	}

	@Override
	public void delete(Long id) {
		categoryDao.delete(id);
	}
	
	@Override
	public void update(Category category) {
		categoryDao.update(category);
	}

}
