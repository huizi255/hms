package com.rj1.TVManager.service.impl;

import java.util.List;

import com.rj1.TVManager.bean.Vedio;
import com.rj1.TVManager.dao.VedioDao;
import com.rj1.TVManager.service.IVedioService;

public class VedioServiceImpl implements IVedioService{
	private VedioDao vedioDao = new VedioDao();

	@Override
	public void save(Vedio vedio) {
		vedioDao.save(vedio);
		
	}

	@Override
	public List<Vedio> list() {
		return vedioDao.list();
	}

	@Override
	public void delete(Long id) {
		vedioDao.delete(id);
	}

	@Override
	public Vedio findById(Long id) {
		return vedioDao.findById(id);
	}

	@Override
	public void update(Vedio vedio) {
		vedioDao.update(vedio);
	}

}
