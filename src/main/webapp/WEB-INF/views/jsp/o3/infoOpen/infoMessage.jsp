<%@ page language="java" contentType="text/html;charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../../../../include/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTDHTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="${contextPath }/css/list.css" rel="stylesheet" type="text/css">
<title>信息公开</title>
</head>
<body>
<div class="content">
	<div class="header-form"></div>	
	<div class="ht30"></div>
    <div class="info-success cblue">企业信息填写
    	企业信息公开网址链接 <br/>本项请填写公司官网网址，如果官网还没有建设成功，请填写“正在建设中”，并请尽快完成建设工作。
                       </br>注意：网址请填写完整的，如"http://www.vecc-mep.org.cn",请勿填写"www.vecc-mep.org.cn"此类格式。
		<form action="/ergs/o3/infoOpen/infoSuccess" method="get">
		    <textarea  name="wz" rows="10" cols="30"></textarea>
		    <input type="hidden" name="sbbh" value="${sbbh }"/>
		    <input type="submit" class="button bg-blue02 fg-white" value="下一步"/>
	    </form>
    </div>
    
  </div>
	
	
	<div class="ht50"></div>
</body>
</html>