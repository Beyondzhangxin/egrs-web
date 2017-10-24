<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../../../../include/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" dir="ltr" lang="zh-CN" xml:lang="zh-CN">
<head>
<title>计划书</title>

</head>
<body>
	
     <table class="list-table datagrid">

	     	 <thead>
	     	 	<tr >
		          <th width="120px">计划书编号</th>
		          <th>创建人</th>
		          <th>内部编号</th>
		          <th>排放标准</th>
		          <th>车辆类别</th>
		          <th>创建时间</th>
		          <th>申请时间</th>
		          <th>计划书状态</th>
		          <th width="280px">选择</th>
	            </tr>
	     	 </thead>
	     	 <tbody>
		     	 	<c:forEach items="${page.content}" var="plan">
		     	 	 <tr>
		     	 		<td>${plan.jhsbh }</td>
		     	 		<td>${plan.cjr }</td>
		     	 		<td>${plan.nbbh }</td>
		     	 		<td>第${fn:substring(plan.jhsbh, 6, 7 )}阶段</td>
		     	 		<td>${plan.cllb }</td>
		     	 		<td>${plan.cjsj }</td>
		     	 		<td>${plan.zhfssj }</td>
		     	 		<td id="statusid">
		     	 			<c:if test="${plan.status == '0'}">
		     	 			未备案	
		     	 			</c:if>
		     	 			<c:if test="${plan.status == '1'}">
		     	 			已备案	
		     	 			</c:if>
		     	 			<c:if test="${plan.status == '2'}">
		     	 			申请修改中	
		     	 			</c:if>
		     	 			<c:if test="${plan.status == '3'}">
		     	 			申请中	
		     	 			</c:if>
		     	 			<c:if test="${plan.status == '4'&&plan.shlog != null&&plan.balog==null}">
		     	 				<a href="#" title="${plan.shlog }" >被打回</a>
		     	 			</c:if>
		     	 			<c:if test="${plan.status == '4'&&plan.balog != null&&plan.shlog !=null}">
		     	 				<a href="#" title="${plan.balog }" >被打回</a>
		     	 			</c:if>
		     	 			<c:if test="${plan.status == '5'}">
		     	 			等待总公司申请	
		     	 			</c:if>
		     	 			<c:if test="${plan.status == '6'}">
		     	 			已备案申请修改中	
		     	 			</c:if>
		     	 			<c:if test="${plan.status == '7'}">
		     	 			催化转化器检验中	
		     	 			</c:if>
		     	 			<c:if test="${plan.status == '8'}">
		     	 			已封样,贵金属通过,已解封,催化器已备案	
		     	 			</c:if>
		     	 			<c:if test="${plan.status == '9'}">
		     	 			催化转化器等待总公司发送	
		     	 			</c:if>
		     	 			<c:if test="${plan.status == 'A'}">
		     	 			催化转化器已封样
		     	 			</c:if>
		     	 			<c:if test="${plan.status == 'B'}">
		     	 			已封样,贵金属通过,催化器解封	
		     	 			</c:if>
		     	 			<c:if test="${plan.status == 'C'}">
		     	 			已封样,贵金属通过
		     	 			</c:if>
		     	 			<c:if test="${plan.status == 'D'}">
		     	 			已审核待备案	
		     	 			</c:if>
		     	 			<c:if test="${plan.status == 'E'}">
		     	 			已公开	
		     	 			</c:if>
		     	 			<c:if test="${plan.status == 'F'}">
		     	 			已入库	
		     	 			</c:if>
		     	 		</td>
		     	 		<td >
		     	 			 <input type="hidden"  name="jhsbh" value="${plan.jhsbh }"/> 
		     	 			<span class="icon-view" title="查看"  onclick="check('${plan.jhsbh}');"></span>
		     	 			<span class="icon-appendix" title="附录" onclick="checkAppendix('${plan.jhsbh}');"></span>
		     	 			<sec:authorize access="hasRole('7')"> 
		     	 			<span class="icon-submit" title="提交" onclick="tj('${plan.jhsbh}')"></span>
		     	 			</sec:authorize>
		     	 			<sec:authorize access="hasRole('7')">
		     	 			<span class="icon-delete" title="删除" onclick="del('${plan.jhsbh}')"></span>
		     	 			</sec:authorize>
		     	 			<sec:authorize access="hasRole('13')"> 
		     	 				<span class="icon-audit" title="审核" onclick="exam('${plan.jhsbh}')"></span>
		     	 			</sec:authorize>
		     	 			<sec:authorize access="hasRole('14')"> 
		     	 				<span class="icon-remark" title="备案" onclick="record('${plan.jhsbh}')"></span>
		     	 			</sec:authorize>
		     	 		</td>
		     	 		</tr>
		     	 	</c:forEach>
	     	 	
	     	 </tbody>
	     </table>
      <div class="datagrid" id="page">
     	<env:pagination page="${page }" click="page"/>
     </div>  
     
     <script type="text/javascript">
   
     </script>
</body>
</html>
