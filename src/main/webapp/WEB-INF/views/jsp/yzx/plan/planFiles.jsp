<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../../../../include/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" dir="ltr" lang="zh-CN" xml:lang="zh-CN">
<head>
    <title>计划书车辆控制</title>
     <link href="/css/list.css" rel="stylesheet" type="text/css" /> 
</head>
<body>
      <jsp:include page="plannav.jsp" />
      <div class="form-div"> 
       <div class="list-item"> 
        <div class="title">填写质量控制文件</div>
        <div class="con quality">
            <form:form action="${contextPath }/ergs/yzx/plan/planFile/addControl" modelAttribute="planFiles" method="get" data-role="validator" data-hint-mode="hint" data-hint-easing="easeOutBounce" novalidate="novalidate" data-on-submit="return true">
            <div class="grid">
            	<div class="blue">关键部件</div>
            	<div class="row cells5">
            		<div class="cell"></div>
            		<div class="cell colspan2">相关技术文件号</div>
            		<div class="cell colspan2">图纸图号</div>
            	</div>
            	<div class="row cells5">
            		<div class="cell">发动机</div>
            		<div class="cell colspan2">
            			<div class="input-control text">
            				<form:input path="fdjwjh" placeholder="请输入发动机相关技术文件号" />
							<span class="input-state-error mif-warning"></span>
 							<span class="input-state-success mif-checkmark"></span>
						</div>
            		</div>
            		<div class="cell colspan2">
						<div class="input-control text">
            				<form:input path="fdjtzh" placeholder="请输入发动机图纸图号" />
							<span class="input-state-error mif-warning"></span>
 							<span class="input-state-success mif-checkmark"></span>
						</div>
					</div>
            	</div>
            	<div class="row cells5">
            		<div class="cell">电控单元</div>
            		<div class="cell colspan2">
            			<div class="input-control text">
            				<form:input path="ecuwjh" />
							<span class="input-state-error mif-warning"></span>
 							<span class="input-state-success mif-checkmark"></span>
						</div>
            		</div>
            		<div class="cell colspan2">
						<div class="input-control text">
            				<form:input path="ecutzh"/>
							<span class="input-state-error mif-warning"></span>
 							<span class="input-state-success mif-checkmark"></span>
						</div>
					</div>
            	</div>
            	<div class="row cells5">
            		<div class="cell">喷射器</div>
            		<div class="cell colspan2">
            			<div class="input-control text">
            				<form:input path="psqwjh" />
							<span class="input-state-error mif-warning"></span>
 							<span class="input-state-success mif-checkmark"></span>
						</div>
            		</div>
            		<div class="cell colspan2">
						<div class="input-control text">
            				<form:input path="psqtzh"/>
							<span class="input-state-error mif-warning"></span>
 							<span class="input-state-success mif-checkmark"></span>
						</div>
					</div>
            	</div>
            	<div class="row cells5">
            		<div class="cell">EECU</div>
            		<div class="cell colspan2">
            			<div class="input-control text">
            				<form:input path="eecuwjh" />
							<span class="input-state-error mif-warning"></span>
 							<span class="input-state-success mif-checkmark"></span>
						</div>
            		</div>
            		<div class="cell colspan2">
						<div class="input-control text">
            				<form:input path="eecutzh"/>
							<span class="input-state-error mif-warning"></span>
 							<span class="input-state-success mif-checkmark"></span>
						</div>
					</div>
            	</div>
            	<div class="row cells5">
            		<div class="cell">OBD</div>
            		<div class="cell colspan2">
            			<div class="input-control text">
            				<form:input path="obdwjh" />
							<span class="input-state-error mif-warning"></span>
 							<span class="input-state-success mif-checkmark"></span>
						</div>
            		</div>
            		<div class="cell colspan2">
						<div class="input-control text">
            				<form:input path="obdtzh"/>
							<span class="input-state-error mif-warning"></span>
 							<span class="input-state-success mif-checkmark"></span>
						</div>
					</div>
            	</div>
            	<div class="row cells5">
            		<div class="cell">催化转化器</div>
            		<div class="cell colspan2">
            			<div class="input-control text">
            				<form:input path="zhqwjh" />
							<span class="input-state-error mif-warning"></span>
 							<span class="input-state-success mif-checkmark"></span>
						</div>
            		</div>
            		<div class="cell colspan2">
						<div class="input-control text">
            				<form:input path="zhqtzh"/>
							<span class="input-state-error mif-warning"></span>
 							<span class="input-state-success mif-checkmark"></span>
						</div>
					</div>
            	</div>
            	<div class="row cells5">
            		<div class="cell">氧传感器</div>
            		<div class="cell colspan2">
            			<div class="input-control text">
            				<form:input path="cgqwjh" />
							<span class="input-state-error mif-warning"></span>
 							<span class="input-state-success mif-checkmark"></span>
						</div>
            		</div>
            		<div class="cell colspan2">
						<div class="input-control text">
            				<form:input path="cgqtzh"/>
							<span class="input-state-error mif-warning"></span>
 							<span class="input-state-success mif-checkmark"></span>
						</div>
					</div>
            	</div>
            	<div class="row cells5">
            		<div class="cell">碳罐</div>
            		<div class="cell colspan2">
            			<div class="input-control text">
            				<form:input path="tgwjh" />
							<span class="input-state-error mif-warning"></span>
 							<span class="input-state-success mif-checkmark"></span>
						</div>
            		</div>
            		<div class="cell colspan2">
						<div class="input-control text">
            				<form:input path="tgtzh"/>
							<span class="input-state-error mif-warning"></span>
 							<span class="input-state-success mif-checkmark"></span>
						</div>
					</div>
            	</div>
            	<div class="row cells5">
            		<div class="cell">PCV</div>
            		<div class="cell colspan2">
            			<div class="input-control text">
            				<form:input path="pcvwjh" />
							<span class="input-state-error mif-warning"></span>
 							<span class="input-state-success mif-checkmark"></span>
						</div>
            		</div>
            		<div class="cell colspan2">
						<div class="input-control text">
            				<form:input path="pcvtzh"/>
							<span class="input-state-error mif-warning"></span>
 							<span class="input-state-success mif-checkmark"></span>
						</div>
					</div>
            	</div>
            	<div class="row cells5">
            		<div class="cell">EGR</div>
            		<div class="cell colspan2">
            			<div class="input-control text">
            				<form:input path="egrwjh" />
							<span class="input-state-error mif-warning"></span>
 							<span class="input-state-success mif-checkmark"></span>
						</div>
            		</div>
            		<div class="cell colspan2">
						<div class="input-control text">
            				<form:input path="egrtzh"/>
							<span class="input-state-error mif-warning"></span>
 							<span class="input-state-success mif-checkmark"></span>
						</div>
					</div>
            	</div>
            	<div class="row cells5">
            		<div class="cell">进气消声器</div>
            		<div class="cell colspan2">
            			<div class="input-control text">
            				<form:input path="jqxsqwjh" />
							<span class="input-state-error mif-warning"></span>
 							<span class="input-state-success mif-checkmark"></span>
						</div>
            		</div>
            		<div class="cell colspan2">
						<div class="input-control text">
            				<form:input path="jqxsqtzh"/>
							<span class="input-state-error mif-warning"></span>
 							<span class="input-state-success mif-checkmark"></span>
						</div>
					</div>
            	</div>
            	<div class="row cells5">
            		<div class="cell">排气消声器</div>
            		<div class="cell colspan2">
            			<div class="input-control text">
            				<form:input path="pqxsqwjh" />
							<span class="input-state-error mif-warning"></span>
 							<span class="input-state-success mif-checkmark"></span>
						</div>
            		</div>
            		<div class="cell colspan2">
						<div class="input-control text">
            				<form:input path="pqxsqtzh"/>
							<span class="input-state-error mif-warning"></span>
 							<span class="input-state-success mif-checkmark"></span>
						</div>
					</div>
            	</div>
           	</div>
           	<hr class="blue"/>
            <div class="grid">
            	<div class="blue">外购件采购过程质量控制</div>
            	<div class="row cells5">
            		<div class="cell"></div>
            		<div class="cell colspan4">相关技术文件号</div>
            	</div>
            	<div class="row cells5">
            		<div class="cell">供应商的选择</div>
            		<div class="cell colspan4">
            			<div class="input-control text required">
            				<form:input path="gyswjh" data-validate-func="required" data-validate-hint="请输入供应商文件号"/>
							<span class="input-state-error mif-warning"></span>
 							<span class="input-state-success mif-checkmark"></span>
						</div>
            		</div>
            	</div>
            	<div class="row cells5">
            		<div class="cell">日常监督</div>
            		<div class="cell colspan4">
            			<div class="input-control text required">
            				<form:input path="rcjdwjh" data-validate-func="required" data-validate-hint="请输入日常监督文件号"/>
							<span class="input-state-error mif-warning"></span>
 							<span class="input-state-success mif-checkmark"></span>
						</div>
            		</div>
            	</div>
            	<div class="row cells5">
            		<div class="cell">采购产品的检验和验证</div>
            		<div class="cell colspan4">
            			<div class="input-control text required">
            				<form:input path="cgcpwjh" data-validate-func="required" data-validate-hint="请输入采购产品的检验和验证文件号"/>
							<span class="input-state-error mif-warning"></span>
 							<span class="input-state-success mif-checkmark"></span>
						</div>
            		</div>
            	</div>
            </div>
           	<hr class="blue"/>
           	<div class="grid">
            	<div class="blue">自制件生产过程质量控制</div>
            	<div class="row cells5">
            		<div class="cell"></div>
            		<div class="cell colspan4">相关技术文件号</div>
            	</div>
            	<div class="row cells5">
            		<div class="cell">工序要求</div>
            		<div class="cell colspan4">
            			<div class="input-control text required">
            				<form:input path="gxwjh"/>
							<span class="input-state-error mif-warning"></span>
 							<span class="input-state-success mif-checkmark"></span>
						</div>
            		</div>
            	</div>
            	<div class="row cells5">
            		<div class="cell">控制方法</div>
            		<div class="cell colspan4">
            			<div class="input-control text required">
            				<form:input path="kzffwjh"/>
							<span class="input-state-error mif-warning"></span>
 							<span class="input-state-success mif-checkmark"></span>
						</div>
            		</div>
            	</div>
            	<div class="row cells5">
            		<div class="cell">在线检验</div>
            		<div class="cell colspan4">
            			<div class="input-control text required">
            				<form:input path="zxjywjh"/>
							<span class="input-state-error mif-warning"></span>
 							<span class="input-state-success mif-checkmark"></span>
						</div>
            		</div>
            	</div>
            	<div class="row cells5">
            		<div class="cell">定期抽检频次和记录</div>
            		<div class="cell colspan4">
            			<div class="input-control text required">
            				<form:input path="dqcjpcwjh"/>
							<span class="input-state-error mif-warning"></span>
 							<span class="input-state-success mif-checkmark"></span>
						</div>
            		</div>
            	</div>
            	<div class="row cells5">
            		<div class="cell">不合格品控制</div>
            		<div class="cell colspan4">
            			<div class="input-control text required">
            				<form:input path="bhgpwjh"/>
							<span class="input-state-error mif-warning"></span>
 							<span class="input-state-success mif-checkmark"></span>
						</div>
            		</div>
            	</div>
            	<div class="row cells5">
            		<div class="cell">人员管理</div>
            		<div class="cell colspan4">
            			<div class="input-control text required">
            				<form:input path="ryglwjh"/>
							<span class="input-state-error mif-warning"></span>
 							<span class="input-state-success mif-checkmark"></span>
						</div>
            		</div>
            	</div>
            </div>
           	<hr class="blue"/>
           	<div class="grid">
            	<div class="blue">装配过程质量控制</div>
            	<div class="row cells5">
            		<div class="cell"></div>
            		<div class="cell colspan4">作业文件号</div>
            	</div>
            	<div class="row cells5">
            		<div class="cell">装配要求</div>
            		<div class="cell colspan4">
            			<div class="input-control text required">
            				<form:input path="zpyqwjh"/>
							<span class="input-state-error mif-warning"></span>
 							<span class="input-state-success mif-checkmark"></span>
						</div>
            		</div>
            	</div>
            	<div class="row cells5">
            		<div class="cell">控制方法</div>
            		<div class="cell colspan4">
            			<div class="input-control text required">
            				<form:input path="zpkzwjh"/>
							<span class="input-state-error mif-warning"></span>
 							<span class="input-state-success mif-checkmark"></span>
						</div>
            		</div>
            	</div>
            	<div class="row cells5">
            		<div class="cell">在线检验</div>
            		<div class="cell colspan4">
            			<div class="input-control text required">
            				<form:input path="zpzxjywjh"/>
							<span class="input-state-error mif-warning"></span>
 							<span class="input-state-success mif-checkmark"></span>
						</div>
            		</div>
            	</div>
            	<div class="row cells5">
            		<div class="cell">定期抽检频次和记录</div>
            		<div class="cell colspan4">
            			<div class="input-control text required">
            				<form:input path="zpdqcjpcwjh"/>
							<span class="input-state-error mif-warning"></span>
 							<span class="input-state-success mif-checkmark"></span>
						</div>
            		</div>
            	</div>
            	<div class="row cells5">
            		<div class="cell">不合格品控制</div>
            		<div class="cell colspan4">
            			<div class="input-control text required">
            				<form:input path="zpbhgpwjh"/>
							<span class="input-state-error mif-warning"></span>
 							<span class="input-state-success mif-checkmark"></span>
						</div>
            		</div>
            	</div>
            	<div class="row cells5">
            		<div class="cell">人员管理</div>
            		<div class="cell colspan4">
            			<div class="input-control text required">
            				<form:input path="zpryglwjh"/>
							<span class="input-state-error mif-warning"></span>
 							<span class="input-state-success mif-checkmark"></span>
						</div>
            		</div>
            	</div>
            </div>
           	<hr class="blue"/>
           	<div class="form-actions">
            	<c:if test="${plan.status==0 }">
					<button class="button success" type="submit">保存</button>
					<button class="button info" type="reset">重置</button>
				</c:if>
				<button class="button" type="button" onclick="JavaScript:history.go(-1);">返回</button>
			</div>
               <input type="hidden" name="jhsbh" value="${plan.jhsbh }"/>
            </form:form>
          </div>
        </div>
      </div>
   
</body>
</html>
