<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
	<link href="css.css" rel="stylesheet">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-6 left">
				<div class=header>
					<h5>ȸ������ �� �������� ���� �̿��� ���� �Ʒ� ����� �о� ���ð�,<br>���� ���θ� ������ �ּ���</h5>
					�ʼ� ����� ���� �ϼž� ȸ�������� �����մϴ�.
				</div>
				<div>
					<div class="title">ȸ������ �������<span style="color :red">*</span></div>
					<div class="content"><textarea rows="8" cols="" style="width:100%;"> ��1�� ��Ģ
					��1��(����)
					�� ����� ��ȭ����Ʈ�� ��ϴ� �� ����Ʈ(Spring Cinema)�� ���ݼ����� �̿����� �� ������ ���� ���� �� ��Ÿ �ʿ��� ������ �������� �������� �Ѵ�.
					��2��(����� ����)
					�� ������� ����ϴ� ���� ������ ���� �����Ѵ�.</textarea>
					</div>
					<div>
						<input type="checkbox">ȸ������ ��� ���� �մϴ�.
					</div>
				</div>
				<div>
					<div class="title">��������ó����ħ<span style="color :red">*</span></div>
					<div class="content"><textarea rows="8" cols="" style="width:100%;">��1�� ��Ģ
					
					��1��(����)�� ��ħ�� ���������� ��ȣ����(���� "��"�̶� �Ѵ�)��12����1�׿� ���� ���������� ó���� ���� ����, �������� ħ���� ���� �� ������ġ � ���� �������� ������ �������� �������� �Ѵ�.
					��2��(����� ����) �� ��ħ���� ����ϴ� ����� ���� ������ ����.
					1."�������� ó��"�� ���������� ����,����,����,����,���,����,����,����,����,�˻�,���,����(����),����,�̿�,����,����,�ı�(��ѥ)</textarea>
					</div>
					<div>
						<input type="checkbox">��������ó����ħ ���� �մϴ�.
					</div>
				</div>
			</div>
			<div class="col-md-6 right">
				<div class="form-control form-control-lg mb-3">
					<input type="text" placeholder="���̵� �Է��ϼ���.*" style="width:100%;">
				</div>
				<div class="form-control form-control-lg mb-3">
					<input type="password" placeholder="��й�ȣ�� �Է��ϼ���.*" style="width:100%;">
				</div>
				<div class="form-control form-control-lg mb-3">
					<input type="password" placeholder="�ѹ��� ��й�ȣ�� �Է��ϼ���.*" style="width:100%;">
				</div>
				<div class="form-control form-control-lg mb-3">
					<input type="text" placeholder="�̸��� �Է��ϼ���.*" style="width:100%;">
				</div>
				<div class="text-center ir">
					<input type="radio" name="g">����<input type="radio" name="g">����
				</div>
				<div class="form-control form-control-lg mb-3">
					<input type="text" placeholder="����ó�� �Է��ϼ���.*" style="width:100%;">
				</div>
				<div class="form-control form-control-lg mb-3">
					<input type="email" placeholder="�̸����� �Է��ϼ���.*" style="width:100%;">
				</div>
				<div class="form-control form-control-lg mb-3">
					<input type="text" placeholder="���̸� �Է��ϼ���.*" style="width:100%;">
				</div>
				<div class="row">
					<div class="col-md-4"> <h3>�ּ�<span style="color :red">*</span></h3> </div>
					<div class="col-md-4"><input class="form-control mb-2" type="text" placeholder="�����ȣ"></div>
					<div class="col-md-4"><button class="form-control mb-2"> �����ȣ ã�� </button></div>
				</div>
				<div class="row">
					<div class="col-md-4 offset-4"><input class="form-control mb-2" type="text" placeholder="���θ��ּ�"></div>
					<div class="col-md-4"><input class="form-control mb-2" type="text" placeholder="�����ּ�"></div>
				</div>
				<div class="row">
					<div class="col-md-8 offset-4"><input class="form-control mb-2" type="text" placeholder="���ּ�"></div>
				</div>
				<div class="ir">
					<button style="width: 100%">ȸ������</button>
				</div>
			</div>
		</div>
	</div>
</body>
</html>