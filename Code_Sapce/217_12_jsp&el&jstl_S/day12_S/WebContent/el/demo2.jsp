<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>获取复杂的数据</title>
</head>
<body>
	<%
		//往request域中导入数据
		request.setAttribute("arr", new String[]{"aa","bb","cc"});
		//往request域中导入list
		List list =new ArrayList();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		list.add("dddd");
		request.setAttribute("list", list);
		//往request域中导入map
		Map m = new HashMap();
		m.put("username", "tom");
		m.put("age", "18");
		m.put("sex", "男");
		request.setAttribute("map", m);
		//往域中放入简单的数据
		request.setAttribute("arr.age", "18");
	%>
	获取域中的数组:<br>
	老方式:<%=((String[])request.getAttribute("arr"))[1]%><br>
	el方式:${arr[1] }<br>
	<hr>
	获取域中的list:<br>
	老方式:<%=((List)request.getAttribute("list")).get(1)%><br>
	el方式:${list[1] }
	list长度:${list.size() }
	<br>
	<hr>
	<hr>
	获取域中的map:<br>
	老方式:<%=((Map)request.getAttribute("map")).get("sex")%><br>
	el方式:${map.sex }
	
	<br>
	<hr>
	获取特殊名字的数据<br>
	${requestScope["arr.age"] }
</body>
</html>