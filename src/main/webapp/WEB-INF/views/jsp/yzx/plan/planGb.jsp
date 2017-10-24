<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../../../../include/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" dir="ltr" lang="zh-CN" xml:lang="zh-CN">
<head>
    <title>计划书执行标准</title>
     <link href="/css/list.css" rel="stylesheet" type="text/css" />
     <style type="text/css">
     .list-item .con .grid .row>.cell.standards>.input-control.checkbox{
     	min-width: 230px;
     	width: auto;
     }
     .list-item .con .grid .row>.cell:first-child {
	    text-align: left;
	}
     </style> 
</head>
<body>
 	<jsp:include page="plannav.jsp" />
   <div class="form-div">
      <div class="list-item"> 
        <div class="title">填写所执行的标准</div>
        <div class="con norm">
        <form  id="formid" action="${ContextPath }/ergs/yzx/plan/planFile/add" method="get">
	        <div class="grid">
	        	<div class="row cells3">
	        		<div class="cell">内部编号：${plan.nbbh }</div>
	        		<div class="cell">排放标准：第${fn:substring(plan.jhsbh, 6, 7 )}阶段</div>
	        		<div class="cell">车辆类别：${plan.cllb }</div>
	        	</div>
	       		<div class="row cells11">
	        		<div class="cell">国家标准</div>
	        		<div class="cell colspan10 standards">
		        		<c:forEach items="${standards }" var="item">
		        			<label class="input-control checkbox small-check">
							    <input type="checkbox" value="${item }" name="gjbz" ${fn:contains(planFiles.gjbz, item)?'checked':''}/>
							    <span class="check"></span>
							    <span class="caption">${item }</span>
							</label>
						</c:forEach>
	        		</div>
	        	</div>
	        	<div class="row cells11">
	        		<div class="cell">企业标准</div>
	        		<div class="cell colspan10">
	        			<div class="input-control textarea" data-role="input" data-text-auto-resize="true" style="width: 800px;">
						    <textarea name="qybz" placeholder="填写企业内部使用的标准编号，如有多个用逗号分隔"></textarea>
						</div>
	        		</div>
	        	</div>
	        </div>
	          <input type="hidden" name="jhsbh" value="${plan.jhsbh }"></input>
	            <input type="hidden" name="fllb" value="${plan.cllb }"></input>
	            <div class="form-actions">
	            	<c:if test="${plan.status==0 }">
						<button class="button success" type="submit">提交</button>
						<button class="button info" type="reset">重置</button>
					</c:if>
					<button class="button" type="button" onclick="window.location.href='/ergs/yzx/plan/index'">返回</button>
				</div>
          <input type="hidden" id="gjbzid" value="${planFiles.gjbz }"/>
          </form >
        </div>
      </div>
    </div>
</body>
</html>
