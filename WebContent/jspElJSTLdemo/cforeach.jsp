<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="java.util.Map" %>
<%@page import="java.util.HashMap" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String[] fruits = {"apple", "orange", "banana", "grape"};
	%>
	String中的数组的元素<hr>
	<c:forEach var="name" items="<%= fruits %>">
		${name } <br>
	</c:forEach>
	
	<%
		Map userMap = new HashMap();
		userMap.put("tom", "123");
		userMap.put("mike", "456");
		userMap.put("jonh", "789");
	%>
	<hr>HashMap集合中的元素<hr>
	<c:forEach var="entity" items="<%=userMap %>">
		${entity.key } &nbsp;&nbsp;${entity.value}<br>
	</c:forEach>
</body>
</html>