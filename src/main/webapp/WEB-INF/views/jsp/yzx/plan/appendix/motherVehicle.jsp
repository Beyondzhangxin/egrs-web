<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../../../../../include/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" dir="ltr" lang="zh-CN" xml:lang="zh-CN">
<head>
<title>原车型</title>
    <meta content="none" name="Robots" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
    <link href="/css/base.css" rel="stylesheet" type="text/css" />
     <link href="/css/list.css" rel="stylesheet" type="text/css" /> 
</head>
<body>
	<div id="detail">
		<form  method="get" id="qry-form" onsubmit="return false;"><!-- action="/ergs/yzx/plan/appendix/search" -->
			<table class="table-search">
				<tr>
					<td>原车型型号</td>
					<td>原车型名称</td>
					<td>原车型生产厂</td>
					<td></td>
				</tr>				
				<tr>
					<td><input name="clxh" type="text"/></td>
					<td><input name="clmc" type="text"/></td>
					<td><input name="clscc" type="text"/></td>
					<td><input class="bg-blue02" type="submit" value="搜索" onclick="page()"/></td>
				</tr>
				<!-- <tr>
					<td>原车型名称</td>
					<td><input name="clmc"/></td>
				</tr>
				<tr>
					<td>原车型生产厂</td>
					<td><input name="clscc"/></td>
				</tr> -->
				
			</table>
			<input type="hidden" name="type" value="${type }"/>
			<input type="hidden" name="flbh" value="${flbh }"/>
		</form>
		<div class="ht30"></div>
	 <div class="table-div"></div>
	</div> 
		 <script type="text/javascript">
			
		</script>  
		
</body>
</html>
