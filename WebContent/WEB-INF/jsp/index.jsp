<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>视频资源管理系统</title>
<title>首页</title>
<link rel="stylesheet" type="text/css" href="theme/1/css/common.css">
<link rel="stylesheet" type="text/css"
	href="theme/1/css/front/style.css">
</head>

<body>
	<div id="main">
		<jsp:include page="header.jsp"></jsp:include>
		<div class="content">
			<div class="congw">
				<div class="clear"></div>
				
				
				<div class="box">
				<c:forEach items="${vmList }" var="vm">
					<div class="box_b">
						<div class="title">
							<span class="txt_title">${vm.category.name }</span>
							 <span class="txt_discipline">栏目</span>
							<span class="txt_time"><a href="toList.action?c_id=${vm.category.id }">更多>></a></span>
						</div>
						<div class="cont">
							<ul class="discipUI">
							<c:forEach items="${vm.vedios }" var="a">
								<li><a href="toContent.action?id=${a.id }" class="txt_title">
								<span class="txt_discipline">${a.name }</span></a><span class="txt_time">${a.publisureDate }</span>
								
								</li>
								</c:forEach>
							</ul>
						</div>
					</div>
					</c:forEach>
					</div>
				
				
				<div class="link">
					<div class="linelink">
						<span>友情链接：</span><a href="javascript:void(0)">上海教育网</a><a
							href="javascript:void(0)">上海杰普软件科技有限公司</a><a
							href="javascript:void(0)">郑州轻工学院</a><a href="javascript:void(0)">郑州大学</a>
					</div>
				</div>
			</div>
		</div>
		<div class="footer">
			<div class="foot">
				<p>
					杰普信息发布系统 技术支持：<a href="javascript:void(0)">上海杰普软件科技有限公司</a>
					电话：021-xxxxxxx
				</p>
			</div>
		</div>
	</div>
</body>
</html>