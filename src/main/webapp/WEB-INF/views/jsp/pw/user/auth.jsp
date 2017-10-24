<%@ page language="java" contentType="text/html;charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../../../../include/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTDHTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改用户权限</title>
</head>
<body>
	<div class="header-form"></div>
	<div class="form-div">
		<div class="list-item">
			<div class="title">修改用户“${user.name }”权限</div>
			<div class="content">
				<form action="javascript:void(0)"  data-role="validator" data-on-submit="return check();" novalidate="novalidate">
					<input type="hidden" name="id" value="${user.userid }">
					<div class="treeview" data-role="treeview">
						<ul>
						<c:forEach items="${allPermissions }" var="allPermission">
							   <li class="collapsed" data-mode="checkbox" data-name="${empty allPermission.children?'auth':'parent'}" data-value="${allPermission.id }">
								   <span class="leaf">${allPermission.name }</span>
								   <c:if test="${not empty allPermission.children  }">
								   		<span class="node-toggle"></span>
									   <ul>
							                <c:forEach items="${allPermission.children }" var="child">
												 <li class="collapsed" data-mode="checkbox" data-name="${empty child.children?'auth':'parent'}" data-value="${child.id }"><span class="leaf">${child.name }</span></li>
													 <c:if test="${not empty child.children  }">
												   		<span class="node-toggle"></span>
													    <ul>
											                <c:forEach items="${child.children }" var="childer">
																 <li class="collapsed" data-mode="checkbox" data-name="${empty childer.children?'auth':'parent'}" data-value="${childer.name }" ><span class="leaf">${childer.name }</span></li>
															</c:forEach>
											            </ul>
									            	</c:if>
											</c:forEach>
							            </ul>
						            </c:if>
					            </li>
						</c:forEach>
					</ul>
					</div>
					<div class="form-actions">
						<button class="button success" type="submit">提交</button>
						<button class="button" type="button" onclick="JavaScript:history.go(-1);">返回</button>
					</div>
				</form>
			</div>
		</div>
	</div>
	<c:forEach items="${allPermissions }" var="allPermission">
		<c:if test="${allPermission.hasPermission && empty allPermission.children}">
			<script type="text/javascript">
				$("[value='${allPermission.id}']").click();
			</script>
		</c:if>
		<c:forEach items="${allPermission.children }" var="child">
			<c:if test="${child.hasPermission && empty child.children}">
				<script type="text/javascript">
					$("[value='${child.id}']").click();
				</script>
			</c:if>
			<c:forEach items="${child.children }" var="childer">
				<c:if test="${childer.hasPermission && empty childer.children}">
					<script type="text/javascript">
						$("[value='${childer.id}']").click();
					</script>
				</c:if>
			</c:forEach>
		</c:forEach>
	</c:forEach>
	<script type="text/javascript">
		function check(){
			$.post('changAuth',$("form").serialize(),function(data){
				if(data.flag){
					window.location.href = "index";
				}
			});
			return false;
		}
	</script>
</body>
</html>