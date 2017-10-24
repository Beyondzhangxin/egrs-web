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
	 <c:if test="${empty fdjs }">
	 	正在跳转，请稍候......
		<input type="hidden" name="_redirect_url" value="/ergs/yzx/plan/appendix/${lb }/fdj/edit?flbh=${flbh}&lb=${lb}"/>
	</c:if>
	<c:if test="${not empty fdjs }">
	<div class="buttons"><input class="r save" type="button" value="新增" onclick="window.location.href='${lb }/fdj/edit?flbh=${param.flbh}&lb=${lb}'"></div>
     <table class="list-table datagrid">
	     	 <thead>
	     	 	<tr >
		          <th>编号</th>
		          <th>发动机型号</th>
		          <th>发动机排量</th>
		          <th>发动机制造商</th>
		          <th width="230">选择</th>
	            </tr>
	     	 </thead>
	     	 <tbody>
		     	 	<c:forEach items="${fdjs}" var="fdj">
		     	 	 <tr>
		     	 		<td>${fdj.fdjbh }</td>
		     	 		<td>${fdj.fdjxh }</td>
		     	 		<td>${fdj.fdjpl }</td>
		     	 		<td>${fdj.fdjscc }</td>
		     	 		<td>
		     	 			<a class="icon-view" title="查看"  href="/ergs/yzx/plan/appendix/${lb }/fdj/edit?flbh=${fdj.flbh}&fdjbh=${fdj.fdjbh}&lb=${lb}&flag=false"></a>
		     	 			<sec:authorize access="hasRole('6')">
		     	 				<span class="icon-delete" title="删除" onclick="delLink('/ergs/yzx/plan/appendix/${lb }/fdj/delet?flbh=${fdj.flbh}&bh=${fdj.fdjbh}')"></span>
		     	 			</sec:authorize>
		     	 			<sec:authorize access="hasRole('6')">
		     	 				<a class="icon-edit" title="修改"  href="/ergs/yzx/plan/appendix/${lb }/fdj/edit?flbh=${fdj.flbh}&fdjbh=${fdj.fdjbh}&lb=${lb}"></a>
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
