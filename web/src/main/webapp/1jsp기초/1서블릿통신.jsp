<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>서블릿 통신</h3>
	<form action="test1" method="get">
	
		<input type="text" name="id">
		<input type="submit" value="전송1">
	</form>
	<h3>jsp 통신</h3>
	<form action="test1.jsp" method="get">
		<input type="text" name="id">
		<input type="submit" value="전송2">
	</form>
</body>
</html>