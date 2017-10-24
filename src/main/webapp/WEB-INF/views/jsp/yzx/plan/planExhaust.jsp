<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../../../../include/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" dir="ltr" lang="zh-CN" xml:lang="zh-CN">
<head>
    <title>计划书</title>
    <meta content="none" name="Robots" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
     <link href="/css/list.css" rel="stylesheet" type="text/css" /> 
</head>
<body>
    <jsp:include page="plannav.jsp" />
  	
     <div class="form-div">
   
      <div class="list-item">
        <div class="title">填写整车机排放检测文件备管理文件</div>
        <div class="con quality">
         <form:form action="${contextPath }/ergs/yzx/plan/planFile/addExhaust" modelAttribute="planFiles" method="get" data-role="validator" data-hint-mode="hint" data-hint-easing="easeOutBounce" novalidate="novalidate" data-on-submit="return true">
          <div class="grid">
            <div class="blue">一致性自检规程</div>
            <div class="row cells5">
				<div class="cell"></div>
				<div class="cell colspan4">相关文件号</div>
			</div>
			<div class="row cells5">
				<div class="cell">下线检验</div>
				<div class="cell colspan4">
					<div class="input-control text required">
						<form:input path="xxjywjh" data-validate-func="required" data-validate-hint="请输入下线检验文件号" />
						<span class="input-state-error mif-warning"></span>
						<span class="input-state-success mif-checkmark"></span>
					</div>
				</div>
			</div>
			<div class="row cells5">
				<div class="cell">例行检验</div>
				<div class="cell colspan4">
					<div class="input-control text required">
						<form:input path="lxjywjh" data-validate-func="required" data-validate-hint="请输入例行检验文件号" />
						<span class="input-state-error mif-warning"></span>
						<span class="input-state-success mif-checkmark"></span>
					</div>
				</div>
			</div>
			<div class="row cells5">
				<div class="cell">定期检验</div>
				<div class="cell colspan4">
					<div class="input-control text required">
						<form:input path="dqjywjh" data-validate-func="required" data-validate-hint="请输入定期检验文件号" />
						<span class="input-state-error mif-warning"></span>
						<span class="input-state-success mif-checkmark"></span>
					</div>
				</div>
			</div>
			<div class="row cells5">
				<div class="cell">常温定期检验频次</div>
				<div class="cell colspan4">
					<div class="input-control text required">
						<form:input path="cwpc" data-validate-func="required" data-validate-hint="请输入常温定期检验频次文件号" />
						<span class="input-state-error mif-warning"></span>
						<span class="input-state-success mif-checkmark"></span>
					</div>
				</div>
			</div>
			<div class="row cells5">
				<div class="cell">曲轴箱定期检验频次</div>
				<div class="cell colspan4">
					<div class="input-control text required">
						<form:input path="qzpc" data-validate-func="required" data-validate-hint="请输入曲轴箱定期检验频次文件号" />
						<span class="input-state-error mif-warning"></span>
						<span class="input-state-success mif-checkmark"></span>
					</div>
				</div>
			</div>
			<div class="row cells5">
				<div class="cell">蒸发排放定期检验频次</div>
				<div class="cell colspan4">
					<div class="input-control text required">
						<form:input path="rypc" data-validate-func="required" data-validate-hint="请输入蒸发排放定期检验频次文件号" />
						<span class="input-state-error mif-warning"></span>
						<span class="input-state-success mif-checkmark"></span>
					</div>
				</div>
			</div>
			<div class="row cells5">
				<div class="cell">低温定期检验频次</div>
				<div class="cell colspan4">
					<div class="input-control text required">
						<form:input path="dwpc" data-validate-func="required" data-validate-hint="请输入低温定期检验频次文件号" />
						<span class="input-state-error mif-warning"></span>
						<span class="input-state-success mif-checkmark"></span>
					</div>
				</div>
			</div>
			<div class="row cells5">
				<div class="cell">加油排放定期检验频次</div>
				<div class="cell colspan4">
					<div class="input-control text required">
						<form:input path="jypfpc" data-validate-func="required" data-validate-hint="请输入加油排放定期检验频次文件号" />
						<span class="input-state-error mif-warning"></span>
						<span class="input-state-success mif-checkmark"></span>
					</div>
				</div>
			</div>
			<div class="row cells5">
				<div class="cell">OBD定期检验频次</div>
				<div class="cell colspan4">
					<div class="input-control text required">
						<form:input path="obdpc" data-validate-func="required" data-validate-hint="请输入OBD定期检验频次文件号" />
						<span class="input-state-error mif-warning"></span>
						<span class="input-state-success mif-checkmark"></span>
					</div>
				</div>
			</div>
			<div class="row cells5">
				<div class="cell">车内空气质量定期检验频次</div>
				<div class="cell colspan4">
					<div class="input-control text required">
						<form:input path="kqzlpc" data-validate-func="required" data-validate-hint="请输入车内空气质量定期检验频次文件号" />
						<span class="input-state-error mif-warning"></span>
						<span class="input-state-success mif-checkmark"></span>
					</div>
				</div>
			</div>
			<div class="row cells5">
				<div class="cell">噪声定期检验频次</div>
				<div class="cell colspan4">
					<div class="input-control text required">
						<form:input path="zspc" data-validate-func="required" data-validate-hint="请输入噪声定期检验频次文件号" />
						<span class="input-state-error mif-warning"></span>
						<span class="input-state-success mif-checkmark"></span>
					</div>
				</div>
			</div>
          </div>
          <div class="form-actions">
            	<c:if test="${plan.status==0 }">
					<button class="button success" type="submit">保存</button>
					<button class="button info" type="reset">重置</button>
				</c:if>
				<button class="button" type="button" onclick="JavaScript:history.go(-1);">返回</button>
			</div>
          <input type="hidden" name="jhsbh" value="${planFiles.jhsbh }"/>
          </form:form>
        </div>
      </div>
   
  </div>
</body>
</html>
