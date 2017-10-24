<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../../../../../../include/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" dir="ltr" lang="zh-CN" xml:lang="zh-CN">
<head>
    <title>供油泵</title>
</head>
<body>
	
	<div id="detail">
	<span class="d-title">供油泵</span>
	<form:form modelAttribute="car" data-reload="true" action="javascript:void(0)" data-role="validator" data-on-submit="sub(this,'gyb')" novalidate="novalidate"  > 
          <div class="grid">
        	<div class="row cells2 title">
	 			<div class="cell">
	 				供油泵型号
	 			</div>
	 			<div class="cell">
	 				供油泵生产厂
	 			</div>
	 		</div>
	 		<div class="row cells2">
	 			<div class="cell">
					<div class="input-control text" >
		       			<form:input path="gybxh" disabled="${flag }"/>
		       			<span class="input-state-error mif-warning"></span>
						<span class="input-state-success mif-checkmark"></span>
					</div>
	 			</div>
	 			<div class="cell">
					<div class="input-control text">
		       			<form:input path="gybscc" disabled="${flag }"/>
		       			<span class="input-state-error mif-warning"></span>
						<span class="input-state-success mif-checkmark"></span>
					</div>
	 			</div>
	 		</div>
	 		<div class="row title">
	 			<div class="cell">
	 				压力
	 			</div>
	 		</div>
	 		<div class="row">
	 			<div class="cell">
					<div class="input-control text" >
		       			<form:input path="gybyl" disabled="${flag }"/>
		       			<span class="input-state-error mif-warning"></span>
						<span class="input-state-success mif-checkmark"></span>
					</div>
	 			</div>
	 		</div>
	 		<div class="buttons">
	 	 		<c:if test="${flag != true }">
	 	 			<input class="button save" type="submit" value="保存"/>
 	 			</c:if> 
 	 			<input class="button save" type="button" value="返回" onclick="reloadRight();"/>
 	 		</div>
	 	</div>
		<form:hidden path="fdjbh"/>
		<form:hidden path="flbh" />
		<form:hidden path="bh" />
        <input id="flagid" type="hidden" name="flag" value="${flag }"/>
       </form:form>
	</div>
</body>
</html>
