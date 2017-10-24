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
	 <p><span class="d-title">排气再循环</span></p>
	 	 <form:form modelAttribute="car" action="" class="formid" > 
        <table>
        	<tr>
        		<td>型号</td>
        		<td>
        			<form:input path="pzxh" disabled="${flag }"/>
        		</td>
        	</tr>
        	<tr>
        		<td>生产厂</td>
        		<td>
        			<form:input path="pzscc" disabled="${flag }"/>
        		</td>
        	</tr>
        	<tr>
        		<td>水冷系统</td>
        		<td>
        			<form:select path="sm" disabled="${flag }">
        				<form:option value="有"></form:option>
        				<form:option value="无"></form:option>
        			</form:select>
        		</td>
        	</tr>
        	<tr>
        		<td>特性（流量等）</td>
        		<td>
        			<input name="sytConfig" value="${car.syt }" />
        		</td>
        	</tr>
        	
        </table>
         </form:form>
        <form:form modelAttribute="bs" action="" class="formid" > 
	        <table>
	        	<tr>
	        		<td>型号生产厂名称打刻内容</td>
	        		<td>
	        			<form:input path="bs" disabled="${flag }"/>
	        		</td>
	        	</tr>
	        	<tr>
	        		<td>型号生产厂名称打刻内容图片</td>
	        		<td>
	        			 <div class="fine-uploader" data-option="{validation:{allowedExtensions: ['jpeg', 'jpg', 'gif', 'png']}}">
	        				<form:hidden path="syt" cssClass="filename"/>
	        			 </div>
	        		</td>
	        	</tr>
	        	<tr>
	        		<td><input type="hidden" name="pzlb" value="EGR"/>
	        	</tr>
	        	
	        </table>
        <p id="saveid"><div class="buttons"><input class="r" type="button" value="保存" onclick="sub('config','1')"/></div></p>
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
