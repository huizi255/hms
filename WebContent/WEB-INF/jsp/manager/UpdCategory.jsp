<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- -------这是jquery.form的异步提交-------- -->
<script>
$(function(){
	var form = $("#UpdCategoryForm");
	form.off();
	form.on("submit",function(){
		form.ajaxSubmit(function(){
			 form[0].reset();
			 alert("修改成功");
			 $(".baseUI li:contains('栏目管理')").trigger("click");
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
<h1 align="center">修改栏目</h1>
<hr>
<form action="UpdCategory.action" method="post" id="UpdCategoryForm">
          <input type="hidden" name="id" value="${category.id }"/>      
       栏目名称：<input type="text" name="name" value="${category.name }"><br>
       栏目编号：<input type="text" name="code" value="${category.code }"><br>
       <input type="submit" value="提交"/>
</form>