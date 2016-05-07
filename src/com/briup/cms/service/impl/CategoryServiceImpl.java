package com.briup.cms.service.impl;

import com.briup.cms.bean.Category;
import com.briup.cms.dao.CategoryDao;
import com.briup.cms.service.ICategoryService;

public class CategoryServiceImpl implements ICategoryService {
	private CategoryDao categoryDao = new CategoryDao();

	@Override
	public void save(Category category) {
		categoryDao.save(category);
	}

}
