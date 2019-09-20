<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 接受值 -->
<jsp:useBean id="u" class="com.itheima.domain.User"></jsp:useBean>
<jsp:setProperty property="name" name="u"/>
<jsp:setProperty property="password" name="u"/>

<!-- 打印值-->
<jsp:getProperty property="name" name="u"/>
</body>
</html>