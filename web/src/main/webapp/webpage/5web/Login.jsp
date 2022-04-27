<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Login page</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
<link href="indexcss.css" rel="stylesheet">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.14.0/css/all.css">
</head>
<body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
	<div class="col-md-10 offset-2 fixed-top pb-1 pt-5 px-5">
	<div class="col-md-7 d-flex justify-content-end offset-5"> <!-- ��� ��� -->
		<ul class="nav">
			<li class="tophead"><a href="Login.jsp">LOGIN</a></li>
			<li class="tophead"><a href="#">JOIN</a></li>
			<li class="tophead"><a href="#">CART</a></li>
			<li class="tophead"><a href="#">MY PAGE</a></li>
			<li class="tophead"><a href="#">SNS</a></li>
			<li class="tophead"><a href="#">BOOKMARK</a></li>
		</ul>
	</div>
	</div> 
	<div class="row">
		<div class="container-fluid">
		<div class="col-md-2 sidemenu"> <!-- ���� ���̵�� -->
		<h3>HUNS</h3>
			<ul>
				<li><a href="#">BEST</a></li>
				<li><a href="#">NEW</a></li>
				<li><a href="#">���Ϲ��</a></li>
				<li><a href="#">1+1/�ڵ�Ʈ</a></li>
			</ul>
			<ul>
				<li><a href="#">�ƿ���</a></li>
				<li><a href="#">����</a></li>
				<li><a href="#">����</a></li>
				<li><a href="#">��Ʈ/�����</a></li>
				<li><a href="#">����</a></li>
				<li><a href="#">Ʈ���̴�</a></li>
				<li><a href="#">�Ź�</a></li>
				<li><a href="#">�Ǽ��縮</a></li>
				<li><a href="#">����</a></li>
			</ul>
			<ul>
				<li><a href="#">NOTICE</a></li>
				<li><a href="#">Q&amp;A</a></li>
				<li><a href="#">REVIEW</a></li>
			</ul>
			<div>
				<input type="text"><i class="fas fa-search"></i>
			</div>
			<div>
			�����͡�070-7710-4745<br>
			<a href="#">īī��ä�� @�ƽ�</a><br>
			MON - FRI AM9 - PM4<br>
			(LUNCH TIME PM12:30 - PM13:30)<br>
			SAT, SUN, HOLIDAY CLOSE<br>
			�����ð��� ���Ǵ�<br>
			Q��A �Խ����� �̿��Ź�帳�ϴ�.<br>
			�츮���� 1111-111-111111<br>
			������ : (��)���������۴�
			</div>
		</div> 
		</div>
		<div class="col-md-10 offset-2 content">
			<div> <!-- �α��� ������ -->
				<div style="width:100%; text-align: center; margin-bottom: 100px; font-size: 30px;"><b>LOGIN</b></div>
				<div class="col-md-4 offset-4"> <!-- �α��� ��ư -->
					<table>
						<tr><td><input type="text" placeholder="���̵�" style="width:238px; height:32px;"></td><td rowspan="2"><button style="height: 65px ; width: 100px; background-color: black; color:white;">LOGIN</button></td></tr>
				 		<tr><td id="bt"><input type="password" placeholder="��й�ȣ" style="width:238px; height:32px;"></td>
					</table>
				</div>
				<div>
					<table class="col-md-6 offset-3">
					 <tr><td><input type="checkbox">���̵� ����</td><td> �������� </td><td><span class="fg">|</span>
						</td><td>���̵�ã��</td><td><span class="fg">|</span></td><td> ��й�ȣã��</td>
						</tr>
					</table>
				</div>
				<div> <!-- �ٸ��ɷ� �α��� -->
					<table class="col-md-4 offset-4">
						<tr><td><a href="#"><img alt="" src="img/naver.PNG"> </a> </td><td><a href="#"><img alt="" src="img/facebook.PNG"> </a></td></tr>
						<tr><td><a href="#"><img alt="" src="img/kakao.PNG"> </a> </td><td><a href="#"><img alt="" src="img/apple.PNG"> </a></td></tr>
						<tr><td colspan="2"><button style="background-color: gray; color:white; width:100%;">JOIN US</button></td></tr>
					</table>
				</div>
				<div class="nj col-md-5 offset-3"> <!-- ��ȸ�� -->
					<div>
					��ȸ���� ���, �ֹ����� �ֹ���ȣ�� �ֹ���ȸ�� �����մϴ�.
					</div>
					<div class="njt"><!-- �Է¹޴°� -->
						<table>
							<tr><td class="dd">�ֹ��ڸ�</td><td class="dd"><input type="text"></td></tr>
							<tr><td class="dd">�ֹ���ȣ</td><td class="dd"><input type="text" placeholder="������(-)����"></td></tr>
							<tr><td class="dd">��ȸ���ֹ� ��й�ȣ</td><td class="dd"><input type="text"></td></tr>
							<tr><td colspan="2"><input type="submit" style="background-color: white; width:100%;">��ȸ�� �α��� </td></tr>
						</table>
					</div>
				</div>
			</div>
			<div class="row footer"> <!-- footer -->
				<div class="col-md-2">
				<span class="fg">S H O P &nbsp I N F O .</span><br>
				<a href="#">ABOUT US</a><br>
				<a href="#">AGREEMENT</a><br>
				<a href="#">PRIVACY POLICY</a><br>
				<a href="#">SHOPPING GUIDE</a>
				</div>
				<div class="col-md-3">
				<span class="fg">C U S T O M E R&nbsp  C E N T E R</span><br>
				<h4>070-7710-4745</h4><br>
				<h5><a href="#">īī��ä�� : @�ƽ�</a></h5><br>
				MON - FRI AM9 - PM4<br>
				(LUNCH TIME PM12:30 - PM13:30)<br>
				SAT, SUN, HOLIDAY CLOSE<br>
				�����ð��� ���Ǵ�<br>
				Q��A �Խ����� �̿��Ź�帳�ϴ�.<br><br><br>
				B A N K    A C C O U N T<br><br>
				�츮���� 1005-504-072722<br>
				������ : (��)���������۴�
				</div>
				<div class="col-md-7">
				<span class="fg">C O M P A N Y &nbspI N F O</span><br>
				COMPANY : (��)���������۴� CEO : ���簩 TEL : 070-7710-4745<br>
				BUSINESS NUMBER : 693-81-01950 / 2021-����ϳ�-0552 [���������Ȯ��]<br>
				ADDRESS : 13024 ��⵵ �ϳ��� �ϳ���� 506 (�ϻ�) 2��<br>
				ADMIN : ��̿� (youandme3800&#64;naver.com) HOSTING : (��)CAFE24<br>
				�¶��� ���ڻ�ŷ� ���� ���� [���񽺰��Ի��Ȯ��]<br><br>
				<b>��ǰ�ּ� / CJ�������(1588-1255)</b><br>
				CJ������� ��ǰ�ּ� : �����ȣ 05839) ����� ���ı� ��η�52 CJ������� ��������븮��<br>
				Ÿ�ù��̿� ��ǰ�ּ� : �����ȣ 12729) ��⵵ ���ֽ� �ʿ��� ����� 625-12 A�� 3��<br>
				��Ÿ�ù� �̿�� �����ù�,�Ե��ù�Ұ�(�ݼ۵ɼ� �ֽ��ϴ�)��<br><br>
				<b>Copyright  (��)���������۴�. All rights reserved. by uniqq.</b><br>
				</div>
			</div>
		</div>
	</div>
</body>
</html>