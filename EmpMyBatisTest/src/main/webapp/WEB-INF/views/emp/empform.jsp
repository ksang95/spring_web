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
	<spring:hasBindErrors name="emp" /> <!-- 에러 바인딩해서 에러 정보설정 -->
	<form:errors path="emp" />
	<form action="./insert.do" method="post">
		EMPNO:<input type="text" name="empno" value="${emp.empno}">
		<form:errors path="emp.empno" /><br> <!-- empno 관련 에러 메시지 출력용 -->
		ENAME:<input type="text" name="ename" value="${emp.ename}">
		<form:errors path="emp.ename" /><br> <!-- ename 관련 에러 메시지 출력용 -->
		JOB:<input type="text" name="job" value="${emp.job}">
		<form:errors path="emp.job" /><br> 
		MGR:
		<select name="mgr">
			<c:forEach var="mgrno" items="${emp.emps}">
				<option value="${mgrno.empno}" <c:if test="${emp.mgr== mgrno.empno}">selected</c:if>>${mgrno.empno}</option>
			</c:forEach>
		</select>
		<form:errors path="emp.mgr" />
		<br> <input type="submit" value="저장"> <input type="reset"
			value="취소">
	</form>
</body>
</html>