<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- jsp : html과 java를 동시에 작성하는 파일 -->
		<!-- html : <마크업> / java -->
	<h3> 선언문 태그 : 메모리할당[변수 생성, 객체 생성, 메소드 실행x 선언o] </h3>
	<h3>스크립트 태그 : 자바실행문[변수 생성, 객체 생성, 메소드 실행o 선언x]</h3>
	<h3>표현식 태그 : 메모리호출 [java에서 html로 출력]</h3>
		<p>html에서 작성된 코드</p>
		<%!
			int 변수1 = 10;
			Date date1 = new Date();
			//느낌표 있으면 선언문, 메소드 선언 x
			//System.out.println("jsp파일에서 작성된 코드1");
			int 함수1(){return 3;}
			class 클래스1{
				String 필드1="엄";
			}
			클래스1 객체1 = new 클래스1(); // 사용자 정의 클래스의 객체 생성 o
		%>
		<%
			int 변수2 = 20;
			Date date2 = new Date(); // 객체 선언 가능
			// 자바 언어가 작성되는 위치 (스크립트 태그, 변수선언도 가능)
			System.out.println("jsp파일에서 작성된 변수"+변수2);
			System.out.println("jsp파일에서 생성된 객체"+date2);
			//int 함수2(){return 3;}
			class 클래스2{
				String 필드2="엄";
			}
			클래스2 객체2 = new 클래스2(); // 사용자 정의 클래스의 객체 생성 o
		%>
		
		<!-- html 구역 -->
		선언문의 변수 : <%=변수1 %><br>
		선언문의 객체 : <%=date1 %><br>
		선언문의 함수 : <%=함수1() %><br>
		선언문의 사용자 정의 클래스 객체 : <%=객체1.필드1 %><br>
		
		스크립트문의 변수 : <%=변수2 %><br>
		스크립트문의 객체 : <%=date2 %><br>
		스크립트문의 사용자 정의 클래스 객체 : <%=객체2.필드2 %><br>
</body>
</html>