<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<div> <!-- �׺�� ���� -->
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
          <a class="nav-link text-white" href="#">�����ڿ��� �����ϱ�</a>
        </li>
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle text-white" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            ȸ�纰�� ����
          </a>
          <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
            <li><a class="dropdown-item" href="#">�÷�����</a></li>
            <li><a class="dropdown-item" href="#">������</a></li>
            <li><a class="dropdown-item" href="#">V-LUP</a></li>
            <li><a class="dropdown-item" href="#">�Ϸ������̺�</a></li>
            <li><hr class="dropdown-divider"></li>
            <li><a class="dropdown-item" href="#">���μ�</a></li>
          </ul>
        </li>
        <li class="nav-item">
          <a class="nav-link disabled">��������KR�� ���� ȸ���Դϴ�</a>
        </li>
      </ul>
      <form class="d-flex">
        <input class="form-control me-2 search" type="search" placeholder="��Ʃ�� �̸� �˻�" aria-label="Search">
        <button class="btn btn-outline-info" id="searchbutton" type="submit">�˻�</button>
      </form>
    </div>
  </div>
</nav>
</div>
</body>
</html>