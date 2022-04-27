<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>main page</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
<link href="indexcss.css" rel="stylesheet">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.14.0/css/all.css">
</head>
<body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
	<div class="col-md-10 offset-2 fixed-top pb-1 pt-5 px-5">
	<div class="col-md-7 d-flex justify-content-end offset-5"> <!-- 상단 헤더 -->
		<ul class="nav">
			<li class="tophead"><a href="Login.jsp">LOGIN</a></li>
			<li class="tophead"><a href="#">JOIN</a></li>
			<li class="tophead"><a href="#">CART</a></li>
			<li class="tophead"><a href="#">MY PAGE</a></li>
			<li class="tophead"><a href="#">SNS</a></li>
			<li class="tophead"><a href="#">BOOKMARK</a></li>
		</ul>
	</div>
	</div> 
	<div class="row">
		<div class="container-fluid">
		<div class="col-md-2 sidemenu"> <!-- 왼쪽 사이드바 -->
		<h3>HUNS</h3>
			<ul>
				<li><a href="#">BEST</a></li>
				<li><a href="#">NEW</a></li>
				<li><a href="#">당일배송</a></li>
				<li><a href="#">1+1/코디세트</a></li>
			</ul>
			<ul>
				<li><a href="#">아우터</a></li>
				<li><a href="#">상의</a></li>
				<li><a href="#">셔츠</a></li>
				<li><a href="#">니트/가디건</a></li>
				<li><a href="#">팬츠</a></li>
				<li><a href="#">트레이닝</a></li>
				<li><a href="#">신발</a></li>
				<li><a href="#">악세사리</a></li>
				<li><a href="#">세일</a></li>
			</ul>
			<ul>
				<li><a href="#">NOTICE</a></li>
				<li><a href="#">Q&amp;A</a></li>
				<li><a href="#">REVIEW</a></li>
			</ul>
			<div>
				<input type="text"><i class="fas fa-search"></i>
			</div>
			<div>
			고객센터　070-7710-4745<br>
			<a href="#">카카오채널 @훈스</a><br>
			MON - FRI AM9 - PM4<br>
			(LUNCH TIME PM12:30 - PM13:30)<br>
			SAT, SUN, HOLIDAY CLOSE<br>
			업무시간외 문의는<br>
			Q＆A 게시판을 이용부탁드립니다.<br>
			우리은행 1111-111-111111<br>
			예금주 : (주)유엔미컴퍼니
			</div>
		</div> 
		</div>
		<div class="col-md-10 offset-2 content"> <!-- 본문 -->
			<div id="cei" class="carousel slide" data-bs-ride="carousel">
			  <div class="carousel-indicators">
			    <button type="button" data-bs-target="#cei" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
			    <button type="button" data-bs-target="#cei" data-bs-slide-to="1" aria-label="Slide 2"></button>
			    <button type="button" data-bs-target="#cei" data-bs-slide-to="2" aria-label="Slide 3"></button>
			  </div>
			  <div class="carousel-inner">
			    <div class="carousel-item active" data-bs-interval="5000">
			      <img src="img/bread1.png" class="d-block w-100" alt="">
			    </div>
			    <div class="carousel-item">
			      <img src="img/bread2.png" class="d-block w-100" alt="">
			    </div>
			    <div class="carousel-item">
			      <img src="img/bread3.png" class="d-block w-100" alt="">
			    </div>
			  </div>
			  <button class="carousel-control-prev" type="button" data-bs-target="#cei" data-bs-slide="prev">
			    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
			    <span class="visually-hidden">Previous</span>
			  </button>
			  <button class="carousel-control-next" type="button" data-bs-target="#cei" data-bs-slide="next">
			    <span class="carousel-control-next-icon" aria-hidden="true"></span>
			    <span class="visually-hidden">Next</span>
			  </button>
			</div>
			<div> <!-- 제품 -->
				<%for(int i=0; i<9; i++){ %>
				<div class="row no-gutters">
					<div class="col-md-4">
						<div>
						<img alt="" src="img/bread1.png"  width="100%">
						</div>
						<div>
							<div class="gt">
								제품이름 1
							</div>
							<div><b>10,000원</b><br>
								<span class="fg">제품옵션1</span>
							</div>
						</div>
					</div>
					<div class="col-md-4">
						<div>
						<img alt="" src="img/bread2.png"  width="100%">
						</div>
						<div>
							<div class="gt">
								제품이름 2
							</div>
							<div><b>20,000원</b><br>
								<span class="fg">제품옵션2</span>
							</div>
						</div>
					</div>
					<div class="col-md-4">
						<div>
						<img alt="" src="img/bread3.png"  width="100%">
						</div>
						<div>
							<div class="gt">
								제품이름 3
							</div>
							<div><b>30,000원</b><br>
								<span class="fg">제품옵션3</span>
							</div>
						</div>
					</div>
				</div>
				<%} %>
			</div>
			<div class="col-md-12 insta"> <!-- 인스타그램 -->
				<b>INSTAGRAM</b><br>
				<span class="fg">&#64;hunsgram</span>
			</div>
			<div class="row footer"> <!-- footer -->
				<div class="col-md-2">
				<span class="fg">S H O P &nbsp I N F O .</span><br>
				<a href="#">ABOUT US</a><br>
				<a href="#">AGREEMENT</a><br>
				<a href="#">PRIVACY POLICY</a><br>
				<a href="#">SHOPPING GUIDE</a>
				</div>
				<div class="col-md-3">
				<span class="fg">C U S T O M E R&nbsp  C E N T E R</span><br>
				<h4>070-7710-4745</h4><br>
				<h5><a href="#">카카오채널 : @훈스</a></h5><br>
				MON - FRI AM9 - PM4<br>
				(LUNCH TIME PM12:30 - PM13:30)<br>
				SAT, SUN, HOLIDAY CLOSE<br>
				업무시간외 문의는<br>
				Q＆A 게시판을 이용부탁드립니다.<br><br><br>
				B A N K    A C C O U N T<br><br>
				우리은행 1005-504-072722<br>
				예금주 : (주)유엔미컴퍼니
				</div>
				<div class="col-md-7">
				<span class="fg">C O M P A N Y &nbspI N F O</span><br>
				COMPANY : (주)유엔미컴퍼니 CEO : 유재갑 TEL : 070-7710-4745<br>
				BUSINESS NUMBER : 693-81-01950 / 2021-경기하남-0552 [사업자정보확인]<br>
				ADDRESS : 13024 경기도 하남시 하남대로 506 (하산곡동) 2층<br>
				ADMIN : 김미연 (youandme3800&#64;naver.com) HOSTING : (주)CAFE24<br>
				온라인 전자상거래 안전 서비스 [서비스가입사실확인]<br><br>
				<b>반품주소 / CJ대한통운(1588-1255)</b><br>
				CJ대한통운 반품주소 : 우편번호 05839) 서울시 송파구 충민로52 CJ대한통운 잠실유정대리점<br>
				타택배이용 반품주소 : 우편번호 12729) 경기도 광주시 초월읍 산수로 625-12 A동 3층<br>
				※타택배 이용시 로젠택배,롯데택배불가(반송될수 있습니다)※<br><br>
				<b>Copyright  (주)유엔미컴퍼니. All rights reserved. by uniqq.</b><br>
				</div>
			</div>
		</div>
	</div>
</body>
</html>