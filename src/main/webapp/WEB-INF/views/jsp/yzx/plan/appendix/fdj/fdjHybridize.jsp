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
    }
    </script>
</head>
<body>
	<div class="header-form"></div>
	<!-- <div class="plan-nav">  -->
        <div id="detail">
        <div class="detail-bg">
    <div class="detail">
      <div class="detail-left f">
        <ul>
          <li>混合动力系统</li>
          <li><img src="/images/back.png" height="22" width="13" onclick="goback('${flbh}','${fdjbh }')"/></li>  
          <li id="li1" data-href="/ergs/yzx/plan/appendix/${lb }/fdj/hybridize/detail?n=0&flbh=${flbh }&fdjbh=${fdjbh } #detail"  ><!-- data-callback="b" --><a href="#"><span class="icon-appendix-electric-machinery"></span>电机</a></li>
	          <li  data-href="/ergs/yzx/plan/appendix/${lb }/fdj/hybridize/detail?n=1&flbh=${flbh }&fdjbh=${fdjbh }&pzlb=DJ #detail" style="display: none;"><a href="#"><span class="icon-appendix-carve-content" ></span>电机打刻内容</a></li>
	          <li  data-href="/ergs/yzx/plan/appendix/${lb }/fdj/hybridize/detail?n=2&flbh=${flbh }&fdjbh=${fdjbh } #detail" ><a href="#"><span class="icon-appendix-energy-storage-device" ></span>储能装置</a></li>
	          <li  data-href="/ergs/yzx/plan/appendix/${lb }/fdj/hybridize/detail?n=3&flbh=${flbh }&fdjbh=${fdjbh }&pzlb=CNZZ #detail" style="display: none;"><a href="#"><span class="icon-appendix-carve-content" ></span>储能装置打刻内容</a></li>
	          <li  data-href="/ergs/yzx/plan/appendix/${lb }/fdj/hybridize/detail?n=4&flbh=${flbh }&fdjbh=${fdjbh } #detail" ><a href="#"><span class="icon-appendix-DC-converter" ></span>DC/DC转化器</a></li>
	          <li  data-href="/ergs/yzx/plan/appendix/${lb }/fdj/hybridize/detail?n=5&flbh=${flbh }&fdjbh=${fdjbh }&pzlb=HCU #detail" ><a href="#"><span class="icon-appendix-power-control" ></span>动力控制型号</a></li>
	          <li  data-href="/ergs/yzx/plan/appendix/${lb }/fdj/hybridize/detail?n=6&flbh=${flbh }&fdjbh=${fdjbh }&pzlb=HCU #detail" style="display: none;"><a href="#"><span class="icon-appendix-carve-content" ></span>动力控制打刻内容</a></li>
	          <li  data-href="/ergs/yzx/plan/appendix/${lb }/fdj/hybridize/detail?n=7&flbh=${flbh }&fdjbh=${fdjbh }&pzlb=DJKZQ #detail" ><a href="#"><span class="icon-appendix-motor-control" ></span>电机控制型号</a></li>
	          <li  data-href="/ergs/yzx/plan/appendix/${lb }/fdj/hybridize/detail?n=8&flbh=${flbh }&fdjbh=${fdjbh }&pzlb=DJKZQ #detail" style="display: none;"><a href="#"><span class="icon-appendix-carve-content" ></span>电机控制打刻内容</a></li>
	          <li  data-href="/ergs/yzx/plan/appendix/${lb }/fdj/hybridize/detail?n=9&flbh=${flbh }&fdjbh=${fdjbh }&pzlb=GYKT #detail" ><a href="#"><span class="icon-appendix-air-conditioner" ></span>高压空调</a></li>
	          <li  data-href="/ergs/yzx/plan/appendix/${lb }/fdj/hybridize/detail?n=10&flbh=${flbh }&fdjbh=${fdjbh }&pzlb=DZZKB #detail" ><a href="#"><span class="icon-appendix-electronic-vacuum-pump" ></span>电子真空泵</a></li>
	          <li  data-href="/ergs/yzx/plan/appendix/${lb }/fdj/hybridize/detail?n=11&flbh=${flbh }&fdjbh=${fdjbh }&pzlb=DZZLZXZZ #detail" ><a href="#"><span class="icon-appendix-electronic-power-steering-device" ></span>电子助力转向装置</a></li>
	          <li  data-href="/ergs/yzx/plan/appendix/${lb }/fdj/hybridize/detail?n=12&flbh=${flbh }&fdjbh=${fdjbh }&pzlb=HSXT #detail" ><a href="#"><span class="icon-appendix-special-recovery-system" ></span>专用制动能量回收系统</a></li>
	          <li  data-href="/ergs/yzx/plan/appendix/${lb }/fdj/hybridize/detail?n=13&flbh=${flbh }&fdjbh=${fdjbh }&pzlb=NYGLXT #detail" ><a href="#"><span class="icon--appendix-energy-management-system" ></span>车载能源管理系统</a></li>
	          <li  id="newcdx" data-href="/ergs/yzx/plan/appendix/${lb }/fdj/hybridize/detail?n=100&flbh=${flbh }&fdjbh=${fdjbh } #detail" style="display: none;">新增</li>
        </ul>
        <input name="lb" value="${lb }" type="hidden"/>
      </div>
      <div class="detail-right r">
      </div>
      <div class="c"></div>
      <div class="c"></div>
      <input type="hidden" value="${fn:substring(plan.jhsbh, 5, 6 )}" id="cllbid"/>
    </div>
  </div>
  </div>
  <!-- </div> -->
		 <script type="text/javascript">
		//提交事件
		 function sub(mark,n){
					 var lb = $("input[name=lb]").val();
					 if(mark == 'elecMotor' || mark == 'storePower' || mark == 'config'){
						 $.post("/ergs/yzx/plan/appendix/"+lb+"/fdj/"+mark+"/add",$(".formid").serialize(),function(data){
							 if(data){
								 $.Notify({
			    	     				content: data.message,
			    	     			    type: 'success',
			    	     				});
								 $(".detail-left li[data-href]").eq(n).click();
							 }
						 }) 
					 }else{
						 
						 $.post("/ergs/yzx/plan/appendix/"+lb+"/fdj/"+mark+"/add",$("#formid").serialize(),function(data){
							 if(data){
								 $.Notify({
			    	     				content: data.message,
			    	     			    type: 'success',
			    	     				});
								 $(".detail-left li[data-href]").eq(n).click();
							 }
						 })
					 }
					
		}
		
	 	 //跳转新建
	 	function add(fdjbh,flbh,n,device,pzlb){
	 		
	 		 $(".detail-left li[data-href]").eq(14).attr("data-href","/ergs/yzx/plan/appendix/${lb }/fdj/hybridize/detail?n="+n+"&flbh="+flbh+"&fdjbh="+fdjbh+"&device="+device+"&pzlb="+pzlb+" #detail").click();
	 	}
	 	
	 	//查看
	 	function check(fdjbh,flbh,bh,n,device,pzlb){
	 		$(".detail-left li[data-href]").eq(14).attr("data-href","/ergs/yzx/plan/appendix/${lb }/fdj/hybridize/detail?n="+n+"&flbh="+flbh+"&fdjbh="+fdjbh+"&bh="+bh+"&device="+device+"&pzlb="+pzlb+" #detail").click();
	 		
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
									        		if(n == '-2' && pzlb == 'DJ'){
									        			$(".detail-left li[data-href]").eq(1).click();
									        		}if(n == '-2' &&pzlb == 'CNZZ'){
									        			$(".detail-left li[data-href]").eq(3).click();
									        		}if(n == '-2' &&pzlb == 'HCU'){
									        			$(".detail-left li[data-href]").eq(6).click();
									        		}if(n == '-2' &&pzlb == 'DJKZQ'){
									        			$(".detail-left li[data-href]").eq(8).click();
									        		}if(n != '-2'){
									        			$(".detail-left li[data-href]").eq(n).click();
									        		}
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
	 	function goback(flbh,fdjbh){
	 		//m用户标识从动力系转过来的;
	 		window.location.href="/ergs/yzx/plan/appendix/qqc/fdj/edit?flbh="+flbh+"&fdjbh="+fdjbh+"&m=14&lb=qqc";
	 		
	 	}
	 	//修改把输入框显示为可编辑
	 	function update(){
	 		$("input[disabled='disabled']").removeAttr("disabled");
	 		$("select[disabled='disabled']").removeAttr("disabled");
	 		$("input[value='修改']").hide();
	 	}
	</script>
</body>
</html>
