<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:choose>
		<c:when test="${empty parm.username }">
			不知道username
		</c:when>
		<c:when test="${param.username == 'tom' }">
			${param.username }是用户
		</c:when>
		<c:otherwise>
			${param.username }是管理员
		</c:otherwise>
	</c:choose>
</body>
</html>