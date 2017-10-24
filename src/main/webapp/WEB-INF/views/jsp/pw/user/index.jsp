<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../../../../include/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTDHTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type"content="text/html; charset=UTF-8">
<title>用户管理</title>
<link href="${contextPath }/css/list.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div class="header-icon">
	      <h1>用户管理</h1>
	      <hr>
	      <p>对本企业用户进行管理</p>
	</div>
	<div class="con-seacher">
		<form onsubmit="return false;" id="qry-form">
			<div class="grid">
				<div class="row cells3">
					<div class="cell">
						<div>用户名</div>
						<div class="input-control text">
							<input type="text" name="username"/>
						</div>
					</div>
					<div class="cell">
						<div>姓名</div>
						<div class="input-control text">
							<input type="text" name="name"/>
						</div>
					</div>
					<div class="cell">
						<div class="input-control text">
							<input type="button" class="qry-btn bg-blue02 fg-white" value="搜 索"  onclick="page(0)">
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
	       <a class="button success" href="form">新增</a>
	     </div>
	</div>
</body>
</html>