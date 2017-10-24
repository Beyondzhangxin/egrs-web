<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>  
<body>  
<h4>${companyName}，你好！</h4>  
&nbsp;&nbsp; 很抱歉得通知您，您${registTime?string('yyyy-MM-dd hh:mm:ss')}在"机动车和非道路移动机械环保信息公开系统"注册的用户审核未通过，原因：${reason}。<br>
&nbsp;&nbsp; 请前往<a href="${context}/egrs/audit/regist?last=${registId}">${context}/egrs/audit/regist?last=${registId}</a>完善注册信息重新提交审核。
<br>
<br>
机动车排污监控中心
${time?date}  
</body>  
</html>  