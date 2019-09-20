<%@page import="com.dj.domain.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	User u =new User();
	u.setId("001");
	u.setUsername("tom");
	u.setPassword("123");
	//将u放入域对象
	request.setAttribute("user", u);
	
%>
获取javaBean的id值:<br>
老方式:<%=((User)request.getAttribute("user")).getId() %><br>
el方式:${user.id}<br>
el方式:${user.username}
<hr>


</body>
</html>