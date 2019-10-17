<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>empInfoEdit</title>
</head>
<body>
<h1>empInfoEdit</h1>
<br><br>
<form action="empUpdateResult" method="POST">
사원번호 <input type="text" name="empno" value="${emp.empno}" readonly="readonly"/><br>
이름 <input type="text" name="ename" value="${emp.ename}"/><br>
업무 <input type="text" name="job" value="${emp.job}"/><br>
상사 <input type="text" name="mgr" value="${emp.mgr}"/><br><br>
<input type="submit" value="수정"/>
</form>
<br><br>
<a href="../home">home</a>
</body>
</html>