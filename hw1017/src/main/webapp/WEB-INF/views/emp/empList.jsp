<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>emp/empList</title>
</head>
<body>
<h1>emp/empList</h1>
<c:forEach var="data" items="${empList}">
<div>${data.empno} ${data.ename} ${data.job} ${data.mgr}</div>
</c:forEach>
<br>
<a href="../home">home</a>
</body>
</html>