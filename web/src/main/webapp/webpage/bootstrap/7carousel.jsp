/*<%@ page language="java" contentType="text/html; charset=EUC-KR"*/
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
	<style type="text/css">
		.carousel-item{
			width:100%;
			height:100%;
		}
	</style>
</head>
<body>
	<%@include file="1start.jsp" %>
	<div class="container">
	<div id="cs" class="carousel slide" data-bs-ride="carousel" data-bs-interval="2500">
	
	<!-- 캐러셀 [내용 위치] 하단 버튼 : 인디케이터 -->
	<div class="carousel-indicators">
		<button type="button" data-bs-target="#cs" data-bs-slide-to="0" class="active"></button>
		<button type="button" data-bs-target="#cs" data-bs-slide-to="1"></button>
		<button type="button" data-bs-target="#cs" data-bs-slide-to="2"></button>
		<button type="button" data-bs-target="#cs" data-bs-slide-to="3"></button>
	</div>
		<div class="carousel-inner">
			<div class="carousel-item active">
				<img alt="" src="../3web/img/photo5.jpg">
			</div>
			<div class="carousel-item">
				<img alt="" src="../3web/img/photo4.jpg">
			</div>
			<div class="carousel-item">
				<img alt="" src="../3web/img/photo3.jpg">
			</div>
			<div class="carousel-item">
				<img alt="" src="../3web/img/photo2.jpg">
			</div>
			
			<!-- 캐러셀 이동 버튼 -->
			<button type="button" class="carousel-control-prev" data-bs-target="#cs" data-bs-slide="prev">
				<span class="carousel-control-prev-icon"></span>
			</button>
			<button type="button" class="carousel-control-next" data-bs-target="#cs" data-bs-slide="next">
				<span class="carousel-control-next-icon"></span>
			</button>
		</div>
	</div>
	</div>
</body>
</html>