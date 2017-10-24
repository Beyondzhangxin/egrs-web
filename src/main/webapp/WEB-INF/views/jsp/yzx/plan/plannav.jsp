<%@ page language="java" contentType="text/html;charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../../../../include/common.jsp"%>
<div class="header-form"></div>
<div class="plan-navbg">
<div class="plan-nav">
	<ul>
		<li><a
			href="${context }/ergs/yzx/plan/planFile/checkGB?jhsbh=${plan.jhsbh }"><img
				src="/images/pic01.png"><br />执行标准</a>
			<div class="fill"></div></li>
		<li id="p-nav-on"><a
			href="/ergs/yzx/plan/checkAppendix?jhsbh=${plan.jhsbh }"><img
				src="/images/pic02.png"><br>车型描述</a></li>
		<li><a
			href="/ergs/yzx/plan/planFile/control?jhsbh=${plan.jhsbh }"><img
				src="/images/pic03.png"><br>车辆控制</a> <c:if
				test="${planFiles.gyswjh !=null && planFiles.rcjdwjh !=null&&planFiles.cgcpwjh !=null}">
				<div class="fill">
				</div>
			</c:if></li>
		<li><a href="/ergs/yzx/plan/planFile/device?jhsbh=${plan.jhsbh }"><img
				src="/images/pic04.png"><br>检测设备</a> <c:if
				test="${planFiles.sbtzwjh !=null && planFiles.sbglzdwjh !=null}">
				<div class="fill">
				</div>
			</c:if></li>
		<li><a
			href="/ergs/yzx/plan/planFile/exhaust?jhsbh=${plan.jhsbh }"><img
				src="/images/pic05.png"><br>整车排放</a> <c:if
				test="${planFiles.xxjywjh !=null && planFiles.lxjywjh !=null&& planFiles.dqjywjh !=null
	        				&& planFiles.cwpc !=null&& planFiles.qzpc !=null&& planFiles.rypc !=null
	        				&& planFiles.dwpc !=null&& planFiles.jypfpc !=null&& planFiles.obdpc !=null
	        				&& planFiles.kqzlpc !=null&& planFiles.zspc !=null}">
				<div class="fill">
				</div>
			</c:if></li>
		<li><a
			href="/ergs/yzx/plan/planFile/correct?jhsbh=${plan.jhsbh }"><img
				src="/images/pic06.png"><br>纠正措施</a> <c:if
				test="${planFiles.jzcswjh !=null }">
				<div class="fill">
				</div>
			</c:if></li>
	</ul>
	<div class="c"></div>
	</div>
</div>
