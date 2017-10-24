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
	 <p><span class="d-title">DC转化装置</span></p>
	 	 <form:form modelAttribute="car" action="" id="formid" > 
        <table>
        	<tr>
        		<td>型号</td>
        		<td>
        			<form:input path="dcxh" disabled="${flag }"/>
        		</td>
        	</tr>
        	<tr>
        		<td>制造商</td>
        		<td><form:input path="dcscc" disabled="${flag }"/>
        	</tr>
        	<tr>
        		<td>额定功率KW</td>
        		<td><form:input path="dcedgl" disabled="${flag }"/>
        	</tr>
        	<tr>
        		<td>与电机控制器集成</td>
        		<td><form:select path="dcjc" disabled="${flag }">
        				<form:option value="请选择"></form:option>
        				<form:option value="是"></form:option>
        				<form:option value="否"></form:option>
        			</form:select></td>
        	</tr>
        	<tr>
        		<td>单向/双向</td>
        		<td><form:input path="dcdxsx" disabled="${flag }"/>
        	</tr>
        	<tr>
        		<td>输出电压范围</td>
        		<td><form:input path="dcdyfw" disabled="${flag }" /></td>
        	</tr>
        </table>
        <p id="saveid"><div class="buttons"><input class="r" type="button" value="保存" onclick="sub('DCChange')"/></div></p>
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
