<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../../../../include/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" dir="ltr" lang="zh-CN" xml:lang="zh-CN">
<head>
    <title>计划书</title>
    <meta content="none" name="Robots" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
    <link href="/css/base.css" rel="stylesheet" type="text/css" />
     <link href="/css/list.css" rel="stylesheet" type="text/css" /> 
</head>
<body>
     <jsp:include page="plannav.jsp" />
     <div class="form-div">
      <div class="list-item">
        <div class="title">填写纠正措施文件</div>
        <div class="con quality">
          <form action="${contextPath }/ergs/yzx/plan/planFile/addCorrect" method="get" 
            	data-role="validator" data-hint-mode="hint" data-hint-easing="easeOutBounce" novalidate="novalidate" data-on-submit="return true">
          <div class="grid">
            <div class="blue">纠正措施</div>
            <div class="row cells5">
           		<div class="cell"></div>
           		<div class="cell colspan4">相关文件号</div>
           	</div>
           	<div class="row cells5">
				<div class="cell">措施</div>
				<div class="cell colspan4">
					<div class="input-control text required">
						<input type="text" name="jzcswjh" value="${planFiles.jzcswjh}"  data-validate-func="required" data-validate-hint="请输入纠正措施文件号"/>
						<span class="input-state-error mif-warning"></span>
						<span class="input-state-success mif-checkmark"></span>
					</div>
				</div>
			</div>
			<div class="row cells5">
        		<div class="cell">附加说明</div>
        		<div class="cell colspan4lk,">
        			<div class="input-control textarea" data-role="input" data-text-auto-resize="true" style="width: 670px;">
					    <textarea name="memo" placeholder="填写本计划的附加说明" >${plan.memo}</textarea>
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
              <input type="hidden" name="jhsbh" value="${plan.jhsbh }"/>
          </form>
        </div>
      </div>
   
  </div>
</body>
</html>
