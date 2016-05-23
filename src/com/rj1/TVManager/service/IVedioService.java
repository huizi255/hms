package com.rj1.TVManager.service;

import java.util.List;

import com.rj1.TVManager.bean.Vedio;
import com.rj1.TVManager.model.CategoryModel;

public interface IVedioService {
	//添加视频
	void save(Vedio vedio);
	//查询所有视频
	List<Vedio> list();
	//通过id删除视频
	void delete(Long id);
	//通过id查询视频
	Vedio findById(Long id);
    //修改视频信息
	void update(Vedio vedio);
	//通过栏目查询视频信息
	List<Vedio> listByCategory(Long c_id);
	//通过id查询
	Vedio scanner(Long id);
	//查询所有栏目，视频信息
	List<CategoryModel> listAll();
}
