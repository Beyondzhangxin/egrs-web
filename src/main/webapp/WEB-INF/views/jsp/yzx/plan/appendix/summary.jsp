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
	 <span class="d-title">概述</span>
 	 <form:form modelAttribute="car" action="javascript:void(0)" data-role="validator" data-on-submit="sub(this,'main')" novalidate="novalidate" method="get">
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
						<input type="text" name="zclxh" value="${planFiles.jzcswjh}"  data-validate-func="required" data-validate-hint="请输入车型型号"/>
						<span class="input-state-error mif-warning"></span>
						<span class="input-state-success mif-checkmark"></span>
					</div>
 	 			</div>
 	 			<div class="cell">
					<div class="input-control text required">
						<input type="text" name="zclmc" value="${planFiles.jzcswjh}"  data-validate-func="required" data-validate-hint="请输入名称"/>
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
 	 				耐久分组编号
 	 			</div>
 	 		</div>
 	 		<div class="row cells2">
 	 			<div class="cell">
					<div class="input-control text">
						<select disabled="disabled">
							<option value="是" label="是">是</option>
							<option value="否" label="否">否</option>
						</select>
					</div>
 	 			</div>
 	 			<div class="cell">
 	 				<span>N50786</span>
					<div class="input-control text required" style="width: 253px;">
						<input type="text" name="njfzbh" value="${planFiles.jzcswjh}"  data-validate-func="required" data-validate-hint="请输入耐久分组编号"/>
						<span class="input-state-error mif-warning"></span>
						<span class="input-state-success mif-checkmark"></span>
					</div>
 	 			</div>
 	 		</div>
 	 		<div class="row cells2 title">
 	 			<div class="cell">
 	 				商标
 	 			</div>
 	 			<div class="cell">
 	 				车型分类
 	 			</div>
 	 		</div>
 	 		<div class="row cells2">
 	 			<div class="cell">
					<div class="input-control select">
						<form:select path="sb" items="${tmns }" itemValue="tmc" itemLabel="tmc"/>
					</div>
 	 			</div>
 	 			<div class="cell">
 	 				<div class="input-control select">
	 	 				<form:select path="cllb">
	        				<form:option value="N1" />N1
	        				<form:option value="N2" />N2
	        				<form:option value="N3" />N3
	        				<form:option value="M1" />M1
	        				<form:option value="M2" />M2
	        				<form:option value="M3" />M3
	        		    </form:select>
        		    </div>
 	 			</div>
 	 		</div>
 	 		<div class="row cells2 title">
 	 			<div class="cell">
 	 				排放基准/扩展
 	 			</div>
 	 			<div class="cell">
 	 				排放系族编号
 	 			</div>
 	 		</div>
 	 		<div class="row cells2">
 	 			<div class="cell">
					<div class="input-control select">
						<form:select path="pfjzkz">
	        				<form:option value="基准" />基准
	        				<form:option value="扩展" />扩展
	        		    </form:select>
					</div>
 	 			</div>
 	 			<div class="cell">
 	 				<span>G50786</span>
	 	 			<div class="input-control text required" style="width: 253px;">
	 	 				<form:input path="pfxzbh"  data-validate-func="required" data-validate-hint="请输入排放系族编号"/>
        		    </div>
 	 			</div>
 	 		</div>
 	 		<div class="row title">
 	 			<div class="cell">
 	 				车型的识别方法和位置（整车铭牌）
 	 			</div>
 	 		</div>
 	 		<div class="row">
 	 			<div class="cell">
					<div class="input-control textarea validate" data-role="input" data-text-auto-resize="true" style="width: 664px;">
	 	 				<form:textarea path="cxbswz" data-validate-func="required" data-validate-hint="请输入车型的识别方法和位置"/>
        		    </div>
 	 			</div>
 	 		</div>
 	 		<div class="row cells2 title">
 	 			<div class="cell">
 	 				车辆制造商名称
 	 			</div>
 	 			<div class="cell">
 	 				内部编号
 	 			</div>
 	 		</div>
 	 		<div class="row cells2">
 	 			<div class="cell">
					<div class="input-control select">
						<form:select path="sccmc" items="${scmcs }" />
						<span class="input-state-error mif-warning"></span>
						<span class="input-state-success mif-checkmark"></span>
					</div>
 	 			</div>
 	 			<div class="cell">
					<div class="input-control text">
						<input type="text" name="nbbh" value="${plan.nbbh }" disabled="disabled"/>
						<span class="input-state-error mif-warning"></span>
						<span class="input-state-success mif-checkmark"></span>
					</div>
 	 			</div>
 	 		</div>
 	 		<div class="row title">
 	 			<div class="cell">
 	 				生产厂地址
 	 			</div>
 	 		</div>
 	 		<div class="row">
 	 			<div class="cell">
					<div class="input-control textarea required" data-role="input" data-text-auto-resize="true" style="width: 664px;">
	 	 				<form:textarea path="sccdz" placeholder="请填写生产厂地址，如有多个生产厂地址请换行分开"  data-validate-func="required" data-validate-hint="请输入生产厂地址"/>
        		    </div>
 	 			</div>
 	 		</div>
 	 		<div class="row cells2 title">
 	 			<div class="cell">
 	 				OBD通讯接口位置
 	 			</div>
 	 			<div class="cell">
 	 				制造厂声明该车型适用的油品最高含硫量
 	 			</div>
 	 		</div>
 	 		<div class="row cells2">
 	 			<div class="cell">
					<div class="input-control text required">
						<form:input path="obdwz"  data-validate-func="required" data-validate-hint="请输入OBD通讯接口位置"/>
						<span class="input-state-error mif-warning"></span>
						<span class="input-state-success mif-checkmark"></span>
					</div>
 	 			</div>
 	 			<div class="cell">
					<div class="input-control select" style="width: 250px;">
						<form:select path="zghll">
	        				<form:option value="10" />
	        				<form:option value="50" />
	        				<form:option value="350" />
	        		    </form:select>
					</div>
					<span>mg/kg</span>
 	 			</div>
 	 		</div>
 	 		<div class="row cells2 title">
 	 			<div class="cell">
 	 				混合动力
 	 			</div>
 	 			<div class="cell">
 	 				混合动力类型
 	 			</div>
 	 		</div>
 	 		<div class="row cells2">
 	 			<div class="cell">
					<div class="input-control select">
						<form:select path="hhdl">
	        				<form:option value="是"/>
	        				<form:option value="否"/>
	        		    </form:select>
					</div>
 	 			</div>
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
 	 		</div>
 	 		<div class="row cells2 title">
 	 			<div class="cell">
 	 				混合动力驱动的联接方式
 	 			</div>
 	 			<div class="cell">
 	 				是否有怠速启停装置
 	 			</div>
 	 		</div>
 	 		<div class="row cells2">
 	 			<div class="cell">
					<div class="input-control select">
						<form:select path="hhdlljfs">
	        				<form:option value="串联式SHEV" />
	        				<form:option value="并联式PHEV" />
	        				<form:option value="混动式PSHEV" />
	        		    </form:select>
					</div>
 	 			</div>
 	 			<div class="cell">
					<div class="input-control select">
						<form:select path="isdsqtzz">
	        				<form:option value="N" label="否"/>
	        				<form:option value="Y" label="是"/>
	        		    </form:select>
					</div>
 	 			</div>
 	 		</div>
 	 		<div class="row cells2 title">
 	 			<div class="cell">
 	 				纯电模式续驶里程(等速法,km)
 	 			</div>
 	 			<div class="cell">
 	 				纯电模式续驶里程(工况法,km)
 	 			</div>
 	 		</div>
 	 		<div class="row cells2">
 	 			<div class="cell">
 	 				<div class="input-control text" style="width: 250px;">
						<form:input path="xhlcdsf"/>
						<span class="input-state-error mif-warning"></span>
						<span class="input-state-success mif-checkmark"></span>
					</div>
					<span>km/h</span>
 	 			</div>
 	 			<div class="cell">
					<div class="input-control text" style="width: 250px;">
						<form:input path="xhlcgkf"/>
						<span class="input-state-error mif-warning"></span>
						<span class="input-state-success mif-checkmark"></span>
					</div>
					<span>km</span>
 	 			</div>
 	 		</div>
 	 		<div class="row cells title">
 	 			<div class="cell">
 	 				纯电模式30分钟最高车速(km/h)
 	 			</div>
 	 		</div>
 	 		<div class="row cells">
 	 			<div class="cell">
					<div class="input-control text" style="width: 250px;">
						<form:input path="d30zgcs"/>
						<span class="input-state-error mif-warning"></span>
						<span class="input-state-success mif-checkmark"></span>
					</div>
					<span>km/h</span>
 	 			</div>
 	 		</div>
 	 		<div class="buttons">
 	 			<input class="button save" type="submit" value="保存"/>
 	 		</div>
 	 	</div>      
		<form:hidden path="flbh" />
        </form:form>
	</div>
</body>
</html>
