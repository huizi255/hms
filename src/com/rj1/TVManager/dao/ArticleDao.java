package com.rj1.TVManager.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.rj1.TVManager.bean.Article;
import com.rj1.TVManager.common.ConnectionFactory;

public class ArticleDao {
	private static final java.util.Date date = null;
	/**
	 * 添加文章
	 * */
	public void save(Article article){
		try {
			Connection conn = null;
			PreparedStatement pstmt = null;
			try{
				conn = ConnectionFactory.getConn();
				String sql = "insert into t_article(title,author,"
						+ "content,publisureDate,clicksTimes,c_id) values(?,?,?,?,?,?)";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, article.getTitle());
				pstmt.setString(2, article.getAuthor());
				pstmt.setString(3, article.getContent());
				pstmt.setDate(4, new Date(article.getPublisureDate().getTime()));
				pstmt.setInt(5, article.getClicksTimes());
				pstmt.setLong(6, article.getC_id());
				pstmt.executeUpdate();
			}finally{
				ConnectionFactory.close(null, pstmt, conn);
			}
		} catch (Exception e) {
            e.printStackTrace();
		}
	}
	/**
	 * 查询文章
	 * */
	public List<Article> findAll(){
		List<Article> list = new ArrayList<Article>();
		try {
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			  try{
				  conn = ConnectionFactory.getConn();
				  String sql = "select * from t_article";
				  pstmt = conn.prepareStatement(sql);
				  rs = pstmt.executeQuery();
				  while(rs.next()){
					  Long id = rs.getLong("id");
					  String title = rs.getString("title");
					  String author = rs.getString("author");
					  String content = rs.getString("content");
					  Date date = rs.getDate("publisureDate");
					  int clicksTimes = rs.getInt("clicksTimes");
					  Long c_id = rs.getLong("c_id");
					  
					  Article article = new Article();
					  article.setId(id);
					  article.setTitle(title);
					  article.setAuthor(author);
					  article.setContent(content);
					  article.setC_id(c_id);
					  article.setClicksTimes(clicksTimes);
					  article.setPublisureDate(date);
					  list.add(article);
				  }
			  }finally{
				  
			  }
		} catch (Exception e) {
          e.printStackTrace();
		}
		return list;
	}
	/**
	 * 删除文章
	 * */
	public void delete(Long id) {
		try {
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try{
				conn = ConnectionFactory.getConn();
				String sql = "delete from t_article where id=?";
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
	 * 通过id查询
	 * */
	public Article findById(Long id) {
		Article article = null;
		try {
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			 try{
				 conn = ConnectionFactory.getConn();
				 String sql = "select * from t_article where id=?";
				 pstmt = conn.prepareStatement(sql);
				 pstmt.setLong(1, id);
				 rs = pstmt.executeQuery();
				 while(rs.next()){
					 String title = rs.getString("title");
					  String author = rs.getString("author");
					  String content = rs.getString("content");
					  Date date = rs.getDate("publisureDate");
					  int clicksTimes = rs.getInt("clicksTimes");
					  Long c_id = rs.getLong("c_id");
					  article = new Article(title, author, content, date, clicksTimes, c_id);
					  article.setId(id);
				 }
			 }finally{
				 
			 }
		} catch (Exception e) {
           e.printStackTrace();
		}
		return article;
	}
	public void update(Article article) {
		try {
			Connection conn = null;
			PreparedStatement pstmt = null;
			try{
				conn = ConnectionFactory.getConn();
				String sql = "update t_category set title=?,author=?"
						+ "content=?,clicksTimes=? where id=?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1,article.getTitle());
				pstmt.setString(2, article.getAuthor());
				pstmt.setString(3, article.getContent());
				pstmt.setInt(4, article.getClicksTimes());
				pstmt.setLong(5, article.getId());
				pstmt.executeUpdate();
			}finally{
                ConnectionFactory.close(null, pstmt, conn);				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}