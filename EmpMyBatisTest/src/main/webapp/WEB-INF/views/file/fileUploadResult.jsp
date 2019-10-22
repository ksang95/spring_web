<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>file upload result</title>
</head>
<body>
file upload result<br>
${pageContext.request.contextPath}${img}<br>
<img src="${pageContext.request.contextPath}${img}">
</body>
</html>