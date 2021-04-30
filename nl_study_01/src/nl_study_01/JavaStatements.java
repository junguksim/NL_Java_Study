package nl_study_01;

public class JavaStatements {
	public static void main(String[] args) {
		// 1��° ��Ģ : ��� ������ ������ �����ݷ�(;) �� �ٿ��� �Ѵ�. �� ���̸� ������ ����!
		System.out.println("Java Statement Test");
		
		// 2��° : �ּ�
		// <- �̰� �޸� �ּ� ó���� �����ϴ�.
		// System.out.println("Java Statement Test"); <- ���� �ȵ�
		/**
		 * 
		 * ��
		 * ��
		 * ��
		 * 
		 */
		
		// 3���� : ������ ���������� ����� �� ����.
		// ���� ��� -> int, short, char, String => ���������� ����� �� ����.
		//int int = 10; 
		
		// Java �� ������ Ÿ��
		// ���� ������ Ÿ��(Primitive Data Types)
		// 8���� 
		// ������, ������, ������, �Ǽ���
		// ������ ������ Ÿ�� -> boolean => �� : true or false
		
		boolean isOdd = false;
		boolean isEven = true;
		
		// ������ -> char
		char firstCharOfName = 'J'; // �� ���� �ۿ� �����, '(single quote) �� ����ؼ� �����Ѵ�.
		
		// ������ -> byte < short < int < double
		// ���� �� �ִ� ���� ������ �ٸ���.
		// byte : 8��Ʈ -128 ~ 127
		byte a = 10;
		// short : 16��Ʈ
		short b = 20;
		// int : 32��Ʈ
		int c = 2100000000;
		// long : 64��Ʈ ( �˰����� Ǯ ��, ���� ū ���� ���� �� �ִ� ��� ���� )
		long d = 9399129;
		
		// �Ǽ��� -> float, double
		float e = 3.14f;
		double f = 392d;
		
		// Casting -> �� ��ȯ
		// �ڵ� ����ȯ, ������ ����ȯ
	
		// ���� ũ���� Ÿ���� ū ũ���� Ÿ������ �ڵ� ��ȯ �Ǵ� �� -> �ڵ�����ȯ
		// ������ ����ȯ
		// ū ũ�Ⱑ ���� ũ��� ������ ���
		int num = (int) 3.4;
		System.out.println(num);
		char A = (char) 65;
		// ASCII CODE -> �� �� �ִ� ��κ��� ���ڸ� ���ڷ� ǥ���س��� �ڵ�
		System.out.println(A);
		char aCh = (char) 97;
		System.out.println(aCh);
	}
}