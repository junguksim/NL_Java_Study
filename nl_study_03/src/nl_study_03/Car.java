package nl_study_03;

public class Car {
	String name;
	int speed;
	int location;
	// 필드 : 어떤 클래스를 만들 때, 그 클래스가 가지는 정보를 나타내는 변수
	// 메서드 : 어떤 클래스를 만들 때, 그 클래스가 할 수 있는 기능들을 나타냄.
	
	// 필드에 어떤 값을 할당해놓으면, 그 값이 default 값이 된다.
	// 할당해놓지 않는다면, java 차원에서 각 타입에 맞는 default 값을 설정을 해준다.
	
	// 할당하지 않았을 경우의 디폴트 값
	// int 는 0
	// String 은 null
	// boolean 은 false
	// char 는 '' (공백)
	
	// 기본 생성자
	Car() {
		// Car c1 = new Car();
		// 여기서 this 는, Car 생성자(new Car() ) 가 호출이 될 때
		// 만들어지는 c1 이라는 인스턴스 자체를 가리킨다.
		// 즉 this 는  c1을 가리킨다.
		System.out.println("차가 생성 되었고, 이 차의 이름은 " + this.name + " 입니다. 속도는 " + this.speed + "입니다.");
	}
	
	// 필드에 원하는 값을 넣는 2가지 방법
	// 1번째 : 생성자 오버로딩
	// Alt + Shift + S 를 누르고, Generate Constructor with fields 를 하면
	// 필드를 argument 로 받는 생성자를 만들 수 있다.
	// 오버로딩이란? 메서드든, 생성자든 이름을 같게 하고, 내용을 다르게 해서, 비슷한 기능을 여러 이름으로 나누지 않고 편하게 사용하기 위함.
	
	// 오버로딩 된 생성자
//	Car(String 차이름, int 차속도, int 차위치) {
//		super();
//		System.out.println("name = " + name);
//		System.out.println("우변의 차이름 = " + 차이름);
//		name = 차이름;
//		System.out.println("speed = " + speed);
//		System.out.println("우변의 차속도 = " + 차속도);
//		speed = 차속도;
//		location = 차위치;
//		System.out.println("차가 오버로딩으로 생성 되었고, 이 차의 이름은 : " +name + "입니다.");
//	}
	
	public Car(String name, int speed, int location) {
		super();
		this.name = name;
		this.speed = speed;
		this.location = location;
	}

	// 2번째 : Getter / Setter ( 값 가져오는 거 / 값 설정하는 거 )
	// 똑같이 Alt + Shift + S 누르고, Generate Getters and Setters 로 가능

	public String getName() {
		return name; // Getter : name 을 가져오는 메서드
	}

	public void setName(String 차이름) {
		name = 차이름; // Setter : name 을 설정하는 메서드
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getLocation() {
		return location;
	}

	public void setLocation(int location) {
		this.location = location;
	}
	
	//질문 2. 메서드 오버로딩은 어떤 방식으로 사용해야 하는지??? 감이 잘 안와요.
	//Java 작명법 !! => 클린 코딩에서 굉장히 중요한 요소
	// 클린 코딩이 뭐냐면 ? 코딩을 깔끔하게(이해하기 쉽게) 하는 것
	
	// 작명법
	// camelCase, kebab-case, snake_case
	// camelCase 는 단어1과 단어2가 이어질 때, 단어2의 첫 문자를 대문자로 쓰는 것
	// 단어 1은 무조건 소문자로 시작 (낙타의 봉우리를 생각하세요)
	// 우리는 camelCase 를 씁니다!
	
	// 1. 클래스의 첫 글자는 무조건 대문자
	// 2. 필드나, 변수나, 메소드의 첫 글자는 무조건 소문자(camelCase)
	// 3. 클래스가 여러 단어르 이루어져 있다면, 첫 글자 대문자, 나머지 camelCase => PascalCase
	
	// 차를 운전하는 기능을 만들 것
	
	// 메소드 작성법
	// 접근자 (static) 리턴타입 메서드이름
	
	void drive() {
		System.out.println("운전 기능~");
	}
	
	void drive(int time) {
		System.out.println("현재 자동차의 위치 : " + this.location);
		this.location += this.speed * time; // 속력 * 시간 의 값을 location 에 더해준다.
		System.out.println("speed : " + this.speed );
		System.out.println("time : " + time);
		System.out.println("운전 뒤의 자동차의 위치 : " + this.location);
	}
	
	// 메소드 오버로딩
	// 똑같이 운전기능인데, 가속도가 붙는 걸로
	void drive(int time, int acc) {
		// 매초, 가속도가 붙어서 속도가 증가해야함.
		System.out.println("현재 자동차의 위치 : " + this.location);
		System.out.println("acc : " + acc);
		int speed = this.speed;
		for(int i = 1; i <= time; i++) {
			// 1초부터 time 까지,
			// 현재의 속도에서 가속도만큼 더 붙어야 함.
			// 시간이 10, 가속도가 5
			// 150, 155, 160, 165, ...
			
			// 이 때 주의해야 할 것은,
			// 기본 속도를 직접적으로 변경해버린다면?
			// c1.drive(10, 5);
			// 결과적으로 속도가 150,155,160,165..., 초기속도가 150이 아니라 200이 되어버린다.
			
			// 그니까, 이 메서드 내에서만 150,155,160 이렇게 가게 하고,
			// 필드의 기본 speed 인 150은 건드리지 말자!
			
			speed += acc;
			// speed : 150, 155, 160, ...
			location += speed;
		}
		System.out.println("가속도가 붙는 운전 뒤의 자동차의 위치 : " + this.location);
	}
} 