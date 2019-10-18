<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<h1>Hello world!</h1>

	<P>The time on the server is ${serverTime}.</P>
	
	<h2>emp</h2>
	<a href="emp/empList">empList</a><br>
	<a href="emp/empUpdate">empUpdate</a><br>
	<h2>dept</h2>
	<a href="dept/login">login-empInsert</a><br>
</body>
</html>
