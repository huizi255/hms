<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<style>
  th{
    background:lightblue;
    text-align:center;
    text-family:微软雅黑；
    font-size:16px;
  }
  td{
    text-align:center;
    text-family:微软雅黑；
    font-size:16px;
  }
</style>    
<h1>视频管理</h1>
<hr>
<table border="1" style="width:100%;border-collapse:collapse;margin-top:10px">
<tr>
  <th>编号</th>
  <th>视频名称</th>
  <th>类型</th>
  <th>内存大小</th>
  <th>简介</th>
  <th>发布时间</th>
  <th>操作</th>
</tr>
<c:forEach items="${vedioList }" var="c">
<tr>
  <td><input type="checkbox" value="${c.id }"/></td>
  <td>${c.name}</td>
  <td>${c.type}</td>
  <td>${c.memory}</td>
  <td>${c.content}</td>
  <td>${c.publisureDate}</td>
  <td>
    <a href="javascript:void(0)" val="${c.id }" class="upd">修改</a>
    <a href="javascript:void(0)" val="${c.id }" class="del">删除</a>
  </td>
</tr>
</c:forEach>
</table>
<script>
  $(".upd").off;
  $(".upd").on("click",function(){
	  var id = $(this).attr("val");
			  $(".right").load("toUpdVedio.action",{id:id});
		});
  
  $(".del").off;
  $(".del").on("click",function(){
	  var flag = confirm("确定要删除吗？");
	  if(flag){
		  var id = $(this).attr("val");
			$.post("delVedio.action",{id:id},function(){
				$(".baseUI li:contains('视频管理')").trigger("click");
			});
	  }
  });
</script>
