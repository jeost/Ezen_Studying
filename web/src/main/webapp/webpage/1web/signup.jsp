<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
	<style type="text/css">
	contents{margin:100px 0px;}
	h3{text-align: center;}
	li{list-style-type: none;}
	
	table{
		border-bottom: solid 2px gray;
		border-top: solid 2px gray;
		padding:25px;
		width:600px;
		margin:0 auto;
		}
		h3{
		text-align: center;
		}
		.b{
		float:right;
		margin:20px;
		padding: 10px;
		}
		.hi{
		vertical-align: top;
		}
	</style>
</head>
<body>
	<%@include file="header.jsp" %> <!-- jsp���� : �Ӽ� �±� [�ڹ� ��밡��] -->
	<%@include file="main.jsp" %>
	<div id="contents">
	<h3>ȸ�� ���� ��</h3>
		<table>
<tr><td>���̵�</td><td><input type="text"> </td></tr>
<tr><td>��й�ȣ</td><td><input type="password"> </td></tr>
<tr><td>��й�ȣ Ȯ��</td><td><input type="password"> </td></tr>
<tr><td>�̸�</td><td><input type="text"> </td></tr>
<tr><td>�̸���</td><td><input type="text">@<select>
			<option> �����Է� </option>
 			<option> naver.com </option>
 			<option> daum.com </option></select> </td></tr>
<tr><td>�̸��� ����</td><td><input type="radio" name="a" checked="checked"> �����<input type="radio" name="a"> ����</td></tr>
<tr><td>���� ���</td><td><input type="checkbox">ģ����õ<input type="checkbox">���ͳݰ˻�<input type="checkbox" checked="checked">��Ÿ</td>
<tr><td class="hi">�λ縻</td><td><textarea rows="10" cols="50"></textarea></td>
		</table>
	</div>
	<span class="b"><input type="submit" value="�����ϱ�"> <input type="reset" value="����ϱ�"> </span>
	
	<%@include file="footer.jsp" %>
</body>
</html>