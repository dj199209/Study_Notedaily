<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	动态包含页面内容
	<hr>
		i1内容:<jsp:include page="/jsp/action/i1.jsp"></jsp:include>
	<hr>
		i2内容:<jsp:include page="/jsp/action/i2.jsp"></jsp:include>
</body>
</html>