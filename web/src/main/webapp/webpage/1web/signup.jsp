<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
	<style type="text/css">
	contents{margin:100px 0px;}
	h3{text-align: center;}
	li{list-style-type: none;}
	
	table{
		border-bottom: solid 2px gray;
		border-top: solid 2px gray;
		padding:25px;
		width:600px;
		margin:0 auto;
		}
		h3{
		text-align: center;
		}
		.b{
		float:right;
		margin:20px;
		padding: 10px;
		}
		.hi{
		vertical-align: top;
		}
	</style>
</head>
<body>
	<%@include file="header.jsp" %> <!-- jsp문법 : 속성 태그 [자바 사용가능] -->
	<%@include file="main.jsp" %>
	<div id="contents">
	<h3>회원 가입 폼</h3>
		<table>
<tr><td>아이디</td><td><input type="text"> </td></tr>
<tr><td>비밀번호</td><td><input type="password"> </td></tr>
<tr><td>비밀번호 확인</td><td><input type="password"> </td></tr>
<tr><td>이름</td><td><input type="text"> </td></tr>
<tr><td>이메일</td><td><input type="text">@<select>
			<option> 직접입력 </option>
 			<option> naver.com </option>
 			<option> daum.com </option></select> </td></tr>
<tr><td>이메일 수신</td><td><input type="radio" name="a" checked="checked"> 비수신<input type="radio" name="a"> 수신</td></tr>
<tr><td>가입 경로</td><td><input type="checkbox">친구추천<input type="checkbox">인터넷검색<input type="checkbox" checked="checked">기타</td>
<tr><td class="hi">인사말</td><td><textarea rows="10" cols="50"></textarea></td>
		</table>
	</div>
	<span class="b"><input type="submit" value="저장하기"> <input type="reset" value="취소하기"> </span>
	
	<%@include file="footer.jsp" %>
</body>
</html>