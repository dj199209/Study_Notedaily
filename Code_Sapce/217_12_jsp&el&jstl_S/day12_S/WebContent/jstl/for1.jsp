<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:forEach begin="1" end="10" step="1" var="i">${i }</c:forEach><br>
	<c:forEach begin="1" end="20" step="2" var="i" varStatus="vs" >${i }--${vs.count }<br></c:forEach>
</body>
</html>