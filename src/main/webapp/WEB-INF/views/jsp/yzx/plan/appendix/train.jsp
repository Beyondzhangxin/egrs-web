<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../../../../../include/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" dir="ltr" lang="zh-CN" xml:lang="zh-CN">
<head>
    <title>计划书</title>
    <meta content="none" name="Robots" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
     <link href="/css/detail.css" rel="stylesheet" type="text/css" /> 
    <script type="text/javascript" src="/js/detail.js"></script>
</head>
<body>
	
	<div id="detail">
	 <span class="d-title">传动系</span>
 	 <form:form modelAttribute="car"  data-reload="true" action="javascript:void(0)" data-role="validator" data-on-submit="sub(this,'cdx')" novalidate="novalidate"  > 
        <div class="grid">
         	<div class="row cells2 title">
 	 			<div class="cell">
					离合器型式
 	 			</div>
 	 			<div class="cell">
 	 				变速箱型式
 	 			</div>
 	 		</div>
 	 		<div class="row cells2">
 	 			<div class="cell">
 	 				<div class="input-control text required">
						<form:input path="lhqxs" disabled="${flag }" data-validate-func="required" data-validate-hint="请输入离合器型式" type="text"/>
						<span class="input-state-error mif-warning"></span>
						<span class="input-state-success mif-checkmark"></span>
					</div>
 	 			</div>
 	 			<div class="cell">
					<div class="input-control select ">
						<form:select path="bsxxs" disabled="${flag }">
	        				<form:option value="手动">手动</form:option>
	        				<form:option value="自动">自动</form:option>
	        				<form:option value="手自一体">手自一体</form:option>
	        				<form:option value="无级变速(CVT)">无级变速(CVT)</form:option>
	        			</form:select>
					</div>
 	 			</div>
 	 		</div>
 	 	    <div class="row cells2 title">
 	 			<div class="cell">
					变速箱型号
 	 			</div>
 	 			<div class="cell">
 	 				变速箱厂家
 	 			</div>
 	 		</div>
 	 		<div class="row cells2">
 	 			<div class="cell">
 	 				<div class="input-control text">
						<form:input path="bsxxh" disabled="${flag }"/>
						<span class="input-state-error mif-warning"></span>
						<span class="input-state-success mif-checkmark"></span>
					</div>
 	 			</div>
 	 			<div class="cell">
					<div class="input-control text">
						<form:input path="bsxscc" disabled="${flag }"/>
						<span class="input-state-error mif-warning"></span>
						<span class="input-state-success mif-checkmark"></span>
					</div>

 	 			</div>
 	 		</div>
 	 		<div class="row cells2 title">
 	 			<div class="cell">
					发动机飞轮的转动惯量㎏·㎡
 	 			</div>
 	 			<div class="cell">
 	 				不带啮合齿轮的附加转动惯量㎏·㎡
 	 			</div>
 	 		</div>
 	 		<div class="row cells2">
 	 			<div class="cell">
 	 				<div class="input-control text">
						<form:input path="flzdgl" disabled="${flag }"/>
						<span class="input-state-error mif-warning"></span>
						<span class="input-state-success mif-checkmark"></span>
					</div>
 	 			</div>
 	 			<div class="cell">
					<div class="input-control text">
						<form:input path="fjzdgl" disabled="${flag }"/>
						<span class="input-state-error mif-warning"></span>
						<span class="input-state-success mif-checkmark"></span>
					</div>
 	 			</div>
 	 		</div>
 	 		 <div class="row cells2 title">
 	 			<div class="cell">
					传递的最大扭矩（Nm）
 	 			</div>
 	 			<div class="cell">
 	 				相对于发动机的位置
 	 			</div>
 	 		</div>
 	 		<div class="row cells2">
 	 			<div class="cell">
 	 				<div class="input-control text">
						<form:input path="zdnj" disabled="${flag }"/>
						<span class="input-state-error mif-warning"></span>
						<span class="input-state-success mif-checkmark"></span>
					</div>
 	 			</div>
 	 			<div class="cell">
					<div class="input-control text">
						<form:input path="xdwz" disabled="${flag }"/>
						<span class="input-state-error mif-warning"></span>
						<span class="input-state-success mif-checkmark"></span>
					</div>
 	 			</div>
 	 		</div>
 	 		<div class="row title">
 	 			<div class="cell">
					档位数
 	 			</div>
 	 		</div>
 	 		<div class="row">
 	 			<div class="cell">
 	 				<div class="input-control text">
						<form:input path="bsxdws" disabled="${flag }"/>
						<span class="input-state-error mif-warning"></span>
						<span class="input-state-success mif-checkmark"></span>
					</div>
 	 			</div>
 	 		</div>
 	 		<div class="row cells4 title">
 	 			<div class="cell">
					档位
 	 			</div>
 	 			<div class="cell">
					变速箱内部速比
 	 			</div>
 	 			<div class="cell">
					主传动比
 	 			</div>
 	 			<div class="cell">
					总速比
 	 			</div>
 	 		</div>
 	 		<div class="row cells4">
 	 			<div class="cell">
 	 				<div>CVT时最大值</div>
 	 				<div>(仅对无极变速)</div>
 	 			</div>
 	 			<div class="cell">
 	 				<div class="input-control text">
						<form:input path="nbsbcvtmax" disabled="${flag }"/>
						<span class="input-state-error mif-warning"></span>
						<span class="input-state-success mif-checkmark"></span>
					</div>
 	 			</div>
 	 			<div class="cell">
 	 				<div class="input-control text">
						<form:input path="zcdbmax" disabled="${flag }"/>
						<span class="input-state-error mif-warning"></span>
						<span class="input-state-success mif-checkmark"></span>
					</div>
 	 			</div>
 	 			<div class="cell">
 	 				<div class="input-control text">
						<form:input path="zsbmax" disabled="${flag }"/>
						<span class="input-state-error mif-warning"></span>
						<span class="input-state-success mif-checkmark"></span>
					</div>
 	 			</div>
 	 		</div>
 	 		<c:forEach items="${fn:split('1,2,3,4,5,6,7,8,9,10',',' )}" var="item">
 	 			<div class="row cells4">
	 	 			<div class="cell">
	 	 				<span>${item }挡</span>
	 	 			</div>
	 	 			<div class="cell">
	 	 				<div class="input-control text">
							<form:input path="nbsb${item }" disabled="${flag }"/>
							<span class="input-state-error mif-warning"></span>
							<span class="input-state-success mif-checkmark"></span>
						</div>
	 	 			</div>
	 	 			<div class="cell">
	 	 				<div class="input-control text">
							<form:input path="zcdb${item }" disabled="${flag }"/>
							<span class="input-state-error mif-warning"></span>
							<span class="input-state-success mif-checkmark"></span>
						</div>
	 	 			</div>
	 	 			<div class="cell">
	 	 				<div class="input-control text">
							<form:input path="zsb${item }" disabled="${flag }"/>
							<span class="input-state-error mif-warning"></span>
							<span class="input-state-success mif-checkmark"></span>
						</div>
	 	 			</div>
	 	 		</div>
	 		</c:forEach>
 	 		<div class="buttons">
	 	 		<c:if test="${flag != true }">
	 	 			<input class="button save" type="submit" value="保存"/>
 	 			</c:if> 
 	 			<input class="button save" type="button" value="返回" onclick="reloadRight();"/>
 	 		</div>
 	 	</div>
 		<form:hidden path="flbh" />
		<form:hidden path="bh" />
	    <input id="flagid" type="hidden" name="flag" value="${flag }"/>
        </form:form>
	</div>
</body>
</html>
