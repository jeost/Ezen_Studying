package Day02;

public class Day02_2 { // c s
	public static void main(String[] args) { // m s
	
		// p.40 byte : 1����Ʈ
		// ; : ���� ���� ����
		// ���� �̸� �ߺ��� ����
		byte var1 = -128;	System.out.println( var1 );
		byte var2 = -30;	System.out.println( var2 );
		byte var3 = 30; 	System.out.println( var3 );
		//byte var4 = 300; system.out.println( var4 );
		 //���� : 128 �̻� ���� �Ұ���
		byte var4 = 'j'; 	System.out.println( var4 );
			// ���� -> ���� ��ȯ [ �ƽ�Ű�ڵ� ��Ģ��� ]
		
		// p.43 char : 2����Ʈ [ 1���� ](�����ڵ�)
		char c1 = 'a'; System.out.println( c1 );
		char c2 = 97; System.out.println( c2 );			// 10���� ǥ��
			// ���� -> ���� ��ȯ
		char c3 = '\u0041'; System.out.println( c3 );	// 16���� ǥ��
		char c4 = '��'; System.out.println( c4 );
		char c5 = 44032; System.out.println( c5 );
		char c6 = '\uac00'; System.out.println( c6 );
		// ���� [ ���� : 2������ ���� ǥ�� ���� ��� ]
			// 2���� = ����(2���ڵ�) = �뷮(1��Ʈ)
			// 8, 10 , 16������ ����
		
		// p.44 short : 2����Ʈ ����
		short num1 = 30000; System.out.println(num1);
		
		// p.45 int : 4����Ʈ ���� ( ���� �⺻Ÿ�� )
		int num2 = 10; System.out.println(num2);	// 10����
		int num3 = 012; System.out.println(num3);	// 8������ �տ� 0 ���̱�
		int num4 = 0xA; System.out.println(num4); 	// 16������ �տ� 0x
		
		// p.46 long : 8����Ʈ ���� [ ������ �ڿ� L ]
		long num5 = 10000000000L; System.out.println(num5);
					// int�� -> long��
		
		// p.47 float : 4����Ʈ [ ������ �ڿ� F ] / double ( �Ǽ� �⺻Ÿ�� ) : 8����Ʈ
		double num6 = 3.14; System.out.println(num6);
		float num7 = 3.14F; System.out.println(num7);
		
		double num8 = 0.159265353979323846264338; System.out.println(num8);
		float num9 = 0.159265353979323826264338F; System.out.println(num9);
		
		// p.48 boolean : 1��Ʈ [ true or false ]
			// ����ġ : on , off
		boolean bo1 = true; System.out.println(bo1);
		
		// p.49 : Ÿ�Ժ�ȯ
			// ----------------------------- �ڵ�����ȯ ���� --------------
			// * ũ����� : byte -> short -> int -> long -> float -> double
			// �������� ���� ����ȯ
			// 1. �ڵ� ����ȯ
				// ���� ���ڿ��� ū ���ڷ� �̵� ����
				// ū ���ڿ��� ���� ���ڷ� �̵� �Ұ�
			byte ����Ʈ = 10;
			int ��Ʈ = ����Ʈ; // �ڵ� ����ȯ o
			// short ��Ʈ = ��Ʈ; // �ڵ� ����ȯ x ���� �߻�
		// 2. ���� ����ȯ
			// ū ���ڿ��� ���� ���ڷ� �̵�. ��, ������ �ս� ��
		short ��Ʈ = (short)��Ʈ; // int�� ������ short�� ��ȯ�ϴµ� ������ �ս�
	
	} // m e

} // c e
