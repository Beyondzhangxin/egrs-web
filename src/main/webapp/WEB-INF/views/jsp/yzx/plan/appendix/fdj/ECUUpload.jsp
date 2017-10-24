<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../../../../../../include/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" dir="ltr" lang="zh-CN" xml:lang="zh-CN">
<head>
<title>上传文件</title>

</head>
<body>
	<div id="detail">
		<P>全面详细说明装置和他们的调整状态	需要有ECU控制原理、脱附吸附条件等内容</P>
		<p>必须是rar和zip格式</p>
		
			<div class="fine-uploader" data-option="{validation:{allowedExtensions: ['rar','zip']}}">
				<input type="hidden" name="file" cssClass="filename"/>
        	</div>
			
		
	</div> 
</body>
</html>
