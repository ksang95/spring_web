<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>user/form</title>
</head>
<body>
<form:form action="register" modelAttribute="user" method="post">
사용자 아이디 : <form:input path="userId"/><form:errors path="userId"/><br>
비밀번호 : <form:input path="password"/><form:errors path="password"/><br>
이름 : <form:input path="name"/><form:errors path="name"/><br>
이메일 : <form:input path="email"/><form:errors path="email"/><br>
<button type="submit">회원가입</button>
</form:form>

</body>
</html>