<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	//获取request对象
	HttpServletRequest req = (HttpServletRequest)pageContext.getRequest();
	//设置页面的属性范围
	pageContext.setAttribute("str", "Java", pageContext.PAGE_SCOPE);
	//设置request的范围
	req.setAttribute("strRequest", "Java Web");
	//获取page页面范围属性
	String strPage = (String)pageContext.getAttribute("str",pageContext.PAGE_SCOPE);
	//获取request的范围属性
	String strReq = (String)pageContext.getAttribute("strRequest",pageContext.REQUEST_SCOPE);
	
	%>
	
	<%= "page的范围"+strPage+"<br>" %>
	<%= "request的范围"+strReq %>
</body>
</html>