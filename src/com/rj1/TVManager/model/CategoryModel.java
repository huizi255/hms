package com.rj1.TVManager.model;

import java.util.List;

import com.rj1.TVManager.bean.Category;
import com.rj1.TVManager.bean.Vedio;

public class CategoryModel {
	private Category category;
	private List<Vedio> vedios;
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public List<Vedio> getVedios() {
		return vedios;
	}
	public void setVedios(List<Vedio> vedios) {
		this.vedios = vedios;
	}
	
}
