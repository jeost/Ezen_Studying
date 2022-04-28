<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<div><!-- 상단 바 -->
		<nav class="navbar navbar-expand-lg navbar-light bg-primary" id="topbar">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">실시간/예정</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNavDropdown">
      <ul class="navbar-nav">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="#">아카이브</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">클립</a>
        </li>
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            정렬기준
          </a>
          <ul class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
            <li><a class="dropdown-item" href="#">현재 시청자</a></li>
            <li><a class="dropdown-item" href="#">팔로우(구독자)</a></li>
            <li><a class="dropdown-item" href="#">오름차순 정렬<input type="checkbox"></a></li>
          </ul>
        </li>
      </ul>
    </div>
  </div>
</nav>
	</div>
</body>
</html>