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
      <p class="cblue">提示：确定配置没有问题后，勾选选择框，然后点击下一步。</p>
      <div class="ht10"></div>
      <p class="cblue">提示：单次申报只能选择一套配置，多套配置请创建多份信息公开表。</p>
      <div class="ht30"></div>
      <div class="info-next">
      <table class="list-table bg-colors">
        
        <c:forEach items="${map }" var="reportlist">
       	 <c:if test="${reportlist.key == '14' || reportlist.key == '16' || reportlist.key == '4' || 
        				reportlist.key == '11' || reportlist.key == '10' || reportlist.key == '0' || 
        				reportlist.key == '6' || reportlist.key == '7' || reportlist.key == '5' || 
        				reportlist.key == '2' || reportlist.key == '1' || reportlist.key == '8' || 
        				reportlist.key == '12' || reportlist.key == '17' || reportlist.key == '15' }">
       
        <tr  class="bg-blue">
         	<c:if test="${reportlist.key == '14'}">
          		<td >常温</td>
         	</c:if>
         	<c:if test="${reportlist.key == '16'}">
          		<td>SBC</td>
         	</c:if>
         	<c:if test="${reportlist.key == '4'}">
          		<td>排污污染试验</td>
          	</c:if>
          	<c:if test="${reportlist.key == '11'}">
          		<td>油耗</td>
          	</c:if>
          	<c:if test="${reportlist.key == '10'}">
          		<td>双怠速</td>
          	</c:if>
          	<c:if test="${reportlist.key == '0'}">
          		<td>OBD</td>
          	</c:if>
          	<c:if test="${reportlist.key == '6'}">
          		<td>耐久性</td>
          	</c:if>
          	<c:if test="${reportlist.key == '7'}">
          		<td>自由加速度烟度</td>
          	</c:if>
          	<c:if test="${reportlist.key == '5'}">
          		<td>曲轴箱</td>
          	</c:if>
          	<c:if test="${reportlist.key == '2'}">
          		<td>蒸发</td>
          	</c:if>
          	<c:if test="${reportlist.key == '1'}">
          		<td>噪声</td>
          	</c:if>
          	<c:if test="${reportlist.key == '12'}">
          		<td>排气烟度</td>
          	</c:if>
          	<c:if test="${reportlist.key == '8'}">
          		<td>全负荷烟度</td>
          	</c:if>
          	<c:if test="${reportlist.key == '17'}">
          		<td>贵金属</td>
          	</c:if>
          	<c:if test="${reportlist.key == '15'}">
          		<td>低温</td>
          	</c:if>
        </tr>
        <tr class="bg-blue">
          <th>种类</th>
          <th>报告编号</th>
          <th>配置编号</th>
          <th>选项</th>
        </tr>
          	<c:forEach items="${reportlist.value }" var="report" varStatus="num">
        <tr>
         	<c:if test="${reportlist.key == '14'}">
          		<td>常温</td>
         	</c:if>
         	<c:if test="${reportlist.key == '16'}">
          		<td>SBC</td>
         	</c:if>
         	<c:if test="${reportlist.key == '4'}">
          		<td>排污污染试验</td>
          	</c:if>
          	<c:if test="${reportlist.key == '11'}">
          		<td>油耗</td>
          	</c:if>
          	<c:if test="${reportlist.key == '10'}">
          		<td>双怠速</td>
          	</c:if>
          	<c:if test="${reportlist.key == '0'}">
          		<td>OBD</td>
          	</c:if>
          	<c:if test="${reportlist.key == '6'}">
          		<td>耐久性</td>
          	</c:if>
          	<c:if test="${reportlist.key == '7'}">
          		<td>自由加速度烟度</td>
          	</c:if>
          	<c:if test="${reportlist.key == '5'}">
          		<td>曲轴箱</td>
          	</c:if>
          	<c:if test="${reportlist.key == '2'}">
          		<td>蒸发</td>
          	</c:if>
          	<c:if test="${reportlist.key == '1'}">
          		<td>噪声</td>
          	</c:if>
          	<c:if test="${reportlist.key == '12'}">
          		<td>排气烟度</td>
          	</c:if>
          	<c:if test="${reportlist.key == '8'}">
          		<td>全负荷烟度</td>
          	</c:if>
          	<c:if test="${reportlist.key == '17'}">
          		<td>贵金属</td>
          	</c:if>
          	<c:if test="${reportlist.key == '15'}">
          		<td>低温</td>
          	</c:if>
          		<td>${report.jybgbh }</td>
          		<td>${report.pzbh }</td>
          		<c:if test="${num.index==0 }">
          		<td><label><input type="radio" name="${reportlist.key }bh" value="${report.jybgbh }:${report.pzbh }:${reportlist.key}:${num.index}" checked="checked"/></label></td>
          		</c:if>
          		<c:if test="${num.index!=0 }">
          		<td><label><input type="radio" name="${reportlist.key }bh" value="${report.jybgbh }:${report.pzbh }:${reportlist.key}:${num.index}"/></label></td>
          		</c:if>
        </tr>
          	</c:forEach>
          	</c:if>
        </c:forEach>
   		<input type="hidden" name="pf" value="${info.pf }"/>
   		<input type="hidden" name="vehicle" value="${info.cllb }"/>
      </table>
	<script type="text/javascript">
        $(function(){
        	$("tr").click(function(){
        		$(this).find(":radio").prop("checked", true);
        	})
        })
		function next(){
			//获取所有选中的radio
			
			var ids = new Array();
				 $("input[type='radio']").each(function(){
					if($(this).is(':checked')){
						ids.push($(this).val());
					}
				})
				
			var sizes = $(".bg-blue").size();
			if(ids.length != sizes){
				$.Notify({
					content: "请完整选择配置！",
				    type: 'alert'
				});
			}else{
				$.ajax({
						 url:'filter',
						 data:{"ids":ids,"pf":$("input[name='pf']").val(),"vehicle":$("input[name='vehicle']").val()},
						 traditional: true,
						success:function(msg){
						if(!msg.flag){
			        		$.Notify({
								content: msg.message,
							    type: 'alert'
							});
						}else{
					 		window.location.href="/ergs/o3/infoOpen/infoMakeSure?ids="+ids+"&pf="+$("input[name='pf']").val()+"&vehicle="+$("input[name='vehicle']").val();
							}
					} 
				})				
				
			}
			
		}
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
	
	<div class="ht50"></div>
</body>
</html>