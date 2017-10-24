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
	 <div>
	 <p><span class="d-title">制造厂允许的温度</span></p>
	 	 <form:form modelAttribute="car" action="" id="formid" > 
        <table>
        	<tr>
        		<td>液体冷却系出口处的最高温度(℃)</td>
        		<td>
        			<form:input path="ckwd" disabled="${flag }"/>
        		</td>
        	</tr>
        	<tr>
        		<td>空气冷却系参考点</td>
        		<td><form:input path="ckd" disabled="${flag }"/>
        	</tr>
        	<tr>
        		<td>空气冷却系参考点处的最高温度(℃)</td>
        		<td><form:input path="ckdwd" disabled="${flag }"/>
        	</tr>
        	<tr>
        		<td>中冷器进口处的最高排气温度(℃)</td>
        		<td><form:input path="zlqzgwd" disabled="${flag }"/>
        	</tr>
        	<tr>
        		<td>靠近排气支管外边界的排气管内参考点的最高排气温度(℃)</td>
        		<td><form:input path="pqgzgwd" disabled="${flag }"/>
        	</tr>
        	<tr>
        		<td>燃料最低温度(℃)</td>
        		<td><form:input path="rlzdwd" disabled="${flag }"/>
        	</tr>
        	<tr>
        		<td>燃料最高温度(℃)</td>
        		<td><form:input path="rlzgwd" disabled="${flag }"/>
        	</tr>
        	<tr>
        		<td>润滑油最低温度(℃)</td>
        		<td><form:input path="rhyzdwd" disabled="${flag }"/>
        	</tr>
        	<tr>
        		<td>润滑油最高温度(℃)</td>
        		<td><form:input path="rhyzgwd" disabled="${flag }"/>
        	</tr>
        	<tr>
        	</tr>
        	
        </table>
        <p id="saveid"><div class="buttons"><input class="r" type="button" value="保存" onclick="sub('temperature')"/></div></p>
        <c:if test="${flag == true }">
			<p><div class="buttons"><input class="r" type="button" value="修改" onclick="update()"/></div></p>
		</c:if> 
		<form:hidden path="fdjbh"/>
		<form:hidden path="flbh" />
        </form:form>
        <input id="flagid" type="hidden" name="flag" value="${flag }"/>
        
	</div>
	</div>
	
	 <script type="text/javascript">
	</script> 
</body>
</html>
