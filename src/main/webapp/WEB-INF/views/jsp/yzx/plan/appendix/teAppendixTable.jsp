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
	 <c:if test="${empty tes }">
	 	正在跳转，请稍候......
		<input type="hidden" name="_redirect_url" value="teAppendix/edit?flbh=${flbh}"/>
	</c:if>
	<c:if test="${not empty tes }">
	<input type="hidden" name="flbh" value="${fdj.flbh }" />
	<div class="buttons"><input class="r save" type="button" value="新增" onclick="window.location.href='teAppendix/edit?flbh=${flbh}'"></div>
     <table class="list-table datagrid">
	     	 <thead>
	     	 	<tr >
		          <th>编号</th>
		          <th>扩展车型</th>
		          <th>扩展车名称</th>
		          <th width="230">选择</th>
	            </tr>
	     	 </thead>
	     	 <tbody>
		     	 	<c:forEach items="${tes}" var="te">
		     	 	 <tr>
		     	 		<td>${te.bh }</td>
		     	 		<td>${te.clxh }</td>
		     	 		<td>${te.clmc }</td>
		     	 		<td>
		     	 			<a class="icon-view" title="查看"  href="/ergs/yzx/plan/appendix/teAppendix/edit?flbh=${te.flbh}&bh=${te.bh}&flag=false"></a>
		     	 			<sec:authorize access="hasRole('6')">
		     	 				<span class="icon-delete" title="删除" onclick="delLink('/ergs/yzx/plan/appendix/teAppendix/delet?flbh=${te.flbh}&bh=${te.bh}')"></span>
		     	 			</sec:authorize>
		     	 			<sec:authorize access="hasRole('6')">
		     	 				<a class="icon-edit" title="修改"  href="/ergs/yzx/plan/appendix/teAppendix/edit?flbh=${te.flbh}&bh=${te.bh}"></a>
		     	 			</sec:authorize>
		     	 		</td>
		     	 		</tr>
		     	 	</c:forEach>
	     	 </tbody>
	     </table>
	      </c:if> 
	    </div> 
    
</body>
</html>
