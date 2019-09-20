<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		request.setAttribute("rkey", "rvalue");
		session.setAttribute("skey", "svalue");
		session.setAttribute("rkey", "svalue");
		application.setAttribute("akey", "avalue");
	%>
	获取request中的数据:<br>
	老方式:<%=request.getAttribute("rkey") %><br/>
	el方式:${requestScope.rkey }<br/>
	<hr>
	
	获取session中的数据:<br>
	老方式:<%=session.getAttribute("skey") %><br/>
	el方式:${sessionScope.skey }<br/>
	<hr>
	
	获取application中的数据:<br>
	老方式:<%=application.getAttribute("akey") %><br/>
	el方式:${applicationScope.akey }<br/>
	
	<hr>
	获取失败老方式:<%=application.getAttribute("aakey") %><br/>
	获取失败el方式:${applicationScope.aakey }
	
	<hr>
	便捷获取:
	${skey },${rkey },${aakey },${akey }
	<hr>
	${rkey }
	<hr>
</body>
</html>