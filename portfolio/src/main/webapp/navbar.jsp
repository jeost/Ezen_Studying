<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<div> <!-- 네비바 시작 -->
	<nav class="navbar navbar-expand-lg navbar-light bg-dark navigationbar">
  <div class="container-fluid">
    <a class="navbar-brand text-white" href="mainpage.jsp">KRVtuberDEX</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active text-white" aria-current="page" href="mainpage.jsp">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link text-white" href="#">개발자에게 문의하기</a>
        </li>
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle text-white" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            회사별로 보기
          </a>
          <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
            <li><a class="dropdown-item" href="#">플럼버스</a></li>
            <li><a class="dropdown-item" href="#">코이텐</a></li>
            <li><a class="dropdown-item" href="#">V-LUP</a></li>
            <li><a class="dropdown-item" href="#">일루전라이브</a></li>
            <li><hr class="dropdown-divider"></li>
            <li><a class="dropdown-item" href="#">개인세</a></li>
          </ul>
        </li>
        <li class="nav-item">
          <a class="nav-link disabled">니지산지KR은 없는 회사입니다</a>
        </li>
      </ul>
      <form class="d-flex">
        <input class="form-control me-2 search" type="search" placeholder="버튜버 이름 검색" aria-label="Search">
        <button class="btn btn-outline-info" id="searchbutton" type="submit">검색</button>
      </form>
    </div>
  </div>
</nav>
</div>
</body>
</html>