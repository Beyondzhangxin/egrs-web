<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../../../../../../include/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" dir="ltr" lang="zh-CN" xml:lang="zh-CN">
<head>
<title>附录</title>
</head>
<body>
     <table class="list-table datagrid">
	     	 <thead>
	     	 	<tr >
		          <th>附录编号</th>
		          <th>车型型号（发动机型号）</th>
		          <th>车辆名称（发动机生产厂）</th>
		          <th>操作</th>
	            </tr>
	     	 </thead>
	     	 <tbody>
		     	 	<c:forEach items="${page.content}" var="item">
		     	 	 <tr>
		     	 		<td>${item.flbh }</td>
		     	 		<td>${item.zclxh }</td>
		     	 		<td>${item.zclmc }</td>
		     	 		<td>
		     	 			<a class="icon-view" title="查看"  href="describe?flbh=${item.flbh }"></a>
		     	 		</td>
		     	 		</tr>
		     	 	</c:forEach>
	     	 </tbody>
	     </table>
	     
      <div class="datagrid" id="page">
     	<env:pagination page="${page }" click="page"/>
     </div>  
    
</body>
</html>
