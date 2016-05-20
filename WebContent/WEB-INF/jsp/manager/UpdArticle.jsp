<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <!-- -------这是jquery.form的异步提交-------- -->
<script>
$(function(){
	var form = $("#updArticleForm");
	form.off();
	  form.on("submit",function(){
		 form.ajaxSubmit(function(){
			 form[0].reset();
			 alert("修改成功");
			 $(".baseUI li:contains('信息管理')").trigger("click");
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
<h1 align="center">文章修改</h1>
<hr>
<form action="UpdArticle.action" method="post" id="updArticleForm">
    <input type="hidden" name="id" value="${article.id }">
       新闻标题：<input type="text" name="title" value="${article.title }"><br>
       标题作者：<input type="text" name="author" value="${article.author}"><br>
          内容：
          <textarea name="content" rows="10" cols="30" value="${article.content}"></textarea><br>
      点击次数：<input type="text" name="clicksTimes" value="${article.clicksTimes }"><br>
       <input type="submit" value="提交"/>
</form>