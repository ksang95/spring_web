<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
</head>
<body>
<h1>login</h1>

<form action="empsInsert">
	empno1 <input type="text" name="emps[0].empno"><br>
	ename1 <input type="text" name="emps[0].ename"><br>
	job1 <input type="text" name="emps[0].job"><br>
	mgr1 <input type="text" name="emps[0].mgr"><br>
	/////////////////////////////<br>
	empno2 <input type="text" name="emps[1].empno"><br>
	ename2 <input type="text" name="emps[1].ename"><br>
	job2 <input type="text" name="emps[1].job"><br>
	mgr2 <input type="text" name="emps[1].mgr"><br>
	<input type="submit">
</form>
<br>
<a href="../home">home</a>
</body>
</html>