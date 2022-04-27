<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
	<style type="text/css">
	#contents{ margin: 100px 0px; }
		table{ width: 350px; margin: 0px auto; }
		input { height: 25px; }
		button { padding: 22px 20px; }
		h3{ text-align: center; }
	</style>
</head>
<body>
	<%@include file="header.jsp" %> <!-- jsp문법 : 속성 태그 [자바 사용가능] -->
	<%@include file="main.jsp" %>
	<div id="contents">
	<h3>로그인</h3>
	<table>
		<tr><td>아이디</td><td><input type="text"></td><td rowspan="2"><button>로그인</button></td></tr>
 	<tr><td>비밀번호</td><td id="bt"><input type="password"></td>
	</table>
	</div>
	<%@include file="footer.jsp" %>
</body>
</html>