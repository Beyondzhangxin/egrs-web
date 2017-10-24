<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../../../../include/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTDHTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type"content="text/html; charset=UTF-8">
<title>修改密码</title>
<link href="${contextPath }/css/password.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div class="shadow">
  	 	<div class="password-bg">
	    </div>
    </div>
	<div class="password">
		<div class="title">修改密码</div>
		<form action="changePassword" method="post" onsubmit="return check();">
			<input type="password" placeholder="原密码" name="oldPwd"/>
			<div class="error">
				<span></span>
			</div>
			<input type="password" placeholder="新密码" name="newPwd"/>
			<div class="error">
				<span></span>
			</div>
			<input type="password" placeholder="确认密码" id="confirm"/>
			<div class="error">
				<span></span>
			</div>
			<input type="submit" value="提交" />
		</form>
	</div>
	<script type="text/javascript">
		$("input[name='oldPwd']").blur(function(){
			if($(this).val()==""){
				$(this).next(".error").children("span").html("原密码不能为空");
			}else{
				$(this).next(".error").children("span").empty();
			}
		});
		$("input[name='newPwd']").blur(function(){
			if($(this).val()==""){
				$(this).next(".error").children("span").html("新密码不能为空");
			}else{
				$(this).next(".error").children("span").empty();
			}
		});
		$("#confirm").blur(function(){
			if($(this).val()!=$("input[name='newPwd']").val()){
				$(this).next(".error").children("span").html("新密码输入不一致");
			}else{
				$(this).next(".error").children("span").empty();
			}
		});
		function check(){
			$("input[type='password']").blur();
			if($("input[name='oldPwd']").val()!=""&&$("input[name='newPwd']").val()!=""&&$("input[name='newPwd']").val()==$("#confirm").val()){
				$.post($("form").attr("action"),{"oldPwd":$("input[name='oldPwd']").val(),"newPwd":$("input[name='newPwd']").val()},function(data){
					if(data.flag){
						$.Notify({
							caption: '修改密码',
							content: data.message,
						    type: 'success'
						});
					}
					$("input[type='password']").val("");
				});
			}
			return false;
		}
	</script>
</body>
</html>