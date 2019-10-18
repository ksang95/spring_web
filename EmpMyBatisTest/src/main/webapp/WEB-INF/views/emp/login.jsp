<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>emp/login</title>
</head>
<body>
<h1>emp/login</h1>
<form action="loginResult" method="get">
<label for="empno">empno:</label> <input type="text" id="empno" name="empno" autofocus="autofocus" required="required"/>
<input type="submit" value="입력"/>
</form>
<br>
${emp}
<br><br>
<a href="../home">home</a>
</body>
</html>