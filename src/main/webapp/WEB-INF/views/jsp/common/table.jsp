<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../../../include/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTDHTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type"content="text/html; charset=UTF-8">
<title>商标管理</title>
</head>
<body>
     <table class="list-table datagrid">
     	 <thead>
	     	 <tr>
	     	 	<c:forEach items="${envfn:getMetroMessage(itemClass)}" var="metroMessage">
	     	 		<c:if test="${metroMessage.list }">
	     	 			<th>${metroMessage.fieldName }</th>
	     	 		</c:if>
	     	 	</c:forEach>
	     	 	<th>操作</th>
     	 	</tr>
     	 </thead>
     	 <tbody>
	     	 <c:forEach items="${page.content }" var="item">
	     	 	<tr>
	     	 		<c:forEach items="${envfn:getMetroMessage(itemClass)}" var="metroMessage">
		     	 		<c:if test="${metroMessage.list }">
	     	 				<td><env:view item="${item }" metro="${metroMessage }"/></td>
		     	 		</c:if>
		     	 	</c:forEach>
		     	 	<td><a class="icon-edit" href="save?${envfn:idField(item)}=${envfn:idValue(item)}" title="编辑"></a>
		     	 	<span class="icon-delete" title="删除" onclick="env.del('${envfn:idValue(item)}')"></span>
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