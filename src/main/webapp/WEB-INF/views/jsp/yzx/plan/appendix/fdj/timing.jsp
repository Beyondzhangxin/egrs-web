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
	 <p><span class="d-title">气阀正时或等效数据</span></p>
	 	 <form:form modelAttribute="car" action="" id="formid" > 
        <table>
        	<tr>
        		<td>气阀最大升程</td>
        		<td>
        			<form:input path="zdsc" disabled="${flag }"/>mm
        		</td>
        	</tr>
        	<tr>
        		<td>开启角度（度）</td>
        		<td><form:input path="kqjd" disabled="${flag }"/>
        	</tr>
        	<tr>
        		<td>关闭角度（度）</td>
        		<td><form:input path="gbjd" disabled="${flag }"/>
        	</tr>
        	<tr>
        		<td>或正时曲线</td>
        		<td>
        			<div class="fine-uploader" data-option="{validation:{allowedExtensions: ['jpeg', 'jpg', 'gif', 'png']}}">
				    	 <form:hidden  path="zsqx" cssClass="filename" />
				    </div>
        		</td>
        	</tr>
        	<tr>
        		<td>可变正时系统开启进气设定范围(度)</td>
        		<td><form:input path="kqjqfw" disabled="${flag }"/>
        	</tr>
        	<tr>
        		<td>可变正时系统开启排气设定范围(度)
</td>
        		<td><form:input path="kqpqfw" disabled="${flag }"/>
        	</tr>
        	<tr>
        		<td>可变正时系统关闭进气设定范围(度)
</td>
        		<td><form:input path="gbjqfw" disabled="${flag }"/>
        	</tr>
        	<tr>
        		<td>可变正时系统关闭排气设定范围(度)</td>
        		<td><form:input path="gbpqfw" disabled="${flag }"/>
        	</tr>
        	<tr>
        	</tr>
        	
        </table>
        <p id="saveid"><div class="buttons"><input class="r" type="button" value="保存" onclick="sub('timing')"/></div></p>
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
