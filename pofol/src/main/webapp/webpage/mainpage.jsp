<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>KRVtuberDEX</title>
</head>
<body>

	<%@include file="navbar.jsp" %>	
	<%@include file="topbar.jsp" %>
		<div class="container"> <!-- 메인 [생방송 목록 출력] -->
			<iframe
			    src="https://player.twitch.tv/?channel=lolminyeo&parent=http://192.168.17.147:8080&autoplay=false"
			    height="370"
			    width="260">
				</iframe>
			<%for(int i=1; i<9; i++) {%>
			테스트
				<%
				if(i%4==0){ %><br>
			<%} 
			}%>
		</div>
</body>
</html>