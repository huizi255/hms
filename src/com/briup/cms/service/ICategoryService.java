package com.briup.cms.service;

import java.util.List;

import com.briup.cms.bean.Category;

public interface ICategoryService {
    void save(Category category);

    List<Category> list();

}
