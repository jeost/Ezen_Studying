package Day06;

public class Korean { // c s

	//* Korean Ŭ���� ����
	
	// 1. �ʵ�
	String nation = "���ѹα�";
		// ���� ������ �̸� ���ѹα� ����
	String name ;
		// �̸�
	String ssn;
	// 2. ������
		//�������
		Korean(){}
			
		//�ʵ� 1���� ���� ������
		Korean(String n){
			name = n;
		}
		//�ʵ� 2���� ���� ������
		Korean(String n, String s) {
		name = n;
		ssn = s;}
		
		// �ʵ� 3���� ���� ������
		Korean( String nation ,
				String name ,
				String ssn){
			this.nation = nation;
			this.name = name;
			this.ssn = ssn;
		}
		
		// 3. �޼ҵ�
	

	
} // c e
