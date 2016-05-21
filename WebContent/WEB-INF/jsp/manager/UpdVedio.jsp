<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <!-- -------这是jquery.form的异步提交-------- -->
<script>
$(function(){
	var form = $("#updVedioForm");
	form.off();
	  form.on("submit",function(){
		 form.ajaxSubmit(function(){
			 form[0].reset();
			 alert("修改成功");
			 $(".baseUI li:contains('视频管理')").trigger("click");
		 });
		 return false;
	  });
 });
</script>
<style type="text/css">
  h1{
    color:orange;
  }
  form{
    font-size:15px;
    padding-left:20px;
    line-height:20px;
  }
</style>
<h1 align="center">视频修改</h1>
<hr>
<form action="updVedio.action" method="post" id="updVedioForm">
    <input type="hidden" name="id" value="${vedio.id }">
       视频名称：<input type="text" name="name" value="${vedio.name }"><br>
       视频类型：<input type="text" name="type" value="${vedio.type}"><br>
       视频大小：<input type="text" name="memory" value="${vedio.memory }"><br>      
          简介：<textarea cols="20" rows="4" name="content">${vedio.content}</textarea><br>
       <input type="submit" value="提交"/>
</form>