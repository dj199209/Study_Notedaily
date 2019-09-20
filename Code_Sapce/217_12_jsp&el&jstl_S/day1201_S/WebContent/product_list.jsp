<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1" align="center">
		<tr>
			<td>id</td>
			<td>商品名称</td>
			<td>单价</td>
			<td>描述</td>
		</tr>
		<c:forEach items ="${list }" var="p">
		<tr>
			<td>${p.id }</td>    
			<td>${p.pname }</td>
			<td>${p.price }</td>
			<td>${p.desc }</td>
		</tr>
			</c:forEach>
	</table>
</body>
</html>