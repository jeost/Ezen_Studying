<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
	<style type="text/css">
		*{border:1px solid aqua;}
	</style>
</head>
<body>
	<%@include file="1start.jsp" %>
	
	<div class="row">
		<div class="col-md-1">.col-md-1</div>
		<div class="col-md-1">.col-md-1</div>
		<div class="col-md-1">.col-md-1</div>
		<div class="col-md-1">.col-md-1</div>
		<div class="col-md-1">.col-md-1</div>
		<div class="col-md-1">.col-md-1</div>
		<div class="col-md-1">.col-md-1</div>
		<div class="col-md-1">.col-md-1</div>
		<div class="col-md-1">.col-md-1</div>
		<div class="col-md-1">.col-md-1</div>
		<div class="col-md-1">.col-md-1</div>
		<div class="col-md-1">.col-md-1</div>
		<div class="col-md-1">.col-md-1</div>
	</div>
	<div class="row">
		<div class="col-md-8">.col-md-8</div>
		<div class="col-md-4">.col-md-4</div>
	</div>
	
	<div class="row">
		<div class="col-md-4">.col-md-4</div>
		<div class="col-md-4">.col-md-4</div>
		<div class="col-md-4">.col-md-4</div>
	</div>
	
	<div class="container">
		<div class="row">
			<div class="col-md-8">
				<div class="col-md-4">
					외부 8 그리드 중 4 그리드 사용 
				</div>
				<div class="col-md-8">
					외부 8 그리드 중 8 그리드 사용
				</div>
			</div>
				
			<div class="col-md-4">
				<div class="col-md-6">6 사용</div>
				<div class="col-md-6">6 사용</div>
			</div>
		</div>
	</div>
	
	<div class="container">
		<div class="row">
			<div class="col-md-5">col-md-5</div>
			<div class="col-md-5 offset-md-2">col-md-5</div>
		</div>
		<div class="row">
			<div class="col-md-4">col-md-4</div>
			<div class="col-md-7 offset-md-1">col-md-7</div>
		</div>
	</div>
	
	<div class="container">
		<div class="row">
			<div class="col-md-5">5</div>
			<div class="col-md-8">8</div>
		</div>
	</div>
</body>
</html>