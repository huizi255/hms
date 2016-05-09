package com.briup.cms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.convention.annotation.Result;

import com.briup.cms.bean.Category;
import com.briup.cms.common.ConnectionFactory;

/**
 * @author huizi;
 * 关于栏目信息与数据库交互的类
 * */
public class CategoryDao {
	/**
	 * 将Category对象中栏目保存到数据库中
	 * */
	public void save(Category category){
		try {
			Connection conn = null;
			PreparedStatement pstmt = null;
			try{
				conn = ConnectionFactory.getConn();
				String sql = "insert into t_category(name,code) values(?,?)";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, category.getName());
				pstmt.setString(2, category.getCode());
				pstmt.executeUpdate();
			}finally{
				ConnectionFactory.close(null, pstmt, conn);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * 查询所有的栏目信息
	 * return所有的栏目信息
	 * */
	public List<Category> findAll(){
		List<Category> list = new ArrayList<Category>();
		try {
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try{
				conn = ConnectionFactory.getConn();
				String sql = "select * from t_category";
				pstmt = conn.prepareStatement(sql);
				pstmt.executeQuery();
				while(rs.next()){
					Long id = rs.getLong("id");
					String name = rs.getString("name");
					String code = rs.getString("code");
					Category c = new Category(name, code);
					c.setId(id);
					list.add(c);
				}
			}finally{
				ConnectionFactory.close(rs, pstmt, conn);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
		
	}

}
