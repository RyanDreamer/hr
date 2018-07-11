<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% pageContext.setAttribute("username", "Jim"); %>
	<% request.setAttribute("bookName", "Java Web"); %>
	<% session.setAttribute("username", "Tom"); %>
 	<% application.setAttribute("bookName", "Java 高级"); %>
 	
 	表达式\${pageScope.username }的值为：${pageScope.username }<br>
 	表达式\${requestScope.bookName }的值为：${requestScope.bookName }<br>
 	表达式\${sessionScope.username }的值为：${sessionScope.username }<br>
 	表达式\${applicationScope.bookName }的值为：${applicationScope.bookName }<br>
</body>
</html>