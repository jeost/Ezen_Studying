<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		// <%! 선언부
		// <% 스크립트문
		// <%= 표현식
	%>
	<form action="3결과페이지.jsp"> <!-- form : 폼양식(데이터 입력받은거 전송) -->
		<input type="text" name="name"><br>
		<!-- input : 입력상자 -->
		배경색 : <select name="color">
			<option value="blue"> 파랑 </option>
			<option value="red"> 빨강 </option>
			<option value="orange"> 오렌지 </option>
			<option value="black"> 검정 </option>
			<option value="white"> 하양 </option>
		</select>
		반복횟수 : <input type="text" name="number"> <!-- 반복횟수 -->
		<input type="submit" value="전송">
		<!-- input type="submit" : 폼 양식 전송(action에 작성된 위치로) -->
	</form>
</body>
</html>