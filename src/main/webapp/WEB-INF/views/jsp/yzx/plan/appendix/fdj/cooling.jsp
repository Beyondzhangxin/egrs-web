<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../../../../../../include/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" dir="ltr" lang="zh-CN" xml:lang="zh-CN">
<head>
    <meta content="none" name="Robots" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
     <link href="/css/detail.css" rel="stylesheet" type="text/css" /> 
    <script type="text/javascript" src="/js/detail.js"></script>
</head>
<body>
	
	<div id="detail">
	<span class="d-title">冷却系统</span>
	<form:form modelAttribute="car"  action="javascript:void(0)" data-role="validator" data-on-submit="sub(this,'cool')" novalidate="novalidate"> 
       	<div class="grid">
        	<div class="row cells2 title">
	 			<div class="cell">
	 				冷却方式
	 			</div>
	 			<div class="cell">
	 				发动机温度调节器机构额定设置
	 			</div>
	 		</div>
	 		<div class="row cells2">
	 			<div class="cell">
					<div class="input-control select" >
		       			<form:select path="lqxt" disabled="${flag }">
	        				<form:option value="液冷">液冷</form:option>
	        				<form:option value="风冷">风冷</form:option>
	        			</form:select>
					</div>
	 			</div>
	 			<div class="cell">
					<div class="input-control text">
		       			<form:input path="wdedsz" disabled="${flag }"/>
		       			<span class="input-state-error mif-warning"></span>
						<span class="input-state-success mif-checkmark"></span>
					</div>
	 			</div>
	 		</div>
	 		<div class="buttons">
	 	 		<c:if test="${flag != true }">
	 	 			<input class="button save" type="submit" value="保存"/>
 	 			</c:if> 
 	 			<input class="button save" type="button" value="返回" onclick="reloadRight();"/>
 	 		</div>
	 	</div>
		<form:hidden path="fdjbh"/>
		<form:hidden path="flbh" />
        <input id="flagid" type="hidden" name="flag" value="${flag }"/>
        </form:form>
        
	</div>
</body>
</html>
