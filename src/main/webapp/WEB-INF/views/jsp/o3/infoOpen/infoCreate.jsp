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
    <div class="list">
      <div class="list-item">
        <div class="title">选择车辆类别</div>
        <div class="con category">
          <div class="ht30"></div>
          <div class="">
            <table>
            <form action="/ergs/o3/infoOpen/infoNext" method="get" id="formid">
              <tr>
                <td width="268" align="right">车辆类别：</td>
                <td>${e3Vehicles.cllb }</td>
              </tr>
              <tr>
                <td align="right">达到的排放阶段:</td>
                <td>
	                <c:if test="${e3Vehicles.cllb == '轻型汽油车' }">
	                <label>
	                	国Ⅳ<input name="pf" type="radio" value="4" checked="checked">
	                </label>
	                <label>
	                	国Ⅴ<input name="pf" type="radio" value="5">
	                </label>
	                </c:if>
                </td>
              </tr>
              <tr>
                <td align="right">是否进口：</td>
                <td>
                  <label>是 <input type="radio" name="jkc" value="Y"></label>
                  <label>否 <input type="radio" name="jkc" value="N" checked="checked"></label>
                </td>
              </tr>
              <tr>
                <td align="right">是否混合动力：</td>
                <td>
                  <label>是 <input type="radio" name="hhdl" value="Y"></label>
                  <label>否 <input type="radio" name="hhdl" value="N" checked="checked"></label>
                </td>
              </tr>
              <tr>
                <td align="right">是否属于单车认证：</td>
                <td>
                  <label>是 <input type="radio" name="acar" value="Y"></label>
                  <label>否 <input type="radio" name="acar" value="N" checked="checked"></label>
                </td>
              </tr>
              <tr>
                <td align="right">耐久标准推荐劣化系数：</td>
                <td>
                  <label>是 <input type="radio" name="njlhxs" value="Y"></label>
                  <label>否 <input type="radio" name="njlhxs" value="N" checked="checked"></label>
                </td>
              </tr>
              <tr>
                <td align="right">蒸发加油排放耐久推荐劣化系数：</td>
                <td>
                  <label>是 <input type="radio" name="rynjlhxs" value="Y"></label>
                  <label>否 <input type="radio" name="rynjlhxs" value="N" checked="checked"></label>
                </td>
              </tr>
              <input type="hidden" name="cxid" value="${e3Vehicles.cxid }"/>
              <input type="hidden" name="cllb" value="${e3Vehicles.cllb }"/>
          <p><input type="button" value="保存" onclick="next()"></p> 
              </form>
            </table>

          </div>
          <div class="car-type">
          </div>
        </div>
      </div>
    </div>
  </div>
	<div class="ht50"></div>
	<script type="text/javascript">
		function next(){
			
			$("#formid").submit();
		}
	</script>
</body>
</html>