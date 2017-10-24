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
	 <p><span class="d-title">氧传感</span></p>
	 	 <form:form modelAttribute="car" action="" class="formid" > 
        <table>
        	<tr>
        		<td>氧传感器型号</td>
        		<td>
        			<form:input path="cgqxh" disabled="${flag }"/>
        		</td>
        	</tr>
        	<tr>
        		<td>氧传感器生产厂</td>
        		<td><form:input path="cgqscc" disabled="${flag }"/></td>
        	</tr>
        	<tr>
        		<td>氧传感器安装位置</td>
        		<td><form:input path="cgqazwz" disabled="${flag }"/></td>
        	</tr>
        	<tr>
        		<td>控制范围</td>
        		<td><form:input path="cgqkzfw" disabled="${flag }"/></td>
        	</tr>
        	<tr>
        		<td>零件号码识别</td>
        		<td><form:input path="ljhmsb" disabled="${flag }"/></td>
        	</tr>

        	<tr>
        	</tr>
        	
        </table>
        </form:form>
               <form:form modelAttribute="mark" action="" class="formid" > 
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
        		<td><input type="hidden" name="pzlb" value="CGQ"/>
        	</tr>
        	
        </table>
        <p id="saveid"><div class="buttons"><input class="r" type="button" value="保存" onclick="sub('oxygen','0')"/></div></p>
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
