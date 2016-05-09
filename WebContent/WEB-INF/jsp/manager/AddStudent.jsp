<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script>
$(function(){
	$("#addStudentForm").off();
	  $("#addStudentForm").on("submit",function(){
		 $("#addStudentForm").ajaxSubmit(function(){
			 $("#addStudentForm input").not(":submit").val("");
			 alert("添加成功")
		 });
		 return false;
	  });
 });
</script>
<h1 align="center">添加学生</h1>
<hr>
<form action="AddStudent.action" method="post" id="addStudentForm">
  姓名：<input type="text" name="name"><br>
  班级：<input type="text" name="grade"><br>
 学号： <input type="text" name="number"><br>
 <input type="submit" value="提交">
</form>    