<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="true" isELIgnored="false" isErrorPage="false" errorPage="600.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	session.setAttribute("skey", "svalue");
	int i=1/0;
	
%>
<%=session.getAttribute("skey") %><br>
${sessionScope.skey }
</body>
</html>