<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <!-- -------这是jquery.form的异步提交-------- -->
<script>
$(function(){
	var form = $("#addVedioForm");
	form.off();
	  form.on("submit",function(){
		 form.ajaxSubmit(function(){
			 form[0].reset();
			 alert("添加成功")
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
<h1 align="center">视频发布</h1>
<hr>
<form action="AddVedio.action" method="post" id="addVedioForm">
       视频名称：<input type="text" name="name"><br>
       视频类型：<input type="text" name="type"><br>
       视频大小：<input type="text" name="memory"><br>
         所属栏目：<select name="c_id">
            <option value="">请选择</option>
            <c:forEach items="${categoryList }" var="c">
            <option value="${c.id }">${c.name }</option>
            </c:forEach>
           </select><br>
        简介：  <textarea name="content" rows="10" cols="20"></textarea><br>   
       <input type="submit" value="添加"/>
</form>