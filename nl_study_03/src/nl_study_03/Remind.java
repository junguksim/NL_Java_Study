package nl_study_03;

public class Remind {
	
	private static class Window {
		private class Glass {
			Glass() {
				System.out.println("���� �ν��Ͻ� ����!");
				//System.out.println(this);
			}
		}
		Window() {
			System.out.println("â�� �ν��Ͻ� ����!");
			// â���� �����ʰ� ���ÿ�, ������ ����� �ʹ�.
			new Glass();
			System.out.println("this : " + this);
		}
	}
	
	
	public static void main(String[] args) {
		int su = 1;
		char c = 'h';
		boolean isOdd = false;
		// ���� 3������ ��� ���� ������ Ÿ���̴�.
		
		String str = "hi!";
		
		// String ���� ���� �� ���� �� �ƴմϱ�?
		// String �� class �̴�.
		// �� �ձ��ڰ� �빮�ڸ�, Ŭ�����̴�.
		// ����������, Ŭ������ ���� ����, �� �ձ��ڸ� �빮�ڷ� ����� �Ѵ�.(�ʼ��̴�!)
		
		//Car c1= new Car();
		//Car c2= new Car();//�ν��Ͻ� 2�� ����
		//���� 3. �ν��Ͻ��� 2�� �����ϴ� ������ ������???
		// �ν��Ͻ��� , Ŭ���� Ÿ�� �����̴�.
		
		// ������ �� �ִ� ��
		// 1 �� : Java �� ��� Ÿ����, ���� ������ Ÿ�԰� Ŭ���� ������ Ÿ��!
		// 2 �� : �ձ��ڰ� �빮���ΰ� Ŭ���� Ÿ���̴�.
		// 3 �� : Ŭ���� ������ Ÿ���� ������ �ν��Ͻ���� �� �� �ִ�
		
		// ���࿡, ���� �Ѵٸ�?
		Car c1;
		// �������� ���� null
		// c1 �� c2�� Car ��� Ŭ���� Ÿ���� �����̴�.
		// �ٵ� c1�� c2�� �׷� Car �� �ν��Ͻ��ΰ���?
		// �ƴϴ�.
		
		// �ν��Ͻ���, �޸𸮿� ��ϵ� ������ �ν��Ͻ���� �մϴ�.
		c1 = new Car();
		// Car�� ������( new Car() ) �� c1 �� �����ߴ�.
		// �׷��Ƿ�, Car ��ü�� �����ϴ� �ν��Ͻ��� ��������µ�
		// �� ������� �ν��Ͻ��� c1 �� ������ �ƴ�.
		
		// �׷��ϱ� ���� c1�� Car �� �ν��Ͻ� �̴�.
		
		// �ν��Ͻ� -> ����
		// ������ 2�� �����ϴ� ������ ������?
		// �׳� �츮�� , �� 2���� �����ؼ� ������ ��Ű�� �;��� ������ 2���� �������.
		
		// Window Ŭ���� �׽�Ʈ
		Window window = new Window();
		System.out.println("window : " + window);
		//Window window2 = new Window();
	}
}
