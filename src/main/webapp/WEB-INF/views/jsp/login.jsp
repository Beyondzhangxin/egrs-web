<%@ page language="java" contentType="text/html;charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../../include/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" dir="ltr" lang="zh-CN" xml:lang="zh-CN">
<head>
    <title>机动车环保信息公开系统</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta content="none" name="Robots" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
    <link href="${contextPath }/css/login.css" rel="stylesheet" type="text/css" />
    <script type="text/javascript" src="${request.contextPath }/webjarslocator/jquery/jquery.js"></script>
</head>
<body>
  <div class="header">
    <div class="head">机动车和非道路移动机械环保信息公开系统</div>
  </div>
  <div class="content">
  	 <div class="shadow">
  	 	<div class="login-bg">
	    </div>
    </div>
		<div class="login">
			<div class="title">登 录</div>
			<form action="login" method="post" onsubmit="return check();">
				<input type="hidden" name="username" />
				<input type="text" placeholder="您的企业编号" id="code"/>
				<input type="text" placeholder="您的用户名"  id="name"/>
				<input type="password" name="password" placeholder="您的密码" />
				<div class="error orange">${error }${msg }</div>
				<div class="remember">
					<label><input name="" type="checkbox" />记住登录信息</label> <a
						class="r orange" href="egrs/audit/regist">注册</a>
				</div>
				<input type="submit" value="登 录" />
			</form>
		</div>
	</div>
  <div class="footer">
	  <div class="foot-l">
		   <div class="foot-txt">
				      机动车排污监控中心<br>
				      总机：84918110 84918112 84916280 84916281 84918813　<br>
				      传真分机号：8118<br>
				      地址：北京朝阳区安外大羊坊8号中国环境科学研究院风洞楼二层
		   </div>
	  </div>
	   <div class="foot-r">
		   <div class="foot-txt">
				      邮政编码：100012<br>
				      信息公开系统.技术支持　<br>
				      邮箱：xxgkzx@vecc-mep.org.cn<br>
				      咨询时间：周一至周五　9:00 - 11:30 13:30 - 16:00
		    </div>
	    <div class="c"></div>
	  </div>
  </div>
  <script type="text/javascript">
		//登陆前赋值
		function check(){
			$("input[name='username']").val($("#code").val() +"-" + $("#name").val());
			return true;
		}
	</script>
</body>
</html>
