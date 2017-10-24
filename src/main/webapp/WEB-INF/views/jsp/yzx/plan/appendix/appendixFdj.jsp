<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../../../../../include/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" dir="ltr" lang="zh-CN" xml:lang="zh-CN">
<head>
    <title>发动机</title>
    <meta content="none" name="Robots" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
     <link href="/css/detail.css" rel="stylesheet" type="text/css" /> 
    <script type="text/javascript" src="/js/detail.js"></script>
    <script type="text/javascript">
    function b() {
    }
    </script>
</head>
<body>
	<div class="header-form"></div>
        <div class="detail-bg">
    <div class="detail">
      <div class="detail-left">
      	<div class="back-icon" onclick="goback('${flbh}')">发动机</div>
        <ul>
          <li class="qqc" data-href="/ergs/yzx/plan/appendix/${lb }/fdj/detail?n=0&flbh=${flbh }&fdjbh=${fdjbh }&flag=${flag } #detail"><a href="#"><span class="icon-summary"></span>概述</a></li>
          <c:if test="${not empty fdjbh }">
	          <li class="qqc" data-href="/ergs/yzx/plan/appendix/${lb }/fdj/detail?n=1&flbh=${flbh }&fdjbh=${fdjbh }&flag=${flag } #detail" ><a href="#"><span class="icon-appendix-fuel-injection" ></span>燃料喷射</a></li>
	          <li class="qqc" data-href="/ergs/yzx/plan/appendix/${lb }/fdj/detail?n=2&flbh=${flbh }&fdjbh=${fdjbh }&flag=${flag } #detail" ><a href="#"><span class="icon-appendix-oil-pump"></span>供油泵</a></li>
	          <li class="qqc" data-redirect="/ergs/yzx/plan/appendix/${lb }/fdj/cool/index?flbh=${flbh}&lb=${lb}&fdjbh=${fdjbh}" ><a href="#"><span class="icon-appendix-cooling"></span>冷却系统</a></li>
	          <li class="qqc" data-redirect="/ergs/yzx/plan/appendix/${lb }/fdj/inlet/index?flbh=${flbh}&lb=${lb}&fdjbh=${fdjbh}" ><a href="#"><span class="icon-appendix-intake"></span>进气系统</a></li>
	          <li class="qqc" data-href="/ergs/yzx/plan/appendix/${lb }/fdj/detail?n=5&flbh=${flbh }&fdjbh=${fdjbh }&flag=${flag } #detail" ><a href="#"><span class="icon-appendix-exhaust"></span>排气系统</a></li>
	          <li class="qqc" data-href="/ergs/yzx/plan/appendix/${lb }/fdj/detail?n=6&flbh=${flbh }&fdjbh=${fdjbh }&flag=${flag } #detail" ><a href="#"><span class="icon-appendix-valve-timing" ></span>气阀正时或等效数据</a></li>
	          <li class="qqc" data-href="/ergs/yzx/plan/appendix/${lb }/fdj/detail?n=7&flbh=${flbh }&fdjbh=${fdjbh }&flag=${flag } #detail" ><a href="#"><span class="icon-appendix-catalytic-converter"></span>催化转化器、氧传感</a></li>
	          <li class="qqc" data-href="/ergs/yzx/plan/appendix/${lb }/fdj/detail?n=8&flbh=${flbh }&fdjbh=${fdjbh }&flag=${flag } #detail" ><a href="#"><span class="icon-appendix-evap"></span>蒸发排放控制系统</a></li>
	          <li class="qqc" data-href="/ergs/yzx/plan/appendix/${lb }/fdj/detail?n=9&flbh=${flbh }&fdjbh=${fdjbh }&flag=${flag } #detail" ><a href="#"><span class="icon-appendix-egr"></span>排气再循环</a></li>
	          <li class="qqc" data-href="/ergs/yzx/plan/appendix/${lb }/fdj/detail?n=10&flbh=${flbh }&fdjbh=${fdjbh }&flag=${flag } #detail" ><a href="#"><span class="icon-appendix-obd"></span>OBD</a></li>
	          <li class="qqc" data-href="/ergs/yzx/plan/appendix/${lb }/fdj/detail?n=11&flbh=${flbh }&fdjbh=${fdjbh }&flag=${flag } #detail" ><a href="#"><span class="icon-appendix-lubrication"></span>其他排放控制系统、润滑系</a></li>
	          <li class="qqc" data-href="/ergs/yzx/plan/appendix/${lb }/fdj/detail?n=12&flbh=${flbh }&fdjbh=${fdjbh }&flag=${flag } #detail" ><a href="#"><span class="icon-appendix-hybrid-engine"></span>混合动力-电机</a></li>
	          <li  id="newcdx" data-href="/ergs/yzx/plan/appendix/${lb }/fdj/detail?n=13&flbh=${flbh }&flag=${flag } #detail" style="display: none;">新增</li>
	          <li class="qqc" data-href="/ergs/yzx/plan/appendix/${lb }/fdj/detail?n=14&flbh=${flbh }&fdjbh=${fdjbh }&flag=${flag } #detail" ><a href="#"><span class="icon-appendix-ignition-device"></span>点火装置</a></li>
	          <li class="qqc" data-href="/ergs/yzx/plan/appendix/${lb }/fdj/detail?n=15&flbh=${flbh }&fdjbh=${fdjbh }&flag=${flag } #detail" ><a href="#"><span class="icon-appendix-pollution-control"></span>污染控制装置</a></li>
	          <li class="qqc" data-href="/ergs/yzx/plan/appendix/${lb }/fdj/detail?n=16&flbh=${flbh }&fdjbh=${fdjbh }&flag=${flag }&pzlb=KQPSXT #detail" ><a href="#"><span class="icon-appendix-air-injection"></span>空气喷射系统</a></li>
	          <li class="qqc" data-href="/ergs/yzx/plan/appendix/${lb }/fdj/detail?n=17&flbh=${flbh }&fdjbh=${fdjbh }&flag=${flag }&pzlb=FDJ #detail" style="display: none;"><a href="#"><span class="icon-appendix-carve-content"></span>发动打刻内容</a></li>
	          <li class="qqc" data-href="/ergs/yzx/plan/appendix/${lb }/fdj/detail?n=18&flbh=${flbh }&fdjbh=${fdjbh }&flag=${flag } #detail" ><a href="#"><span class="icon-appendix-pollution-control"></span>冷启动</a></li>
          </c:if>
        </ul>
      </div>
      <div class="detail-right">
      </div>
      <div class="c"></div>
      <input type="hidden" value="${fn:substring(plan.jhsbh, 5, 6 )}" id="cllbid"/>
    </div>
  </div>
		 <script type="text/javascript">
		 $("li.${lb }").show();
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
	 	 //跳转新建
	 	function add(fdjbh,flbh,n,device,pzlb){
	 		
	 		 $(".detail-left li[data-href]").eq(n).attr("data-href","/ergs/yzx/plan/appendix/${lb }/fdj/detail?n="+n+"&flbh="+flbh+"&fdjbh="+fdjbh+"&device="+device+"&pzlb="+pzlb+" #detail").click();
	 	}
	 	
	 	//查看
	 	function check(fdjbh,flbh,bh,n,device,pzlb){
	 		$(".detail-left li[data-href]").eq(n).attr("data-href","/ergs/yzx/plan/appendix/${lb }/fdj/detail?n="+n+"&flbh="+flbh+"&fdjbh="+fdjbh+"&bh="+bh+"&device="+device+"&pzlb="+pzlb+" #detail").click();
	 		
	 	} 
	 	//删除
	 	function del(bh,flbh,n,mark,fdjbh,pzlb){
	 		var lb = $("input[name=lb]").val();
	 		metroDialog.create({
				content: "确定要删除吗？",
				actions: [
							{
								title: "确定",
								onclick: function(el){
									$(el).data('dialog').close();
									  $.post("/ergs/yzx/plan/appendix/"+lb+"/"+mark+"/delet",{"flbh":flbh,"bh":bh,"fdjbh":fdjbh,"pzlb":pzlb},function(msg){
									        	if(msg){
									        		$.Notify({
														content: msg.message,
													    type: 'success'
													});
									        		$(".detail-left li[data-href]").eq(n).click();
									        	}
									        }
									    )	
									}
								},
							{
							title: "取消",
							cls: "js-dialog-close"
							}
						],
				options: { 
					width: '210px',
					height: '118px',
					// dialog options
					}
				});
		}
	 	//返回
	 	function back(n){
	 		$(".detail-left li[data-href]").eq(n).click();
	 	}
	 	//返回到附录详情
	 	function goback(flbh){
	 		
	 		window.location.href="/ergs/yzx/plan/appendix/describe?flbh="+flbh;
	 		
	 	}
	 	//修改把输入框显示为可编辑
	 	function update(){
	 		$("input[disabled]").removeAttr("disabled");
	 		$("select[disabled]").removeAttr("disabled");
	 		$("input[value='修改']").hide();
	 	}
	</script>
</body>
</html>
