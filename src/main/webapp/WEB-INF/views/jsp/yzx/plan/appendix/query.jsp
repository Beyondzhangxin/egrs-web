<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../../../../../include/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTDHTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type"content="text/html; charset=UTF-8">
<title>附录查询</title>
</head>
<body>
	<div class="header-icon">
	      <h1>附录查询</h1>
	      <hr>
	      <p></p>
	</div>
	<div class="con-seacher">
		<form:form onsubmit="return false;" id="qry-form">
			<div class="grid">
				<div class="row cells4">
					<div class="cell">
						<div>车辆类别</div>
						<div class="input-control select">
							<form:select path="vehicle" items="${vehicles }" itemLabel="lable" itemValue="value"></form:select>
						</div>
					</div>
					<div class="cell">
						<div>附录编号</div>
						<div class="input-control text">
							<form:input path="flbh"/>
						</div>
					</div>
					<div class="cell">
						<div>车型(发动机)型号</div>
						<div class="input-control text" >
							<form:input path="xh"/>
						</div>
					</div>
					<div class="cell">
						<div class="input-control text">
							<input type="button" class="qry-btn bg-blue02 fg-white" value="搜 索"  onclick="page(0)">
						</div>
					</div>
				</div>
			</div>
		</form:form>
	</div>
      <div class="table-div"></div>
	   <script type="text/javascript">
		   function page(pageNum,pageSize){
			    url = $("#vehicle").val().toLowerCase()+"/table?";
				url += $("#qry-form").serialize();
		 		$(".table-div").load(env.page_url(url,pageNum,pageSize));
		 	}
			page();
		</script>
</body>
</html>