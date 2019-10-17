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
	<a href="emp/login">login</a><br>
	<a href="emp/empList">empList</a>
	<h2>dept</h2>
	<a href="dept/login">login</a><br>
	<a href="dept/empList">empList</a>
</body>
</html>
