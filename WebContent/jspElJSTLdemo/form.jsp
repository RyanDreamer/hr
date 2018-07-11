<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body style="text-aligin:center;">
	<form action="${pageContext.request.contextPath }/param.jsp">
		num1:<input type="text" name="num1"><br>
		num2:<input type="text" name="num"><br>
		num3:<input type="text" name="num"><br>
		
		<input type="submit" value="提交">
		<input type="reset" value="重置">
	</form>
	
	<hr>
	num1:${param.num1 }<br>
	num2:${paramValues.num[0] }<br>
	num3:${paramValues.num[1] }<br>
	
	
	<c:out value="${param.num1 }"></c:out>
	
	<c:set value="1" var="num" property="num"></c:set>
	<c:if test="${num==1 }">
		标签的使用
	</c:if>
</body>
</html>