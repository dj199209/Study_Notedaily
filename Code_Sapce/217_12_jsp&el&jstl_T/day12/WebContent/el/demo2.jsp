<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>获取复杂数据</title>
</head>
<body>
	<%
		//往request域中放入数组
		request.setAttribute("arr", new String[]{"aa","bb","cc"});
		
		//往request域中放入list
		List list=new ArrayList();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		request.setAttribute("list", list);
		
		//往request域中放入map
		Map m=new HashMap();
		m.put("username","tom");
		m.put("age",18);
		request.setAttribute("map", m);
		
		//往域中放入一个简单数据
		request.setAttribute("arr.age","18");
	%>
	
	获取域中的数组:<br>
	老方式:<%=((String[])request.getAttribute("arr"))[1] %><br>
	el方式:${arr[1] }<br>
	<hr>
	
	获取域中的list:<br>
	老方式:<%=((List)request.getAttribute("list")).get(1) %><br>
	el方式:${list[1] }<br>
	list的长度:${list.size() }
	<hr>
	
	获取域中的map:<br>
	老方式:<%=((Map)request.getAttribute("map")).get("age") %><br>
	el方式:${map.age }<br>
	<hr>
	
	获取特殊名字的数据<br>
	${requestScope["arr.age"] }
</body>
</html>