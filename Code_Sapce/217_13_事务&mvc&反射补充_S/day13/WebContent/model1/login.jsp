<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 接收值 -->
<jsp:useBean id="u" class="com.dj.domain.User"></jsp:useBean>
<jsp:setProperty property="username" name="u"/>
<jsp:setProperty property="password" name="p"/>
<!-- 打印值 -->
<jsp:getProperty property="username" name="u"/>

</body>
</html> 