<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="/day12_S/jsp/page.jsp">page指令</a><br>
<a href="/day12_S/jsp/include/include.jsp">include指令</a><br>
<a href="/day12_S/jsp/pagecontext.jsp">pageContext指令</a><br>
<a href="/day12_S/jsp/action/forward.jsp">jsp动作标签forword</a><br>
<a href="/day12_S/jsp/action/include.jsp">jsp动作标签include</a><br>
<hr>
<hr>
 
<a href="/day12_S/el/demo1.jsp">el获取简单数据</a><br>
<a href="/day12_S/el/demo2.jsp">el获取复杂数据</a><br>
<a href="/day12_S/el/demo3.jsp">javabean</a><br>
<a href="/day12_S/el/demo4.jsp">执行运算</a><br>
<a href="/day12_S/el/demo8.jsp">cookie</a><br>
<a href="${pageContext.request.contextPath}/el/demo8.jsp">pagecontext对象</a><br>

<hr>
<hr>
<a href="${pageContext.request.contextPath}/jstl/if.jsp">core_if</a><br>
<a href="${pageContext.request.contextPath}/jstl/for1.jsp">core_foreache</a><br>

</body>
</html>