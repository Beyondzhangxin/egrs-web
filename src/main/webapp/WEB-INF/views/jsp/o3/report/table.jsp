<%@ page language="java" contentType="text/html;charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../../../../include/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTDHTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商标管理</title>
</head>
<body>
	<table class="list-table datagrid">
		<thead>
			<tr>
				<th>检验报告编号</th>
				<th>车辆型号/名称</th>
				<th>发动机型号/制造商</th>
				<th>检测单位</th>
				<th>发送日期</th>
				<th>最后修改日期</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${page.content }" var="item">
				<tr>
					<td>${item.jybgbh }</td>
					<td>${item.cpxh }/${item.cpmc }</td>
					<td>${item.fdjxh }/${item.fdjscc }</td>
					<td>${item.jydwmc }</td>
					<td><fmt:formatDate value="${item.fsrq }" type="both"/></td>
					<td><fmt:formatDate value="${item.edittime }" type="both"/></td>
					<td>
						<a class="icon-view" target="_blank" href="view/${item.jybgbh }" title="查看"></a>
						<a class="icon-download" target="_blank" href="doc/${item.jybgbh }" title="doc下载"></a>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<div class="datagrid">
		<env:pagination page="${page }" />
	</div>
</body>
</html>