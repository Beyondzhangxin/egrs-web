<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../../../../../include/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" dir="ltr" lang="zh-CN" xml:lang="zh-CN">
<head>
    <title>计划书</title>
    <meta content="none" name="Robots" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
     <link href="/css/detail.css" rel="stylesheet" type="text/css" /> 
    <script type="text/javascript" src="/js/detail.js"></script>
</head>
<body>
	<div id="detail">
	 <span class="d-title">总体特征</span>
 	 <form:form modelAttribute="car"  action="javascript:void(0)" data-role="validator" data-on-submit="sub(this,'main')" novalidate="novalidate" method="get"> 
        <div class="grid">
 	 		<div class="row cells title">
 	 			<div class="cell">
 	 				车辆图片
 	 			</div>
 	 		</div>
 	 		<div class="row">
 	 			<div class="cell">
					<div class="fine-uploader" data-option="{validation:{allowedExtensions: ['jpeg', 'jpg', 'gif', 'png']}}">
				    	 <form:hidden path="clzp" cssClass="filename"/>
				    </div>
 	 			</div>
 	 		</div>
 	 		<div class="row cells title">
 	 			<div class="cell">
 	 				排放控制件位置示意图
 	 			</div>
 	 		</div>
 	 		<div class="row">
 	 			<div class="cell">
					<div class="fine-uploader" data-option="{validation:{allowedExtensions: ['jpeg', 'jpg', 'gif', 'png']}}">
				    	 <form:hidden path="pfkzsyt" cssClass="filename"/>
				    </div>
 	 			</div>
 	 		</div>
 	 		<div class="row cells2 title">
 	 			<div class="cell">
 	 				驱动轴数量
 	 			</div>
 	 			<div class="cell">
 	 				驱动轴位置
 	 			</div>
 	 		</div>
 	 		<div class="row cells2">
 	 			<div class="cell">
					<div class="input-control text ">
						<form:input path="qdzsl" />
						<span class="input-state-error mif-warning"></span>
						<span class="input-state-success mif-checkmark"></span>
					</div>
 	 			</div>
 	 			<div class="cell">
					<div class="input-control text">
	        			<form:input path="qdzwz" />
	        			<span class="input-state-error mif-warning"></span>
						<span class="input-state-success mif-checkmark"></span>
					</div>
 	 			</div>
 	 		</div>
 	 		<div class="row cells2 title">
 	 			<div class="cell">
 	 				驱动轴相互连接
 	 			</div>
 	 			<div class="cell">
 	 				车辆外形尺寸(长×宽×高)mm
 	 			</div>
 	 		</div>
 	 		<div class="row cells2">
 	 			<div class="cell">
					<div class="input-control text ">
						<form:input path="qdzxhlj" />
						<span class="input-state-error mif-warning"></span>
						<span class="input-state-success mif-checkmark"></span>
					</div>
 	 			</div>
 	 			<div class="cell">
					<div class="input-control text">
	        			<form:input path="clwxcc" />
	        			<span class="input-state-error mif-warning"></span>
						<span class="input-state-success mif-checkmark"></span>
					</div>
 	 			</div>
 	 		</div>
 	 		<div class="row cells2 title">
 	 			<div class="cell">
 	 				车型整备质量
 	 			</div>
 	 			<div class="cell">
 	 				车型最大总质量
 	 			</div>
 	 		</div>
 	 		<div class="row cells2">
 	 			<div class="cell">
					<div class="input-control text ">
						<form:input path="zbzl" />
						<span class="input-state-error mif-warning"></span>
						<span class="input-state-success mif-checkmark"></span>
					</div>
 	 			</div>
 	 			<div class="cell">
					<div class="input-control text">
	        			<form:input path="zdzzl" />
	        			<span class="input-state-error mif-warning"></span>
						<span class="input-state-success mif-checkmark"></span>
					</div>
 	 			</div>
 	 		</div>
 	 		<div class="row cells2 title">
 	 			<div class="cell">
 	 				汽车基准质量(kg)
 	 			</div>
 	 			<div class="cell">
 	 				驱动型式
 	 			</div>
 	 		</div>
 	 		<div class="row cells2">
 	 			<div class="cell">
					<div class="input-control text ">
						<form:input path="jzzl" />
						<span class="input-state-error mif-warning"></span>
						<span class="input-state-success mif-checkmark"></span>
					</div>
 	 			</div>
 	 			<div class="cell">
					<div class="input-control select">
	        			<form:select path="qdxs">
        				<form:option value="两驱" />两驱
        				<form:option value="非全时四驱" />非全时四驱
        				<form:option value="全时四驱" />全时四驱
        		    </form:select>
					</div>
 	 			</div>
 	 		</div>
 	 		<div class="row cells2 title">
 	 			<div class="cell">
 	 				车型综合油耗(L/100Km)
 	 			</div>
 	 			<div class="cell">
 	 				最大设计车速(km/h)
 	 			</div>
 	 		</div>
 	 		<div class="row cells2">
 	 			<div class="cell">
					<div class="input-control text ">
						<form:input path="yh" />
						<span class="input-state-error mif-warning"></span>
						<span class="input-state-success mif-checkmark"></span>
					</div>
 	 			</div>
 	 			<div class="cell">
					<div class="input-control text">
	        			<form:input path="zdsjcs" />
						<span class="input-state-error mif-warning"></span>
						<span class="input-state-success mif-checkmark"></span>
					</div>
 	 			</div>
 	 		</div>
 	 		<div class="row cells2 title">
 	 			<div class="cell">
 	 				底盘型号
 	 			</div>
 	 			<div class="cell">
 	 				底盘生产厂
 	 			</div>
 	 		</div>
 	 		<div class="row cells2">
 	 			<div class="cell">
					<div class="input-control text ">
						<form:input path="dpxh" />
						<span class="input-state-error mif-warning"></span>
						<span class="input-state-success mif-checkmark"></span>
					</div>
 	 			</div>
 	 			<div class="cell">
					<div class="input-control text">
	        			<form:input path="dpscc" />
						<span class="input-state-error mif-warning"></span>
						<span class="input-state-success mif-checkmark"></span>
					</div>
 	 			</div>
 	 		</div>
 	 		<c:if test="${lb == 'qqc' }">
 	 			<div class="row cells2 title">
	 	 			<div class="cell">
	 	 				燃料类型
	 	 			</div>
	 	 			<div class="cell">
	 	 				燃油规格
	 	 			</div>
	 	 		</div>
	 	 		<div class="row cells2">
	 	 			<div class="cell">
						<div class="input-control select ">
							<form:select path="rllx">
		        				<form:option value="汽油" />汽油
		        		    </form:select>
						</div>
	 	 			</div>
	 	 			<div class="cell">
						<div class="input-control text">
		        			<form:input path="rygg" />
							<span class="input-state-error mif-warning"></span>
							<span class="input-state-success mif-checkmark"></span>
						</div>
	 	 			</div>
	 	 		</div>
	 	 		<div class="row title">
	 	 			<div class="cell">
	 	 				是否使用
	 	 			</div>
	 	 		</div>
	 	 		<div class="row">
	 	 			<div class="cell">
						<env:checkboxes element="label class='input-control checkbox small-check' style='min-width:140px;'" items="${fn:split('乙醇E10,甲醇汽油M15,甲醇M20,甲醇M30,甲醇M50', ',')}" path="ycjc" />
	 	 			</div>
	 	 		</div>
	 	 		<div class="row cells2 title">
	 	 			<div class="cell">
	 	 				油箱容积(L)
	 	 			</div>
	 	 		</div>
	 	 		<div class="row cells2">
	 	 			<div class="cell">
						<div class="input-control text">
		        			<form:input path="yxrj" />
							<span class="input-state-error mif-warning"></span>
							<span class="input-state-success mif-checkmark"></span>
						</div>
					</div>
	 	 		</div>
 	 		</c:if>
 	 		<div class="buttons">
 	 			<input class="button save" type="submit" value="保存"/>
 	 		</div>
 	 	</div>
		<form:hidden path="flbh" />
        </form:form>
	</div>
</body>
</html>
