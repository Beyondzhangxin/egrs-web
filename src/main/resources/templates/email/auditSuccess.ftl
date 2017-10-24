<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>  
<body>  
<h4>${companyName}，你好！</h4>  
&nbsp;&nbsp; 恭喜您${registTime?string('yyyy-MM-dd hh:mm:ss')}在"机动车和非道路移动机械环保信息公开系统"注册的用户已成功通过审核。<br>
&nbsp;&nbsp; 请前往<a href="${context}/login">${context}/login</a>登录，登录企业编号：${manufid},用户名：${username},密码:${pwd}。
<br>
<br>
机动车排污监控中心
${time?date}  
</body>  
</html>  