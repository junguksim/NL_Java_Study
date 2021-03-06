package nl_study_01;

public class JavaOperators {
	public static void main(String[] args) {
		// +,-,*,/ 넘어갈게요
		// String -> 원시 데이터 타입 아니다. 모든 객체는 시작 문자가 대문자.
		String hello = "hello"; // single quote 는 char, double quote 는 String 용입니다.
		String world = "world";
		System.out.println(3 + 5);
		System.out.println(hello + " " + world); // concat -> 접합이 된다. 붙는다.
		
		// ==(같다), !=(다르다) => return 타입이 boolean (true, false)
		System.out.println(3 == 5);
		System.out.println(4 != 7);
		
		// 같은 객체를 참조하는, 다른 인스턴스가 된다.
		// 인스턴스 -> 메모리를 점유하는 고유한 존재
		
		Car car1 = new Car(10, "벤츠");
		// car1 은 Car 라는 객체를 기반으로 만들어진 인스턴스!
		// car1 이 나타내는 값 -> car1이 있는 메모리의 주소
		Car car2 = new Car(20, "아반떼");
		// car2 는 Car 라는 객체를 기반으로 만들어진 인스턴스!
		System.out.println(car1 == car2);
		// 객체끼리 비교하는 ==, != 연산자는
		// 객체의 값을 비교하는 게 아니고!!!!
		// 객체의 메모리 주소를 비교한다!!!!
		
		String s1 = "NL";
		// s1 이라는 "변수" 는, String 이라는 "타입"을 가지고, 이 String 타입은, 객체 타입 이다. 왜냐 ? 원시적 타입이 아니니까!
		String s2 = "NL";
		System.out.println(s1 == s2);
		// 1번 : true
		// 2번 : false
		
		// &&(AND), ||(OR)
		
		// if(조건) { 조건이 성립할 경우 실행할 문장}
		int num = 18;
		if(num % 2 == 0) { // num 이 짝수라면
			System.out.println("짝수임!");
		}
		if(num % 3 == 0) {
			System.out.println("3으로 나누어 떨어짐!");
		}
		//점수가 90점 이상이면 A출력 85이상이면 B출력
		
		// switch 조건문
		//if else if else if..... -> 성능이 떨어진다. 매번 조건 체크를 해야함.
		
		// BFS, DFS 등의 알고리즘에서 자주 쓰이는 "사방탐색" 알고리즘에서 많이 쓰인다.
		// direction 이 0번이라면 위로, 1번이라면 오른쪽으로, 2번이라면 밑으로, 3번이라면 왼쪽으로
		//	0
		//3	   1
		//	2
		int direction = 2;
		switch(direction) { // direction 이라는 변수의 값이
			case 0:
				direction = 1;
				System.out.println("우회전!");
				break;
			case 1:
				direction = 2;
				System.out.println("밑으로!");
				break;
			default:
				System.out.println("위도 오른쪽도 아님!");
				break;
		}
		
		// 3항 연산식
		boolean flag = false;
		int result = 0;
		if(flag) result = 1;
		else result = -1;
		int result2 = (flag) ? 1 : -1;
		// 				1항     2항     3항
		// 1항에 있는 조건문이 true 일 경우, result 에 2항이 담기고
		// false 일 경우, 3항이 담긴다.
		System.out.println(result2);
		
		// 반복문
		// for( 선언 ; 조건 ; 증감 ) { 실행할 문장 }
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		// while(조건식) { 조건식이 성립하는 동안에 수행 }
		int sum2 = 0;
		int num2 = 1;
		while(num2 <= 10) {
			sum2 += num2; // 1 + 2 + 3 + ... + 10
			num2++;// 2, 3
		}
		System.out.println(sum2);
		
		// do { 조건식이 성립하는 동안에 수행} while( 조건식 )
		do {
			System.out.println("안녕!"); // 무조건 한번의 실행은 보장한다!
		} while(false);
		
		// 루프를 빠져나오기 위해 사용되는 문장들
		// break, continue
		// continue
		
		// 문제 : 1부터 100까지 수 중에서, 짝수만 더하고 싶다.
		int res = 0;
		for(int n = 1; n <= 100; n++) {
			// n 이 1부터 시작해서,
			// n 이 100보다 작거나 같을 동안,
			// n 을 1씩 증가시키면서
			// 아래를 수행한다.
			if(n % 2 != 0) {
				continue; // continue : n이 홀수라면, 아래를 더이상 수행하지 않고 넘어간다.
			}
			res += n;
			if(res >= 1000) {
				break; // break : 그냥 반복문을 종료시켜버리는 구문
			}
			System.out.println(res);
			
		}
	}
}
