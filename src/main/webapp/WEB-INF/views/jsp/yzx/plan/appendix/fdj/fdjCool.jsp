<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../../../../../../include/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" dir="ltr" lang="zh-CN" xml:lang="zh-CN">
<head>
    <meta content="none" name="Robots" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
     <link href="/css/detail.css" rel="stylesheet" type="text/css" /> 
    <script type="text/javascript" src="/js/detail.js"></script>
    <script type="text/javascript">
    var m=${empty param.m?0:param.m};
    function b() {
    	$("select[name='lqxt']").change(function(){
    		//选择风冷就显示风冷
    		if($(this).val()=="风冷"){
        		$("#li3").hide();
        		$("#li2").show();
        	}else{
        		$("#li2").hide();
        		$("#li3").show();	
    		}
    	});
    	$("select[name='lqxt']").change();
    }
    </script>
</head>
<body>
	<div class="header-form"></div>
        <div class="detail-bg">
        <div id="detail">
    <div class="detail">
      <div class="detail-left">
    	<div class="back-icon" onclick="goback('${flbh}','${fdjbh }')">冷却系统</div>
        <ul>
          <li data-href="/ergs/yzx/plan/appendix/${lb }/fdj/cool/detail?n=0&flbh=${flbh }&fdjbh=${fdjbh } #detail" class="qqc" data-callback="b" >
	          <a href="#"><span class="icon-appendix-cooling"></span>冷却装置</a>
          </li>
          <li id="li2" data-href="/ergs/yzx/plan/appendix/${lb }/fdj/cool/detail?n=1&flbh=${flbh }&fdjbh=${fdjbh } #detail" class="qqc" ><a href="#"><span class="icon-appendix-air-cool" ></span>风冷</a></li>
          <li id="li3" data-href="/ergs/yzx/plan/appendix/${lb }/fdj/cool/detail?n=2&flbh=${flbh }&fdjbh=${fdjbh } #detail" class="qqc" ><a href="#"><span class="icon-appendix-liquid-cool"></span>液冷</a></li>
        </ul>
      </div>
      <div class="detail-right">
      </div>
      <div class="c"></div>
      <input type="hidden" value="${fn:substring(plan.jhsbh, 5, 6 )}" id="cllbid"/>
    </div>
  </div>
  </div>
		 <script type="text/javascript">
		 $("li.${lb}").show();
		 function sub(form,mark){
			 $.post("/ergs/yzx/plan/appendix/${lb }/fdj/"+mark+"/add",$(form).serialize(),function(data){
				 $.Notify({
     				content: data.message,
     			    type: 'success',
    			 });
				 if(mark == 'main'){
					 window.location.href="/ergs/yzx/plan/appendix/describe?m=2&flbh=${flbh }";
				 }else{
					 if($(form).data("reload")){
						 $(".leftbar-on").click();
					 }
				 }
			 });
			return false;
		}
		function reloadRight(){
			$(".leftbar-on").click();
		}
		//加载页面
		function loadLink(url){
			$(".detail-right").load(url);
		} 
		//删除
	 	function delLink(url){
	 		metroDialog.create({
				content: "确定要删除吗？",
				actions: [{
					title: "确定",
					onclick: function(el){
						$(el).data('dialog').close();
						$.post(url,function(msg){
				        	if(msg){
				        		$.Notify({
									content: msg.message,
								    type: 'success'
								});
				        		$(".leftbar-on").click();
				        	}
				        });
					}	
				},{
					title: "取消",
					cls: "js-dialog-close"
				}
			],
			options: { 
				width: '210px',
				height: '118px',
				}
			});
		}
	 	//返回
	 	function back(n){
	 		$(".detail-left li[data-href]").eq(n).click();
	 	}
	 	//返回到附录详情
	 	function goback(flbh,fdjbh){
	 		window.location.href="/ergs/yzx/plan/appendix/qqc/fdj/edit?flbh="+flbh+"&fdjbh="+fdjbh+"&m=14&lb=qqc";
	 	}
	</script>
</body>
</html>
