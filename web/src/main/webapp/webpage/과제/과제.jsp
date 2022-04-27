<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
	<link href="css.css" rel="stylesheet">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-6 left">
				<div class=header>
					<h5>회원가입 및 정상적인 서비스 이용을 위해 아래 약관을 읽어 보시고,<br>동의 여부를 결정해 주세요</h5>
					필수 약관을 동의 하셔야 회원가입이 가능합니다.
				</div>
				<div>
					<div class="title">회원가입 약관동의<span style="color :red">*</span></div>
					<div class="content"><textarea rows="8" cols="" style="width:100%;"> 제1장 총칙
					제1조(목적)
					본 약관은 영화사이트가 운영하는 웹 사이트(Spring Cinema)의 제반서비스의 이용조건 및 절차에 관한 사항 및 기타 필요한 사항을 규정함을 목적으로 한다.
					제2조(용어의 정의)
					본 약관에서 사용하는 용어는 다음과 같이 정의한다.</textarea>
					</div>
					<div>
						<input type="checkbox">회원가입 약관 동의 합니다.
					</div>
				</div>
				<div>
					<div class="title">개인정보처리방침<span style="color :red">*</span></div>
					<div class="content"><textarea rows="8" cols="" style="width:100%;">제1장 총칙
					
					제1조(목적)이 지침은 「개인정보 보호법」(이하 "법"이라 한다)제12조제1항에 따른 개인정보의 처리에 관한 기준, 개인정보 침해의 유형 및 예방조치 등에 관한 세부적인 사항을 규정함을 목적으로 한다.
					제2조(용어의 정의) 이 지침에서 사용하는 용어의 뜻은 다음과 같다.
					1."개인정보 처리"란 개인정보를 수집,생성,연계,연동,기록,저장,보유,가공,편집,검색,출력,정정(訂正),복구,이용,제공,공개,파기(破棄)</textarea>
					</div>
					<div>
						<input type="checkbox">개인정보처리방침 동의 합니다.
					</div>
				</div>
			</div>
			<div class="col-md-6 right">
				<div class="form-control form-control-lg mb-3">
					<input type="text" placeholder="아이디를 입력하세요.*" style="width:100%;">
				</div>
				<div class="form-control form-control-lg mb-3">
					<input type="password" placeholder="비밀번호를 입력하세요.*" style="width:100%;">
				</div>
				<div class="form-control form-control-lg mb-3">
					<input type="password" placeholder="한번더 비밀번호를 입력하세요.*" style="width:100%;">
				</div>
				<div class="form-control form-control-lg mb-3">
					<input type="text" placeholder="이름을 입력하세요.*" style="width:100%;">
				</div>
				<div class="text-center ir">
					<input type="radio" name="g">남자<input type="radio" name="g">여자
				</div>
				<div class="form-control form-control-lg mb-3">
					<input type="text" placeholder="연락처를 입력하세요.*" style="width:100%;">
				</div>
				<div class="form-control form-control-lg mb-3">
					<input type="email" placeholder="이메일을 입력하세요.*" style="width:100%;">
				</div>
				<div class="form-control form-control-lg mb-3">
					<input type="text" placeholder="나이를 입력하세요.*" style="width:100%;">
				</div>
				<div class="row">
					<div class="col-md-4"> <h3>주소<span style="color :red">*</span></h3> </div>
					<div class="col-md-4"><input class="form-control mb-2" type="text" placeholder="우편번호"></div>
					<div class="col-md-4"><button class="form-control mb-2"> 우편번호 찾기 </button></div>
				</div>
				<div class="row">
					<div class="col-md-4 offset-4"><input class="form-control mb-2" type="text" placeholder="도로명주소"></div>
					<div class="col-md-4"><input class="form-control mb-2" type="text" placeholder="지번주소"></div>
				</div>
				<div class="row">
					<div class="col-md-8 offset-4"><input class="form-control mb-2" type="text" placeholder="상세주소"></div>
				</div>
				<div class="ir">
					<button style="width: 100%">회원가입</button>
				</div>
			</div>
		</div>
	</div>
</body>
</html>