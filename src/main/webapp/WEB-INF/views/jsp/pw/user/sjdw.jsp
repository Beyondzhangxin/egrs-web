<%@ page language="java" contentType="text/html;charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../../../../include/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTDHTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>企业资料</title>
</head>
<body>
	<div class="header-form"></div>
	<div class="form-div">
		<div class="list-item info">
			<div class="title">企业资料</div>
			<div class="content">
				<form:form action="javascript:void(0)" data-role="validator" data-on-submit="return check();" novalidate="novalidate">
					<form:hidden path="manufid" />
					<form:hidden path="type"  />
					<div class="grid">
						<div class="row">
							<div class="cell" style="width:100px">企业所属类别</div>
							<div class="cell" style="width:800px">
								<c:forEach items="${types }" var="type">
									<label class="input-control checkbox small-check">
									    <input class="companyType" type="checkbox" ${fn:substring(command.type, type.ordinal, type.ordinal+1) eq 1?"checked":""}>
									    <span class="check"></span>
									    <span class="caption">${type.value}</span>
									</label>
								</c:forEach>
							</div>
						</div>
						<div class="row cells4">
							<div class="cell">企业名称</div>
							<div class="cell">${command.manuf }</div>
							<div class="cell">企业地址</div>
							<div class="cell">${command.qydz }</div>
						</div>
						
						<div class="row cells4">
							<div class="cell">法定代表人</div>
							<div class="cell">${command.fddbr }</div>
							<div class="cell">企业代码</div>
							<div class="cell">${command.ymanufid }</div>
						</div>
						<div class="row cells4">
							<div class="cell">联系人</div>
							<div class="cell">
								<div class="input-control text" data-role="text">
									<form:input path="lxr" data-validate-func="required"
										data-validate-hint="请输入联系人" />
									<span class="input-state-error mif-warning"></span>
    								<span class="input-state-success mif-checkmark"></span>
								</div>
							</div>
							<div class="cell">联系电话</div>
							<div class="cell">
								<div class="input-control text" data-role="text">
									<form:input path="tel" data-validate-func="required"
										data-validate-hint="请输入联系电话" />
									<span class="input-state-error mif-warning"></span>
    								<span class="input-state-success mif-checkmark"></span>
								</div>
							</div>
						</div>
					
						<div class="row cells4">
							<div class="cell">电子邮件</div>
							<div class="cell">
								<div class="input-control text" data-role="text">
									<form:input path="email" data-validate-func="required"
										data-validate-hint="请输入电子邮件" disabled="true"/>
									<span class="input-state-error mif-warning"></span>
    								<span class="input-state-success mif-checkmark"></span>
								</div>
							</div>
							<div class="cell">传真</div>
							<div class="cell">
								<div class="input-control text" data-role="text">
									<form:input path="fax" data-validate-func="required"
										data-validate-hint="请输入传真" />
									<span class="input-state-error mif-warning"></span>
    								<span class="input-state-success mif-checkmark"></span>
								</div>
							</div>
						</div>
						<div class="row cells4">
							<div class="cell">企业电话</div>
							<div class="cell">
								<div class="input-control text" data-role="text">
									<form:input path="qytel" data-validate-func="required"
										data-validate-hint="请输入企业电话" />
									<span class="input-state-error mif-warning"></span>
    								<span class="input-state-success mif-checkmark"></span>
								</div>
							</div>
							<div class="cell">法人联系电话</div>
							<div class="cell">
								<div class="input-control text" data-role="text">
									<form:input path="frtel" data-validate-func="required"
										data-validate-hint="请输入法人联系电话" />
									<span class="input-state-error mif-warning"></span>
    								<span class="input-state-success mif-checkmark"></span>
								</div>
							</div>
						</div>
						<div class="row cells4">
							<div class="cell">邮政编码</div>
							<div class="cell">
								<div class="input-control text" data-role="text">
									<form:input path="code"/>
								</div>
							</div>
							<div class="cell">申报负责人</div>
							<div class="cell">
								<div class="input-control text" data-role="text">
									<form:input path="sbfzr" data-validate-func="required"
										data-validate-hint="请输入申报负责人" />
									<span class="input-state-error mif-warning"></span>
    								<span class="input-state-success mif-checkmark"></span>
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
			var types=new Array();
			$(".companyType").each(function(){
				types.push($(this).is(':checked')?'1':'0');
			});
			$("input[name='type']").val(types.join(''));
			$.post('sjdw',$("form").serialize(),function(data){
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