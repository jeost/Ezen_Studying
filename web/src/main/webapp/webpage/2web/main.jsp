<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>main</title>
	<style type="text/css">
		#sidebar{
			width:250px; float: left;
		}
		#main{
			width:840px; float:right;
		}
		#sidebar .title1{
			background-color: aqua; color:white; padding:15px; font-size:18px;
		}
		#sidebar .comment{
			padding:15px; line-height:150%;
		}
		#sidebar #search input{
			width:150px; height:28px;
		}
		#sidebar #search button{
			margin-left: 5px; padding: 6px 10px;
		}
		#sidebar .title2{
			border-top: solid 2px black;
			border-bottom:solid 1px #dddddd;
			padding:15px;
			font-size: 15px;
			margin-top: 30px;
		}
		#sidebar .list{
			margin:20px 0px;
		}
		#sidebar .list li{
			margin:10px;
		}
		#left_main{width:400px; float:left; margin-left:10px;}
		#left_main .title1{border-bottom: solid 1px black; padding-bottom: 8px;}
		#left_main .boardul{margin-top: 30px;}
		#left_main .items{height:30px;}
		#left_main .items .subject{float:left;}
		#left_main .items .date{float:right;}
		#right_main{width:400px; float:right; margin-left:10px;}
		#right_main .items{float:left; width:200px; margin-top:30px;}
		#right_main .subject{
			margin-top:10px; font-size:15px; font-weight:bold;
		}
		#right_main .date{margin-top:5px;}
	</style>
</head>
<body>
	<div id="box">
		<div id="sidebar"> <!-- ���̵� �� -->
			<h3 class="title1">The ����ŷ</h3>
			<p class="comment">�ȳ��ϼ���. ��Ű�� �� ����� ������ �����ϰ� �����ϴ� �����Դϴ�.</p>
			<div id="search">
				<input type="text"><button>�˻�</button>
			</div>
			<h3 class="title2">����ŷ/�丮</h3>
			<ul class="list">
				<li>��Ű �����</li>
				<li>�� �����</li>
				<li>��ī�� �����</li>
			</ul>
			<h3 class="title2">�ֱ� ���</h3>
			<ul class="list">
				<li>��Ű �����</li>
				<li>�� �����</li>
				<li>��ī�� �����</li>
			</ul>
		</div>
		<div id="main"> <!-- ���� �޴� -->
			<div id="left_main">
				<h3 class="title1">�˸�</h3>
				<ul class="boardul">
				
				<%for(int i=0; i<5; i++){ %>
					<li class="items">
						<div class="subject">��Ű Ŭ������ �����մϴ�.</div>
						<div class="date">09.30</div>
					</li>
					<%} %>
				</ul>
				<h3 class="title1">�Խ���</h3>
				<ul class="boardul">
				<%for(int i=0; i<5; i++){ %>
					<li class="items">
						<div class="subject">�ȳ��ϼ��� �ݰ����ϴ�.</div>
						<div class="date">09.30</div>
					</li>
					<%} %>
				</ul>
			</div>
			<div id="right_main">
				<h3 class="title1">���� Ŭ����</h3>
				<ul class="items">
					<li><img src="img/bread1.png"></li>
					<li class="subject">������ �����[3]</li>
					<li class="date">21.09.30</li>
				</ul>
				<ul class="items">
					<li><img src="img/bread2.png"></li>
					<li class="subject">������ �����[3]</li>
					<li class="date">21.09.30</li>
				</ul>
				<ul class="items">
					<li><img src="img/bread3.png"></li>
					<li class="subject">������ �����[3]</li>
					<li class="date">21.09.30</li>
				</ul>
				<ul class="items">
					<li><img src="img/bread4.png"></li>
					<li class="subject">������ �����[3]</li>
					<li class="date">21.09.30</li>
				</ul>
			</div>
		</div>
	</div>
</body>
</html>