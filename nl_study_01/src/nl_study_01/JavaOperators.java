package nl_study_01;

public class JavaOperators {
	public static void main(String[] args) {
		// +,-,*,/ �Ѿ�Կ�
		// String -> ���� ������ Ÿ�� �ƴϴ�. ��� ��ü�� ���� ���ڰ� �빮��.
		String hello = "hello"; // single quote �� char, double quote �� String ���Դϴ�.
		String world = "world";
		System.out.println(3 + 5);
		System.out.println(hello + " " + world); // concat -> ������ �ȴ�. �ٴ´�.
		
		// ==(����), !=(�ٸ���) => return Ÿ���� boolean (true, false)
		System.out.println(3 == 5);
		System.out.println(4 != 7);
		
		// ���� ��ü�� �����ϴ�, �ٸ� �ν��Ͻ��� �ȴ�.
		// �ν��Ͻ� -> �޸𸮸� �����ϴ� ������ ����
		
		Car car1 = new Car(10, "����");
		// car1 �� Car ��� ��ü�� ������� ������� �ν��Ͻ�!
		// car1 �� ��Ÿ���� �� -> car1�� �ִ� �޸��� �ּ�
		Car car2 = new Car(20, "�ƹݶ�");
		// car2 �� Car ��� ��ü�� ������� ������� �ν��Ͻ�!
		System.out.println(car1 == car2);
		// ��ü���� ���ϴ� ==, != �����ڴ�
		// ��ü�� ���� ���ϴ� �� �ƴϰ�!!!!
		// ��ü�� �޸� �ּҸ� ���Ѵ�!!!!
		
		String s1 = "NL";
		// s1 �̶�� "����" ��, String �̶�� "Ÿ��"�� ������, �� String Ÿ����, ��ü Ÿ�� �̴�. �ֳ� ? ������ Ÿ���� �ƴϴϱ�!
		String s2 = "NL";
		System.out.println(s1 == s2);
		// 1�� : true
		// 2�� : false
		
		// &&(AND), ||(OR)
		
		// if(����) { ������ ������ ��� ������ ����}
		int num = 18;
		if(num % 2 == 0) { // num �� ¦�����
			System.out.println("¦����!");
		}
		if(num % 3 == 0) {
			System.out.println("3���� ������ ������!");
		}
		//������ 90�� �̻��̸� A��� 85�̻��̸� B���
		
		// switch ���ǹ�
		//if else if else if..... -> ������ ��������. �Ź� ���� üũ�� �ؾ���.
		
		// BFS, DFS ���� �˰����򿡼� ���� ���̴� "���Ž��" �˰����򿡼� ���� ���δ�.
		// direction �� 0���̶�� ����, 1���̶�� ����������, 2���̶�� ������, 3���̶�� ��������
		//	0
		//3	   1
		//	2
		int direction = 2;
		switch(direction) { // direction �̶�� ������ ����
			case 0:
				direction = 1;
				System.out.println("��ȸ��!");
				break;
			case 1:
				direction = 2;
				System.out.println("������!");
				break;
			default:
				System.out.println("���� �����ʵ� �ƴ�!");
				break;
		}
		
		// 3�� �����
		boolean flag = false;
		int result = 0;
		if(flag) result = 1;
		else result = -1;
		int result2 = (flag) ? 1 : -1;
		// 				1��     2��     3��
		// 1�׿� �ִ� ���ǹ��� true �� ���, result �� 2���� ����
		// false �� ���, 3���� ����.
		System.out.println(result2);
		
		// �ݺ���
		// for( ���� ; ���� ; ���� ) { ������ ���� }
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		// while(���ǽ�) { ���ǽ��� �����ϴ� ���ȿ� ���� }
		int sum2 = 0;
		int num2 = 1;
		while(num2 <= 10) {
			sum2 += num2; // 1 + 2 + 3 + ... + 10
			num2++;// 2, 3
		}
		System.out.println(sum2);
		
		// do { ���ǽ��� �����ϴ� ���ȿ� ����} while( ���ǽ� )
		do {
			System.out.println("�ȳ�!"); // ������ �ѹ��� ������ �����Ѵ�!
		} while(false);
		
		// ������ ���������� ���� ���Ǵ� �����
		// break, continue
		// continue
		
		// ���� : 1���� 100���� �� �߿���, ¦���� ���ϰ� �ʹ�.
		int res = 0;
		for(int n = 1; n <= 100; n++) {
			// n �� 1���� �����ؼ�,
			// n �� 100���� �۰ų� ���� ����,
			// n �� 1�� ������Ű�鼭
			// �Ʒ��� �����Ѵ�.
			if(n % 2 != 0) {
				continue; // continue : n�� Ȧ�����, �Ʒ��� ���̻� �������� �ʰ� �Ѿ��.
			}
			res += n;
			if(res >= 1000) {
				break; // break : �׳� �ݺ����� ������ѹ����� ����
			}
			System.out.println(res);
			
		}
	}
}