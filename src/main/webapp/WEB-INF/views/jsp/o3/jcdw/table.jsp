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
				<c:forEach items="${envfn:getMetroMessage(itemClass)}"
					var="metroMessage">
					<c:if test="${metroMessage.list }">
						<th>${metroMessage.fieldName }</th>
					</c:if>
				</c:forEach>
				<th>授权下载附录</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${page.content }" var="item">
				<tr>
					<c:forEach items="${envfn:getMetroMessage(itemClass)}"
						var="metroMessage">
						<c:if test="${metroMessage.list }">
							<td title="<env:view item="${item }" metro="${metroMessage }" />"><env:view item="${item }" metro="${metroMessage }" /></td>
						</c:if>
					</c:forEach>
					<td><c:if test="${fn:contains(item.manufids,manufid) }">是</c:if>
						<c:if test="${!fn:contains(item.manufids,manufid) }">否</c:if></td>
					<td><c:if test="${!fn:contains(item.manufids,manufid) }">
							<a onclick="addAuth('${envfn:idValue(item)}')" class="icon-grant"
								href="javascript:void(0);" title="授权"></a>
						</c:if> <c:if test="${fn:contains(item.manufids,manufid) }">
							<a onclick="removeAuth('${envfn:idValue(item)}')"  class="icon-non-grant"
								href="javascript:void(0);" title="取消授权"></a>
						</c:if>
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