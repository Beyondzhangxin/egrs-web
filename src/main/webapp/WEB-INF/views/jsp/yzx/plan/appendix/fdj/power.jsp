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
	 <p><span class="d-title">储能装置</span></p>
	 	 <form:form modelAttribute="car" action="" class="formid" > 
        <table>
        	<tr>
        		<td>成箱后的储能装置型号</td>
        		<td>
        			<form:input path="cnzzxh" disabled="${flag }"/>
        		</td>
        	</tr>
        	<tr>
        		<td>储能装置总成生产企业</td>
        		<td><form:input path="cnzzscc" disabled="${flag }"/>
        	</tr>
        	<tr>
        		<td>储能装置类型</td>
        		<td><form:select path="cnzzlx" disabled="${flag }">
        				<%-- <form:option value="请选择"></form:option> --%>
        				<form:option value="电池"></form:option>
        				<form:option value="电容"></form:option>
        				<form:option value="其他"></form:option>
        			</form:select></td>
        	</tr>
        	<tr>
        		<td>装置的识别号</td>
        		<td><form:input path="sbh" disabled="${flag }"/>
        	</tr>
        	<tr>
        		<td>充电装置</td>
        		<td><form:select path="cdzz" disabled="${flag }">
        				<%-- <form:option value="请选择"></form:option> --%>
        				<form:option value="车载"></form:option>
        				<form:option value="外部"></form:option>
        				<form:option value="无"></form:option>
        			</form:select></td>
        	</tr>
        	<tr>
        		<td>电池单体数目及单体连接方式</td>
        		<td><form:input path="smljfs" disabled="${flag }"/></td>
        	</tr>
        	<tr>
        		<td>最大充电功率</td>
        		<td><form:input path="zdcdgl" disabled="${flag }"/></td>
        	</tr>
        	<tr>
        		<td>储能装置单体的标称电压(V)</td>
        		<td><form:input path="dtdy" disabled="${flag }"/></td>
        	</tr>
        	<tr>
        		<td>储能装置单体生产企业</td>
        		<td><form:input path="dtscc" disabled="${flag }"/></td>
        	</tr>
        	<tr>
        		<td>动力蓄电池总成额定容量(Ah)</td>
        		<td><form:input path="zcedrl" disabled="${flag }"/></td>
        	</tr>
        	<tr>
        		<td>储能装置总成标称电压(V)</td>
        		<td><form:input path="zcbcdy" disabled="${flag }"/></td>
        	</tr>
        	<tr>
        		<td>储能装置总成额定输出电流(A)</td>
        		<td><form:input path="zcedscdl" disabled="${flag }"/></td>
        	</tr>
        	<tr>
        		<td>储能装置总储电量(kWh)</td>
        		<td><form:input path="zzdl" disabled="${flag }"/></td>
        	</tr>
        	<tr>
        		<td>最大放电功率(kW,50%SOC,10s)</td>
        		<td><form:input path="zdfdgl" disabled="${flag }"/></td>
        	</tr>
        	<tr>
        		<td>电池包重量(kg)</td>
        		<td><form:input path="dcbzl" disabled="${flag }"/></td>
        	</tr>
        	<tr>
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
	        		<td><input type="hidden" name="pzlb" value="CNZZ"/>
	        	</tr>
	        	
	        </table>
        <p id="saveid"><div class="buttons"><input class="r" type="button" value="保存" onclick="sub('storePower','2')"/></div></p>
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
