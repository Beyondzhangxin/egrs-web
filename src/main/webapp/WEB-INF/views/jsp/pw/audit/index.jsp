<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../../../../include/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTDHTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type"content="text/html; charset=UTF-8">
<title>用户审核</title>
</head>
<body>
	<div class="header-icon">
	      <h1>注册用户审核</h1>
	      <hr>
	      <p>注册用户信息要经过审核才能确认是否通过</p>
	</div>
	<div class="con-seacher">
		<form onsubmit="return false;" id="qry-form">
			<div class="grid">
				<div class="row cells4">
					<div class="cell">
						<div>注册时间</div>
						<div class="input-control text" data-role="datepicker" data-locale=zhCN>
							<input type="text" readonly="readonly" name="registTime"/>
							<button class="button"><span class="mif-calendar"></span></button>
						</div>
					</div>
					<div class="cell">
						<div>开户企业</div>
						<div class="input-control text">
							<input type="text" name="companyName"/>
						</div>
					</div>
					<div class="cell">
						<div>统一社会信用代码</div>
						<div class="input-control text" >
							<input type="text" name="creditCode"/>
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
	   <script type="text/javascript">
		   function page(pageNum,pageSize){
			    url = "table?";
				url += $("#qry-form").serialize();
		 		$(".table-div").load(env.page_url(url,pageNum,pageSize));
		 	}
			page();
			function audit(id){
				metroDialog.create({
				    title: "审核意见",
				    content: '<div class="input-control textarea" data-role="input" data-text-auto-resize="true" data-text-max-height="200" style="width:100%;"><textarea name="view"></textarea></div>',
				    actions: [
				    	{
				            title: "通过",
				            cls: "success",
				            onclick: function(el){
				            	$.post("auditSucess",{registerId:id,view:$(el).find("[name='view']").val()},function(data){
									if(data.flag){
										$.Notify({
											content: data.message,
										    type: 'success'
										});
										$(el).data('dialog').close();
										page();
									}
								});
				            }
				        },
				        {
				            title: "不通过",
				            cls: "danger",
				            onclick: function(el){
				            	$.post("auditFail",{registerId:id,view:$(el).find("[name='view']").val()},function(data){
									if(data.flag){
										$.Notify({
											content: data.message,
										    type: 'success'
										});
										$(el).data('dialog').close();
										page();
									}
								});
				            }
				        },
				        {
				            title: "取消",
				            cls: "js-dialog-close"
				        }
				    ],
				    options: { // dialog options
				    	width: '400'
				    }
				});
			}
		</script>
</body>
</html>