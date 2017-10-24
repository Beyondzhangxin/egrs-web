<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../../../../../include/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" dir="ltr" lang="zh-CN" xml:lang="zh-CN">
<head>
    <title>计划书</title>
    <meta content="none" name="Robots" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
     <link href="/css/detail.css" rel="stylesheet" type="text/css" /> 
    <script type="text/javascript" src="/js/detail.js"></script>
    <script type="text/javascript">
    	var m=${empty param.m?0:param.m};
    	function pageCallback(){
    		page();
    	}
    </script>
</head>
<body>
	<div class="header-form"></div>
    <div class="detail-bg">
    <div class="detail">
      <div class="detail-left">
      	<div class="back-icon" onclick="goback('${plan.jhsbh}')"></div>
        <ul>
          <li data-href="${lb }/main/detail?n=0&flbh=${appendix.flbh } #detail" class="qqc">
	          <a href="#"><span class="icon-summary"></span>概述</a>
          </li>
          <li data-href="${lb }/main/detail?n=1&flbh=${appendix.flbh } #detail" class="qqc"><a href="#"><span class="icon-features" ></span>总体机构特征</a></li>
          <li data-href="${lb }/main/detail?n=2&flbh=${appendix.flbh } #detail" class="qqc"><a href="#"><span class="icon-power"></span>动力系</a></li>
          <li data-href="${lb }/main/detail?n=3&flbh=${appendix.flbh } #detail" class="qqc"><a href="#"><span class="icon-train"></span>传动系</a></li>
          <li data-href="${lb }/main/detail?n=4&flbh=${appendix.flbh } #detail" class="qqc"><a href="#"><span class="icon-suspension"></span>悬挂系</a></li>
          <li data-href="${lb }/main/detail?n=5&flbh=${appendix.flbh } #detail" class="qqc"><a href="#"><span class="icon-car"></span>车体</a></li>
          <li data-href="${lb }/main/detail?n=9&flbh=${appendix.flbh } #detail" class="qqc"><a href="#"><span class="icon-car"></span>扩展车型</a></li>
          <c:if test="${appendix.manuftype == 2 }">
         	 <li  data-href="${lb }/main/detail?n=10&flbh=${appendix.flbh }&type=${appendix.fllb } #detail" data-callback="pageCallback" class="qqc"><a href="#"><span class="icon-car"></span>原型车型</a></li>
          </c:if>
        </ul>
      </div>
      <div class="detail-right">
      </div>
      <div class="c"></div>
    </div>
  </div>
  <script type="text/javascript">
		 $(".detail-left>ul>li.${lb }").show();
		//提交事件
		 function sub(form,mark){
			 $.post("/ergs/yzx/plan/appendix/${lb }/"+mark+"/add",$(form).serialize(),function(data){
				 $.Notify({
     				content: data.message,
     			    type: 'success',
    			 });
				 if($(form).data("reload")){
					 $(".leftbar-on").click();
				 }
			 });
			return false;
		}
		function reloadRight(){
			$(".leftbar-on").click();
		}
		//加载页面
		function loadLink(url){
			$(".detail-right").load("${lb }/"+url);
		}
		//删除
	 	function del(url){
	 		metroDialog.create({
				content: "确定要删除吗？",
				actions: [{
					title: "确定",
					onclick: function(el){
						$(el).data('dialog').close();
						$.post("${lb }/"+url,function(msg){
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
	 	//返回到附录列表
	 	function goback(jhsbh){
	 		window.location.href="/ergs/yzx/plan/checkAppendix?jhsbh="+jhsbh;
	 	}
	 	
	 	 function page(pageNum,pageSize){
			 url = "/ergs/yzx/plan/appendix/search?";
			url += $("#qry-form").serialize();
	 		$(".table-div").load(env.page_url(url,pageNum,pageSize));
	 	}
		 
	</script>
</body>
</html>
