<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../../../../include/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" dir="ltr" lang="zh-CN" xml:lang="zh-CN">
<head>
    <title>创建计划书</title>
    <meta content="none" name="Robots" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
    <link href="/css/base.css" rel="stylesheet" type="text/css" />
     <link href="/css/list.css" rel="stylesheet" type="text/css" /> 
   <script type="text/javascript">
	
     $(function(){
    	 $("[name=pf]:radio").click(function(){
   			 var lbs = [];
		   	 switch ($(this).val()){
			   	  case "1":
			   	  lbs = ["电动车"];
			   	  break;
			   	  case "2":
			   	  lbs = ["三轮车和低速货车","三轮汽车和低速货车用柴油机","非道路移动机械用小型点燃式发动机","非道路移动机械"];
			   	  break;
			   	  case "3":
			   	  lbs = ["摩托车","非道路移动机械用柴油机","轻便摩托车","非道路移动机械"];
			   	  break;
			   	  case "4":
			   	  lbs = ["摩托车","轻便摩托车","重型柴油机(城市车辆用柴油发动机)","轻型柴油车","轻型两用车","重型汽油车","重型汽油机"];
			   	  break;
			   	  case "5":
			   	  lbs = ["轻型柴油车","轻型汽油车","重型柴油机(城市车辆用柴油发动机)","重型柴油机","重型LPG发动机","重型NG发动机","重型柴油车","重型LPG车","重型NG车","轻型两用燃料车"];
			   	  break;
			   	  case "6":
			   	  lbs = ["轻型汽油车"];
			   	  break;
		   	 }
		   	 $(".cllb").empty();
		   	 for(var i=0;i<lbs.length;i++){
		   	 	$(".cllb").append('<label class="input-control radio small-check"><input type="radio" value="'+lbs[i]+'" name="cllb" /><span class="check"></span><span class="caption">'+lbs[i]+'</span></label>');
		   	 }
		   	$(".cllb label:eq(0)").click();
   		  });
    	 $("[name=pf]:radio").eq(0).click();
     });
  </script>
  <style type="">
  	.cllb>.input-control.checkbox, .cllb>.input-control.radio{
  		min-width: 300px;
  	}
  	.cllb{
  		padding-left: 30px;
  	}
  	.button.success{
  	  margin-right:150px;
  	  margin-bottom: 30px;
  	}
  </style>
</head>
<body>
  	<div class="header-form"></div>
	<div class="form-div">
		<div class="list-item">
		<form action="${ContextPath }/ergs/yzx/plan/add" method="get" data-role="validator" data-hint-mode="hint" data-hint-easing="easeOutBounce" novalidate="novalidate" data-on-submit="return true">
        <div class="title">选择车辆类别</div>
        <div class="con category">
          <div class="ht30"></div>
          <div>
	         <span>内部编号</span>
	         <div class="input-control text required" style="width: 520px;" >
	         	<input type="text" name="nbbh"  placeholder="请输入内部编号，该编号由企业内部自定义，不作信息公开使用" data-validate-func="required" data-validate-hint="请输入内部编号" type="text"/>
				<span class="input-state-error mif-warning"></span>
				<span class="input-state-success mif-checkmark"></span>
			 </div>
          </div>
          <div>
            <span>排放标准</span>
           	<label class="input-control radio small-check">
			    <input type="radio" value="1" checked="checked" name="pf" />
			    <span class="check"></span>
			    <span class="caption">电动车</span>
			</label>
			<label class="input-control radio small-check">
			    <input type="radio" value="2" name="pf" />
			    <span class="check"></span>
			    <span class="caption">第二阶段</span>
			</label>
			<label class="input-control radio small-check">
			    <input type="radio" value="3" name="pf" />
			    <span class="check"></span>
			    <span class="caption">第三阶段</span>
			</label>
			<label class="input-control radio small-check">
			    <input type="radio" value="4" name="pf" />
			    <span class="check"></span>
			    <span class="caption">第四阶段</span>
			</label>
			<label class="input-control radio small-check">
			    <input type="radio" value="5" name="pf" />
			    <span class="check"></span>
			    <span class="caption">第五阶段</span>
			</label>
			<label class="input-control radio small-check">
			    <input type="radio" value="6" name="pf" />
			    <span class="check"></span>
			    <span class="caption">第六阶段</span>
			</label>
           </div>
           <div class="ht20"></div>
           <div>
            <span>车辆类别</span>
           </div>
           <div class="cllb">
          	</div>
          <div class="ht30"></div>
          </div>
          <p><input type="submit" class="button success" value="下一步" /></p>
        </div>
        </form>
      </div>
    </div>
	
</body>
</html>
