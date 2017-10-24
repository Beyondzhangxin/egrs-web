<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../../../../include/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTDHTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" dir="ltr" lang="zh-CN" xml:lang="zh-CN">
<head>
    <title>计划书</title>
    <meta content="none" name="Robots" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
    <link href="/css/base.css" rel="stylesheet" type="text/css" />
     <link href="/css/list.css" rel="stylesheet" type="text/css" /> 
    <script type="text/javascript">
	//提交计划书
   function tj(jhsbh){
		if(null==jhsbh){
			$.Notify({
				content: "请选择要操作的计划书！",
			    type: 'alert'
			});
		}else{
		metroDialog.create({
			content: "确定要提交吗？",
			actions: [
						{
							title: "确定",
							onclick: function(el){
								$(el).data('dialog').close();
								  $.ajax({
								    	url:"/ergs/yzx/plan/refer?jhsbh="+jhsbh,
								    	type: "post",
								        success:function(msg){
								        	if(msg){
								        		$.Notify({
													content: msg.message,
												    type: 'success'
												});
								        		page();
								        	}
								        }
								    })	
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
	}
	
 
	$(function(){
		//创建计划书
		$("#cj").click(function(){
		 window.location.href = "/ergs/yzx/plan/plancj"; 
		})
	})
	//查看计划书
   function check(jhsbh){
 		if(null==jhsbh){
 			$.Notify({
 				content: "请选择要操作的计划书！",
 			    type: 'alert',
 			});
 		}else{
 		window.location.href ="/ergs/yzx/plan/checkPlan?jhsbh="+jhsbh;
 		
 		} 
 	}	
	//查看附录
	function checkAppendix(jhsbh){
		if(null==jhsbh){
			$.Notify({
				content: "请选择要操作的计划书！",
			    type: 'alert'
			});
		}else{
	    window.location.href = "/ergs/yzx/plan/checkAppendix?jhsbh="+jhsbh; 
		}
	}
	//删除计划书
	function del(jhsbh){
		metroDialog.create({
			content: "确定要删除吗？",
			actions: [
						{
							title: "确定",
							onclick: function(el){
								$(el).data('dialog').close();
								  $.post("delete",{"jhsbh":jhsbh},function(msg){
								        	if(msg){
								        		$.Notify({
													content: msg.message,
												    type: 'success'
												});
								        		page();
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
	//审核计划书
	function exam(jhsbh){
		if(null==jhsbh){
			$.Notify({
				content: "请选择要操作的计划书！",
			    type: 'alert'
			         });
		}else{
			$.ajax({
				url:"/ergs/yzx/plan/checkStatus?jhsbh="+jhsbh,
			    success:function(status){
	    	  		if(status == 3){
	    	  			metroDialog.create({
							title: "审核意见",
							content: '<div class="input-control textarea" data-role="input" data-text-auto-resize="true" data-text-max-height="200" style="width:100%;"><textarea name="shlog"></textarea></div>',
							actions: [
										{
										title: "通过",
										onclick: function(el){
													var shlog = $(el).find("[name='shlog']").val();
													$.ajax({
												    	url:"/ergs/yzx/plan/exam",
												    	data:{"jhsbh":jhsbh,"shlog":shlog,"status":'D'},
												        success:function(msg){
												        	if(msg){
												        		$.Notify({
																	content: msg.message,
																    type: 'success'
																});
												        		$(el).data('dialog').close();
												        		page();
												        	}
												        }
												    })
												}
										},
										{
										title: "打回",
										onclick: function(el){
													var shlog = $(el).find("[name='shlog']").val();
													$.ajax({
												    	url:"/ergs/yzx/plan/exam",
												    	data:{"jhsbh":jhsbh,"shlog":shlog,"status":4},
												        success:function(msg){
												        	if(msg){
												        		$.Notify({
																	content: msg.message,
																    type: 'success'
																});
												        		$(el).data('dialog').close();
												        		page();
												        	}
												        }
												    })
												}
										},
										
										{
										title: "取消",
										cls: "js-dialog-close"
										}
									],
							options: { // dialog options
								     }
							});
						
			    		}else{
			    		$.Notify({
							content: "只有提交后才能审核！",
						    type: 'alert',
								});
					    	}
					    }
					})
				}
		}
	//备案
	function record(jhsbh){
		if(null==jhsbh){
			$.Notify({
				content: "请选择要操作的计划书！",
			    type: 'alert'
			});
		}else{
			$.ajax({
				url:"/ergs/yzx/plan/checkStatus?jhsbh="+jhsbh,
			    success:function(status){
			    	
	    	  if(status == 'D'){
			metroDialog.create({
				title: "审核意见",
				content: '<div class="input-control textarea" data-role="input" data-text-auto-resize="true" data-text-max-height="200" style="width:100%;"><textarea name="balog"></textarea></div>',
				actions: [
							{
							title: "通过",
							onclick: function(el){
										var balog = $(el).find("[name='balog']").val();
										$.ajax({
									    	url:"/ergs/yzx/plan/record",
									    	data:{"jhsbh":jhsbh,"balog":balog,"status":1},
									        success:function(msg){
									        	if(msg){
									        		$.Notify({
														content: msg.message,
													    type: 'success'
													});
									        		$(el).data('dialog').close();
									        		page();
									        	}
									        }
									    })
									}
							},
							{
							title: "打回",
							onclick: function(el){
										var balog = $(el).find("[name='balog']").val();
										$.ajax({
									    	url:"/ergs/yzx/plan/record",
									    	data:{"jhsbh":jhsbh,"balog":balog,"status":4},
									        success:function(msg){
									        	if(msg){
									        		$.Notify({
														content: msg.message,
													    type: 'success'
													});
									        		$(el).data('dialog').close();
									        		page();
									        	}
									        }
									    })
									}
							},
							
							{
							title: "取消",
							cls: "js-dialog-close"
							}
						],
				options: { // dialog options
							
					}
				});
	    	  }else{
		    		$.Notify({
						content: "只有审核后才能备案！",
					    type: 'alert',
							});
				    	}
				    }
				})
		}
	}
	
  </script> 
</head>
<body>
	<div class="header-icon">
		<div class="header-row">
			<h1 class="f">计划书管理</h1>
			<hr class="f">
			<p class="f">列表里有详细的计划书内容可以参考</p>
		</div>
	</div>
	<div class="con-seacher">
		<form onsubmit="return false;" id="qry-form">
			<div class="grid">
				<div class="row cells4">
					<div class="cell">
						<div>计划书编号</div>
						<div class="input-control text">
							<input type="text" name="jhsbh"/>
						</div>
					</div>
					<div class="cell">
						<div>内部编号</div>
						<div class="input-control text">
							<input type="text" name="nbbh"/>
						</div>
					</div>
					<div class="cell">
						<div>创建人</div>
						<div class="input-control text">
							<input type="text" name="cjr"/>
						</div>
					</div>
					<div class="cell">
						<div class="input-control text">
							<input type="button" class="qry-btn bg-blue02 fg-white" value="搜 索" onclick="page()">
						</div>
					</div>
				</div>
			</div>
		</form>
	</div>  	
      <div class="table-div"></div>
		 <script type="text/javascript">
			function page(pageNum,pageSize){
				 url = "table?";
				url += $("#qry-form").serialize();
		 		$(".table-div").load(env.page_url(url,pageNum,pageSize));
		 	}
			page();
			
			 
			
		</script> 
       <div class="buttons">
       <sec:authorize access="hasRole('7')">
        <input type="button" value="创建计划书" id="cj">
       </sec:authorize>
       <%--  <input type="button" value="提交" onclick="tj()">
       	 <sec:authorize access="hasRole('13')"> 
       	 	<input type="button" value="审核" id="examid"/>
         </sec:authorize>  
       	 <sec:authorize access="hasRole('12')"> 
       	 	<input type="button" value="备案" id="recordid"/>
         </sec:authorize>  
        <input type="button" value="查看" id="checkid">
        <input type="button" value="查看附录" id="flid">
        <input type="button" value="删除" id="delid"> --%>
      </div>
     <div class="ht30"></div>
</body>
</html>
