<%@page import="com.dj.domain.User"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
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
		request.setAttribute("i", 3);
		request.setAttribute("j", 4);
		request.setAttribute("q", 12);
		request.setAttribute("k", "k");
		List l =null;
		request.setAttribute("list", l);
		List l2 =new ArrayList();
		l2.add("ssss");
		request.setAttribute("list2", l2);
		User u = null;
		request.setAttribute("bean", u);
		User u1 = new User();
		request.setAttribute("bean1", u1);
	%>
	${i+j }
	${i+q }
	${q+q }
	<hr>
	域中的list的长度是否为0:${empty list }<br>
	域中的list的长度是否为0:${empty list2 }<br>
	域中的user的长度是否为0:${empty bean }<br>
	域中的user1的长度是否为0:${empty bean1 }<br>
	<hr>
	${3>4?"yes":"no" }<br>
	
</body>
</html>