<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% // java
			//폼이 전송하기 전에 요청 불가[null]
					
		Calendar calendar = Calendar.getInstance();
		int year=2022; int month=4;
		if((request.getParameter("year")!=null) && (request.getParameter("month")!=null)){
			//요청 변수가 있을경우에만 실행
		year=Integer.parseInt(request.getParameter("year"));
		month=Integer.parseInt(request.getParameter("month"));}
		
		calendar.set(year, month-1, 1); // 0부터 1월이라서
		int sweek= calendar.get(Calendar.DAY_OF_WEEK);// 해당 월의 시작 요일 구하기
		int eday = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);// 해당 월의 마지막 일 구하기
		
	%>
	<!-- html -->
	
	<form action="4달력.jsp" method="get">
		<input type="text" name="year" placeholder="연도">
		<input type="text" name="month" placeholder="월">
		<input type="submit" value="검색">
	</form>
	<p>입력한 연도 : <%=year %></p>
	<p>입력한 월 : <%=month %></p>
	<form action="4달력.jsp" method="get">
		<input type="text" name="year" value="<%=year %>" >
		<input type="text" name="month" value="<%=month-1 %>" >
		<input type="submit" value="이전달">
		</form><form action="4달력.jsp" method="get">
		<input type="text" name="year" value="<%=year %>" >
		<input type="text" name="month" value="<%=month+1 %>" >
		<input type="submit" value="다음달">
		</form>
	<table>
		<tr>
			<th>일요일</th>
			<th>월요일</th>
			<th>화요일</th>
			<th>수요일</th>
			<th>목요일</th>
			<th>금요일</th>
			<th>토요일</th>
		</tr>
		<tr> <!-- 시작 요일 미만은 공백넣기 -->
			<%for(int i=1; i<sweek; i++){ %>
			<td> </td>
			<%} %>
			<!-- 1일부터 마지막일까지 1씩 증가하며 출력 -->
			<%for(int i=1; i<=eday; i++){ %>
				<td><%=i %></td>
				<!-- 토요일마다 줄바꿈 -->
				<%if(sweek%7==0){ %>
					</tr><tr>
				<%} sweek++;
			} %>
		</tr>
	</table>
</body>
</html>