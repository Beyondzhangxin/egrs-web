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
		<div class="buttons"><input class="r save" type="button" value="新增" onclick="loadLink('liquidCool/create?flbh=${param.flbh}&fdjbh=${param.fdjbh }&bh=${liquidCool.bh } #detail')"/></div>
		 	<table class="list-table datagrid">
	     	 <thead>
	     	 	<tr >
		          <th>编号</th>
		          <th>发动机编号</th>
		          <th>循环泵型号</th>
		          <th>厂牌</th>
		          <th>循环泵特性</th>
		          <th>传动比</th>
		          <th width="230">选择</th>
	            </tr>
	     	 </thead>
	     	 <tbody>
		     	 	<c:forEach items="${liquidCools}" var="liquidCool">
		     	 	 <tr>
		     	 		<td>${liquidCool.bh }</td>
		     	 		<td>${liquidCool.fdjbh }</td>
		     	 		<td>${liquidCool.xh }</td>
		     	 		<td>${liquidCool.scc }</td>
		     	 		<td>${liquidCool.tx }</td>
		     	 		<td>${liquidCool.cdb }</td>
		     	 		<td>
		     	 			<a class="icon-view" title="查看"  onclick="loadLink('liquidCool/create?flbh=${param.flbh}&fdjbh=${param.fdjbh }&bh=${liquidCool.bh }&flag=false #detail')"></a>
		     	 			<sec:authorize access="hasRole('6')">
		     	 				<span class="icon-delete" title="删除" onclick="delLink('liquidCool/delet?flbh=${param.flbh}&fdjbh=${param.fdjbh }&bh=${liquidCool.bh }')"></span>
		     	 			</sec:authorize>
		     	 			<sec:authorize access="hasRole('6')">
		     	 				<span class="icon-edit" title="修改" onclick="loadLink('liquidCool/create?flbh=${param.flbh}&fdjbh=${param.fdjbh }&bh=${liquidCool.bh } #detail')"></span>
		     	 			</sec:authorize>
		     	 		</td>
		     	 		</tr>
		     	 	</c:forEach>
	     	 </tbody>
	     </table>
	    </div> 
</body>
</html>
