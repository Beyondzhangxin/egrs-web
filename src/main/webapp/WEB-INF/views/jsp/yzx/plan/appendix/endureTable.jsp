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
		<div class="buttons"><input class="r save" type="button" value="新增" onclick="loadLink('../njAppendix/create?flbh=${param.flbh}&bh=${param.bh } #detail')"/></div>
		 	<table class="list-table datagrid">
	     	 <thead>
	     	 	<tr >
		          <th>编号</th>
		          <th>开始时间</th>
		          <th>结束时间</th>
		          <th width="230">选择</th>
	            </tr>
	     	 </thead>
	     	 <tbody>
		     	 	<c:forEach items="${njs}" var="nj">
		     	 	 <tr>
		     	 		<td>${nj.njbh }</td>
		     	 		<td>${nj.njstartdate }</td>
		     	 		<td>${nj.njenddate }</td>
		     	 		<td>
		     	 			<a class="icon-view" title="查看"  onclick="loadLink('../njAppendix/create?flbh=${param.flbh}&bh=${param.bh }&njbh=${nj.njbh}&flag=false #detail')"></a>
		     	 			<sec:authorize access="hasRole('6')">
		     	 				<span class="icon-edit" title="修改" onclick="loadLink('../njAppendix/create?flbh=${param.flbh}&bh=${param.bh }&njbh=${nj.njbh} #detail')"></span>
		     	 			</sec:authorize>
		     	 			<sec:authorize access="hasRole('6')">
		     	 				<span class="icon-delete" title="删除" onclick="delLink('../njAppendix/delet?flbh=${param.flbh}&bh=${param.bh }&njbh=${nj.njbh}')"></span>
		     	 			</sec:authorize>
		     	 		</td>
		     	 		</tr>
		     	 	</c:forEach>
	     	 </tbody>
	     </table>
	    </div> 
</body>
</html>
