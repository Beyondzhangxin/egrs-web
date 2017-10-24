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
	<div class="buttons"><input class="r save" type="button" value="新增"  onclick="loadLink('cdx/toSave?flbh=${param.flbh} #detail')"/></div>
     <table class="list-table datagrid">
	     	 <thead>
	     	 	<tr >
		          <th>编号</th>
		          <th>离合器型式</th>
		          <th>变速箱型式</th>
		          <th>变速箱型号</th>
		          <th>变速箱厂家</th>
		          <th width="230">选择</th>
	            </tr>
	     	 </thead>
	     	 <tbody>
		     	 	<c:forEach items="${cdxs}" var="cdx">
		     	 	 <tr>
		     	 		<td>${cdx.bh }</td>
		     	 		<td>${cdx.lhqxs }</td>
		     	 		<td>${cdx.bsxxs }</td>
		     	 		<td>${cdx.bsxxh }</td>
		     	 		<td>${cdx.bsxscc }</td>
		     	 		<td>
		     	 			<span class="icon-view" title="查看"  onclick="loadLink('cdx/toSave?flbh=${param.flbh}&bh=${cdx.bh }&edit=false #detail')"/>
		     	 			<sec:authorize access="hasRole('6')">
		     	 				<span class="icon-delete" title="删除" onclick="del('cdx/delet?flbh=${param.flbh}&bh=${cdx.bh }')"></span>
		     	 			</sec:authorize>
		     	 			<sec:authorize access="hasRole('6')">
		     	 				<span class="icon-edit" title="修改" onclick="loadLink('cdx/toSave?flbh=${param.flbh}&bh=${cdx.bh } #detail')"></span>
		     	 			</sec:authorize>
		     	 		</td>
		     	 		</tr>
		     	 	</c:forEach>
	     	 </tbody>
	     	 </table>
	    </div> 
</body>
</html>
