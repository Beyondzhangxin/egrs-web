<%@ page language="java" contentType="text/html;charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../../../../include/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTDHTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="${contextPath }/css/list.css" rel="stylesheet" type="text/css">
<title>检验报告</title>
</head>
<body>
	<div class="header-icon">
		<h1>检验报告</h1>
		<hr>
		<p></p>
	</div>
	<div class="con-seacher">
		<form onsubmit="return false;" id="qry-form">
			<div class="grid">
				<div class="row cells4">
					<div class="cell">
						<div>检验报告编号</div>
						<div class="input-control text">
							<input type="text" name="jybgbh"/>
						</div>
					</div>
					<div class="cell">
						<div>车辆型号</div>
						<div class="input-control text">
							<input type="text" name="cpxh"/>
						</div>
					</div>
					<div class="cell">
						<div>发动机型号</div>
						<div class="input-control text">
							<input type="text" name="fdjxh"/>
						</div>
					</div>
					<div class="cell">
						<div class="input-control text">
							<input type="button" class="qry-btn bg-blue02 fg-white" value="搜 索" onclick="page(0)">
						</div>
					</div>
				</div>
			</div>
		</form>
	</div>
	<div class="table-div"></div>
	<script type="text/javascript">
		function page(pageNum,pageSize){
		    url = "table?";
			url += $("#qry-form").serialize();
	 		$(".table-div").load(env.page_url(url,pageNum,pageSize));
	 	}
		page();
	</script>
</body>
</html>