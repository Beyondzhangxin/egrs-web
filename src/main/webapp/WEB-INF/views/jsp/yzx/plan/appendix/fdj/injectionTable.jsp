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
	<div class="buttons"><input class="r save" type="button" value="新增" onclick="loadLink('rlps/create?flbh=${param.flbh}&fdjbh=${fdjbh } #detail')"/></div>
     <table class="list-table datagrid">
	     	 <thead>
	     	 	<tr >
		          <th>编号</th>
		          <th>发动机编号</th>
		          <th>电控单元型号</th>
		          <th>生产厂</th>
		          <th width="230">选择</th>
	            </tr>
	     	 </thead>
	     	 <tbody>
		     	 	<c:forEach items="${rlpss}" var="rlps">
		     	 	 <tr>
		     	 		<td>${rlps.bh }</td>
		     	 		<td>${rlps.fdjbh }</td>
		     	 		<td>${rlps.dkdyxh }</td>
		     	 		<td>${rlps.dkdyscc }</td>
		     	 		<td>
		     	 			<a class="icon-view" title="查看"  onclick="loadLink('rlps/create?flbh=${param.flbh}&fdjbh=${param.fdjbh }&bh=${rlps.bh }&flag=false #detail')"></a>
		     	 			<sec:authorize access="hasRole('6')">
		     	 				<span class="icon-delete" title="删除" onclick="delLink('rlps/delet?flbh=${param.flbh}&fdjbh=${param.fdjbh }&bh=${rlps.bh }')"></span>
		     	 			</sec:authorize>
		     	 			<sec:authorize access="hasRole('6')">
		     	 				<span class="icon-edit" title="修改" onclick="loadLink('rlps/create?flbh=${param.flbh}&fdjbh=${param.fdjbh }&bh=${rlps.bh } #detail')"></span>
		     	 			</sec:authorize>
		     	 		</td>
		     	 		</tr>
		     	 	</c:forEach>
	     	 </tbody>
	     </table>
	    </div> 
</body>
</html>
