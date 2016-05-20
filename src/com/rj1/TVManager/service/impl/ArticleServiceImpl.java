package com.rj1.TVManager.service.impl;

import java.util.List;

import com.rj1.TVManager.dao.ArticleDao;
import com.rj1.TVManager.dao.CategoryDao;
import com.rj1.TVManager.bean.Article;
import com.rj1.TVManager.service.IArticleService;

public class ArticleServiceImpl implements IArticleService{
	private ArticleDao articleDao = new ArticleDao();

	@Override
	public void save(Article article) {
		articleDao.save(article);
	}

	@Override
	public List<Article> list() {
		return articleDao.findAll();
	}

	@Override
	public void delete(Long id) {
		articleDao.delete(id);
	}

	@Override
	public Article findById(Long id) {
		return articleDao.findById(id);
	}

	@Override
	public void update(Article article) {
		articleDao.update(article);
	}

}
