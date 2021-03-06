package com.rj1.TVManager.service;

import java.util.List;

import com.rj1.TVManager.bean.Category;

public interface ICategoryService {
	//添加栏目
    void save(Category category);
    //查询栏目信息
    List<Category> list();
    //通过id删除栏目
    void delete(Long id);
    //通过修改栏目
    void update(Category category);
    //通过id查询栏目信息
    Category findById(Long id);
    //修改栏目信息
}
