package com.rj1.TVManager.service;

import java.util.List;

import com.rj1.TVManager.bean.Vedio;

public interface IVedioService {
	
	void save(Vedio vedio);
	
	List<Vedio> list();
	
	void delete(Long id);

}
