<%@ page language="java" contentType="text/html;charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../../../../include/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" dir="ltr" lang="zh-CN"
	xml:lang="zh-CN">
<head>
<title>机动车环保信息公开系统--注册页</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta content="none" name="Robots" />
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
<link href="${request.contextPath }/css/base.css" rel="stylesheet" type="text/css" />
<link href="${request.contextPath }/css/regsiter.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="${request.contextPath }/webjarslocator/jquery/jquery.js"></script>
<script type="text/javascript" src="${request.contextPath }/js/regsiter.js"></script>
</head>
<body>
	<div class="header">
		<div class="head">机动车和非道路移动机械环保信息公开系统</div>
	</div>
	<div class="content-bg">
	<div class="content">
		<div class="con-row">
			<ul>
				<li class="border-blue">基本信息 <span class="circle-blue">01</span>
				</li>
				<li class="border-gray">完善信息 <span class="circle-gray">02</span>
				</li>
				<li class="border-gray">注册成功 <span class="circle-gray">03</span>
				</li>
			</ul>
			<div class="c"></div>
		</div>

		<div class="main">
			<form action="${contextPath }/egrs/audit/regist" onsubmit="return false;">
			<div class="basic-info">
				<table>
					<tr>
						<td width="90"><span class="red">*</span> 开户企业名称</td>
						<td colspan="2"><input type="text" name="companyName" class="required" placeholder="请输入开户企业名称"/></td>
						<td><span class="red">*</span> 开户企业地址</td>
						<td colspan="2"><input type="text" name="companyAddress" class="required" placeholder="请输入开户企业地址"/></td>
					</tr>
					<tr>

					</tr>
					<tr>
						<td><span class="red">*</span> 社会信用代码</td>
						<td><input type="text" name="creditCode" class="required" placeholder="请输入社会信用代码"/></td>
						<td>省份</td>
						<td><input type="text" name="province"/></td>
						<td>邮编</td>
						<td><input type="text" name="zipCode"/></td>
					</tr>
					<tr>
						<td><span class="red">*</span> 电子邮件</td>
						<td><input type="text" name="email" class="required" placeholder="请输入电子邮件"/></td>
						<td>电话</td>
						<td><input type="text" name="tel"/></td>
						<td>传真</td>
						<td><input type="text" name="fax"/></td>
					</tr>
					<tr>
						<td><span class="red">*</span> 法定代表</td>
						<td><input type="text" name="legalPerson" class="required" placeholder="请输入法定代表人"/></td>
						<td>负责人</td>
						<td><input type="text" name="header"/></td>
						<td>联系人</td>
						<td><input type="text" name="linkman"/></td>
					</tr>
					<tr>
						<td colspan="6"><div class="line"></div></td>
					</tr>
					<tr>
						<td>集团名称</td>
						<td colspan="3"><input type="text" name="groupName" placeholder="说明生产企业隶属于哪个集团，没有则写“无”"/></td>
						<td>联系人</td>
						<td><input type="text" name="groupLinkman"/></td>
					</tr>
					<tr>
						<td>电子邮件</td>
						<td><input type="text" name="groupEmail"/></td>
						<td>电话</td>
						<td><input type="text" name="groupTel"/></td>
						<td>传真</td>
						<td><input type="text" name="groupFax"/></td>
					</tr>
					<tr>
						<td>企业类别</td>
						<td>
							<c:forEach items="${companyTypes }" var="companyType">
								<label>
									<input name="companyType" type="radio" value="${companyType.ordinal }" ${companyType.ordinal==0 ? "checked='checked'": ""} />${companyType.value }
								</label>
							</c:forEach>
						</td>
					</tr>


				</table>
				<div class="button-all">
					<span>已有账号，<a href="${contextPath }/login">登录</a></span>
					<input type="button" value="下一步"/>
				</div>
			</div>
			<div class="prefect-info" style="display: none;">
				<table>
					<c:forEach items="${carTypes }" var="carType">
						<tr>
							<td><label>${carType.value}</label></td>
							<td>
								<c:forEach items="${productTypes }" var="productType">
									<c:if test="${productType.type eq carType }">
										<label><input name="productTypes" type="checkbox" value="${productType.ordinal }" />${productType.value} </label>
									</c:if>
								</c:forEach>
							</td>
						</tr>
					</c:forEach>
				</table>
				<div class="error-type"></div>
				<div class="button-all">
					<input type="button" value="提交"/>
				</div>
			</div>
			</form>
			<div class="success"  style="display: none;">
				<img class="mr20" src="${contextPath }/images/icon/success.png"/>注册成功，我们马上为您提交审核，审核结果将以<span
					class="cblue">邮件</span>的方式发送到您的邮箱，请注意查收！ 
			</div>
		</div>
	</div>
	</div>
	<script type="text/javascript">
		$(".basic-info .button-all input[type='button']").click(function(){
			$(".basic-info .required").removeClass("error");
			$(".basic-info .required").each(function(){
				if($(this).val()==""){
					$(this).addClass("error");
					$(this).focus();
				}
			});
			if($(".error").length>0){
				return;
			}
			$(".basic-info").hide();
			$(".prefect-info").show();
			$(".con-row ul li").removeClass("border-blue").addClass("border-gray");
			$(".con-row ul li").eq(1).removeClass("border-gray").addClass("border-blue");
		});
		$(".prefect-info .button-all input[type='button']").click(function(){
			if($("input[name='productTypes']:checked").length==0){
				$(".error-type").html("请至少选择一类产品");
			}else{
				$(".error-type").empty();
				$.post($("form").attr("action"),$("form").serialize(),function(data){
					console.info(data);
					if(data.flag){
						$(".prefect-info").hide();
						$(".con-row ul li").removeClass("border-blue").addClass("border-gray");
						$(".con-row ul li").eq(2).removeClass("border-gray").addClass("border-blue");
						$(".success").show();
						$(".main").removeClass("main");
					}
				});
			}
			return false;
		});
</script>
</body>
</html>
