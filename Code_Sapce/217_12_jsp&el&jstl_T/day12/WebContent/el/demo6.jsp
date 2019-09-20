<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>和请求头相关的</title>
</head>
<body>
${header }<hr>
${headerValues }
<hr>
<hr>
referer:${header.referer }<br>
user-agent:${headerValues["user-agent"][0] }
</body>
</html>