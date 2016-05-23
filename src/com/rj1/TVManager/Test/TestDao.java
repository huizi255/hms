package com.rj1.TVManager.Test;

import java.util.List;

import com.rj1.TVManager.bean.Vedio;
import com.rj1.TVManager.dao.VedioDao;

public class TestDao {
     public static void main(String[] args) {
		VedioDao vedioDao = new VedioDao();
		//List<Vedio> list = vedioDao.query(null, "%天%", null);
		List<Vedio> list = vedioDao.query(6L, null, null);
		for(Vedio v:list){
			System.out.println(v);
		}
	}
}
