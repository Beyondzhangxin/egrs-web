<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>  
<%@ taglib uri="/WEB-INF/tlds/env.tld" prefix="env" %>
<%@ taglib uri="/WEB-INF/tlds/envfn.tld" prefix="envfn" %>
<c:url value="${pageContext.request.contextPath}/logout" var="logoutUrl"/>  
<c:url value="${pageContext.request.contextPath}/login" var="loginUrl"/>  
<c:set value="${pageContext.request.contextPath}" var="contextPath"></c:set>
