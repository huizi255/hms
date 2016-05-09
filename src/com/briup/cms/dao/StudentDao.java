package com.briup.cms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.briup.cms.bean.Student;
import com.briup.cms.common.ConnectionFactory;

public class StudentDao {
	
	public void save(Student student){
		try {
			  Connection conn =null;
			  PreparedStatement pstmt = null;
			  try{
				  conn = ConnectionFactory.getConn();
				  String sql = "insert into t_student(name,grade,number) values(?,?,?)";
				  pstmt = conn.prepareStatement(sql);
				  pstmt.setString(1,student.getName());
				  pstmt.setString(2, student.getGrade());
				  pstmt.setString(3, student.getNumber());
				  pstmt.executeUpdate();
			  }finally{
				  ConnectionFactory.close(null, pstmt, conn);
			  }
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		
}
