<%@ page language="java" contentType="text/html;charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../../../../include/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTDHTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>个人信息</title>
</head>
<body>
	<div class="header-form"></div>
	<div class="form-div">
		<div class="list-item">
			<div class="title">个人信息</div>
			<div class="content">
				<form:form action="update" modelAttribute="user" onsubmit="return check();">
					<form:hidden path="userid" />
					<div class="grid info">
						<div class="row cells4">
							<div class="cell">用户名</div>
							<div class="cell">${user.username }</div>
							<div class="cell">昵称</div>
							<div class="cell">${user.name }</div>
						</div>
						<div class="row cells4">
							<div class="cell">办公电话</div>
							<div class="cell">
								<div class="input-control text" data-role="text">
									<form:input path="tel" data-validate-func="required"
										data-validate-hint="请输入办公电话" />
								</div>
							</div>
							<div class="cell">移动电话</div>
							<div class="cell">
								<div class="input-control text" data-role="text">
									<form:input path="mobile" data-validate-func="required"
										data-validate-hint="请输入移动电话" />
								</div>
							</div>
						</div>
						<div class="row cells4">
							<div class="cell">电子邮件</div>
							<div class="cell">
								<div class="input-control text" data-role="text">
									<form:input path="email" data-validate-func="required"
										data-validate-hint="请输入电子邮件" disabled="true"/>
								</div>
							</div>
							<div class="cell">传真</div>
							<div class="cell">
								<div class="input-control text" data-role="text">
									<form:input path="fax"  />
								</div>
							</div>
						</div>
						<div class="row cells4">
							<div class="cell">部门</div>
							<div class="cell">
								<div class="input-control text" data-role="text">
									<form:input path="depart" data-validate-func="required"
										data-validate-hint="请输入所属部门" />
								</div>
							</div>
							<div class="cell">职责</div>
							<div class="cell">
								<div class="input-control text" data-role="text">
									<form:input path="duty"  />
								</div>
							</div>
						</div>
						<div class="row cells4">
							<div class="cell">地址</div>
							<div class="cell colspan3">
								<div class="input-control text full-size" data-role="text">
									<form:input path="uaddress" cssStyle="width:770px;" />
								</div>
							</div>
						</div>
					</div>
					<div class="form-actions">
						<button class="button success" type="submit">提交</button>
					</div>
				</form:form>
			</div>
 		</div>
	</div>
	<script type="text/javascript">
		function check(){
			$.post($("form").attr("action"),$("form").serialize(),function(data){
				if(data.flag){
					$.Notify({
						content: data.message,
					    type: 'success'
					});
				}
			});
			return false;
		}
	</script>
</body>
</html>