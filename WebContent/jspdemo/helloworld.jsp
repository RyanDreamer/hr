<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<%!
	//定义两个变量
	int a =1, b=2;
%>
	<%!
	public String print() {
		String str = "学习";
		return str;
	}
	%>
</head>
<body>
<%
	//输出两个变量之和
	out.println(a+b);
%>
<br>
<%
	//调用print方法输出其返回值
	out.println(print());
%>
<br>
<%= a+b %>
<%--JSP表达式输出 --%>
<%= print() %>
	<h3>如果.jsp直接在WebContent下面，则访问http://localhost:8080/hr/helloworld.jsp 输出Hello world! 否则在/hr后加文件夹名</h3>
</body>
</html>