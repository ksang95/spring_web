<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>emp/empList</title>
</head>
<body>
	<h1>emp/empList</h1>
	<table>
	<tr><th>EMPNO</th><th>ENAME</th><th>JOB</th><th>MGR</th></tr>
	<c:forEach var="data" items="${empList}">
		<tr><td>${data.empno}</td><td>${data.ename}</td><td>${data.job}</td><td>${data.mgr}</td></tr>
	</c:forEach>
	</table>
	<br>
	<a href="../home">home</a>
</body>
</html>