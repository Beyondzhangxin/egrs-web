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

  </script>
</head>
<body>
 <div class="header-form"></div>
    <div class="plan-nav">
      <ul>
        <li>
          <a href="#"><img src="/images/pic01.png"><br>执行标准</a>
          <div class="fill"><img src="/images/fill.png" ></div>
        </li>
        <li id="p-nav-on"><a href="#"><img src="/images/pic02.png"><br>车型描述</a></li>
        <li><a href="#"><img src="/images/pic03.png"><br>车辆控制</a></li>
        <li><a href="#"><img src="/images/pic04.png"><br>检测设备</a></li>
        <li><a href="#"><img src="/images/pic05.png"><br>整车排放</a></li>
        <li><a href="#"><img src="/images/pic06.png"><br>纠正措施</a></li>
      </ul>
      <div class="c"></div>
    </div>
   <div class="content">
    <div class="list">
      <div class="list-item">
        <div class="title">选择车辆类别</div>
        <div class="con category">
          <div class="ht30"></div>
          <div class="">
            <table>
              <tr>
                <td width="268" align="right">车辆类别：</td>
                <td>${planFiles.fllb }</td>
              </tr>
              <tr>
                <td align="right">非道路移动机械用柴油机达到的排放阶段：</td>
                <td>
                <label>国Ⅲ<input type="radio"></label>
                </td>
              </tr>
              <tr>
                <td align="right">是否进口：</td>
                <td>
                  <label>是 <input type="radio"></label>
                  <label>否 <input type="radio"></label>
                </td>
              </tr>
            </table>

          </div>
          <div class="car-type">
          </div>
          <p><input type="button" value="保存"></p>
        </div>
      </div>
    </div>
  </div>
</body>
</html>
