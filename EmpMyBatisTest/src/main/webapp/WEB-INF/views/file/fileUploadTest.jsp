<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>file upload</title>
</head>
<body>
<form action="fileUploadProc" method="post" enctype="multipart/form-data">
제목: <input type="text" name="title" /><br>
파일: <input type="file" name="file" /><br>
<input type="submit" value="upload" />
</form>
</body>
</html>