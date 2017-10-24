<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../../../../../include/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" dir="ltr" lang="zh-CN" xml:lang="zh-CN">
<head>
    <title>车体</title>
</head>
<body>
	<div id="detail">
		 <span class="d-title">车体</span>
		 <form:form modelAttribute="car"  data-reload="true" action="javascript:void(0)" data-role="validator" data-on-submit="sub(this,'ct')" novalidate="novalidate"  > 
	        <div class="grid">
	        	<div class="row cells2 title">
		 			<div class="cell">
					座椅数量
		 			</div>
		 			<div class="cell">
		 				车身的型式
		 			</div>
		 		</div>
		 		<div class="row cells2">
		 			<div class="cell">
					<div class="input-control text required">
						<form:input path="zws" disabled="${flag }" data-validate-func="required" data-validate-hint="请输入座椅数量" type="text"/>
						<span class="input-state-error mif-warning"></span>
						<span class="input-state-success mif-checkmark"></span>
					</div>
		 			</div>
		 			<div class="cell">
					<div class="input-control select">
						<form:select path="xs" disabled="${flag }">
	        				<form:option value="轿车">轿车</form:option>
	        				<form:option value="仓门式后备车">仓门式后备车</form:option>
	        				<form:option value="两厢车">两厢车</form:option>
	        				<form:option value="客货两用车">客货两用车</form:option>
	        				<form:option value="卡车">卡车</form:option>
	        				<form:option value="敞篷车">敞篷车</form:option>
	        				<form:option value="厢式货车">厢式货车</form:option>
	        				<form:option value="多用途乘用车">多用途乘用车</form:option>
	        				<form:option value="多用途货车">多用途货车</form:option>
	        				<form:option value="多用途车">多用途车</form:option>
	        			</form:select>
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
			<form:hidden path="flbh" />
			<form:hidden path="bh" />
			<input id="flagid" type="hidden" name="flag" value="${flag }"/>  
	    </form:form>
    </div>
</body>
</html>
