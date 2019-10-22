<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<form:form action="./insert2.do" modelAttribute="emp2" method="post">
EMPNO:<form:input path="empno" value="${emp2.empno}"/>
		<form:errors path="empno" /><br> <!-- empno 관련 에러 메시지 출력용 -->
		ENAME:<form:input path="ename" value="${emp2.ename}"/>
		<form:errors path="ename" /><br> <!-- ename 관련 에러 메시지 출력용 -->
		JOB:<form:input path="job" value="${emp2.job}"/>
		<form:errors path="job" /><br> 
		MGR:<form:input path="mgr" value="${emp2.mgr}"/>
		<form:errors path="mgr" />
		<br> <input type="submit" value="저장"> <input type="reset"
			value="취소">
</form:form>

</body>
</html>