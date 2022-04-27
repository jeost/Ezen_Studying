<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%@include file="header.jsp" %>
	<br><br><br><br><br>
	<div class="container">
		<h3>고객센터</h3>
			<div class="col-md-5 offset-7 row g-0 my-4">
				<div class="col-md-3">
					<select class="form-select">
						<option>키워드</option>
						<option>번호</option>
						<option>제목</option>
						<option>작성자</option>
					</select>
				</div>
				<div class="col-md-6">
					<input type="text" class="form-control">
				</div>
				<div class="col-md-3">
					<button class="form-control">검색</button>
				</div>
			</div>
		<table class="table table-hover text-center">
			<tr>
				<th>번호</th><th>제목</th><th>작성일</th><th>처리여부</th>
			</tr>
			<tr>
				<td>1</td><td><a href="boardview.jsp">제목0</a></td><td>04/25</td><td>처리완료</td>
			</tr>
			<tr>
				<td>2</td><td>제목1</td><td>04/26</td><td>처리완료</td>
			</tr>
			<tr>
				<td>3</td><td>제목2</td><td>04/27</td><td>처리완료</td>
			</tr>
			<tr>
				<td>4</td><td>제목3</td><td>04/28</td><td>처리완료</td>
			</tr>
		</table>
	<div class="row">
		<div class="col-md-4 offset-4 my-3">
			<ul class="pagination">
				<li class="page-item"><a class="page-link" href="#">이전</a></li>
				<li class="page-item"><a class="page-link" href="#">1</a></li>
				<li class="page-item"><a class="page-link" href="#">2</a></li>
				<li class="page-item"><a class="page-link" href="#">3</a></li>
				<li class="page-item"><a class="page-link" href="#">4</a></li>
				<li class="page-item"><a class="page-link" href="#">5</a></li>
			</ul>
		</div>
		<div class="col-md-2 offset-2 my-3">
			<button class="form-control">문의하기</button>
		</div>
	</div>
	</div>
<%@include file="footer.jsp" %>
</body>
</html>