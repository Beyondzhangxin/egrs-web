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
	     	 	<th>注册时间</th>
	     	 	<th>企业类别</th>
	     	 	<th>开户企业名称</th>
	     	 	<th>统一社会信用代码</th>
	     	 	<th>审核状态</th>
	     	 	<th>操作</th>
     	 	</tr>
     	 </thead>
     	 <tbody>
     	 	<c:forEach items="${page.content }" var="item">
     	 		<tr>
	     	 		<td><fmt:formatDate value="${item.registTime }" type="both"/></td>
		     	 	<td><env:view item="${item }" field="companyType"/></td>
		     	 	<td>${item.companyName }</td>
		     	 	<td>${item.creditCode }</td>
		     	 	<td>
		     	 		<c:if test="${empty item.audited }">
		     	 			待审核
		     	 		</c:if>
		     	 		<c:if test="${item.audited }">
		     	 			审核通过
		     	 		</c:if>
		     	 		<c:if test="${item.audited eq false}">
		     	 			审核不通过
		     	 		</c:if>
		     	 	</td>
		     	 	<td>
		     	 		<a href="view?id=${item.id}" class="icon-view" title="查看"></a>
		     	 		<c:if test="${empty item.audited }">
		     	 			<span class="icon-audit" onclick="audit(${item.id});" title="审核"></span>
		     	 		</c:if>
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