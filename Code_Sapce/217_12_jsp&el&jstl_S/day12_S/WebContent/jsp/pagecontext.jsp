<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>pagecontext</title>
</head>
<body>
<%
	pageContext.setAttribute("rkey", "rvalue",pageContext.REQUEST_SCOPE);
%>
通过pagecontext往request放入一个值,取出来<%=request.getAttribute("rkey") %>
</body>
</html>