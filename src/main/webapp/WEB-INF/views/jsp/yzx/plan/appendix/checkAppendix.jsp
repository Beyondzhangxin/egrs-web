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
   <script type="text/javascript">
 //提交附录
   function tj(flbh){
		if(null==flbh){
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
								    	url:"/ergs/yzx/plan/appendix/refer?flbh="+flbh,
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
	
 //删除附录
	function del(flbh){
		metroDialog.create({
			content: "确定要删除吗？",
			actions: [
						{
							title: "确定",
							onclick: function(el){
								$(el).data('dialog').close();
								  $.post("/ergs/yzx/plan/appendix/deleteAppendix",{"flbh":flbh},function(msg){
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
	//新增附录
	$(function(){
		$("#cj").click(function(){
			window.location.href="/ergs/yzx/plan/appendix/index?jhsbh=${jhsbh}";
		})
	})
	//审核
	function exam(flbh){
		if(null==flbh){
			$.Notify({
				content: "请选择要操作的计划书！",
			    type: 'alert'
			         });
		}else{
			$.ajax({
				url:"/ergs/yzx/plan/appendix/checkStatus?flbh="+flbh,
			    success:function(status){
	    	  		if(status == 3||status == 4){
	    	  			metroDialog.create({
							title: "审核意见",
							content: '<div class="input-control textarea" data-role="input" data-text-auto-resize="true" data-text-max-height="200" style="width:100%;"><textarea name="shlog"></textarea></div>',
							actions: [
										{
										title: "通过",
										onclick: function(el){
													var shlog = $(el).find("[name='shlog']").val();
													$.ajax({
												    	url:"/ergs/yzx/plan/appendix/exam",
												    	data:{"flbh":flbh,"shlog":shlog,"status":'D'},
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
												    	url:"/ergs/yzx/plan/appendix/exam",
												    	data:{"flbh":flbh,"shlog":shlog,"status":4},
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
	function record(flbh){
		if(null==flbh){
			$.Notify({
				content: "请选择要操作的计划书！",
			    type: 'alert'
			});
		}else{
			$.ajax({
				url:"/ergs/yzx/plan/appendix/checkStatus?flbh="+flbh,
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
									    	url:"/ergs/yzx/plan/appendix/record",
									    	data:{"flbh":flbh,"balog":balog,"status":1},
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
									    	url:"/ergs/yzx/plan/appendix/record",
									    	data:{"flbh":flbh,"balog":balog,"status":4},
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
	function control(){
		$.post("/ergs/yzx/plan/planFile/control");
	}
	//查看车辆信息
	function check(flbh){
		window.location.href="/ergs/yzx/plan/appendix/describe?flbh="+flbh;
	}
  </script>
</head>
<body>
	<div class="header-icon">
	      <h1>${plan.jhsbh }附录</h1>
	      <hr>
	      <p>提供${plan.cllb }，编号为${plan.jhsbh }的计划书附录查询服务</p>
	</div>
	<div class="con-seacher">
		<form onsubmit="return false;" id="qry-form">
			<div class="grid">
				<div class="row cells4">
					<div class="cell">
						<div>附录编号</div>
						<div class="input-control text">
							<input name="flbh" />
						</div>
					</div>
					<div class="cell">
						<div>内部编号</div>
						<div class="input-control text" >
							<input name="nbbh" />
						</div>
					</div>
					<div class="cell">
						<div>审核状态</div>
						<div class="input-control select" >
							<select name="status">
								<c:forEach items="${statuses }" var="item">
									<option value="${item.value }" label="${item.lable }">${item.lable }</option>
								</c:forEach>
							</select>
						</div>
					</div>
					<div class="cell">
						<div class="input-control text">
							<input type="button" class="qry-btn bg-blue02 fg-white" value="搜 索"  onclick="page(0)">
						</div>
					</div>
				</div>
			</div>
		</form>
	</div>
      <div class="table-div"></div>
      <div class="controlid"></div>
		 <script type="text/javascript">
			function page(pageNum,pageSize){
				url = "${contextPath }/ergs/yzx/plan/appendix/table?jhsbh=${jhsbh}&";
				url += $("#qry-form").serialize();
		 		$(".table-div").load(env.page_url(url,pageNum,pageSize));
		 	}
			page();
			//加载控制文件
			function control(){
				$(".table-div").hide();
				$(".buttons").hide();
				$.post("/ergs/yzx/plan/planFile/find?jhsbh=${jhsbh}");
				$(".controlid").load("/ergs/yzx/plan/planFile/control .form-div");
			}
			//提交控制文件
			function sub(){
        		var gyswjh = $("input[name='gyswjh']").val();
           		var rcjdwjh = $("input[name='rcjdwjh']").val();
           		var cgcpwjh = $("input[name='cgcpwjh']").val();
        		if("" != gyswjh&&"" !=rcjdwjh&&"" !=cgcpwjh){
        			//ajax提交表单；
        			$.post("/ergs/yzx/plan/planFile/addControl",{"planFilesOld":$("#formid").serialize(),"jhsbh":'${plan.jhsbh}'},function(data){
        				//成功后提醒
        				$.Notify({
    	     				content: data.message,
    	     			    type: 'success',
    	     				});
        				//追加一个对勾标识保存过；
        			$("#controlid").append("<div class='fill' ></div>");
        			})
        		}else {
        			//提示必填项要填写！
        			$.Notify({
	     				content: "请填写【日常监督文件号】和【供应商文件号】和【采购产品的检验和验证文件号】",
	     			    type: 'alert'
	     				});
        		}
        	}
        	
        	
        	$(function(){
		    	$("input[name='gyswjh']").blur(function(){
		    		if($(this).val()==""){
		    			$.Notify({
		     				content: "请填写供应商文件号！",
		     			    type: 'alert'
		     				});
		    		}
		    	})
		    	$("input[name='rcjdwjh']").blur(function(){
		    		if($(this).val()==""){
		    			$.Notify({
		     				content: "请填写日常监督文件号！",
		     			    type: 'alert'
		     				});
		    		}
		    	})
		    	$("input[name='cgcpwjh']").blur(function(){
		    		if($(this).val()==""){
		    			$.Notify({
		     				content: "请填写采购产品的检验和验证文件号！",
		     			    type: 'alert'
		     				});
		    		}
		    	})
		    })
		</script> 
	       <div class="buttons">
		       <sec:authorize access="hasRole('6')">
		        <input type="button" value="创建附录" id="cj"/>
		       </sec:authorize>
		       <input type="button" value="返回计划书" id="back" onclick="window.location.href='/ergs/yzx/plan/planFile/checkGB?jhsbh=${param.jhsbh}'"/> 
	       </div>
	       	<div class="ht30"></div>
</body>
</html>
