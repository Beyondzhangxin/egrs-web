<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../../../../../../include/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" dir="ltr" lang="zh-CN" xml:lang="zh-CN">
<head>
<title>计划书</title>

</head>
<body>
	<div id="detail">
		 	<table class="list-table datagrid">
	     	 <thead>
	     	 	<tr >
		          <th>编号</th>
		          <th>发动机编号</th>
		          <th>空气喷射系统型式</th>
		          <th width="230">选择</th>
	            </tr>
	     	 </thead>
	     	 <tbody>
		     	 	<c:forEach items="${configs}" var="config">
		     	 	 <tr>
		     	 		<td>${config.bh }</td>
		     	 		<td>${config.fdjbh }</td>
		     	 		<td>${config.pzxh }</td>
		     	 		<td>
		     	 			<a class="icon-view" title="查看"  onclick="check('${config.fdjbh }','${config.flbh}','${config.bh }',13,'config','KQPSXT')"></a>
		     	 			<sec:authorize access="hasRole('6')">
		     	 				<span class="icon-delete" title="删除" onclick="del('${config.bh }','${config.flbh}','16','fdj/config','${config.fdjbh }','KQPSXT')"></span>
		     	 			</sec:authorize>
		     	 		</td>
		     	 		</tr>
		     	 	</c:forEach>
	     	 </tbody>
	     </table>
	     	<div class="buttons"><input class="r save" type="button" value="新增" onclick="add('${fdjbh }','${flbh}',13,'config','KQPSXT')"/></div>
	     
	    </div> 
</body>
</html>
