<%@ page language="java" contentType="text/html;charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../../../../include/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTDHTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="${contextPath }/css/list.css" rel="stylesheet" type="text/css">
<title>检测单位授权</title>
</head>
<body>
	<div class="header-icon">
		<h1>检测单位</h1>
		<hr>
		<p>检测单位需要授权后才能下载您的附录	</p>
	</div>
	<div class="table-div"></div>
	<script type="text/javascript">
		function page(pageNum,pageSize){
		    url = "table?";
	 		$(".table-div").load(env.page_url(url,pageNum,pageSize));
	 	}
		page();
		function addAuth(id){
			$.post("addAuth",{jcdwId:id},function(data){
				$.Notify({
					content: data.message,
				    type: 'success'
				});
				page();
			});
		}
		function removeAuth(id){
			$.post("removeAuth",{jcdwId:id},function(data){
				$.Notify({
					content: data.message,
					keepOpen : true,
				    type: 'success'
				});
				page();
			});
		}
	</script>
</body>
</html>