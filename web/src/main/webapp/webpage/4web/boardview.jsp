<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<link href="css/maincss.css" rel="stylesheet">
</head>
<body>
	<%@include file="header.jsp" %>
	<br><br><br><br><br><br>
	<div class="container">
		<h3 class="text-center titleline">���� ��</h3>
		
		<!-- ��� ��ư -->
		<div>
			<a href="boardlist.jsp"><button class="btn btn-outline-info">���</button></a>
			<a href="boardlist.jsp"><button class="btn btn-outline-info">����</button></a>	<!-- �ۼ��ڸ� ���� -->
			<a href="boardlist.jsp"><button class="btn btn-outline-info">����</button></a> <!-- �ۼ��ڸ� ���� -->
			<a href="boardlist.jsp"><button class="btn btn-outline-info">�亯</button></a> <!-- �����ڸ� ���� -->
		</div>
		<!-- �ۼ��ڰ� �Է��� ���� -->
		<div>
			<div><span>�ۼ���</span> <span>�ۼ����̸�</span></div>
			<div><span>���ǳ�¥</span> <span>04/25</span></div>
		</div>
		<div>
			<input type="text" value="������ �Է����ּ���" class="questtitle">
		</div>
		<div>
			<textarea rows="20" cols="" class="form-control" readonly style="resize: none;">�ۼ��� �Է� ����</textarea>
		</div>																<!-- textarea ũ�� ���� -->
		<div class="row my-4">
			<h4>÷�� ����</h4>
			<div class="col-md-3">
				<img alt="" src="img/bread4.png" width="100%">
			</div>
			<div class="col-md-3">
				<img alt="" src="img/bread3.png" width="100%">
			</div>
			<div class="col-md-3">
				<img alt="" src="img/bread2.png" width="100%">
			</div>
			<div class="col-md-3">
				<img alt="" src="img/bread1.png" width="100%">
			</div>
		</div>
		<!-- �����ڰ� �Է��� ���� -->
		<h4>�亯</h4>
		<p>�亯��:04/25</p>
		<div>
			<textarea rows="" cols="" class="form-control" readonly style="resize: none;">������ �亯 ����</textarea>
		</div>
	</div>
	<br><br><br><br><br><br>
	<%@include file="footer.jsp" %>
</body>
</html>