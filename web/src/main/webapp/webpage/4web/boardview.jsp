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
		<h3 class="text-center titleline">문의 글</h3>
		
		<!-- 상단 버튼 -->
		<div>
			<a href="boardlist.jsp"><button class="btn btn-outline-info">목록</button></a>
			<a href="boardlist.jsp"><button class="btn btn-outline-info">삭제</button></a>	<!-- 작성자만 가능 -->
			<a href="boardlist.jsp"><button class="btn btn-outline-info">수정</button></a> <!-- 작성자만 가능 -->
			<a href="boardlist.jsp"><button class="btn btn-outline-info">답변</button></a> <!-- 관리자만 가능 -->
		</div>
		<!-- 작성자가 입력한 내용 -->
		<div>
			<div><span>작성자</span> <span>작성자이름</span></div>
			<div><span>문의날짜</span> <span>04/25</span></div>
		</div>
		<div>
			<input type="text" value="제목을 입력해주세요" class="questtitle">
		</div>
		<div>
			<textarea rows="20" cols="" class="form-control" readonly style="resize: none;">작성자 입력 내용</textarea>
		</div>																<!-- textarea 크기 고정 -->
		<div class="row my-4">
			<h4>첨부 사진</h4>
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
		<!-- 관리자가 입력한 내용 -->
		<h4>답변</h4>
		<p>답변일:04/25</p>
		<div>
			<textarea rows="" cols="" class="form-control" readonly style="resize: none;">관리자 답변 내용</textarea>
		</div>
	</div>
	<br><br><br><br><br><br>
	<%@include file="footer.jsp" %>
</body>
</html>