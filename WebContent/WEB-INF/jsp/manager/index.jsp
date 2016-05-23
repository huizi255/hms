<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>视频资源管理</title>
<link rel="stylesheet" type="text/css" href="../theme/1/css/common.css">
<link rel="stylesheet" type="text/css" href="../theme/1/css/style.css">
<link rel="stylesheet" type="text/css" href="../theme/1/css/table.css">
<link rel="stylesheet" type="text/css" href="../theme/1/css/icon.css">
<link rel="stylesheet" type="text/css" href="../theme/1/jquery-easyui-themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="../theme/1/css/easyui-tabs.css">
<script type="text/javascript" src="../js/jquery-1.8.2.min.js"></script>
<script type="text/javascript" src="../js/jquery.form.js"></script>
<script type="text/javascript" src="../js/jquery.easyui.min.js"></script>
<script type="text/javascript"  src="../theme/1/js/base.js"></script>
<script type="text/javascript">
//在右边区域无刷新显示页面
$(function(){
	$(".baseUI li").on("click",function(){
		var url = $(this).attr("url");
		$(".right").load(url);
	});
	$(".baseUI li").filter(":first").trigger("click");
});
</script>
</head>

<body>
<div class="main">
	<div id="top">
    	<div class="top">
        	<div class="t_logo"></div>
            <div class="t_sign">
            	<span>你好，管理员</span><a href="#" class="t_exit">退出</a>
            </div>
            <div style="position: absolute;top:10px;right:2px;">
            <a href="../toIndex.action" target="_blank">跳转到前台页面</a></div>
        </div>
    </div>
    <div id="cont">
    	<div class="centent">
        	<div class="left">
            	<ul class="baseUI">
                	<li url="toAddCategory.action">
                	<a href="#"><em class="base_basicset"></em><span>添加栏目</span></a>
                    </li>
                    <li url="toCategoryManager.action">
                    <a href="#"><em class="base_userset"></em><span>栏目管理</span></a>
                    </li>
                    <li url="toMessagePublish.action">
                    <a href="#"><em class="base_roll"></em><span>信息发布</span></a>
                    </li>
                    <li url="toMessageManager.action">
                    <a href="#"><em class="base_sys"></em><span>信息管理</span></a>
                    </li>
                    <li url="toAddStudent.action">
                    <a href="#"><em class="base_sys"></em><span>添加学生</span></a>
                    </li>
                     <li url="toMoviePublish.action">
                    <a href="#"><em class="base_roll"></em><span>视频发布</span></a>
                    </li>
                    <li url="toMovieManager.action">
                    <a href="#"><em class="base_sys"></em><span>视频管理</span></a>
                    </li>
                </ul>
            </div>
            <!-- -------这是我们的内容区-------- -->>
            <div class="right">
              
            </div>
            <div class="clear"></div>
        </div>
    </div>
    <div id="foot"><a href="#">上海师悦信息科技有限公司</a></div>
</div>
</body>
</html>
