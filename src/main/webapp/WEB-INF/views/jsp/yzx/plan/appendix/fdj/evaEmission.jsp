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
	 <p><span class="d-title">蒸发排放控制系统</span></p>
	 	 <form:form modelAttribute="car" action="" class="formid" > 
        <table>
        	<tr>
        		<td>碳罐型号</td>
        		<td>
        			<form:input path="tgxh" disabled="${flag }"/>
        		</td>
        	</tr>
        	<tr>
        		<td>碳罐生产厂</td>
        		<td><form:input path="tgscc" disabled="${flag }"/>
        	</tr>
        	<tr>
        		<td>脱附阀开启点</td>
        		<td><form:input path="tffkqd" disabled="${flag }"/>kpa
        	</tr>
        	<tr>
        		<td>蒸发污染物控制系统示意图</td>
        		<td>
        			<div class="fine-uploader" data-option="{validation:{allowedExtensions: ['jpeg', 'jpg', 'gif', 'png']}}">
				    	 <form:hidden path="xtsyt" cssClass="filename" />
				    </div>
        		</td>
        	</tr>
        	<tr>
        		<td>油箱示意图</td>
        		<td>
        			<div class="fine-uploader" data-option="{validation:{allowedExtensions: ['jpeg', 'jpg', 'gif', 'png']}}">
				    	 <form:hidden path="yxsyt" cssClass="filename" />
				    </div>
        		</td>
        	</tr>
        	<tr>
        		<td>碳罐结构示意图</td>
        		<td>
        			<div class="fine-uploader" data-option="{validation:{allowedExtensions: ['jpeg', 'jpg', 'gif', 'png']}}">
				    	 <form:hidden path="tgsyt" cssClass="filename" />
				    </div>
        		</td>
        	</tr>
        	<tr>
        		<td>干碳质量</td>
        		<td><form:input path="gtzl" disabled="${flag }"/>g
        	</tr>
        	<tr>
        		<td>燃油管材料</td>
        		<td><form:input path="rygcl" disabled="${flag }"/>
        	</tr>
        	<tr>
        		<td>油箱容积</td>
        		<td><form:input path="yxrj" disabled="${flag }"/>L
        	</tr>
        	<tr>
        		<td>油箱材料</td>
        		<td><form:input path="yxcl" disabled="${flag }"/>
        	</tr>
        	<tr>
        		<td>热保护说明</td>
        		<td><form:input path="rbhsm" disabled="${flag }"/>
        	</tr>
        	<tr>
        		<td>燃油管长度</td>
        		<td><form:input path="rygcd" disabled="${flag }"/>mm
        	</tr>
        	<tr>
        		<td>炭罐的初始工作能力</td>
        		<td><form:input path="csgznl" disabled="${flag }"/>g/100ml	
        	</tr>
        	<tr>
        		<td>油箱和排气管间的热保护示意图</td>
        		<td>
        			<div class="fine-uploader" data-option="{validation:{allowedExtensions: ['jpeg', 'jpg', 'gif', 'png']}}">
				    	 <form:hidden path="rbhsyt" cssClass="filename" />
				    </div>
        		</td>
        	</tr>
        	<tr>
        		<td>炭罐有效容积</td>
        		<td><form:input path="tgyxrj" disabled="${flag }"/>L
        	</tr>
        	<tr>
        		<td>活性炭型号</td>
        		<td><form:input path="hxtxh" disabled="${flag }"/>
        	</tr>
        	<tr>
        		<td>活性炭生产厂</td>
        		<td><form:input path="hxtscc" disabled="${flag }"/>
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
        		<td><input type="hidden" name="pzlb" value="ZFPF"/>
        	</tr>
        	
        </table>
        <p id="saveid"><div class="buttons"><input class="r" type="button" value="保存" onclick="sub('evaporate','0')"/></div></p>
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
