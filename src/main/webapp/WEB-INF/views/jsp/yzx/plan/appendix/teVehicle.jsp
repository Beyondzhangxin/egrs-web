<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../../../../../include/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" dir="ltr" lang="zh-CN" xml:lang="zh-CN">
<head>
    <title>视同车型</title>
    <meta content="none" name="Robots" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
     <link href="/css/detail.css" rel="stylesheet" type="text/css" /> 
    <script type="text/javascript" src="/js/detail.js"></script>
    <script type="text/javascript">
    function b() {
    	//如果耐久试验选择了是，就显示左侧的耐久试验标记；
    	$("select[name='njsource']").change(function(){
    		if($("select[name='njsource']").val() == '否'){
        		$("#li1").hide();
        	}else{
        		$("#li1").show();
        	}
    	});
    	$("select[name='njsource']").change();
    }
    </script>
</head>
<body>
	<div class="header-form"></div>
    <div class="detail-bg">
     <div class="detail">
      <div class="detail-left">
      	<div class="back-icon" onclick="goback('${param.flbh}')">扩展车辆</div>
        <ul>
          <li data-href="/ergs/yzx/plan/appendix/teAppendix/detail?n=0&flbh=${flbh }&bh=${bh }&flag=${param.flag } #detail" data-callback="b"><a href="#"><span class="icon-summary"></span>概述</a></li>
	      <li id="li1"  data-href="/ergs/yzx/plan/appendix/teAppendix/detail?n=1&flbh=${flbh }&bh=${bh } #detail" ><a href="#"><span class="icon-appendix-endurance-test-reference-vehicle" ></span>耐久性试验基准车型</a></li>
        </ul>
      </div>
      <div class="detail-right">
      </div>
      <div class="c"></div>
    </div>
  </div>
		 <script type="text/javascript">
		 $(".detail-left>ul>li:eq(0)").show();
		//提交事件
		 function sub(form,mask){
			 $.post("/ergs/yzx/plan/appendix/"+mask+"/add",$(form).serialize(),function(data){
				 $.Notify({
	     			content: "保存成功",
	     			type: 'success',
   				});
				if(mask=='teAppendix'){
					window.location.href='edit?flbh=${flbh }&bh='+data.message+'&flag=${param.flag }';
				}else{
					if($(form).data("reload")){
						$(".leftbar-on").click();
					}
				}
			 })
			 return false;
		}
		 function reloadRight(){
				$(".leftbar-on").click();
			}
		//加载页面
		function loadLink(url){
			$(".detail-right").load(url);
		}
		
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
	 	function goback(flbh){
	 		//m用户标识从动力系转过来的;
	 		window.location.href="/ergs/yzx/plan/appendix/describe?flbh="+flbh;
	 	}
	</script>
</body>
</html>
