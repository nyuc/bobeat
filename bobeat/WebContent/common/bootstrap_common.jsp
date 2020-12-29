<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	StringBuilder path = new StringBuilder(request.getContextPath());
	path.append("/");
%>
<!-- link rel="shortcut icon" href="image/favicon.ico"-->
<link rel="stylesheet" type="text/css" href="<%=path.toString() %>css/bootstrap.min.css">
<script type="text/javascript" src="<%=path.toString() %>js/jquery.min.js"></script>
<script type="text/javascript" src="<%=path.toString() %>js/common.js"></script>
<script type="text/javascript" src="<%=path.toString() %>js/bootstrap.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-cookie/1.4.1/jquery.cookie.min.js"></script>