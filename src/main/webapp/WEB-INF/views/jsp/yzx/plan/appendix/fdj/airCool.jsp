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
	<span class="d-title">风冷</span>
	 	<form:form modelAttribute="car"  data-reload="true"  action="javascript:void(0)" data-role="validator" data-on-submit="sub(this,'cool/airCool')" novalidate="novalidate" method="get" > 
        <div class="grid">
        	<div class="row cells2 title">
	 			<div class="cell">
	 				鼓风机型号
	 			</div>
	 			<div class="cell">
	 				厂牌
	 			</div>
	 		</div>
	 		<div class="row cells2">
	 			<div class="cell">
					<div class="input-control text" >
		       			<form:input path="xh" disabled="${flag }"/>
		       			<span class="input-state-error mif-warning"></span>
						<span class="input-state-success mif-checkmark"></span>
					</div>
	 			</div>
	 			<div class="cell">
					<div class="input-control text">
		       			<form:input path="scc" disabled="${flag }"/>
		       			<span class="input-state-error mif-warning"></span>
						<span class="input-state-success mif-checkmark"></span>
					</div>
	 			</div>
	 		</div>
	 		<div class="row cells2 title">
	 			<div class="cell">
	 				循环泵特性
	 			</div>
	 			<div class="cell">
	 				传动比
	 			</div>
	 		</div>
	 		<div class="row cells2">
	 			<div class="cell">
					<div class="input-control text" >
		       			<form:input path="tx" disabled="${flag }"/>
		       			<span class="input-state-error mif-warning"></span>
						<span class="input-state-success mif-checkmark"></span>
					</div>
	 			</div>
	 			<div class="cell">
					<div class="input-control text">
		       			<form:input path="cdb" disabled="${flag }"/>
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
        <table>
        	<tr>
        		<td>鼓风机型号</td>
        		<td>
        			<form:input path="xh" disabled="${flag }"/>
        		</td>
        	</tr>
        	<tr>
        		<td>厂牌</td>
        		<td><form:input path="scc" disabled="${flag }"/>
        	</tr>
        	<tr>
        		<td>特性</td>
        		<td><form:input path="tx" disabled="${flag }"/>
        	</tr>
        	<tr>
        		<td>传动比</td>
        		<td><form:input path="cdb" disabled="${flag }"/>
        	</tr>
        	<tr>
        	</tr>
        	
        </table>
        <p id="saveid"><div class="buttons"><input class="r" type="button" value="保存" onclick="sub('cool/airCool')"/></div></p>
        <c:if test="${flag == true }">
			<p><div class="buttons"><input class="r" type="button" value="修改" onclick="update()"/></div></p>
		</c:if> 
		<form:hidden path="fdjbh"/>
		<form:hidden path="flbh" />
		<form:hidden path="bh" />
        </form:form>
        <input id="flagid" type="hidden" name="flag" value="${flag }"/>
        
	</div>
	</div>
	
	 <script type="text/javascript">
	</script> 
</body>
</html>
