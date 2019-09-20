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
		request.setAttribute("rkey", "rvalue");
		session.setAttribute("skey", "svalue");
		application.setAttribute("akey", "avalue");
	%>
	获取request中的数据<br>
	老方式:<%=request.getAttribute("rkey") %><br>
	el方式:${requestScope.rkey  }<br>
	<hr>
	获取session中的数据<br>
	老方式:<%=session.getAttribute("skey") %><br>
	el方式:${sessionScope.skey  }<br>
	<hr>
	获取application中的数据<br>
	老方式:<%=application.getAttribute("akey") %><br>
	el方式:${applicationScope.akey  }<br>
	<hr>
	获取失败的老方式:<%=application.getAttribute("aakey") %><br>
	el方式:${applicationScope.aakey  }<br>
		<hr>
		便捷获取:
		${skey} ,${akey},${aakey}}
</body>
</html>