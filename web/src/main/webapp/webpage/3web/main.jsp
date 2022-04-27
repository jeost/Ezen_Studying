<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
	<style type="text/css">
		#main{width:1100px; margin: auto;}
		#upper{height:150px;}
		#downer{height:350px;}
		#up1{float:left; margin-left: 30px;}
		#up2{float:right; margin-right: 30px;}
		#up1 ,#up2{width:450px; margin-left: 20px; margin-top: 20px;}
		.icon{float:left;}
		#text{margin:7px;}
		#downer{float:left;}
		#downer .i{float:left;}
		#downer img{width:250px; height:250px;}
	</style>
</head>
<body>
	<div id="main">
	<div id = "upper">
		<div id="up1"> <!-- 좌상단박스 -->
			<div class="icon">
				<img alt="" src="img/icon1.png">
			</div>
			<div id="text">
				<div>
					<h3>예약 안내</h3>
				</div>
				<div>
					스튜디오 대여는 사전에 인터넷 예약을 하셔야 합니다. 예약은 1일 이전까지 가능합니다.
				</div>
			</div>
		</div>
		<div id="up2"> <!-- 우상단박스 -->
			<div class="icon">
				<img alt="" src="img/icon2.png">
			</div>
			<div id="text">
				<div>
					<h3>포토 갤러리</h3>
				</div>
				<div>
					취업 사진, 가족 사진, 프로필 사진, 우정 사진 등 개인 또는 단체가 이용할 수 있습니다. 
				</div>
			</div>
		</div>
	</div>
	<div id="downer"> <!-- 하단 -->
		<ul class="i">
			<li>
				<img alt="" src="img/image1.jpg">
			</li>
			<li><h3>촬영 스튜디오</h3></li>
			<li>카메라, 조명 등 촬영 장비 완비</li>
		</ul>
		<ul class="i">
			<li>
				<img alt="" src="img/image2.jpg">
			</li>
			<li><h3>촬영 스튜디오</h3></li>
			<li>카메라, 조명 등 촬영 장비 완비</li>
		</ul>
		<ul class="i">
			<li>
				<img alt="" src="img/image3.jpg">
			</li>
			<li><h3>촬영 스튜디오</h3></li>
			<li>카메라, 조명 등 촬영 장비 완비</li>
		</ul>
		<ul class="i">
			<li>
				<img alt="" src="img/image4.jpg">
			</li>
			<li><h3>촬영 스튜디오</h3></li>
			<li>카메라, 조명 등 촬영 장비 완비</li>
		</ul>
	</div>
	</div>
</body>
</html>