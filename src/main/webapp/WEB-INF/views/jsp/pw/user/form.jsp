<%@ page language="java" contentType="text/html;charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../../../../include/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTDHTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>编辑用户信息</title>
</head>
<body>
	<div class="header-form"></div>
	<div class="form-div">
		<div class="list-item">
			<div class="title">编辑用户信息</div>
			<div class="content">
				<form:form action="javascript:void(0)" data-role="validator" data-on-submit="return check();" novalidate="novalidate">
					<form:hidden path="userid"/>
					<div class="grid">
						<div class="row cells4">
							<div class="cell">用户名</div>
							<div class="cell">
								<div class="input-control text" data-role="text">
									<form:input path="username" data-validate-func="required" disabled="${not empty command.userid }"/>
									<span class="input-state-error mif-warning"></span>
    								<span class="input-state-success mif-checkmark"></span>
								</div>
							</div>
							<div class="cell">姓名</div>
							<div class="cell">
								<div class="input-control text" data-role="text">
									<form:input path="name" data-validate-func="required"  disabled="${not empty command.userid }"/>
									<span class="input-state-error mif-warning"></span>
    								<span class="input-state-success mif-checkmark"></span>
								</div>
							</div>
						</div>
						<div class="row cells4">
							<div class="cell">办公电话</div>
							<div class="cell">
								<div class="input-control text" data-role="text">
									<form:input path="tel" data-validate-func="required" />
									<span class="input-state-error mif-warning"></span>
    								<span class="input-state-success mif-checkmark"></span>
								</div>
							</div>
							<div class="cell">移动电话</div>
							<div class="cell">
								<div class="input-control text" data-role="text">
									<form:input path="mobile" data-validate-func="required" />
									<span class="input-state-error mif-warning"></span>
    								<span class="input-state-success mif-checkmark"></span>
								</div>
							</div>
						</div>
						<div class="row cells4">
							<div class="cell">电子邮件</div>
							<div class="cell">
								<div class="input-control text" data-role="text" >
									<form:input path="email" data-validate-func="required" disabled="${not empty command.userid }"/>
									<span class="input-state-error mif-warning"></span>
    								<span class="input-state-success mif-checkmark"></span>
								</div>
							</div>
							<div class="cell">部门</div>
							<div class="cell">
								<div class="input-control text" data-role="text">
									<form:input path="depart" data-validate-func="required" />
									<span class="input-state-error mif-warning"></span>
    								<span class="input-state-success mif-checkmark"></span>
								</div>
							</div>
						</div>
						<div class="row cells4">
							<div class="cell">职责</div>
							<div class="cell">
								<div class="input-control text" data-role="text">
									<form:input path="duty" />
								</div>
							</div>
							<div class="cell">传真</div>
							<div class="cell">
								<div class="input-control text" data-role="text">
									<form:input path="fax" />
								</div>
							</div>
						</div>
						<div class="row cells4">
							<div class="cell">身份证编号</div>
							<div class="cell">
								<div class="input-control text" data-role="text">
									<form:input path="sfzbh" />
								</div>
							</div>
							<div class="cell">地址</div>
							<div class="cell">
								<div class="input-control text">
									<form:input path="uaddress"/>
								</div>
							</div>
						</div>
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
	<script type="text/javascript">
		function check(){
			$.post('save',$("form").serialize(),function(data){
				if(data.flag){
					window.location.href = "index";
				}
			});
			return false;
		}
	</script>
</body>
</html>