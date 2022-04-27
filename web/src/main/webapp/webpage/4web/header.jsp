<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
	<!-- 부트스트랩 css 포함 -->
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" >
	<!-- 사용자 정의 css 포함 -->
	<link href="css/maincss.css" rel="stylesheet">
	<!-- 폰트어썸(아이콘) -->
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.14.0/css/all.css">
</head>
<body>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
	<div class="fixed-top bg-white">
	<div class="container">
		<div class="py-3"> <!-- 상단 메뉴 -->
				<!-- p : 안쪽 여백 py-n : 위아래 안쪽 여백
					m : 바깥 여백 my-n : 위아래 바깥 여백 -->
			<div class="row"> <!-- 가로 배치 -->
				<div class="col-md-4 offset-4 text-center"> <!-- 로고 -->
										<!-- 박스권 내 내용물 가운데 정렬 -->
					<a href="main.jsp" class="header_logo">로고</a>
				</div>
				<div class="col-md-4 d-flex justify-content-end"> <!-- 상단 메뉴 -->
					<ul class="nav"> <!-- 가로배치 -->
						<li><a href="#">로그인</a>|</li>
						<li><a href="#">회원가입</a>|</li>
						<li><a href="#">장바구니</a></li>
					</ul>
				</div>
			</div>
		</div>
		<div class="navbar navbar-expand-md navbar-light bg-white"> <!-- 본 메뉴 -->
			<button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#nc" aria-controls="navbarText" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
			<div class="collapse navbar-collapse" id="nc">
			<ul class="navbar-nav col-md-12 justify-content-between">
				<li class="nav-item"><a href="#" class="nav-link">1</a></li>
				<li class="nav-item"><a href="#" class="nav-link">2</a></li>
				<li class="nav-item"><a href="#" class="nav-link">3</a></li>
				<li class="nav-item"><a href="#" class="nav-link">4</a></li>
				<li class="nav-item"><a href="#" class="nav-link">5</a></li>
				<li class="nav-item"><a href="#" class="nav-link">6</a></li>
				<li class="nav-item"><a href="#" class="nav-link">7</a></li>
				<li class="nav-item"><a href="#" class="nav-link">8</a></li>
				<li class="nav-item"><a href="#" class="nav-link">9</a></li>
				<li class="nav-item"><a href="#" class="nav-link">10</a></li>
				<li class="nav-item"><a href="#" class="nav-link">고객센터</a></li>
				<li class="nav-item"><a href="#" class="nav-link"><i class="fas fa-search"></i></a> </li>
			</ul>
			</div>
		</div>
	</div>
	</div>
</body>
</html>