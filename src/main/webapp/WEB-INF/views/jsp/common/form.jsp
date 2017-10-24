<%@ page language="java" contentType="text/html;charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../../../include/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTDHTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>编辑</title>
</head>
<body>
	<div class="header-form"></div>
	<div class="form-div">
		<div class="list-item">
			<div class="title">编辑</div>
			<div class="content">
				<form:form action="save.do" data-role="validator" data-show-error-hint="true" novalidate="novalidate">
					<div class="grid">
						<c:forEach items="${envfn:getMetroMessage(itemClass)}" var="metro">
							<c:if test="${metro.type eq 'hidden'}">
								<form:hidden path="${metro.field}" />
							</c:if>
							<c:if test="${metro.type != 'hidden'}">
								<div class="row cells2">
									<div class="cell">
										<label for="${metro.field }">${metro.fieldName}</label>
									</div>
									<div class="cell">
										<c:if test="${metro.type eq 'input'}">
											<div class="input-control text" data-role="${metro.type }">
												<form:input path="${metro.field }"
													placeholder="${metro.placeholder }"
													data-validate-func="${metro.dataValidateFunc }"
													data-validate-arg="${metro.dataValidateArg }"
													data-validate-hint="${metro.dataValidateHint }" />
												<span class="input-state-error mif-warning"></span>
        										<span class="input-state-success mif-checkmark"></span>
											</div>
										</c:if>
										<c:if test="${metro.type eq 'radio'}">
											<env:radiobuttons path="${metro.field }" itemValue="value"
												itemLabel="lable" items="${envfn:getFieldData(metro)}" />
										</c:if>
										<c:if test="${metro.type eq 'checkbox'}">
											<env:checkboxes path="${metro.field }" itemValue="value"
												itemLabel="lable" items="${envfn:getFieldData(metro)}" />
										</c:if>
									</div>
								</div>
							</c:if>
						</c:forEach>
					</div>
					<div class="form-actions">
						<button class="button success" type="submit">提交</button>
						<button class="button info" type="reset">重置</button>
						<button class="button" type="button" onclick="JavaScript:history.go(-1);">返回</button>
					</div>
				</form:form>
			</div>
		</div>
	</div>
</body>
</html>