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
	<%@include file="header.jsp" %> <!-- jsp���� : �Ӽ� �±� [�ڹ� ��밡��] -->
	<%@include file="main.jsp" %>
	<div id="contents">
	<h3>�α���</h3>
	<table>
		<tr><td>���̵�</td><td><input type="text"></td><td rowspan="2"><button>�α���</button></td></tr>
 	<tr><td>��й�ȣ</td><td id="bt"><input type="password"></td>
	</table>
	</div>
	<%@include file="footer.jsp" %>
</body>
</html>