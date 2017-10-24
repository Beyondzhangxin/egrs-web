<%@ page language="java" contentType="text/html;charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../../../../include/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTDHTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="${contextPath }/css/list.css" rel="stylesheet" type="text/css">
<title>信息公开</title>
</head>
<body>
	<div class="header-icon">
		<h1>信息公开</h1>
		<hr>
		<p>	</p>
	</div>
	<div class="con-seacher">
		<form onsubmit="return false;" id="qry-form">
			<div class="grid">
				<div class="row cells4">
					<div class="cell">
						<div>系族名称</div>
						<div class="input-control text">
							<input name="xzmc" type="text" />
						</div>
					</div>
					<div class="cell">
						<div>车辆型号</div>
						<div class="input-control text">
							<input name="clxh" type="text"/>
						</div>
					</div>
					<div class="cell">
						<div>发动机型号</div>
						<div class="input-control text">
							<input name="fdjxh" type="text" />
						</div>
					</div>
					<div class="cell">
						<div class="input-control text">
							<input type="button" class="qry-btn bg-blue02 fg-white" value="搜 索" onclick="page()">
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
	<div class="content-item">
		<div class="buttons">
	       <a class="button bg-blue02 fg-white" onclick="create()">创建信息公开表</a>
	     </div>
	</div>
	<div class="ht50"></div>
	<script type="text/javascript">
		function create(){
			if($("input[type='radio']:checked").val() == null){
				$.Notify({
					content: "请选择要操作的车类型！",
				    type: 'alert'
				});
			}else{
				window.location.href= "/ergs/o3/infoOpen/infoCreate?cxid="+$("input[type='radio']:checked").val();
				}
		}
	</script>
</body>
</html>