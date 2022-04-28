<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <!-- 
    	전 페이지로부터 request(요청)
    	String 이름 = request.getParameter("요청할 변수의 name값")
     -->
     <%
     	//스크립트문 = 자바 언어를 작성하고 실행할 수 있는 공간
     	String 이름 = request.getParameter("name");
     	String 색상 = request.getParameter("color");
     	//제어문
     	boolean 엄준식=false;
     	if(이름.equals("엄준식")){
     			엄준식=true;
     	}
     	int 반복횟수 = Integer.parseInt(request.getParameter("number"));
     %>
     <html>
     	<body style="background-color: <%=색상%>">
     		작성한 이름 : <%=이름 %><br>
     		선택한 색상 : <%=색상 %><br>
     		<!-- 제어문 -->
     		<% // 자바 시작
     			if(엄준식){
     			// 자바 끝	%> 
     				<div>엄준식임</div>
     				<% // 자바 시작
     			}
     	// 자바 끝	%>
     	<!-- 반복문 -->
     	<%
     		for(int i=0; i<반복횟수; i++){
     			%>
     			<span>*</span>
     			<%
     		}
     	%><br>
     	<%
     		for(int i=0; i<반복횟수; i++){
     			for(int b=1; b<=반복횟수-i; b++){
     				%>
         			<span>&nbsp</span>
         			<%
     			}
     			for(int c=1; c<=i; c++){
     				%>
         			<span>*</span>
         			<%
     			}
     			for(int s=0; s<=i; s++){
     				
     			%>
     			<span>*</span>
     			<%} %>
     			<br>
     			<%
     		}
     	%>
     	<%
     		for(int i=0; i<반복횟수; i++){
     			
     			for(int s=0; s<=i; s++){
     				
     			%>
     			<span>*</span>
     			<%} %>
     			<br>
     			<%
     		}
     	%>
     	</body>
     </html>