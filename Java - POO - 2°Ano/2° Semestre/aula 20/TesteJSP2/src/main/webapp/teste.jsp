<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Bem vindo, <% out.print(session.getAttribute("nome")); %></h1>
	<h2>Email: <%= session.getAttribute("email") %></h2> 
	<% for(int i = 1; i <= 10; i++){
		out.print(i);
	}%>
</body>
</html>