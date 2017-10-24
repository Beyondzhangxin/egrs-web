<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../../../../../include/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" dir="ltr" lang="zh-CN" xml:lang="zh-CN">
<head>
<title>计划书</title>

</head>
<body>
	<div id="detail">
	 
	<input type="hidden" name="flbh" value="${fdj.flbh }" />
     <table class="list-table datagrid">
	     	 <thead>
	     	 	<tr >
		          <th>原车型附录编号</th>
		          <th>原车型型号</th>
		          <th>原车型名称</th>
		          <th>原车型制造商</th>
	            </tr>
	     	 </thead>
	     	 <tbody>
		     	 	<c:forEach items="${page.content}" var="ori">
		     	 	 <tr>
		     	 		<td>${ori.key.flbh }</td>
		     	 		<td>${ori.key.clxh }</td>
		     	 		<td>${ori.clmc }</td>
		     	 		<td>${ori.clscc }</td>
		     	 		</tr>
		     	 	</c:forEach>
	     	 </tbody>
	     </table>
	     
	        <div class="datagrid">
     			 <env:pagination page="${page }" click="page"/> 
    	 	</div> 
	    </div> 
    
</body>
</html>
