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
		
			<a href="#" class="navbar-brand">로고</a>
			<!-- 메뉴 사이즈 작아지는 경우 -->
			<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
			data-ba-target="#menu" aria-controls="navbarcontents" aria-expanded="false" aria-label="Toggle navi">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="menu">
			
			<ul class="navbar-nav">
				<li class="nav-item"><a href="#">메뉴1 </a></li>
				<li class="nav-item"><a href="#">메뉴2 </a></li>
				<li class="nav-item"><a href="#">메뉴3 </a></li>
				<li class="nav-item dropdown"> <!-- 드롭다운 메뉴 -->
					<!-- 하단 텍스트를 클릭했을때 메뉴 펼치기 -->
					<a href="#" class="nav-link dropdown-toggle"
					data-bs-toggle="dropdown" id="navdrop">드롭다운</a>
					<div class="dropdown-menu" aria-labelledby="navdrop">
						<a class="dropdown-item" href="#">드롭다운 메뉴1</a>
						<a class="dropdown-item" href="#">드롭다운 메뉴2</a>
						<a class="dropdown-item" href="#">드롭다운 메뉴3</a>
					</div>
				</li>
			</ul>
			<form action="">
				<div class="row">
					<div class="col-md-6">
				<input type="text" class="form-control" placeholder="검색어">
					</div>
					<div class="col-md-2">
				<button class="btn btn-info" type="submit">검색</button>
					</div>
				</div>
			</form>
		</div>
		</div>
	</div>
	
</body>
</html>