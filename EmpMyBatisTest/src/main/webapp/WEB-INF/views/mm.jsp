<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form action="empForm" id="emp" commandName="emp"> <!-- controller에서 emp라는 Emp객체 넘겨줘야함 -->
	empno : <form:input path="empno"/> <br> <!-- 자동으로 name, id, default value 만들어줌 -->
	ename : <form:input path="ename"/><br>
	job : <form:input path="job"/><br>
	mgr : <form:input path="mgr"/><br>
	<input type="submit">
	</form:form>
</body>
</html>