<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
	<style type="text/css">
	h2{text-align:center;}
	table{margin:0px auto; border-top: solid 1px #dddddd; border-bottom: solid 1px #dddddd;}
	th{text-align: center; padding: 10px 40px;}
	td{padding:10px 30px; border-top:solid 1px #dddddd;}
	f{background-color: navy;}
	#search input{
		width: 450px;
		height: 40px; 
		}
	#search button {
		width: 100px;
		height: 40px;
		background-color: #555555;
		color: white;
	}
	#search{ width:550px; margin:0px auto; padding-bottom: 30px;}
	</style>
</head>
<body>
	<%@include file="header.jsp" %> <!-- jsp���� : �Ӽ� �±� [�ڹ� ��밡��] -->
	<%@include file="main.jsp" %>
	<div id="contents">
		<h2>��������</h2>
		<div id="search">
			<form id="f">
				<input type="text" placeholder="�˻�� �Է����ּ���.">
				<button style="height:30px; width:70px; background-color: gray; color:white;">�˻�</button>
			</form>
		</div>
		<div>
			<table>
				<tr><th>��ȣ</th><th>����</th><th>�����</th></tr>
				<tr id="t"><td align="center">3</td><td>[��������]�������� ó����ħ ����ȳ�</td><td>2017.07.13</td>
				<tr id="t"><td align="center">2</td><td>�������� �ȳ��Դϴ�. �̿����ּż� �����մϴ�.</td><td>2017.06.15</td>
				<tr id="t"><td align="center">1</td><td>�������� �ȳ��Դϴ�. �̿����ּż� �����մϴ�.</td><td>2017.06.15</td>
			</table>
		</div>
	</div>
	<%@include file="footer.jsp" %>
</body>
</html>