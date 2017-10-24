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
          <li>排气系统</li>
          <li><img src="/images/back.png" height="22" width="13" onclick="goback('${flbh}','${fdjbh }')"/></li>  
          <li id="li1" data-href="/ergs/yzx/plan/appendix/${lb }/fdj/outlet/detail?n=0&flbh=${flbh }&fdjbh=${fdjbh } #detail" data-callback="b" >
	          <a href="#"><span class="icon-appendix-exhaust"></span>排气装置</a>
          </li>
	          <li id="li2" data-href="/ergs/yzx/plan/appendix/${lb }/fdj/outlet/detail?n=1&flbh=${flbh }&fdjbh=${fdjbh }&pzlb=PQXSQ #detail" ><a href="#"><span class="icon-appendix-ignition-co-il"></span>增压器打刻内容和图片</a></li> 
	          <li  data-href="/ergs/yzx/plan/appendix/${lb }/fdj/outlet/detail?n=100&flbh=${flbh }&fdjbh=${fdjbh } #detail" style="display: none;">新增</li>
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
		 function sub(mark){
					 var lb = $("input[name=lb]").val();
					 $.post("/ergs/yzx/plan/appendix/"+lb+"/fdj/"+mark+"/add",$("#formid").serialize(),function(data){
						 $.Notify({
	    	     				content: data.message,
	    	     			    type: 'success',
	    	     				});
						 //$("input[value='保存']").hide();
					 })
					
			/* 校验
						$.Notify({
							content: "请将必填项填写完整！",
		 			    	type: 'alert'
					})
				} */
		}
		
	 	 //跳转新建
	 	function add(fdjbh,flbh,n,device,pzlb){
	 		
	 		 $(".detail-left li[data-href]").eq(2).attr("data-href","/ergs/yzx/plan/appendix/${lb }/fdj/outlet/detail?n="+n+"&flbh="+flbh+"&fdjbh="+fdjbh+"&device="+device+"&pzlb="+pzlb+" #detail").click();
	 	}
	 	
	 	//查看
	 	function check(fdjbh,flbh,bh,n,device,pzlb){
	 		$(".detail-left li[data-href]").eq(2).attr("data-href","/ergs/yzx/plan/appendix/${lb }/fdj/outlet/detail?n="+n+"&flbh="+flbh+"&fdjbh="+fdjbh+"&bh="+bh+"&device="+device+"&pzlb="+pzlb+" #detail").click();
	 		
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
