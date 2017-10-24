<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../../../../../../include/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" dir="ltr" lang="zh-CN" xml:lang="zh-CN">
<body>
	<div id="detail">
	 <span class="d-title">概述</span>
 	 <form:form modelAttribute="car" action="javascript:void(0)" data-role="validator" data-on-submit="sub(this,'main')" novalidate="novalidate"> 
        <div class="grid">
        	<div class="row cells2 title">
	 			<div class="cell">
	 				发动机型号
	 			</div>
	 			<div class="cell">
	 				发动机排量
	 			</div>
	 		</div>
	 		<div class="row cells2">
	 			<div class="cell">
					<div class="input-control text" >
		       			<form:input path="fdjxh" disabled="${flag }"/>
		       			<span class="input-state-error mif-warning"></span>
						<span class="input-state-success mif-checkmark"></span>
					</div>
	 			</div>
	 			<div class="cell">
					<div class="input-control text">
		       			<form:input path="fdjpl" disabled="${flag }"/>
		       			<span class="input-state-error mif-warning"></span>
						<span class="input-state-success mif-checkmark"></span>
					</div>
	 			</div>
	 		</div>
	 		<div class="row cells2 title">
	 			<div class="cell">
	 				发动机制造商
	 			</div>
	 			<div class="cell">
	 				压缩比
	 			</div>
	 		</div>
	 		<div class="row cells2">
	 			<div class="cell">
					<div class="input-control text" >
		       			<form:input path="fdjscc" disabled="${flag }"/>
		       			<span class="input-state-error mif-warning"></span>
						<span class="input-state-success mif-checkmark"></span>
					</div>
	 			</div>
	 			<div class="cell">
					<div class="input-control text ysb">
		       			<c:if test="${flag }">
		        			<input name="ysb1_1"  value="${ysb1_1 }" disabled="disabled"/>±<input name="ysb1_2"  value="${ysb1_2 }" disabled="disabled"/>:
		        		</c:if>	
		        		<c:if test="${!flag }">
		        			<input name="ysb1_1"  value="${ysb1_1 }" />±<input name="ysb1_2"  value="${ysb1_2 }" />:
		        		</c:if>	
		        		<form:input path="ysb2" disabled="${flag }"/>
					</div>
	 			</div>
	 		</div>
	 		<div class="row cells2 title">
	 			<div class="cell">
	 				缸径
	 			</div>
	 			<div class="cell">
	 				行程
	 			</div>
	 		</div>
	 		<div class="row cells2">
	 			<div class="cell">
					<div class="input-control text" >
		       			<form:input path="gj" disabled="${flag }"/>
		       			<span class="input-state-error mif-warning"></span>
						<span class="input-state-success mif-checkmark"></span>
					</div>
	 			</div>
	 			<div class="cell">
					<div class="input-control text">
		       			<form:input path="xc" disabled="${flag }"/>
		       			<span class="input-state-error mif-warning"></span>
						<span class="input-state-success mif-checkmark"></span>
					</div>
	 			</div>
	 		</div>
	 		<div class="row cells2 title">
	 			<div class="cell">
	 				工作原理
	 			</div>
	 			<div class="cell">
	 				冲程数
	 			</div>
	 		</div>
	 		<div class="row cells2">
	 			<div class="cell">
					<div class="input-control text" >
		       			<form:input path="gzyl" disabled="${flag }"/>
		       			<span class="input-state-error mif-warning"></span>
						<span class="input-state-success mif-checkmark"></span>
					</div>
	 			</div>
	 			<div class="cell">
					<div class="input-control select">
		       			<form:select path="xh"  disabled="${flag }">
		        			<form:option value="四冲程"/>四冲程
		        			<form:option value="二冲程"/>二冲程
		        		</form:select>
					</div>
	 			</div>
	 		</div>
	 		<div class="row title">
	 			<div class="cell">
	 				燃烧室图纸
	 			</div>
	 		</div>
	 		<div class="row">
	 			<div class="cell">
					<div class="fine-uploader" data-option="{validation:{allowedExtensions: ['jpeg', 'jpg', 'gif', 'png']}}">
        				<form:hidden path="rsstzh" cssClass="filename"/>
        			</div>
	 			</div>
	 		</div>
	 		<div class="row cells2 title">
	 			<div class="cell">
	 				活塞顶示意图
	 			</div>
	 		</div>
	 		<div class="row cells2">
	 			<div class="cell">
					<div class="fine-uploader" data-option="{validation:{allowedExtensions: ['jpeg', 'jpg', 'gif', 'png']}}">
        				<form:hidden path="hshtzh" cssClass="filename"/>
        			</div>
	 			</div>
	 		</div>
	 		<div class="row cells2 title">
	 			<div class="cell">
	 				气缸数目
	 			</div>
	 			<div class="cell">
	 				气缸排列
	 			</div>
	 		</div>
	 		<div class="row cells2">
	 			<div class="cell">
					<div class="input-control text" >
		       			<form:input path="qgsm" disabled="${flag }"/>
		       			<span class="input-state-error mif-warning"></span>
						<span class="input-state-success mif-checkmark"></span>
					</div>
	 			</div>
	 			<div class="cell">
					<div class="input-control text">
		       			<form:input path="qgpl" disabled="${flag }"/>
		       			<span class="input-state-error mif-warning"></span>
						<span class="input-state-success mif-checkmark"></span>
					</div>
	 			</div>
	 		</div>
	 		<div class="row cells2 title">
	 			<div class="cell">
	 				点火顺序
	 			</div>
	 			<div class="cell">
	 				制造厂规定的发动机最大允许转速
	 			</div>
	 		</div>
	 		<div class="row cells2">
	 			<div class="cell">
					<div class="input-control text" >
		       			<form:input path="dhsx" disabled="${flag }"/>
		       			<span class="input-state-error mif-warning"></span>
						<span class="input-state-success mif-checkmark"></span>
					</div>
	 			</div>
	 			<div class="cell">
					<div class="input-control text">
		       			<form:input path="zdyxzs" disabled="${flag }"/>
		       			<span class="input-state-error mif-warning"></span>
						<span class="input-state-success mif-checkmark"></span>
					</div>
	 			</div>
	 		</div>
	 		<div class="row cells2 title">
	 			<div class="cell">
	 				最大净功率
	 			</div>
	 			<div class="cell">
	 				最大净扭矩
	 			</div>
	 		</div>
	 		<div class="row cells2">
	 			<div class="cell">
					<div class="input-control text" >
		       			<form:input path="jgl1" disabled="${flag }" cssStyle="width: 122px;"/>kw在
		       			<form:input path="jgl2" disabled="${flag }" cssStyle="width: 122px;"/>以下
					</div>
	 			</div>
	 			<div class="cell">
					<div class="input-control text">
		       			<form:input path="zdnj1" disabled="${flag }" cssStyle="width: 110px;"/>N/M在
        				<form:input path="zdnj2" disabled="${flag }" cssStyle="width: 100px;"/>r/min下
					</div>
	 			</div>
	 		</div>
	 		<div class="row cells2 title">
	 			<div class="cell">
	 				是否稀薄燃烧
	 			</div>
	 			<div class="cell">
	 				最大净扭矩
	 			</div>
	 		</div>
	 		<div class="row cells2">
	 			<div class="cell">
					<div class="input-control text" >
		       			<form:input path="jgl1" disabled="${flag }" cssStyle="width: 122px;"/>kw在
		       			<form:input path="jgl2" disabled="${flag }" cssStyle="width: 122px;"/>以下
					</div>
	 			</div>
	 			<div class="cell">
					<div class="input-control text">
		       			<form:input path="zdnj1" disabled="${flag }" cssStyle="width: 110px;"/>N/M在
        				<form:input path="zdnj2" disabled="${flag }" cssStyle="width: 100px;"/>r/min下
					</div>
	 			</div>
	 		</div>
	 		<div class="row cells2 title">
	 			<div class="cell">
	 				是否稀薄燃烧
	 			</div>
	 			<div class="cell">
	 				燃料标号
	 			</div>
	 		</div>
	 		<div class="row cells2">
	 			<div class="cell">
					<div class="input-control select" >
		       			<form:select path="xbrs" disabled="${flag }">
	        				<form:option value="是" disabled="${flag }"/>是
	        				<form:option value="否" disabled="${flag }"/>否
	        		    </form:select>
					</div>
	 			</div>
	 			<div class="cell">
					<div class="input-control text">
		       			<form:input path="rlbh" disabled="${flag }"/>
		       			<span class="input-state-error mif-warning"></span>
						<span class="input-state-success mif-checkmark"></span>
					</div>
	 			</div>
	 		</div>
	 		<div class="row cells2 title">
	 			<div class="cell">
	 				怠速转速（多个以逗号隔开）
	 			</div>
	 			<div class="cell">
	 				额定功率
	 			</div>
	 		</div>
	 		<div class="row cells2">
	 			<div class="cell">
					<div class="input-control text" >
		       			<form:input path="dszs" disabled="${flag }"/>
		       			<span class="input-state-error mif-warning"></span>
						<span class="input-state-success mif-checkmark"></span>
					</div>
	 			</div>
	 			<div class="cell">
					<div class="input-control text">
						<form:input path="edgl1" disabled="${flag }" cssStyle="width: 110px;"/>kw在
        				<form:input path="edgl2" disabled="${flag }" cssStyle="width: 110px;"/>r/min下
					</div>
	 			</div>
	 		</div>
	 		<div class="row cells2 title">
	 			<div class="cell">
	 				怠速时排气中一氧化碳百分比
	 			</div>
	 			<div class="cell">
	 				怠速时排气中(10－碳氢化合物体积浓度(ppm))
	 			</div>
	 		</div>
	 		<div class="row cells2">
	 			<div class="cell">
					<div class="input-control text">
		       			<form:input path="cobfb" disabled="${flag }" cssStyle="width: 296px;"/>%
		       			<span class="input-state-error mif-warning"></span>
						<span class="input-state-success mif-checkmark"></span>
					</div>
	 			</div>
	 			<div class="cell">
					<div class="input-control text">
		       			<form:input path="chbfb" disabled="${flag }" cssStyle="width: 238px;"/>(10－6v/v)
		       			<span class="input-state-error mif-warning"></span>
						<span class="input-state-success mif-checkmark"></span>
					</div>
	 			</div>
	 		</div>
	 		<div class="row cells2 title">
	 			<div class="cell">
	 				高怠速转速
	 			</div>
	 			<div class="cell">
	 				高怠速时排气中一氧化碳百分比
	 			</div>
	 		</div>
	 		<div class="row cells2">
	 			<div class="cell">
					<div class="input-control text">
		       			<form:input path="gdszs" disabled="${flag }" cssStyle="width: 270px;"/>r/min
		       			<span class="input-state-error mif-warning"></span>
						<span class="input-state-success mif-checkmark"></span>
					</div>
	 			</div>
	 			<div class="cell">
					<div class="input-control text">
		       			<form:input path="gdscobfb" disabled="${flag }"/>%
		       			<span class="input-state-error mif-warning"></span>
						<span class="input-state-success mif-checkmark"></span>
					</div>
	 			</div>
	 		</div>
	 		<div class="row cells2 title">
	 			<div class="cell">
	 				高怠速时排气中(10－碳氢化合物体积浓度(ppm))
	 			</div>
	 			<div class="cell">
	 				高怠速时过量空气系数
	 			</div>
	 		</div>
	 		<div class="row cells2">
	 			<div class="cell">
					<div class="input-control text">
		       			<form:input path="gdshcbfb" disabled="${flag }" cssStyle="width: 238px;"/>(10－6v/v)
		       			<span class="input-state-error mif-warning"></span>
						<span class="input-state-success mif-checkmark"></span>
					</div>
	 			</div>
	 			<div class="cell">
					<div class="input-control text">
		       			<form:input path="gdskrb" disabled="${flag }" />
		       			<span class="input-state-error mif-warning"></span>
						<span class="input-state-success mif-checkmark"></span>
					</div>
	 			</div>
	 		</div>
	 		<div class="row cells2 title">
	 			<div class="cell">
	 				机舱隔音材料
	 			</div>
	 			<div class="cell">
	 				气门布置
	 			</div>
	 		</div>
	 		<div class="row cells2">
	 			<div class="cell">
					<div class="input-control text">
		       			<form:input path="jcgycl" disabled="${flag }"/>
		       			<span class="input-state-error mif-warning"></span>
						<span class="input-state-success mif-checkmark"></span>
					</div>
	 			</div>
	 			<div class="cell">
					<div class="input-control text">
		       			<form:input path="qmbz" disabled="${flag }"/>
		       			<span class="input-state-error mif-warning"></span>
						<span class="input-state-success mif-checkmark"></span>
					</div>
	 			</div>
	 		</div>
	 		<div class="row cells2 title">
	 			<div class="cell">
	 				燃料类型
	 			</div>
	 			<div class="cell">
	 				气门数
	 			</div>
	 		</div>
	 		<div class="row cells2">
	 			<div class="cell">
					<div class="input-control text">
		       			<form:input path="rl" disabled="${flag }"/>
		       			<span class="input-state-error mif-warning"></span>
						<span class="input-state-success mif-checkmark"></span>
					</div>
	 			</div>
	 			<div class="cell">
					<div class="input-control text">
		       			<form:input path="qms" disabled="${flag }"/>
		       			<span class="input-state-error mif-warning"></span>
						<span class="input-state-success mif-checkmark"></span>
					</div>
	 			</div>
	 		</div>
	 		<div class="row cells2 title">
	 			<div class="cell">
	 				车辆适用油品的最低辛烷值
	 			</div>
	 			<div class="cell">
	 				车辆标定试验时所用油品的辛烷值
	 			</div>
	 		</div>
	 		<div class="row cells2">
	 			<div class="cell">
					<div class="input-control text">
		       			<form:input path="wqqyxwz" disabled="${flag }"/>
		       			<span class="input-state-error mif-warning"></span>
						<span class="input-state-success mif-checkmark"></span>
					</div>
	 			</div>
	 			<div class="cell">
					<div class="input-control select">
		       			<form:select path="syxwz" disabled="${flag }">
	        				<form:option value="89"/>89
	        				<form:option value="90"/>90
	        				<form:option value="92"/>92
	        				<form:option value="93"/>93
	        				<form:option value="95"/>95
	        				<form:option value="97"/>97
	        			</form:select>
					</div>
	 			</div>
	 		</div>
	 		<div class="row cells2 title">
	 			<div class="cell">
	 				进气方式
	 			</div>
	 			<div class="cell">
	 				燃料喷射工作原理
	 			</div>
	 		</div>
	 		<div class="row cells2">
	 			<div class="cell">
					<div class="input-control text">
		       			<form:input path="jqfs" disabled="${flag }"/>
		       			<span class="input-state-error mif-warning"></span>
						<span class="input-state-success mif-checkmark"></span>
					</div>
	 			</div>
	 			<div class="cell">
					<div class="input-control select">
		       			<form:select path="rlpslx" disabled="${flag }">
	        				<form:option value="单点"/>单点
	        				<form:option value="多点,进气歧管喷射"/>多点,进气歧管喷射
	        				<form:option value="缸内直接喷射"/>缸内直接喷射
	        			</form:select>
					</div>
	 			</div>
	 		</div>
	 		<div class="row title">
	 			<div class="cell">
	 				型号生产厂名称打刻内容
	 			</div>
	 		</div>
	 		<div class="row">
	 			<div class="cell">
					<div class="input-control text">
						<c:if test="${!flag }">
							<input name="bs" id="bs" value="${bs.bs }" style="width: 666px;"/>
						</c:if>
						<c:if test="${flag }">
							<input name="bs" id="bs" value="${bs.bs }" style="width: 666px;" disabled="disabled"/>
						</c:if>
		       			<span class="input-state-error mif-warning"></span>
						<span class="input-state-success mif-checkmark"></span>
					</div>
	 			</div>
	 		</div>
	 		<div class="row title">
	 			<div class="cell">
	 				型号生产厂名称打刻内容图片
	 			</div>
	 		</div>
	 		<div class="row">
	 			<div class="cell">
					<div class="fine-uploader" data-option="{validation:{allowedExtensions: ['jpeg', 'jpg', 'gif', 'png']}}">
        					<input type="hidden" class="filename" name="pzlb" value="${bs.pzlb }"/>
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
        <input type="hidden" name="pzlb" value="FDJ"/>
        <form:hidden path="fdjbh"/>
		<form:hidden path="flbh" />
       </form:form>
	</div>
</body>
</html>
