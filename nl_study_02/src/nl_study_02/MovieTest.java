package nl_study_02;

public class MovieTest {
	public static void main(String[] args) {
		// 1. ��ü�� ����Ϸ���, ���� ��ü�� ������� �ν��Ͻ��� ���� �ؾ� �Ѵ�.
		// ������ , �� new Ŭ������() �� ���ؼ� Ŭ������ �����ϴ� busanhang �̶�� �ν��Ͻ��� �����.
		
		Movie busanhang = new Movie();
		Movie interstella = new Movie();
		Movie sherlock = new Movie("�ȷ� Ȩ��", "�ȷ��� �߸��ϴ� ����");
		Movie sevenNumber = new Movie("7������ ����", "������", 15, "���", "���ۿ�");
		
		// ȣ���ϴ� �̸��� �Ȱ�����, argument �� �ٸ���
		// �̰��� �����ε��̶�� �Ѵ�.
		
		System.out.println(sevenNumber);
		System.out.println(busanhang.title);
		System.out.println(sherlock.title); // 1. null 2. �ȷ� Ȩ��
		// toString �� ���� ��쿡, �ν��Ͻ��� ����ϸ� �޸��ּҰ� ���.
//		System.out.println(busanhang.toString());
//		System.out.println(interstella.toString());
//		
//		busanhang.title = "�λ���";
//		busanhang.summary = "���� ���Դ�..";
//		interstella.title = "���ͽ��ڶ�";
//		interstella.summary = "������ ���ߴ�..";
//		System.out.println(busanhang.toString());
//		System.out.println(interstella.toString());
//		
//		// �ν��Ͻ�.�ʵ�� ���� �ν��Ͻ��� �ʵ尪�� ������ �� �ִ�.
//		
//		// �ν��Ͻ�.�޼����() �� �ν��Ͻ��� �޼��带 ȣ���� �� �ִ�.
//		busanhang.showMovie();
//		interstella.showMovie();
//		busanhang.moveTheater("CGV ���� �����");
		
	
	}
}
