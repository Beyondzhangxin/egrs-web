<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../../../../../include/common.jsp"%>
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
	
  	<div class="header-form"></div>
	<div class="form-div">
		<div class="list-item">
		<form id="planId" action="" method="post" >
        <div class="title">选择车辆类别</div>
        <div class="con category">
          <div class="ht30"></div>
          <div>
           类型
	            <label>
	            	<select name="manuftype" id="manuftype">
	            		<option value="1">自产整车(整车)</option>
	            		<option value="2">二类底盘(整车)改装车</option>
	            		<option value="7">三类底盘的改装车</option>
	            	</select>
	            </label>
	       
           </div>
          <div>全部创建</div>
            <div>
            <label>
             	确认附录所对应的车型类型
            </label>
          </div>
          <div class="ht30"></div>
          <div class="car-type">
          </div>
          <p><input type="button" value="下一步" onclick="next();"></p>
        </div>
        </form>
      </div>
    </div>
	<script type="text/javascript">
		function next(){
			window.location.href="/ergs/yzx/plan/appendix/add?manuftype="+$("#manuftype").val()+"&jhsbh=${plan.jhsbh }";
		}
  	</script>
</body>
</html>
