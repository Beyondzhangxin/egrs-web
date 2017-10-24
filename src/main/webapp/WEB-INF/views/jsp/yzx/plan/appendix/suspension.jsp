<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../../../../../include/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" dir="ltr" lang="zh-CN" xml:lang="zh-CN">
<head>
    <title>悬挂系</title>
</head>
<body>
	
	<div id="detail">
	 <span class="d-title">悬挂系</span></p>
	 	 <form:form modelAttribute="car" data-reload="true" action="javascript:void(0)" data-role="validator" data-on-submit="sub(this,'lt')" novalidate="novalidate"  > 
         <div class="grid">
         	<div class="row cells2 title">
 	 			<div class="cell">
					车轴
 	 			</div>
 	 			<div class="cell">
 	 				轮胎型号
 	 			</div>
 	 		</div>
 	 		<div class="row cells2">
 	 			<div class="cell">
					<div class="input-control select ">
						<form:select path="cz" disabled="${flag }">
	        				<form:option value="1">1</form:option>
	        				<form:option value="2">2</form:option>
	        				<form:option value="3">3</form:option>
	        				<form:option value="4">4</form:option>
	        			</form:select>
					</div>
 	 			</div>
 	 			<div class="cell">
					<div class="input-control text">
						<form:input path="ltxh" disabled="${flag }"/>
					</div>
 	 			</div>
 	 		</div>
 	 		<div class="row cells2 title">
 	 			<div class="cell">
					所有可选择的轮胎厂牌
 	 			</div>
 	 			<div class="cell">
 	 				式样（型式）
 	 			</div>
 	 		</div>
 	 		<div class="row cells2">
 	 			<div class="cell">
					<div class="input-control text">
						<form:input path="ltscc" disabled="${flag }"/>
					</div>
 	 			</div>
 	 			<div class="cell">
					<div class="input-control text">
						<form:input path="xs" disabled="${flag }"/>
					</div>
 	 			</div>
 	 		</div>
 	 		<div class="row cells2 title">
 	 			<div class="cell">
					轮胎压力（KPa）
 	 			</div>
 	 			<div class="cell">
 	 				最大速度类型符号
 	 			</div>
 	 		</div>
 	 		<div class="row cells2">
 	 			<div class="cell">
					<div class="input-control text">
						<form:input path="ltyl" disabled="${flag }"/>
					</div>
 	 			</div>
 	 			<div class="cell">
					<div class="input-control text">
						<form:input path="zdlxfh" disabled="${flag }"/>
					</div>
 	 			</div>
 	 		</div>
 	 		<div class="row cells2 title">
 	 			<div class="cell">
					最大负荷能力指标
 	 			</div>
 	 			<div class="cell">
 	 				轮胎滚动半径的上下限
 	 			</div>
 	 		</div>
 	 		<div class="row cells2">
 	 			<div class="cell">
					<div class="input-control text">
						<form:input path="zdllzb" disabled="${flag }"/>
					</div>
 	 			</div>
 	 			<div class="cell">
					<div class="input-control text">
						<form:input path="gdsxx" disabled="${flag }"/>
					</div>
 	 			</div>
 	 		</div>
 	 		<div class="row title">
 	 			<div class="cell">
					轮胎尺寸和偏差（拟安装到最高速度超过300 km/h的Z类轮胎填写）
 	 			</div>
 	 		</div>
 	 		<div class="row">
 	 			<div class="cell">
					<div class="input-control text">
						<form:input path="ccpc" disabled="${flag }"/>
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
