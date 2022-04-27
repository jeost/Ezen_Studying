<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
	<!-- ��Ʈ��Ʈ�� css ���� -->
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" >
	<!-- ����� ���� css ���� -->
	<link href="css/maincss.css" rel="stylesheet">
</head>
<body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
	<!-- ���� ��ġ�� �ٸ� ���� �����ϱ� -->
	<%@include file="header.jsp" %>
	<br><br><br><br><br><br>
	<div id="cs" class="carousel slide" data-bs-ride="carousel" data-bs-interval="2000">
		<div class="carousel-indicators">
			<button data-bs-target="#cs" data-bs-slide-to="0" class="active"></button>
			<button data-bs-target="#cs" data-bs-slide-to="1" class="active"></button>
			<button data-bs-target="#cs" data-bs-slide-to="2" class="active"></button>
			<button data-bs-target="#cs" data-bs-slide-to="3" class="active"></button>
		</div>
		<div class="carousel-inner">
			<div class="carousel-item active"><img alt="" src="img/bread1.png"> </div>
			<div class="carousel-item"><img alt="" src="img/bread2.png"></div>
			<div class="carousel-item"><img alt="" src="img/bread3.png"></div>
			<div class="carousel-item"><img alt="" src="img/bread4.png"></div>
		</div>
		<!-- �̹��� �̵� ��ư -->
		<button class="carousel-control-prev" data-bs-target="cs" data-bs-slide="prev">
			<span class="carousel-control-prev-icon"></span>
		</button>
		<button class="carousel-control-next" data-bs-target="cs" data-bs-slide="next">
			<span class="carousel-control-next-icon"></span>
		</button>
	</div> <!-- carousel end -->
	<br><br>
	<div class="container">
		<hr> <!-- �Ǽ� (���п�) -->
			<h3>New ARRIVAL</h3>
			<p>�Ż�ǰ</p>
	</div>
	<div class="container">
		<div class="row">
			<%for(int i=0; i<8; i++){ %>
			<div class="col-md-3">
				<div class="card"> <!-- ī������ -->
					<img class="card-img-top" alt="" src="img/logo.png">
					<div class="card-body">
						<p class="item">
							<span class="title">���� ����</span>
							<span class="content">xptmxm �׽�Ʈ test</span>
							<br>
							<span class="price1">12,345��</span> <span class="price2">11,111</span>
							<br>
							<span class="badge bg-warning text-dark my-3">���ؽ�</span>
							<span class="badge bg-dange text-dark my-3">������</span> 
						</p>
					</div>
				</div>
			</div>
			<%} %>
		</div>
	</div>
	<%@include file="footer.jsp" %>
</body>
</html>