<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../../../../../include/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" dir="ltr" lang="zh-CN" xml:lang="zh-CN">
<head>
    <title>视同概述</title>
</head>
<body>
	<div id="detail">
	<span class="d-title">概述</span>
	<form:form modelAttribute="car"  action="javascript:void(0)" data-role="validator" data-on-submit="sub(this,'teAppendix')" novalidate="novalidate" method="get">         
    <div class="grid">
    	<div class="row cells2 title">
			<div class="cell">
 				车型型号
 			</div>
 			<div class="cell">
 				名称
 			</div>
 		</div>
 		<div class="row cells2">
 			<div class="cell">
				<div class="input-control text required">
					<form:input path="clxh"  data-validate-func="required" data-validate-hint="请输入车型型号"/>
				 	<span class="input-state-error mif-warning"></span>
					<span class="input-state-success mif-checkmark"></span>
				</div>
 			</div>
 			<div class="cell">
				<div class="input-control text required">
					<form:input path="clmc"  data-validate-func="required" data-validate-hint="请输入车型名称"/>
				 	<span class="input-state-error mif-warning"></span>
					<span class="input-state-success mif-checkmark"></span>
				</div>
 			</div>
 		</div>
 		<div class="row cells2 title">
			<div class="cell">
 				是否耐久性试验基准车型
 			</div>
 			<div class="cell">
 				商标
 			</div>
 		</div>
 		<div class="row cells2">
 			<div class="cell">
				<div class="input-control select">
					<form:select path="njsource">
        				<form:option value="否"/>
        				<form:option value="是"/>
        			</form:select>
				</div>
 			</div>
 			<div class="cell">
				<div class="input-control select">
					<form:select path="clsb" items="${tmns }" itemValue="tmc" itemLabel="tmc" />
				</div>
 			</div>
 		</div>
 		<div class="row cells2 title">
			<div class="cell">
 				车型分类
 			</div>
 			<div class="cell">
 				车型的识别方法和位置（整车铭牌）
 			</div>
 		</div>
 		<div class="row cells2">
 			<div class="cell">
				<div class="input-control select">
					<form:select path="qcfl">
        				<form:option value="N1" />N1
        				<form:option value="N2" />N2
        				<form:option value="N3" />N3
        				<form:option value="M1" />M1
        				<form:option value="M2" />M2
        				<form:option value="M3" />M3
        		    </form:select>
				</div>
 			</div>
 			<div class="cell">
				<div class="input-control text required">
					<form:input path="cxbswz" data-validate-func="required" data-validate-hint="请输入车型的识别方法和位置"/>
				 	<span class="input-state-error mif-warning"></span>
					<span class="input-state-success mif-checkmark"></span>
				</div>
 			</div>
 		</div>
 		<div class="row title">
			<div class="cell">
 				生产厂地址（如有多个生产厂地址请换行分开）
 			</div>
 		</div>
 		<div class="row">
 			<div class="cell">
				<div class="input-control textarea">
					<div class="input-control textarea validate" data-role="input" data-text-auto-resize="true" style="width: 664px;">
	 	 				<form:textarea path="sccdz" data-validate-func="required" data-validate-hint="请输入车型的识别方法和位置"/>
        		    </div>
				</div>
 			</div>
 		</div>
 		<div class="row cells2 title">
			<div class="cell">
 				车辆外形尺寸
 			</div>
 			<div class="cell">
 				车型整备质量
 			</div>
 		</div>
 		<div class="row cells2">
 			<div class="cell">
				<div class="input-control text">
					<form:input path="clwxcc" />
					<span class="input-state-error mif-warning"></span>
					<span class="input-state-success mif-checkmark"></span>
				</div>
 			</div>
 			<div class="cell">
				<div class="input-control text">
					<form:input path="zbzl"/>
				 	<span class="input-state-error mif-warning"></span>
					<span class="input-state-success mif-checkmark"></span>
				</div>
 			</div>
 		</div>
 		<div class="row cells2 title">
			<div class="cell">
 				油箱容积
 			</div>
 			<div class="cell">
 				车型最大总质量
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
 			<div class="cell">
				<div class="input-control text">
					<form:input path="zdzzl"/>
				 	<span class="input-state-error mif-warning"></span>
					<span class="input-state-success mif-checkmark"></span>
				</div>
 			</div>
 		</div>
 		<div class="row cells2 title">
			<div class="cell">
 				车型综合油耗（L/100km）
 			</div>
 			<div class="cell">
 				OBD通讯接口位置
 			</div>
 		</div>
 		<div class="row cells2">
 			<div class="cell">
				<div class="input-control text">
					<form:input path="yh" />
					<span class="input-state-error mif-warning"></span>
					<span class="input-state-success mif-checkmark"></span>
				</div>
 			</div>
 			<div class="cell">
				<div class="input-control text required">
					<form:input path="obdwz" data-validate-func="required" data-validate-hint="请输入OBD通讯接口位置"/>
				 	<span class="input-state-error mif-warning"></span>
					<span class="input-state-success mif-checkmark"></span>
				</div>
 			</div>
 		</div>
 		<div class="row cells2 title">
			<div class="cell">
 				制造厂声明该车型适用的油品最高含硫量（mg/kg）
 			</div>
 			<div class="cell">
 				最大设计车速（km/h）
 			</div>
 		</div>
 		<div class="row cells2">
 			<div class="cell">
				<div class="input-control select">
					<form:select path="zghll">
        				<form:option value="10" />
        				<form:option value="50" />
        				<form:option value="350" />
        		    </form:select>
				</div>
 			</div>
 			<div class="cell">
				<div class="input-control text">
					<form:input path="zdsjcs"/>
				 	<span class="input-state-error mif-warning"></span>
					<span class="input-state-success mif-checkmark"></span>
				</div>
 			</div>
 		</div>
 		<div class="row cells2 title">
			<div class="cell">
 				车型基准质量（kg）
 			</div>
 			<div class="cell">
 				混合动力
 			</div>
 		</div>
 		<div class="row cells2">
 			<div class="cell">
 				<div class="input-control text">
					<form:input path="jzzl"/>
				 	<span class="input-state-error mif-warning"></span>
					<span class="input-state-success mif-checkmark"></span>
				</div>
 			</div>
 			<div class="cell">
				<div class="input-control select">
					<form:select path="hhdl">
        				<form:option value="是"/>
        				<form:option value="否"/>
        		    </form:select>
				</div>
 			</div>
 		</div>
 		<div class="row cells2 title">
			<div class="cell">
 				混合动力类型
 			</div>
 			<div class="cell">
 				混合动力驱动的联接方式
 			</div>
 		</div>
 		<div class="row cells2">
 			<div class="cell">
 				<div class="input-control select">
					<form:select path="hhdllx">
        				<form:option value="可外接充电,无手动选择行驶模式功能" />
        				<form:option value="可外接充电,有手动选择行驶模式功能" />
        				<form:option value="不可外接充电,无手动选择行驶模式功能" />
        				<form:option value="不可外接充电,有手动选择行驶模式功能" />
        		    </form:select>
				</div>
 			</div>
 			<div class="cell">
				<div class="input-control select">
					<form:select path="hhdlljfs">
        				<form:option value="串联式SHEV" />
        				<form:option value="并联式PHEV" />
        				<form:option value="混动式PSHEV" />
        		    </form:select>
				</div>
 			</div>
 		</div>
 		<div class="row cells2 title">
			<div class="cell">
 				是否有怠速启停装置
 			</div>
 			<div class="cell">
 				纯电模式30分钟最高车速(km/h)
 			</div>
 		</div>
 		<div class="row cells2">
 			<div class="cell">
 				<div class="input-control select">
					<form:select path="isdsqtzz">
        				<form:option value="N" label="否"/>
        				<form:option value="Y" label="是"/>
        		    </form:select>
				</div>
 			</div>
 			<div class="cell">
				<div class="input-control text">
					<form:input path="d30zgcs"/>
				 	<span class="input-state-error mif-warning"></span>
					<span class="input-state-success mif-checkmark"></span>
				</div>
 			</div>
 		</div>
 		<div class="row cells2 title">
			<div class="cell">
 				纯电模式续驶里程(工况法,km)
 			</div>
 			<div class="cell">
 				纯电模式续驶里程(等速法,km)
 			</div>
 		</div>
 		<div class="row cells2">
 			<div class="cell">
 				<div class="input-control text">
					<form:input path="xhlcgkf"/>
				 	<span class="input-state-error mif-warning"></span>
					<span class="input-state-success mif-checkmark"></span>
				</div>
 			</div>
 			<div class="cell">
				<div class="input-control text">
					<form:input path="xhlcdsf"/>
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
 		<div class="buttons">
 			<input class="button save" type="submit" value="保存"/>
 		</div>
    </div>    
	<form:hidden path="bh"/>
	<form:hidden path="flbh" />
    </form:form>
	</div>
</body>
</html>
