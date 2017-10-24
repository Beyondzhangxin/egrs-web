<%@ page language="java" contentType="text/html;charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../../../../include/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" dir="ltr" lang="zh-CN"
	xml:lang="zh-CN">
<head>
<title>计划书检测设备</title>
<link href="/css/list.css" rel="stylesheet" type="text/css" />
</head>
<body>
	<jsp:include page="plannav.jsp" />
	<div class="form-div">
		<div class="list-item">
			<div class="title">填写检验设备的标准</div>
			<div class="con quality">
				<form:form action="${contextPath }/ergs/yzx/plan/planFile/addDevice"
					modelAttribute="planFiles" method="get" data-role="validator"
					data-hint-mode="hint" data-hint-easing="easeOutBounce"
					novalidate="novalidate" data-on-submit="return true">
					<div class="grid">
						<div class="blue">检验设备管理</div>
						<div class="row cells5">
							<div class="cell"></div>
							<div class="cell colspan4">相关文件号</div>
						</div>
						<div class="row cells5">
							<div class="cell">设备台账</div>
							<div class="cell colspan4">
								<div class="input-control text required">
									<form:input path="sbtzwjh" data-validate-func="required" data-validate-hint="请输入设备台账文件号" />
									<span class="input-state-error mif-warning"></span>
									<span class="input-state-success mif-checkmark"></span>
								</div>
							</div>
						</div>
						<div class="row cells5">
							<div class="cell">设备管理制度</div>
							<div class="cell colspan4">
								<div class="input-control text required">
									<form:input path="sbglzdwjh" data-validate-func="required" data-validate-hint="请输入设备管理制度文件号" />
									<span class="input-state-error mif-warning"></span>
									<span class="input-state-success mif-checkmark"></span>
								</div>
							</div>
						</div>
					</div>
					<div class="form-actions">
						<c:if test="${plan.status==0 }">
							<button class="button success" type="submit">保存</button>
							<button class="button info" type="reset">重置</button>
						</c:if>
						<button class="button" type="button" onclick="JavaScript:history.go(-1);">返回</button>
					</div>
					<input type="hidden" name="jhsbh" value="${planFiles.jhsbh }" />
				</form:form>
			</div>
		</div>
	</div>
</body>
</html>
