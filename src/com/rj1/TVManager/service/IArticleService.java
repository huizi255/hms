package com.rj1.TVManager.service;

import java.util.List;

import com.rj1.TVManager.bean.Article;

public interface IArticleService {
	//添加栏目
		void save(Article article);
		
		//查询栏目信息
		List<Article> list();
		
		//通过id删除栏目
		void delete(Long id);
        //通过id查询文章
		Article findById(Long id);
         //修改文章
		void update(Article article);

}
