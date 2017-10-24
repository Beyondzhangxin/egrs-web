<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../../../../../../include/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" dir="ltr" lang="zh-CN" xml:lang="zh-CN">
<head>
    <title>燃料喷射</title>
</head>
<body>
	
	<div id="detail">
	 <span class="d-title">燃料喷射</span>
 	 <form:form modelAttribute="car" data-reload="true" action="javascript:void(0)" data-role="validator" data-on-submit="sub(this,'rlps')" novalidate="novalidate"  > 
        <div class="grid">
        	<div class="row cells2 title">
	 			<div class="cell">
	 				电控单元型号
	 			</div>
	 			<div class="cell">
	 				生产厂
	 			</div>
	 		</div>
	 		<div class="row cells2">
	 			<div class="cell">
					<div class="input-control text" >
		       			<form:input path="dkdyxh" disabled="${flag }"/>
		       			<span class="input-state-error mif-warning"></span>
						<span class="input-state-success mif-checkmark"></span>
					</div>
	 			</div>
	 			<div class="cell">
					<div class="input-control text">
		       			<form:input path="dkdyscc" disabled="${flag }"/>
		       			<span class="input-state-error mif-warning"></span>
						<span class="input-state-success mif-checkmark"></span>
					</div>
	 			</div>
	 		</div>
	 		<div class="row cells2 title">
	 			<div class="cell">
	 				进气管及其附件的说明(如有特殊处可在此说明)
	 			</div>
	 			<div class="cell">
	 				控制单元型式
	 			</div>
	 		</div>
	 		<div class="row cells2">
	 			<div class="cell">
					<div class="input-control text" >
		       			<form:input path="xtsm" disabled="${flag }"/>
		       			<span class="input-state-error mif-warning"></span>
						<span class="input-state-success mif-checkmark"></span>
					</div>
	 			</div>
	 			<div class="cell">
					<div class="input-control text">
		       			<form:input path="kzdyxs" disabled="${flag }"/>
		       			<span class="input-state-error mif-warning"></span>
						<span class="input-state-success mif-checkmark"></span>
					</div>
	 			</div>
	 		</div>
	 		<div class="row cells2 title">
	 			<div class="cell">
	 				空气流量传感器型式
	 			</div>
	 			<div class="cell">
	 				空气流量传感器厂牌
	 			</div>
	 		</div>
	 		<div class="row cells2">
	 			<div class="cell">
					<div class="input-control text" >
		       			<form:input path="kqllcgqxs" disabled="${flag }"/>
		       			<span class="input-state-error mif-warning"></span>
						<span class="input-state-success mif-checkmark"></span>
					</div>
	 			</div>
	 			<div class="cell">
					<div class="input-control text">
		       			<form:input path="kqllcgqscc" disabled="${flag }"/>
		       			<span class="input-state-error mif-warning"></span>
						<span class="input-state-success mif-checkmark"></span>
					</div>
	 			</div>
	 		</div>
	 		<div class="row cells2 title">
	 			<div class="cell">
	 				压力调节器型式
	 			</div>
	 			<div class="cell">
	 				空气压力传感器厂牌
	 			</div>
	 		</div>
	 		<div class="row cells2">
	 			<div class="cell">
					<div class="input-control text" >
		       			<form:input path="yltjqxs" disabled="${flag }"/>
		       			<span class="input-state-error mif-warning"></span>
						<span class="input-state-success mif-checkmark"></span>
					</div>
	 			</div>
	 			<div class="cell">
					<div class="input-control text">
		       			<form:input path="yltjqscc" disabled="${flag }"/>
		       			<span class="input-state-error mif-warning"></span>
						<span class="input-state-success mif-checkmark"></span>
					</div>
	 			</div>
	 		</div>
	 		<div class="row cells2 title">
	 			<div class="cell">
	 				水温传感器型式
	 			</div>
	 			<div class="cell">
	 				水温传感器厂牌
	 			</div>
	 		</div>
	 		<div class="row cells2">
	 			<div class="cell">
					<div class="input-control text" >
		       			<form:input path="swcgqxs" disabled="${flag }"/>
		       			<span class="input-state-error mif-warning"></span>
						<span class="input-state-success mif-checkmark"></span>
					</div>
	 			</div>
	 			<div class="cell">
					<div class="input-control text">
		       			<form:input path="swcgqscc" disabled="${flag }"/>
		       			<span class="input-state-error mif-warning"></span>
						<span class="input-state-success mif-checkmark"></span>
					</div>
	 			</div>
	 		</div>
	 		<div class="row cells2 title">
	 			<div class="cell">
	 				喷油器开启压力
	 			</div>
	 			<div class="cell">
	 				燃料调节器型式
	 			</div>
	 		</div>
	 		<div class="row cells2">
	 			<div class="cell">
					<div class="input-control text" >
		       			<form:input path="kqyl" disabled="${flag }"/>
		       			<span class="input-state-error mif-warning"></span>
						<span class="input-state-success mif-checkmark"></span>
					</div>
	 			</div>
	 			<div class="cell">
					<div class="input-control text">
		       			<form:input path="rltjq" disabled="${flag }"/>
		       			<span class="input-state-error mif-warning"></span>
						<span class="input-state-success mif-checkmark"></span>
					</div>
	 			</div>
	 		</div>
	 		<div class="row cells2 title">
	 			<div class="cell">
	 				微开关型式
	 			</div>
	 			<div class="cell">
	 				微开关厂牌
	 			</div>
	 		</div>
	 		<div class="row cells2">
	 			<div class="cell">
					<div class="input-control text" >
		       			<form:input path="wkgxs" disabled="${flag }"/>
		       			<span class="input-state-error mif-warning"></span>
						<span class="input-state-success mif-checkmark"></span>
					</div>
	 			</div>
	 			<div class="cell">
					<div class="input-control text">
		       			<form:input path="wkgscc" disabled="${flag }"/>
		       			<span class="input-state-error mif-warning"></span>
						<span class="input-state-success mif-checkmark"></span>
					</div>
	 			</div>
	 		</div>
	 		<div class="row cells2 title">
	 			<div class="cell">
	 				温度开关型式
	 			</div>
	 			<div class="cell">
	 				喷射正时
	 			</div>
	 		</div>
	 		<div class="row cells2">
	 			<div class="cell">
					<div class="input-control text" >
		       			<form:input path="wdkgxs" disabled="${flag }"/>
		       			<span class="input-state-error mif-warning"></span>
						<span class="input-state-success mif-checkmark"></span>
					</div>
	 			</div>
	 			<div class="cell">
					<div class="input-control text">
		       			<form:input path="pyzs" disabled="${flag }"/>
		       			<span class="input-state-error mif-warning"></span>
						<span class="input-state-success mif-checkmark"></span>
					</div>
	 			</div>
	 		</div>
	 		<div class="row cells2 title">
	 			<div class="cell">
	 				节流阀体型式
	 			</div>
	 			<div class="cell">
	 				节流阀体厂牌
	 			</div>
	 		</div>
	 		<div class="row cells2">
	 			<div class="cell">
					<div class="input-control text" >
		       			<form:input path="jlftxs" disabled="${flag }"/>
		       			<span class="input-state-error mif-warning"></span>
						<span class="input-state-success mif-checkmark"></span>
					</div>
	 			</div>
	 			<div class="cell">
					<div class="input-control text">
		       			<form:input path="jlftscc" disabled="${flag }"/>
		       			<span class="input-state-error mif-warning"></span>
						<span class="input-state-success mif-checkmark"></span>
					</div>
	 			</div>
	 		</div>
	 		<div class="row cells2 title">
	 			<div class="cell">
	 				空气温度传感器型式
	 			</div>
	 			<div class="cell">
	 				空气温度传感器厂牌
	 			</div>
	 		</div>
	 		<div class="row cells2">
	 			<div class="cell">
					<div class="input-control text" >
		       			<form:input path="kqwdcgqxs" disabled="${flag }"/>
		       			<span class="input-state-error mif-warning"></span>
						<span class="input-state-success mif-checkmark"></span>
					</div>
	 			</div>
	 			<div class="cell">
					<div class="input-control text">
		       			<form:input path="kqwdcgqscc" disabled="${flag }"/>
		       			<span class="input-state-error mif-warning"></span>
						<span class="input-state-success mif-checkmark"></span>
					</div>
	 			</div>
	 		</div>
	 		<div class="row cells2 title">
	 			<div class="cell">
	 				燃料分配器型式
	 			</div>
	 			<div class="cell">
	 				怠速调整螺钉型式
	 			</div>
	 		</div>
	 		<div class="row cells2">
	 			<div class="cell">
					<div class="input-control text" >
		       			<form:input path="rlfpqxs" disabled="${flag }"/>
		       			<span class="input-state-error mif-warning"></span>
						<span class="input-state-success mif-checkmark"></span>
					</div>
	 			</div>
	 			<div class="cell">
					<div class="input-control text">
		       			<form:input path="dstzldxs" disabled="${flag }"/>
		       			<span class="input-state-error mif-warning"></span>
						<span class="input-state-success mif-checkmark"></span>
					</div>
	 			</div>
	 		</div>
	 		<div class="row title">
	 			<div class="cell">
	 				电控单元软件版本号
	 			</div>
	 		</div>
	 		<div class="row cells2">
	 			<div class="cell">
					<div class="input-control text" >
		       			<form:input path="dkdybbh" disabled="${flag }"/>
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
