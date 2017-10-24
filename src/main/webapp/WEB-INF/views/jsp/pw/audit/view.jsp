<%@ page language="java" contentType="text/html;charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../../../../include/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTDHTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户注册查看</title>
<link href="${contextPath }/css/list.css" rel="stylesheet"
	type="text/css">
</head>
<body>
	<div class="header-form"></div>
	<div class="form-div">
		<table class="view-table">
			<tr>
				<th>开户企业名称</th>
				<td colspan="3">${item.companyName }</td>
			</tr>
			<tr>
				<th>开户企业地址</th>
				<td colspan="3">${item.companyAddress }</td>
			</tr>
			<tr>
				<th>统一社会信用代码</th>
				<td colspan="3">${item.creditCode }</td>
			</tr>
			<tr>
				<th>省份</th>
				<td colspan="3">${item.province }</td>
			</tr>
			<tr>
				<th width="194">邮编</th>
				<td width="304">${item.zipCode }</td>
				<th width="194">电子邮件</th>
				<td>${item.email }</td>
			</tr>
			<tr>
				<th>电话</th>
				<td>${item.tel }</td>
				<th>传真</th>
				<td>${item.fax }</td>
			</tr>
			<tr>
				<th>负责人</th>
				<td>${item.header }</td>
				<th>联系人</th>
				<td>${item.linkman }</td>
			</tr>
			<tr>
				<th>法定代表人</th>
				<td colspan="3">${item.legalPerson }</td>
			</tr> 
			<tr>
				<th>集团名称</th>
				<td colspan="3">${item.groupName }</td>
			</tr> 
			<tr>
				<th>联系人</th>
				<td>${item.groupLinkman }</td>
				<th>联系电话</th>
				<td>${item.groupTel }</td>
			</tr>
			<tr>
				<th>电子邮件</th>
				<td>${item.groupEmail }</td>
				<th>传真</th>
				<td>${item.groupFax }</td>
			</tr>
			<tr>
				<th>企业类别</th>
				<td colspan="3">${item.companyType.value }</td>
			</tr>
			<c:forEach items="${carTypes }" var="carType">
				<tr>
					<th>${carType.value}</th>
					<td colspan="3">
						<c:forEach items="${productTypes }" var="productType">
							<c:if test="${productType.type eq carType }">
								<c:if test="${fn:contains(item.productTypes,productType ) }">
									<label><input type="checkbox" disabled="disabled" checked="checked"/>${productType.value} </label>
								</c:if>
								<c:if test="${!fn:contains(item.productTypes,productType ) }">
									<label><input type="checkbox" disabled="disabled"/>${productType.value} </label>
								</c:if>
							</c:if>
						</c:forEach>
					</td>
				</tr>
			</c:forEach>
		</table>
		<div class="form-actions">
			<c:if test="${empty item.audited }">
				<button class="button success" type="button" onclick="audit(${item.id})">审核</button>
			</c:if>
			<button class="button" type="button" onclick="JavaScript:history.go(-1);">返回</button>
		</div>
		<script type="text/javascript">
			function audit(id){
				metroDialog.create({
				    title: "审核意见",
				    content: '<div class="input-control textarea" data-role="input" data-text-auto-resize="true" data-text-max-height="200" style="width:100%;"><textarea name="view"></textarea></div>',
				    actions: [
				    	{
				            title: "通过",
				            cls: "success",
				            onclick: function(el){
				            	$.post("auditSucess",{registerId:id,view:$(el).find("[name='view']").val()},function(data){
									if(data.flag){
										$.Notify({
											content: data.message,
										    type: 'success'
										});
										$(el).data('dialog').close();
										page();
									}
								});
				            }
				        },
				        {
				            title: "不通过",
				            cls: "danger",
				            onclick: function(el){
				            	$.post("auditFail",{registerId:id,view:$(el).find("[name='view']").val()},function(data){
									if(data.flag){
										$.Notify({
											content: data.message,
										    type: 'success'
										});
										$(el).data('dialog').close();
										page();
									}
								});
				            }
				        },
				        {
				            title: "取消",
				            cls: "js-dialog-close"
				        }
				    ],
				    options: { // dialog options
				    	width: '400'
				    }
				});
			}
		</script>
	</div>
</body>
</html>