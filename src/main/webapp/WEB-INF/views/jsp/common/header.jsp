<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../../../include/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTDHTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>菜单</title>
</head>
<body>
     <ul class="navul">
     	<c:forEach items="${nav }" var="item">
	     	<c:if test="${item.hasPermission}">
				<li>
					<a href="${item.url }">${item.name }</a>
					<c:if test="${not empty item.children }">
						<ul>
							<c:forEach items="${item.children }" var="child">
								<c:if test="${child.hasPermission}">
									<li><a href="${child.url }">${child.name }</a></li>
								</c:if>
							</c:forEach>
						</ul>
					</c:if>
				</li>
			</c:if>
		</c:forEach>
	</ul>
</body>
</html>