package nl_study_03;

public class Remind {
	
	private static class Window {
		private class Glass {
			Glass() {
				System.out.println("유리 인스턴스 생성!");
				//System.out.println(this);
			}
		}
		Window() {
			System.out.println("창문 인스턴스 생성!");
			// 창문이 생성됨과 동시에, 유리를 만들고 싶다.
			new Glass();
			System.out.println("this : " + this);
		}
	}
	
	
	public static void main(String[] args) {
		int su = 1;
		char c = 'h';
		boolean isOdd = false;
		// 위의 3가지는 모두 원시 데이터 타입이다.
		
		String str = "hi!";
		
		// String 문자 담을 때 쓰는 거 아닙니까?
		// String 은 class 이다.
		// 맨 앞글자가 대문자면, 클래스이다.
		// 마찬가지로, 클래스를 만들 때는, 맨 앞글자를 대문자로 해줘야 한다.(필수이다!)
		
		//Car c1= new Car();
		//Car c2= new Car();//인스턴스 2개 생성
		//질문 3. 인스턴스를 2개 생성하는 이유가 뭔가요???
		// 인스턴스는 , 클래스 타입 변수이다.
		
		// 유추할 수 있는 것
		// 1 번 : Java 의 모든 타입은, 원시 데이터 타입과 클래스 데이터 타입!
		// 2 번 : 앞글자가 대문자인게 클래스 타입이다.
		// 3 번 : 클래스 데이터 타입의 변수를 인스턴스라고 할 수 있다
		
		// 만약에, 선언만 한다면?
		Car c1;
		// 실질적인 값은 null
		// c1 과 c2는 Car 라는 클래스 타입의 변수이다.
		// 근데 c1과 c2는 그럼 Car 의 인스턴스인가요?
		// 아니다.
		
		// 인스턴스는, 메모리에 등록된 순간에 인스턴스라고 합니다.
		c1 = new Car();
		// Car의 생성자( new Car() ) 를 c1 에 대입했다.
		// 그러므로, Car 객체를 참조하는 인스턴스가 만들어졌는데
		// 이 만들어진 인스턴스가 c1 에 대입이 됐다.
		
		// 그러니까 이제 c1은 Car 의 인스턴스 이다.
		
		// 인스턴스 -> 변수
		// 변수를 2개 생성하는 이유가 뭔가요?
		// 그냥 우리는 , 차 2개를 생성해서 운전을 시키고 싶었기 때문에 2개를 만들었다.
		
		// Window 클래스 테스트
		Window window = new Window();
		System.out.println("window : " + window);
		//Window window2 = new Window();
	}
}
