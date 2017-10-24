<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../../../../../include/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" dir="ltr" lang="zh-CN" xml:lang="zh-CN">
<head>
<title>计划书</title>

</head>
<body>
	
     <table class="list-table datagrid">

	     	 <thead>
	     	 	<tr >
		          <th width="140">附录编号</th>
		          <th>创建人</th>
		          <th>内部编号</th>
		          <th>排放标准</th>
		          <th>车辆类别</th>
		          <th>创建时间</th>
		          <th>发送时间</th>
		          <th width="80">附录状态</th>
		          <th width="230">选择</th>
	            </tr>
	     	 </thead>
	     	 <tbody>
		     	 	<c:forEach items="${page.content}" var="appendix">
		     	 	 <tr>
		     	 		<td>${appendix.flbh }</td>
		     	 		<td>${appendix.cjr }</td>
		     	 		<td>${appendix.nbbh }</td>
		     	 		<td>第${fn:substring(appendix.flbh, 6, 7 )}阶段</td>
		     	 		<td>${appendix.fllb }</td>
		     	 		<td>${appendix.cjsj }</td>
		     	 		<td>${appendix.zhfssj }</td>
		     	 		<td>
		     	 		<c:if test="${appendix.status == '0'}">
		     	 			未备案	
		     	 			</c:if>
		     	 			<c:if test="${appendix.status == '1'}">
		     	 			已备案	
		     	 			</c:if>
		     	 			<c:if test="${appendix.status == '2'}">
		     	 			申请修改中	
		     	 			</c:if>
		     	 			<c:if test="${appendix.status == '3'}">
		     	 			申请中	
		     	 			</c:if>
		     	 			<c:if test="${appendix.status == '4'&&appendix.shlog != null&&appendix.balog==null}">
		     	 				<a href="#" title="${appendix.shlog }" >被打回</a>
		     	 			</c:if>
		     	 			<c:if test="${appendix.status == '4'&&appendix.balog != null&&appendix.shlog !=null}">
		     	 				<a href="#" title="${appendix.balog }" >被打回</a>
		     	 			</c:if>
		     	 			<c:if test="${appendix.status == '5'}">
		     	 			等待总公司申请	
		     	 			</c:if>
		     	 			<c:if test="${appendix.status == '6'}">
		     	 			已备案申请修改中	
		     	 			</c:if>
		     	 			<c:if test="${appendix.status == '7'}">
		     	 			催化转化器检验中	
		     	 			</c:if>
		     	 			<c:if test="${appendix.status == '8'}">
		     	 			已封样,贵金属通过,已解封,催化器已备案	
		     	 			</c:if>
		     	 			<c:if test="${appendix.status == '9'}">
		     	 			催化转化器等待总公司发送	
		     	 			</c:if>
		     	 			<c:if test="${appendix.status == 'A'}">
		     	 			催化转化器已封样
		     	 			</c:if>
		     	 			<c:if test="${appendix.status == 'B'}">
		     	 			已封样,贵金属通过,催化器解封	
		     	 			</c:if>
		     	 			<c:if test="${appendix.status == 'C'}">
		     	 			已封样,贵金属通过
		     	 			</c:if>
		     	 			<c:if test="${appendix.status == 'D'}">
		     	 			已审核待备案	
		     	 			</c:if>
		     	 			<c:if test="${appendix.status == 'E'}">
		     	 			已公开	
		     	 			</c:if>
		     	 			<c:if test="${appendix.status == 'F'}">
		     	 			已入库	
		     	 			</c:if>
		     	 		</td>
		     	 		<td>
		     	 			<input type="hidden" name="jhsbh" value=${appendix.flbh }>
		     	 			<span class="icon-view" title="查看"  onclick="check('${appendix.flbh}');"></span>
		     	 			<sec:authorize access="hasRole('6')">
		     	 			<span class="icon-submit" title="提交" onclick="tj('${appendix.flbh}')"></span>
		     	 			</sec:authorize>
		     	 			<sec:authorize access="hasRole('6')">
		     	 			<span class="icon-delete" title="删除" onclick="del('${appendix.flbh}')"></span>
		     	 			</sec:authorize>
		     	 			<sec:authorize access="hasRole('12')"> 
		     	 				<span class="icon-remark" title="备案" onclick="record('${appendix.flbh}')"></span>
		     	 			</sec:authorize>
		     	 			<sec:authorize access="hasRole('11')"> 
		     	 				<span class="icon-audit" title="审核" onclick="exam('${appendix.flbh}')"></span>
		     	 			</sec:authorize>
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
