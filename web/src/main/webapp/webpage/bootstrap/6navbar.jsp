<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%@include file="1start.jsp" %>
	<div class="container">
		<div class="navbar navbar-expand-md navbar-light">
		
			<a href="#" class="navbar-brand">�ΰ�</a>
			<!-- �޴� ������ �۾����� ��� -->
			<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
			data-ba-target="#menu" aria-controls="navbarcontents" aria-expanded="false" aria-label="Toggle navi">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="menu">
			
			<ul class="navbar-nav">
				<li class="nav-item"><a href="#">�޴�1 </a></li>
				<li class="nav-item"><a href="#">�޴�2 </a></li>
				<li class="nav-item"><a href="#">�޴�3 </a></li>
				<li class="nav-item dropdown"> <!-- ��Ӵٿ� �޴� -->
					<!-- �ϴ� �ؽ�Ʈ�� Ŭ�������� �޴� ��ġ�� -->
					<a href="#" class="nav-link dropdown-toggle"
					data-bs-toggle="dropdown" id="navdrop">��Ӵٿ�</a>
					<div class="dropdown-menu" aria-labelledby="navdrop">
						<a class="dropdown-item" href="#">��Ӵٿ� �޴�1</a>
						<a class="dropdown-item" href="#">��Ӵٿ� �޴�2</a>
						<a class="dropdown-item" href="#">��Ӵٿ� �޴�3</a>
					</div>
				</li>
			</ul>
			<form action="">
				<div class="row">
					<div class="col-md-6">
				<input type="text" class="form-control" placeholder="�˻���">
					</div>
					<div class="col-md-2">
				<button class="btn btn-info" type="submit">�˻�</button>
					</div>
				</div>
			</form>
		</div>
		</div>
	</div>
	
</body>
</html>