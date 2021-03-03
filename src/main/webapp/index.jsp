<%@ page language="java" contentType="text/html; 
    charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<!-- Please, fill <a href="WEB-INF/jsp/registration.jsp "> the registration form </a>-->
Please, fill <a href="jsp/registration.jsp "> the registration form </a>

	<%
		response.sendRedirect("controller?command=gotoindexpage");
	%>
</body>
</html>