<%@ page language="java"
    pageEncoding="UTF-8" buffer="8kb" autoFlush="true" session="true"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="/day12/jsp/page.jsp">page指令</a><br>
	<a href="/day12/jsp/include/include.jsp">include指令</a><br>
	<a href="/day12/jsp/pagecontext.jsp">PageContext作用</a><br>
	<a href="/day12/jsp/action/forward.jsp">jsp动作标签-forward</a><br>
	<a href="/day12/jsp/action/include.jsp">jsp动作标签-include</a><br>
	<hr>
	<hr>
	<a href="/day12/el/demo1.jsp">el-获取简单数据</a><br>
	<a href="/day12/el/demo2.jsp">el-获取复杂数据</a><br>
	<a href="/day12/el/demo3.jsp">el-javabean导航</a><br>
	<a href="/day12/el/demo4.jsp">el-执行运算</a><br>
	<a href="/day12/el/demo5.jsp?username=tom&password=123&hobby=drink&hobby=sleep">和参数相关的内置对象(了解)</a><br>
	<a href="/day12/el/demo6.jsp">和请求头相关的内置对象(了解)</a><br>
	<a href="/day12/el/demo7.jsp">和全局初始化参数相关的内置对象(了解)</a><br>
	<a href="/day12/el/demo8.jsp">cookie内置对象(掌握)</a><br>
	<a href="${pageContext.request.contextPath }/el/demo8.jsp">pagecontext内置对象获取项目名(掌握)</a><br>
	
	<hr>
	<hr>
	<a href="${pageContext.request.contextPath }/jstl/if.jsp">core_if</a><br>
	<a href="${pageContext.request.contextPath }/jstl/for1.jsp">core_forEache基础用法</a><br>
	<a href="${pageContext.request.contextPath }/jstl/for2.jsp">core_forEache高级用法</a><br>
	<a href="${pageContext.request.contextPath }/jstl/choose.jsp">core_set和choose(扩展)</a><br>
	<a href="${pageContext.request.contextPath }/jstl/fn.jsp">函数库(扩展)</a><br>
</body>
</html>