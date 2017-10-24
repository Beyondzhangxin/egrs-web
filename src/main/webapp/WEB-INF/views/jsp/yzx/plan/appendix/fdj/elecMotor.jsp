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
	 <p><span class="d-title">电机</span></p>
	 	 <form:form modelAttribute="car" action="" class="formid" > 
        <table>
        	<tr>
        		<td>电机型号</td>
        		<td>
        			<form:input path="djxh" disabled="${flag }"/>
        		</td>
        	</tr>
        	<tr>
        		<td>电机制造商</td>
        		<td><form:input path="djscc" disabled="${flag }"/>
        	</tr>
        	<tr>
        		<td>主要用途</td>
        		<td><form:select path="djyt" disabled="${flag }">
        				<form:option value="驱动"></form:option>
        				<form:option value="发电"></form:option>
        				<form:option value="驱动及发电"></form:option>
        			</form:select></td>
        	</tr>
        	<tr>
        		<td>电机安装数量</td>
        		<td><form:input path="djazsl" disabled="${flag }"/>
        	</tr>
        	<tr>
        		<td>驱动电机布置型式/位置</td>
        		<td><form:input path="djwz" disabled="${flag }"/>
        		</td>
        	</tr>
        	<tr>
        		<td>驱动电机冷却方式</td>
        		<td><form:input path="djlqfs" disabled="${flag }"/></td>
        	</tr>
        	<tr>
        		<td>驱动电机额定功率(kW)</td>
        		<td><form:input path="djedgl" disabled="${flag }"/></td>
        	</tr>
        	<tr>
        		<td>驱动电机峰值功率(kW)</td>
        		<td><form:input path="djfzgl" disabled="${flag }"/></td>
        	</tr>
        	<tr>
        		<td>驱动电机额定功率转速(r/min)</td>
        		<td><form:input path="djedglzs" disabled="${flag }"/></td>
        	</tr>
        	<tr>
        		<td>驱动电机峰值功率转速(r/min)</td>
        		<td><form:input path="djfzglzs" disabled="${flag }"/></td>
        	</tr>
        	<tr>
        		<td>驱动电机额定功率转矩(N.m)</td>
        		<td><form:input path="djedglzj" disabled="${flag }"/></td>
        	</tr>
        	<tr>
        		<td>驱动电机峰值功率转矩(N.m)</td>
        		<td><form:input path="djfzglzj" disabled="${flag }"/></td>
        	</tr>
        	<tr>
        		<td>驱动电机工作原理1</td>
        		<td><form:select path="djgzyl1" disabled="${flag }">
        				<form:option value="请选择"></form:option>
        				<form:option value="直流电"></form:option>
        				<form:option value="交流电"></form:option>
        				<form:option value="相数"></form:option>
        			</form:select>
        		</td>
        	</tr>
        	<tr>
        		<td>驱动电机工作原理1</td>
        		<td><form:select path="djgzyl2" disabled="${flag }">
        				<form:option value="请选择"></form:option>
        				<form:option value="他激"></form:option>
        				<form:option value="串激"></form:option>
        				<form:option value="复激"></form:option>
        			</form:select>
        		</td>
        	</tr>
        	<tr>
        		<td>驱动电机工作原理1</td>
        		<td><form:select path="djgzyl3" disabled="${flag }">
        				<form:option value="请选择"></form:option>
        				<form:option value="同步"></form:option>
        				<form:option value="异步"></form:option>
        			</form:select>
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
	        		<td><input type="hidden" name="pzlb" value="DJ"/>
	        	</tr>
	        	
	        </table>
        <p id="saveid"><div class="buttons"><input class="r" type="button" value="保存" onclick="sub('elecMotor','0')"/></div></p>
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
