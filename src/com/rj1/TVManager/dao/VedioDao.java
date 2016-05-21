package com.rj1.TVManager.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.rj1.TVManager.bean.Vedio;
import com.rj1.TVManager.common.ConnectionFactory;

public class VedioDao {
	/**
	 * 插入vedio值
	 * */
	public void save(Vedio vedio){
		try {
			Connection conn = null;
			PreparedStatement pstmt = null;
			try{
				conn = ConnectionFactory.getConn();
				String sql = "insert into t_vedio(name,memory"
						+ ",type,publisureDate,c_id,content) values(?,?,?,?,?,?)";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, vedio.getName());
				pstmt.setLong(2, vedio.getMemory()); //内存大小
				pstmt.setString(3, vedio.getType());  //视频类型
				pstmt.setDate(4,new Date(vedio.getPublisureDate().getTime()));
				pstmt.setLong(5, vedio.getC_id());
				pstmt.setString(6, vedio.getContent());
				pstmt.executeUpdate();
			}finally{
				ConnectionFactory.close(null, pstmt, conn);
			}
		} catch (Exception e) {
             e.printStackTrace();
		}
	}

	/**
	 * 查询所有视频信息
	 * */
	public List<Vedio> list(){
		List<Vedio> list = new ArrayList<Vedio>();
		try {
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try{
				conn = ConnectionFactory.getConn();
				String sql = "select * from t_vedio";
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				while(rs.next()){
					Long id = rs.getLong("id");
					String name = rs.getString("name");
					String type = rs.getString("type");
					Long memory = rs.getLong("memory");
					Date publisureDate = rs.getDate("publisureDate");
					Long c_id = rs.getLong("c_id");
					String content = rs.getString("content");
					
					Vedio vedio = new Vedio();
					vedio.setId(id);
					vedio.setName(name);
					vedio.setType(type);
					vedio.setMemory(memory);
					vedio.setPublisureDate(publisureDate);
					vedio.setC_id(c_id);
					vedio.setContent(content);
					list.add(vedio);
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
	 * 视频的删除
	 * */
	public void delete(Long id){
		try {
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try{
				conn = ConnectionFactory.getConn();
				String sql = "delete from t_vedio where id = ?";
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
	//通过id查询视频信息
	public Vedio findById(Long id){
		Vedio vedio = null;
		try {
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			 try{
				 conn = ConnectionFactory.getConn();
				 String sql = "select * from t_vedio where id=?";
				 pstmt = conn.prepareStatement(sql);
				 pstmt.setLong(1, id);
				 rs = pstmt.executeQuery();
				 while(rs.next()){
					 String name = rs.getString("name");
					  String type = rs.getString("type");
					  Long memory = rs.getLong("memory");
					  String content = rs.getString("content");
					  Date date = rs.getDate("publisureDate");
					  Long c_id = rs.getLong("c_id");
					  vedio = new Vedio(name, type, memory, date, c_id, content);
					  vedio.setId(id);
				 }
			 }finally{
				 ConnectionFactory.close(rs, pstmt, conn);
			 }
		} catch (Exception e) {
           e.printStackTrace();
		}
		return vedio;
	}
	//修改视频信息
	public void update(Vedio vedio){
		try {
			Connection conn = null;
			PreparedStatement pstmt =null;
			try{
				conn =ConnectionFactory.getConn();
				String sql="update t_vedio set name=?,type=?,memory=?,content=? where id=?";
				pstmt =conn.prepareStatement(sql);
				pstmt.setString(1,vedio.getName());
				pstmt.setString(2, vedio.getType());
				pstmt.setLong(3, vedio.getMemory());
				pstmt.setString(4, vedio.getContent());
				pstmt.setLong(5, vedio.getId());
				pstmt.executeUpdate();
			}finally{
				ConnectionFactory.close(null, pstmt, conn);
			}
		} catch (Exception e) {
           e.printStackTrace();
		}
	}
}
