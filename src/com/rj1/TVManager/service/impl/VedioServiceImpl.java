package com.rj1.TVManager.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.rj1.TVManager.bean.Category;
import com.rj1.TVManager.bean.Vedio;
import com.rj1.TVManager.dao.CategoryDao;
import com.rj1.TVManager.dao.VedioDao;
import com.rj1.TVManager.model.CategoryModel;
import com.rj1.TVManager.service.IVedioService;

public class VedioServiceImpl implements IVedioService{
	private VedioDao vedioDao = new VedioDao();
	private CategoryDao categoryDao = new CategoryDao();

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

	@Override
	public List<Vedio> listByCategory(Long c_id) {
		return vedioDao.query(null, null, c_id);
	}

	@Override
	public Vedio scanner(Long id) {
		List<Vedio> list = vedioDao.query(id, null, null);
		if(list.size()>0){
			return list.get(0);
		}
		return null;
	}

	@Override
	public List<CategoryModel> listAll() {
		List<CategoryModel> list = new ArrayList<CategoryModel>();
		List<Category> cs =categoryDao.findAll();
		for(Category c:cs){
			CategoryModel model = new CategoryModel();
			model.setCategory(c);
			List<Vedio> vs =vedioDao.query(null, null, c.getId());
			model.setVedios(vs);
			list.add(model);
		}
		return list;
	}

}
