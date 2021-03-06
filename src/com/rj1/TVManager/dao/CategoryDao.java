package com.rj1.TVManager.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.rj1.TVManager.bean.Category;
import com.rj1.TVManager.common.ConnectionFactory;

/**
 * @author huizi;
 * 关于栏目信息与数据库交互的类
 * */
public class CategoryDao {
	/**
	 * 将Category对象中栏目保存到数据库中,添加栏目功能；
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
				rs = pstmt.executeQuery();
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
	/**
	 * 通过id查询栏目信息
	 * */
	public Category findById(Long id){
		Category category = null;
		try {
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try{
				conn = ConnectionFactory.getConn();
				String sql = "select * from t_category where id=?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setLong(1, id);
				rs = pstmt.executeQuery();
				while(rs.next()){
					String name = rs.getString("name");
					String code = rs.getString("code");
					category= new Category(name, code);
					category.setId(id);
				}
			}finally{
				ConnectionFactory.close(rs, pstmt, conn);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return category;
	}

	/**
	 * 通过id删除栏目信息
	 * */
	public void delete(Long id){
		try {
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try{
				conn = ConnectionFactory.getConn();
				String sql = "delete from t_category where id=?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setLong(1, id);
		        pstmt.executeUpdate();		
	   		}finally{
				ConnectionFactory.close(rs, pstmt, conn);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * 修改栏目
	 * */
	public void update(Category category){
		try {
			Connection conn = null;
			PreparedStatement pstmt = null;
			try{
				conn = ConnectionFactory.getConn();
				String sql = "update t_category set name=?,code=? where id=?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1,category.getName());
				pstmt.setString(2, category.getCode());
				pstmt.setLong(3, category.getId());
				pstmt.executeUpdate();
			}finally{
                ConnectionFactory.close(null, pstmt, conn);				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
