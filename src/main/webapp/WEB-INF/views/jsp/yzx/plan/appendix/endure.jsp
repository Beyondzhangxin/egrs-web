<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../../../../../include/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" dir="ltr" lang="zh-CN" xml:lang="zh-CN">
<head>
    <meta content="none" name="Robots" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
     <link href="/css/detail.css" rel="stylesheet" type="text/css" /> 
    <script type="text/javascript" src="/js/detail.js"></script>
</head>
<body>
	
	<div id="detail">
	<span class="d-title">耐久性试验</span>
	<form:form modelAttribute="car" data-reload="true"  action="javascript:void(0)" data-role="validator" data-on-submit="sub(this,'njAppendix')" novalidate="novalidate" method="get"> 
    <div class="grid">
    	<div class="row cells2 title">
 			<div class="cell">
 				开始时间
 			</div>
 			<div class="cell">
 				结束时间
 			</div>
 		</div>
 		<div class="row cells2">
 			<div class="cell">
				<div class="input-control text" data-role="datepicker" data-locale=zhCN>
	       			<form:input path="njstartdate" disabled="${flag }"/>
	       			<button class="button"><span class="mif-calendar"></span></button>
				</div>
 			</div>
 			<div class="cell">
				<div class="input-control text" data-role="datepicker" data-locale=zhCN>
	       			<form:input path="njenddate" disabled="${flag }"/>
	       			<button class="button"><span class="mif-calendar"></span></button>
				</div>
 			</div>
 		</div>
 		<div class="row cells2 title">
 			<div class="cell">
 				试验循环
 			</div>
 			<div class="cell">
 				耐久性试验检测机构
 			</div>
 		</div>
 		<div class="row cells2">
 			<div class="cell">
			<div class="input-control text">
       			<form:input path="syxh" disabled="${flag }"/>
			</div>
 			</div>
 			<div class="cell">
			<div class="input-control select">
       			<form:select path="njjcdw" disabled="${flag }" items="${scmcs }" />
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
	<form:hidden path="bh" />
	<form:hidden path="flbh" />
	<form:hidden path="njbh" />
     <input id="flagid" type="hidden" name="flag" value="${flag }"/>
    </form:form>
	</div>
</body>
</html>
