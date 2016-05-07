package com.briup.cms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import com.briup.cms.bean.Category;
import com.briup.cms.common.ConnectionFactory;

/**
 * @author huizi
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
		return null;
		
	}

}
