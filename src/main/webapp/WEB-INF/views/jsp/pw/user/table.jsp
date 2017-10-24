<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../../../../include/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTDHTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type"content="text/html; charset=UTF-8">
<title>审核用户</title>
</head>
<body>
     <table class="list-table datagrid">
     	 <thead>
	     	 <tr>
	     	 	<th>用户名</th>
	     	 	<th>姓名</th>
	     	 	<th>部门</th>
	     	 	<th>办公电话</th>
	     	 	<th>移动电话</th>
	     	 	<th>电子邮件</th>
	     	 	<th>操作</th>
     	 	</tr>
     	 </thead>
     	 <tbody>
     	 	<c:forEach items="${page.content }" var="item">
     	 		<tr>
	     	 		<td>${item.username }</td>
		     	 	<td>${item.name }</td>
		     	 	<td>${item.depart }</td>
		     	 	<td>${item.tel }</td>
		     	 	<td>${item.mobile }</td>
		     	 	<td>${item.email }</td>
		     	 	<td>
		     	 		<a href="form?id=${item.userid}" class="icon-edit" title="编辑"></a>
		     	 		<a href="auth?id=${item.userid}" class="icon-audit" title="权限分配"></a>
		     	 	</td>
	     	 	</tr> 
     	 	</c:forEach>
     	 </tbody>
     </table>
     <div class="datagrid">
     	<env:pagination page="${page }"/>
     </div>
</body>
</html>