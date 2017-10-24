<%@ page language="java" contentType="text/html;charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../../../../include/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTDHTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="${contextPath }/css/list.css" rel="stylesheet" type="text/css">
<link href="${contextPath }/css/report.css" rel="stylesheet" type="text/css">
<title>信息公开</title>
</head>
<body>
    <div class="report-view">
    	<p>
    	报告编号：${E3_REPORT.JYBGBH}<br>
    	内部编号：${E3_REPORT.NBBH}
    	</p>
    	<h1>检测报告</h1>
    	<h4>常温下冷启动后排气污染物排放试验（I型）<br>(GB18352.5-2013)</h4>
    	<table>
    		<tr>
    			<td>产品名称</td>
    			<td>${E3_REPORT.CPMC}</td>
    		</tr>
    		<tr>
    			<td>产品商标</td>
    			<td>${E3_REPORT.SB}</td>
    		</tr>
    		<tr>
    			<td>产品型号</td>
    			<td>${E3_REPORT.CPXH}</td>
    		</tr>
    		<tr>
    			<td>受检单位</td>
    			<td>${E3_REPORT.SJDWMC}</td>
    		</tr>
    		<tr>
    			<td>检验类别</td>
    			<td>${E3_REPORT.JYLB}</td>
    		</tr>
    		<tr>
    			<td>发送日期</td>
    			<td>${E3_REPORT.FSRQ}</td>
    		</tr>
    	</table>
    	<h3>注意事项</h3>
    	<p>
    		1．	报告无“检验报告专用章”或检验单位公章无效。<br>
			2．	复制报告未重新加盖“检验报告专用章”或检验单位公章无效。<br>
			3．	报告无主检、审核、批准人签字无效。<br>
			4．	报告涂改无效。<br>
			5．	对检验报告若有异议，应于收到报告之日起到十五日内向检验单位提出，逾期不予受理。<br>
			6．	送样检验仅对样品负责。
		</p>
		<h3>检验信息</h3>
		<div class="info-view">
			<div class="info-view-left f">
				<table>
					<tr>
						<td width="150">检验单位名称</td>
						<td>${E3_REPORT.JYDWMC}</td>
					</tr>
					<tr>
						<td>地址</td>
						<td>${E3_REPORT. JYDWADDRESS }</td>
					</tr>
					<tr>
						<td>电话</td>
						<td>${E3_REPORT. JYDWTEL}</td>
					</tr>
					<tr>
						<td>传真</td>
						<td>${E3_REPORT.JYDWFAX}</td>
					</tr>
					<tr>
						<td>邮编</td>
						<td>${E3_REPORT.JYDWCODE}</td>
					</tr>
					<tr>
						<td>E-mail</td>
						<td>${E3_REPORT.JYDWEMAIL}</td>
					</tr>
				</table>
			</div>
			<div class="info-view-right r">
				<table>
					<tr>
						<td width="150">受验单位名称</td>
						<td>${E3_REPORT.SJDWMC}</td>
					</tr>
					<tr>
						<td>地址</td>
						<td>${E3_REPORT.SJDWADDRESS}</td>
					</tr>
					<tr>
						<td>电话</td>
						<td>${E3_REPORT.SJDWTEL}</td>
					</tr>
					<tr>
						<td>传真</td>
						<td>${E3_REPORT.SJDWFAX}</td>
					</tr>
					<tr>
						<td>邮编</td>
						<td>${E3_REPORT.SJDWCODE}</td>
					</tr>
					<tr>
						<td>E-mail</td>
						<td>${E3_REPORT.SJDWEMAIL}</td>
					</tr>
				</table>
			</div>
			<div class="c"></div>
		</div>
		<h3>检验报告——检验结论</h3>
    	<p>
    	报告编号：${E3_REPORT.JYBGBH}<br>
    	检验单位名称：${E3_REPORT.JYDWMC}
    	</p>
    	<div>
    		<table>
    			<tr>
    				<td width="150">样品名称</td>
    				<td>${E3_REPORT.CPMC}</td>
    				<td width="150">型号</td>
    				<td>${E3_REPORT.CPXH}</td>
    			</tr>
    			<tr>
    				<td>商标</td>
    				<td>${E3_REPORT.SB}</td>
    				<td>受检单位</td>
    				<td>${E3_REPORT.SJDWMC}</td>
    			</tr>
    			<tr>
    				<td>生产单位</td>
    				<td>${E3_REPORT.SCDWMC}</td>
    				<td>生产日期</td>
    				<td>${E3_REPORT.SCRQ}</td>
    			</tr>
    			<tr>
    				<td>送样者</td>
    				<td>${E3_REPORT.SYR}</td>
    				<td>送样日期</td>
    				<td>${E3_REPORT.SYRQ}</td>
    			</tr>
    			<tr>
    				<td>样品数量</td>
    				<td>${E3_REPORT.YPSL}</td>
    				<td>检验类别</td>
    				<td>${E3_REPORT.JYLB}</td>
    			</tr>
    			<tr>
    				<td>检验依据</td>
    				<td>${E3_REPORT.JYYJ}</td>
    				<td>检验项目</td>
    				<td>${E3_REPORT.JYNR}</td>
    			</tr>
    			<tr>
    				<td>检验结论</td>
    				<td colspan="3">${E3_REPORT.JYJL}</td>
    				
    			</tr>
    			<tr>
    				<td>备注</td>
    				<td colspan="3">${E3_REPORT.BZ}</td>
    			</tr>
    		</table>
    		<div>
    			<div class="f cell">批准：${E3_REPORT.PZR}  </div>
    			<div class="f cell">审核：${E3_REPORT.SHR} </div>
    			<div class="f cell">主检：${E3_REPORT.ZJR}</div>
    			<div class="c"></div>
    		</div>    		
    	</div>
    	<h3>检验报告——检验车辆基本参数1</h3>
    	<p>
    	报告编号：${E3_REPORT.JYBGBH}<br>
    	检验单位名称：${E3_REPORT.JYDWMC}
    	</p>
    	<table>
	    	<tr>
	    		<td rowspan="17" width="40">整<br>车<br>参<br>数</td>
	    		<td colspan="2" width="80">车辆型号名称</td>
	    		<td width="280">${E3_REPORT.CPXH}/${E3_REPORT.CPMC}</td>
	    		<td width="200">生产厂</td>
	    		<td width="200">${E3_REPORT.SCDWMC}</td>
	    	</tr>
	    	<tr>
	    		<td colspan="2">VIN号</td>
	    		<td>${E3_QQC_MAIN_CW.VIN}</td>
	    		<td>最大设计车速</td>
	    		<td>${E3_QQC_MAIN_CW.ZDCS}</td>
	    	</tr>
	    	<tr>
	    		<td colspan="2">混合动力类型</td>
	    		<td>${E3_QQC_MAIN_CW.HHDLFL}</td>
	    		<td>混合动力驱动的联结方式</td>
	    		<td>${E3_QQC_MAIN_CW.HHDLLJFS}</td>
	    	</tr>
	    	<tr>
	    		<td colspan="2">续航里程</td>
	    		<td>${E3_QQC_MAIN_CW.XHLC}</td>
	    		<td>基准质量(kg)</td>
	    		<td>${E3_QQC_MAIN_CW.JZZL}</td>
	    	</tr>
	    	<tr>
	    		<td colspan="2">最大总质量(kg)</td>
	    		<td>${E3_QQC_MAIN_CW.ZDZZL}</td>
	    		<td>整备质量(kg)</td>
	    		<td>${E3_QQC_MAIN_CW.ZBZL}</td>
	    	</tr>
	    	<tr>
	    		<td colspan="2">车辆外形尺寸</td>
	    		<td>${E3_QQC_MAIN_CW.CLWXCC}</td>
	    		<td>车辆座位数</td>
	    		<td>${E3_QQC_MAIN_CW.SJCYS}</td>
	    	</tr>
	    	<tr>
	    		<td colspan="2">车胎数量</td>
	    		<td>${E3_QQC_MAIN_CW.LTSL}</td>
	    		<td>商标</td>
	    		<td>${E3_QQC_MAIN_CW.SB}</td>
	    	</tr>
	    	<tr>
	    		<td>轮胎1</td>
	    		<td>轮胎型号</td>
	    		<td>${E3_QQC_MAIN_CW.LTXH1}</td>
	    		<td>前后轮/驱动轮胎压力</td>
	    		<td>${E3_QQC_MAIN_CW.QHLTYL1}/${E3_QQC_MAIN_CW.QDLTYL1}</td>
	    	</tr>
	    	<tr>
	    		<td>轮胎2</td>
	    		<td>轮胎型号</td>
	    		<td>${E3_QQC_MAIN_CW.LTXH2} </td>
	    		<td>前后轮/驱动轮胎压力</td>
	    		<td>${E3_QQC_MAIN_CW.QHLTYL2}/${E3_QQC_MAIN_CW.QDLTYL2}</td>
	    	</tr>
	    	<tr>
	    		<td>轮胎3</td>
	    		<td>轮胎型号</td>
	    		<td>${E3_QQC_MAIN_CW.LTXH3}</td>
	    		<td>前后轮/驱动轮胎压力</td>
	    		<td>${E3_QQC_MAIN_CW.QHLTYL3}/${E3_QQC_MAIN_CW.QDLTYL3}</td>
	    	</tr>
	    	<tr>
	    		<td>轮胎4</td>
	    		<td>轮胎型号</td>
	    		<td>${E3_QQC_MAIN_CW.LTXH4}</td>
	    		<td>前后轮/驱动轮胎压力</td>
	    		<td>${E3_QQC_MAIN_CW.QHLTYL4}/${E3_QQC_MAIN_CW.QDLTYL4}</td>
	    	</tr>
	    	<tr>
	    		<td colspan="2">点火系统型号</td>
	    		<td>${E3_QQC_MAIN_CW.DHXTXH}</td>
	    		<td>点火系统生产厂</td>
	    		<td>${E3_QQC_MAIN_CW.DHXTSCC}</td>
	    	</tr>
	    	<tr>
	    		<td colspan="2">驱动型式</td>
	    		<td>${E3_QQC_MAIN_CW.QDXS}</td>
	    		<td>油耗(l/100km)</td>
	    		<td>${E3_QQC_MAIN_CW.YH}</td>
	    	</tr>
	    	<tr>
	    		<td colspan="2">里程表读数(km)</td>
	    		<td>${E3_QQC_MAIN_CW.LCBDS}</td>
	    		<td>汽车分类</td>
	    		<td>${E3_QQC_MAIN_CW.QCFL}</td>
	    	</tr>
	    	<tr>
	    		<td colspan="2">燃料类型</td>
	    		<td>${E3_QQC_MAIN_CW.RLLX}</td>
	    		<td>燃油规格</td>
	    		<td>${E3_QQC_MAIN_CW.RYGG}</td>
	    	</tr>
	    	<tr>
	    		<td colspan="2">邮箱容积(l)</td>
	    		<td>${E3_QQC_MAIN_CW.YXRJ}</td>
	    		<td>燃油供给型式</td>
	    		<td>${E3_QQC_MAIN_CW.YXRJ}</td>
	    	</tr>
	    	<tr>
	    		<td colspan="2">底盘型号</td>
	    		<td>${E3_QQC_MAIN_CW.DPXH}</td>
	    		<td>底盘生产厂</td>
	    		<td>${E3_QQC_MAIN_CW.DPSCC}</td>
	    	</tr>
    	</table>
    	<h3>检验车辆基本参数2</h3>
    	<table>
	    	<tr>
	    		<td rowspan="6" width="40">变<br>速<br>器</td>
	    		<td colspan="2" width="80">变速器型式</td>
	    		<td width="280">${E3_QQC_MAIN_CW.BSXXS}</td>
	    		<td width="200">主减速器速比</td>
	    		<td width="200">${E3_QQC_MAIN_CW.ZJSB}</td>
	    	</tr>
	    	<tr>
	    		<td colspan="2">档位数</td>
	    		<td>${E3_QQC_MAIN_CW.BSXDWS}</td>
	    		<td>离合器型式</td>
	    		<td>${E3_QQC_MAIN_CW.LHQXS}</td>
	    	</tr>
	    	<tr>
	    		<td colspan="2">1/2速比</td>
	    		<td>${E3_QQC_MAIN_CW.SB1}/${E3_QQC_MAIN_CW.SB2}</td>
	    		<td>3/4速比</td>
	    		<td>${E3_QQC_MAIN_CW.SB3}/${E3_QQC_MAIN_CW.SB4}</td>
	    	</tr>
	    	<tr>
	    		<td colspan="2">5/6速比</td>
	    		<td>${E3_QQC_MAIN_CW.SB5}/${E3_QQC_MAIN_CW.SB6}</td>
	    		<td>7/8速比</td>
	    		<td>${E3_QQC_MAIN_CW.SB7}/${E3_QQC_MAIN_CW.SB8}</td>
	    	</tr>
	    	<tr>
	    		<td colspan="2">9/10速比</td>
	    		<td>${E3_QQC_MAIN_CW.SB9}/${E3_QQC_MAIN_CW.SB10}</td>
	    		<td>超速档/倒挡速比</td>
	    		<td>${E3_QQC_MAIN_CW.CSD}/${E3_QQC_MAIN_CW.DD}</td>
	    	</tr>
	    	<tr>
	    		<td colspan="2">变速器型号</td>
	    		<td>${E3_QQC_MAIN_CW.BSXXH}</td>
	    		<td>变速器生产厂</td>
	    		<td>${E3_QQC_MAIN_CW.BSXSCC}</td>
	    	</tr>
	    	<tr>
	    		<td rowspan="9" width="40">发<br>动<br>机</td>
	    		<td colspan="2" width="80">发动机型号</td>
	    		<td width="280">${E3_QQC_MAIN_CW.FDJXH}</td>
	    		<td width="200">发动机制造商</td>
	    		<td width="200">${E3_QQC_MAIN_CW.FDJSCC}</td>
	    	</tr>
	    	<tr>
	    		<td colspan="2">额定功率(kw)</td>
	    		<td>${E3_QQC_MAIN_CW.EDGL}</td>
	    		<td>额定功率转速</td>
	    		<td>${E3_QQC_MAIN_CW.EDGLZS}</td>
	    	</tr>
	    	<tr>
	    		<td colspan="2">最大扭矩/转速</td>
	    		<td>${E3_QQC_MAIN_CW.ZDNJ}/${E3_QQC_MAIN_CW.ZDNJZS}</td>
	    		<td>怠速转速(r/min)</td>
	    		<td>${E3_QQC_MAIN_CW.DSZS}</td>
	    	</tr>
	    	<tr>
	    		<td colspan="2">排量(l)</td>
	    		<td>${E3_QQC_MAIN_CW.PL}</td>
	    		<td>发动机机舱隔音材料</td>
	    		<td>${E3_QQC_MAIN_CW.FDJGYCL}</td>
	    	</tr>
	    	<tr>
	    		<td colspan="2">气门布置</td>
	    		<td>${E3_QQC_MAIN_CW.QMBZ}</td>
	    		<td>燃料喷射系统型式</td>
	    		<td>${E3_QQC_MAIN_CW.RLPSXTXS}</td>
	    	</tr>
	    	<tr>
	    		<td colspan="2">排列方式</td>
	    		<td>${E3_QQC_MAIN_CW.PLFS}</td>
	    		<td>冷却方式</td>
	    		<td>${E3_QQC_MAIN_CW.LQFS}</td>
	    	</tr>
	    	<tr>
	    		<td colspan="2">进气方式</td>
	    		<td>${E3_QQC_MAIN_CW.JQFS}</td>
	    		<td>供油方式</td>
	    		<td>${E3_QQC_MAIN_CW.GYFS}</td>
	    	</tr>
	    	<tr>
	    		<td colspan="2">汽缸数</td>
	    		<td>${E3_QQC_MAIN_CW.QGS}</td>
	    		<td>气阀数</td>
	    		<td>${E3_QQC_MAIN_CW.QFS}</td>
	    	</tr>
	    	<tr>
	    		<td colspan="2">冲程数</td>
	    		<td>${E3_QQC_MAIN_CW.CCS}</td>
	    		<td>发动机编号</td>
	    		<td>${E3_QQC_MAIN_CW.FDJBH}</td>
	    	</tr>
	    </table>
	    <h3>检验报告——污染控制装置配置及检验结果</h3>
	    <p>
	   		 报告编号：${E3_REPORT.JYBGBH}<br>
	   		 检验单位名称：${E3_REPORT.JYDWMC}
	    </p>
	    <table>
	    	<tr>
	    		<td rowspan="15" width="40">污<br>染<br>控<br>制<br>装<br>置</td>
	    		<td width="200"></td>
	    		<td width="200">型号</td>
	    		<td>生产厂</td>
	    	</tr>
	    	<tr>
	    		<td>催化转化器</td>
	    		<td>${E3_QQC_CONFIG_CW.ZHQXH}</td>
	    		<td>${E3_QQC_CONFIG_CW.ZHQSCC}</td>
	    	</tr>
	    	<tr>
	    		<td>涂层生产厂</td>
	    		<td colspan="2">${E3_QQC_CONFIG_CW.TCSCC}</td>
	    	</tr>
	    	<tr>
	    		<td>载体生产厂</td>
	    		<td colspan="2">${E3_QQC_CONFIG_CW.ZTSCC}</td>
	    	</tr>
	    	<tr>
	    		<td>封装生产厂</td>
	    		<td colspan="2">${E3_QQC_CONFIG_CW.FZSCC}</td>
	    	</tr>
	    	<tr>
	    		<td>氧传感器</td>
	    		<td>${E3_QQC_CONFIG_CW.CGQXH}</td>
	    		<td>${E3_QQC_CONFIG_CW.CGQSCC}</td>
	    	</tr>
	    	<tr>
	    		<td>EGR</td>
	    		<td>${E3_QQC_CONFIG_CW.EGRXH}</td>
	    		<td>${E3_QQC_CONFIG_CW.EGRSCC}</td>
	    	</tr>
	    	<tr>
	    		<td>电控单元</td>
	    		<td>${E3_QQC_CONFIG_CW.ECUXH}</td>
	    		<td>${E3_QQC_CONFIG_CW.ECUSCC}</td>
	    	</tr>
	    	<tr>
	    		<td>增压器</td>
	    		<td>${E3_QQC_CONFIG_CW.ZYQXH}</td>
	    		<td>${E3_QQC_CONFIG_CW.ZYQSCC}</td>
	    	</tr>
	    	<tr>
	    		<td>中冷器型式</td>
	    		<td colspan="2">${E3_QQC_CONFIG_CW.ZLQXH}</td>
	    	</tr>
	    	<tr>
	    		<td>储能装置</td>
	    		<td>${E3_QQC_CONFIG_CW.CNZZXH}</td>
	    		<td>${E3_QQC_CONFIG_CW.CNZZSCC}</td>
	    	</tr>
	    	<tr>
	    		<td>电池容量</td>
	    		<td colspan="2">${E3_QQC_CONFIG_CW.DCRL}</td>
	    	</tr>
	    	<tr>
	    		<td>电机</td>
	    		<td>${E3_QQC_CONFIG_CW.DJXH}</td>
	    		<td>${E3_QQC_CONFIG_CW.DJSCC}</td>
	    	</tr>
	    	<tr>
	    		<td>电机主要用途</td>
	    		<td colspan="2">${E3_QQC_CONFIG_CW.DJZYYT}</td>
	    	</tr>
	    	<tr>
	    		<td>电机安装数量</td>
	    		<td colspan="2">${E3_QQC_CONFIG_CW.DJAZSL}</td>
	    	</tr>
	    </table>
	    <h3>检验报告-检验结果</h3>
	    <p>*注：检验结果已乘以劣化系数</p>
	    <table>
	    	<tr>
	    		<td rowspan="2">检验项目</td>
	    		<td rowspan="2">标准限值(mg/km)</td>
	    		<td colspan="3">检验结果</td>
	    		<td rowspan="2">符合性判断</td>
	    	</tr>
	    	<tr>
	    		<td>1</td>
	    		<td>2</td>
	    		<td>3</td>
	    	</tr>
	    	<tr>
	    		<td>CO</td>
	    		<td>${E3_QQC_CONFIG_CW.COXZ}</td>
	    		<td>${E3_QQC_CONFIG_CW.COJG1}</td>
	    		<td>${E3_QQC_CONFIG_CW.COJG2}</td>
	    		<td>${E3_QQC_CONFIG_CW.COJG3}</td>
	    		<td rowspan="8">${E3_QQC_CONFIG_CW.FHXPD}</td>
	    	</tr>
	    	<tr>
	    		<td>THC</td>
	    		<td>${E3_QQC_CONFIG_CW.THCXZ}</td>
	    		<td>${E3_QQC_CONFIG_CW.THCJG1}</td>
	    		<td>${E3_QQC_CONFIG_CW.THCJG2}</td>
	    		<td>${E3_QQC_CONFIG_CW.THCJG3}</td>
	    	</tr>
	    	<tr>
	    		<td>NMHC</td>
	    		<td>${E3_QQC_CONFIG_CW.NMHCXZ}</td>
	    		<td>${E3_QQC_CONFIG_CW.NMHCJG1}</td>
	    		<td>${E3_QQC_CONFIG_CW.NMHCJG2}</td>
	    		<td>${E3_QQC_CONFIG_CW.NMHCJG3}</td>
	    	</tr>
	    	<tr>
	    		<td>NOX</td>
	    		<td>${E3_QQC_CONFIG_CW.NOXXZ}</td>
	    		<td>${E3_QQC_CONFIG_CW.NOXJG1}</td>
	    		<td>${E3_QQC_CONFIG_CW.NOXJG2}</td>
	    		<td>${E3_QQC_CONFIG_CW.NOXJG3}</td>
	    	</tr>
	    	<tr>
	    		<td>PM</td>
	    		<td>${E3_QQC_CONFIG_CW.PMXZ}</td>
	    		<td>${E3_QQC_CONFIG_CW.PMJG1}</td>
	    		<td>${E3_QQC_CONFIG_CW.PMJG2}</td>
	    		<td>${E3_QQC_CONFIG_CW.PMJG3}</td>
	    	</tr>
	    	<tr>
	    		<td>CO/THC劣化系数</td>
	    		<td colspan="4">${E3_QQC_CONFIG_CW.COXS}/${E3_QQC_CONFIG_CW.THCXS}</td>
	    	</tr>
	    	<tr>
	    		<td>NMHC劣化系数</td>
	    		<td colspan="4">${E3_QQC_CONFIG_CW.NMHCXS}</td>
	    	</tr>
	    	<tr>
	    		<td>NOC/PM劣化系数</td>
	    		<td colspan="4">${E3_QQC_CONFIG_CW.NOXXS}/${E3_QQC_CONFIG_CW.PMXS}</td>
	    	</tr>
	    	<tr>
	    		<td colspan="5">试验中发动机冷却风扇的位置</td>
	    		<td>${E3_QQC_CONFIG_CW.FSWZ}</td>
	    	</tr>
	    	<tr>
	    		<td colspan="5">最低点离地高度cm</td>
	    		<td>${E3_QQC_CONFIG_CW.LDGD}</td>
	    	</tr>
	    	<tr>
	    		<td colspan="5">风扇中心线横向位置（在车辆中心线左边或右边）cm</td>
	    		<td>${E3_QQC_CONFIG_CW.HXWZ}</td>
	    	</tr>
	    </table>
	    <h3>检验报告——检验条件</h3>
	    <p>
	    	报告编号：${E3_REPORT.JYBGBH}<br>
	    	检验单位名称：${E3_REPORT.JYDWMC}
	    </p>
	    <table>
	    	<tr>
	    		<td width="240">1检测用燃料</td>
	    		<td colspan="6">${E3_QQC_TEST_CW.JYRL}</td>
	    	</tr>
	    	<tr>
	    		<td>2检测时间</td>
	    		<td colspan="6">${E3_QQC_TEST_CW.JYSJ}</td>
	    	</tr>
	    	<tr>
	    		<td>3检测人员</td>
	    		<td colspan="6">${E3_QQC_TEST_CW.JYRY}</td>
	    	</tr>
	    	<tr>
	    		<td>4检测地点</td>
	    		<td colspan="6">${E3_QQC_TEST_CW.JYDD}</td>
	    	</tr>
	    	<tr>
	    		<td>5大气压(kpa)</td>
	    		<td colspan="6">${E3_QQC_TEST_CW.DQY}</td>
	    	</tr>
	    	<tr>
	    		<td>6Ⅰ型环境温度(°C)</td>
	    		<td colspan="6">${E3_QQC_TEST_CW.HJWD}</td>
	    	</tr>
	    	<tr>
	    		<td>7 相对湿度(%)</td>
	    		<td colspan="6">${E3_QQC_TEST_CW.XDSD}</td>
	    	</tr>
	    	<tr>
	    		<td>8标准推荐阻力(表C.1系数)</td>
	    		<td width="50">A</td>
	    		<td>${E3_QQC_TEST_CW.DPCGJSDA}</td>
	    		<td width="50">B</td>
	    		<td>${E3_QQC_TEST_CW. DPCGJSDB}</td>
	    		<td width="50">C</td>
	    		<td>${E3_QQC_TEST_CW.DPCGJSDC}</td>
	    	</tr>
	    	<tr>
	    		<td>9实际道路滑行阻力（总阻力）</td>
	    		<td width="50">A</td>
	    		<td>${E3_QQC_TEST_CW.HXZLA}</td>
	    		<td width="50">B</td>
	    		<td>${E3_QQC_TEST_CW.HXZLB}</td>
	    		<td width="50">C</td>
	    		<td>${E3_QQC_TEST_CW.HXZLC}</td>
	    	</tr>
	    </table>
	    <h3>检验报告——检验用仪器设备</h3>
	    <table>
	    	<tr>
	    		<td width="240">仪器、设备名称</td>
	    		<td>型号</td>
	    		<td>生产厂</td>
	    		<td>检定有效期</td>
	    	</tr>
	    	<tr>
	    		<td>底盘测功机（Ⅰ型试验）</td>
	    		<td>${E3_QQC_TEST_CW.DPCGJXH}</td>
	    		<td>${E3_QQC_TEST_CW.DPCGJSCC}</td>
	    		<td>${E3_QQC_TEST_CW.DPCGJYXQ}</td>
	    	</tr>
	    	<tr>
	    		<td>取样系统（Ⅰ型试验）</td>
	    		<td>${E3_QQC_TEST_CW.QYXTXH}</td>
	    		<td>${E3_QQC_TEST_CW.QYXTSCC}</td>
	    		<td>${E3_QQC_TEST_CW.QYXTYXQ}</td>
	    	</tr>
	    	<tr>
	    		<td>排气分析系统（Ⅰ型试验）</td>
	    		<td>${E3_QQC_TEST_CW.FXXTXH}</td>
	    		<td>${E3_QQC_TEST_CW.FXXTSCC}</td>
	    		<td>${E3_QQC_TEST_CW.FXXTYXQ}</td>
	    	</tr>
	    	<tr>
	    		<td>天平</td>
	    		<td>${E3_QQC_TEST_CW.TPXH}</td>
	    		<td>${E3_QQC_TEST_CW.TPSCC}</td>
	    		<td>${E3_QQC_TEST_CW.TPYXQ}</td>
	    	</tr>	    	
	    </table>
    	
    </div>
	
	<div class="ht50"></div><div class="ht50"></div><div class="ht50"></div><div class="ht50"></div>
</body>
</html>