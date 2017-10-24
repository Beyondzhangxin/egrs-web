<%@ page language="java" contentType="text/html;charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../../../../include/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTDHTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>信息公开</title>
</head>
<body>
	<!-- <table class="list-table datagrid">
		<thead>
			<tr>
				<th>操1作</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td></td>
				<td></td>
			</tr>
		</tbody>
	</table> -->
	<table class="list-table datagrid">
		<thead>
			<tr>
				<th>车辆型号</th>
				<th>车辆名称</th>
				<th>发动机型号</th>
				<th>发动机制造商</th>
				<th>系统名称</th>
				<th>车机型类别</th>
				<th>选项</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${page.content }" var="info">
				<tr>
					<td>${info.clxh }</td>
					<td>${info.clmc }</td>
					<td>${info.fdjxh }</td>
					<td>${info.fdjscc }</td>
					<td>${info.xzmc }</td>
					<td>${info.cllb }</td>
					<td><input type="radio" name="id" value="${info.cxid }"></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
    
    
	<div class="datagrid">
	</div>
</body>
</html>