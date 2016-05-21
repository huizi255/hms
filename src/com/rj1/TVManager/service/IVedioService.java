package com.rj1.TVManager.service;

import java.util.List;

import com.rj1.TVManager.bean.Vedio;

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
}
