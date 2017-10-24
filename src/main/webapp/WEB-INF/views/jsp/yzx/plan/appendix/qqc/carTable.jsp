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
	 <div class="buttons"><input class="r save" type="button" value="新增"  onclick="loadLink('ct/toSave?flbh=${param.flbh} #detail')" /></div>
     <table class="list-table datagrid">
	     	 <thead>
	     	 	<tr >
		          <th>编号</th>
		          <th>座椅数量</th>
		          <th>车身的型式</th>
		          <th width="230">选择</th>
	            </tr>
	     	 </thead>
	     	 <tbody>
		     	 	<c:forEach items="${cts}" var="ct">
		     	 	 <tr>
		     	 		<td>${ct.bh }</td>
		     	 		<td>${ct.zws }</td>
		     	 		<td>${ct.xs }</td>
		     	 		<td>
		     	 			<span class="icon-view" title="查看"  onclick="loadLink('ct/toSave?flbh=${param.flbh}&bh=${ct.bh }&edit=false #detail')"/>
		     	 			<sec:authorize access="hasRole('6')">
		     	 				<span class="icon-delete" title="删除" onclick="del('ct/delete?flbh=${param.flbh}&bh=${ct.bh }')"></span>
		     	 			</sec:authorize>
		     	 			<sec:authorize access="hasRole('6')">
		     	 				<span class="icon-edit" title="修改" onclick="loadLink('ct/toSave?flbh=${param.flbh}&bh=${ct.bh } #detail')"></span>
		     	 			</sec:authorize>
		     	 		</td>
		     	 		</tr>
		     	 	</c:forEach>
	     	 </tbody>
	     </table>
	    </div> 
      <%-- <div class="datagrid" id="page">
     	<env:pagination page="${page }" click="page"/>
     </div>  --%> 
    
</body>
</html>
