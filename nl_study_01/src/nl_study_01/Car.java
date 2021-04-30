package nl_study_01;

public class Car {
	int no; // 차 고유 번호
	String name; // 차의 이름
	
	public Car() {
		System.out.println("차가 생성됨!");
	}

	public Car(int no, String name) {
		super();
		this.no = no;
		this.name = name;
		System.out.println("차 번호 : " +no + "번 이고, 차 이름은 " + name + " 인 차가 만들어짐");
	}
	
	
}
