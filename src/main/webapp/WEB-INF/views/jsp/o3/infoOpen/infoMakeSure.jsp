<%@ page language="java" contentType="text/html;charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../../../../include/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTDHTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="${contextPath }/css/list.css" rel="stylesheet" type="text/css">
<title>信息公开</title>
</head>
<body>
<div class="content">
	<div class="header-form"></div>	
	<div class="ht30"></div>
    <div class="list-info plan">
      <div class="ht30"></div>
      <p class="cblue">提示：确定配置。</p>
      <div class="ht10"></div>
      
      <div class="ht30"></div>
      <div class="info-next">
      <table class="list-table bg-colors">
        
       
        <tr class="bg-blue">
          <th>催化转换器</th>
          <th>燃油蒸发控制装置</th>
          <th>氧传感器</th>
          <th>曲轴箱排放控制装置</th>
          <th>EGR</th>
          <th>OBD</th> 
          <th>ECU</th>
          <!-- <th>变速器型式/档位数</th> -->
          <th>消声器</th>
          <th>增压器</th>
          <th>中冷器</th>
          <th>IUPR功能/NOX监测</th>
          <th>储能装置</th>
          <th>电机</th>
          <th>选项</th>
        </tr>
          	<c:forEach items="${configList }" var="config" varStatus="num">
          	
        <tr>
          		<td>${config["14"].zhqxh },${config["14"].zhqscc }</td>
          		 <td>${config['2'].tgxh },${config['2'].tgscc }</td>
          		<td>${config['14'].cgqxh },${config['14'].cgqscc }</td>
          		<td>${config['5'].pcvxh },${config['5'].pcvscc }</td>
          		<td>${config['14'].egrxh },${config['14'].egrscc }</td>
          		<td>${config['0'].mixh },${config['0'].miscc }</td>
          		<td>${config['14'].ecuxh },${config['14'].ecuscc }</td>
          		<%--<td>${config[14]. },${config[14]. }</td>--%>
          		<td>${config['1'].xsqxh },${config['1'].xsqscc }</td>
          		<td>${config['14'].zyqxh },${config['14'].zyqscc }</td>
          		<td>${config['14'].zlqxh }</td>
          		<td>${config['0'].iupr },${config['0'].noxjc }</td>
          		<td>${config['15'].cnzzxh },${config['15'].cnzzscc }</td>
          		<td>${config['15'].djxh },${config['15'].djscc }</td> 
          		<td><label><input type="radio" name="id" value="${num.index }"/></label></td>
        </tr>
          	</c:forEach>
          	
        
   		<input type="hidden" name="pf" value="${info.pf }"/>
   		<input type="hidden" name="inforPub" valu="${info }"/>
      </table>
	<script type="text/javascript">

	</script>
	<div class="ht30"></div>
	<div class="content-item">
		<div class="buttons">
	       <a class="button bg-blue02 fg-white" onclick="next()">下一步</a>
	     </div>
	</div>
     
      </div>
    </div>
  </div>
	<script type="text/javascript">
		function next(){
			var id = $("input[type='radio']:checked").val();
			if( id == null){
				$.Notify({
					content: "请选择要保存的报告！",
				    type: 'alert'
				})}else{
			 window.location.href= "infoMessage?id="+id;
				
			}
		}
	</script>
	<div class="ht50"></div>
</body>
</html>