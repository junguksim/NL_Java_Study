package nl_study_01;

import java.util.Random;

public class ArrayTest {
	public static void main(String[] args) {
		// 배열!
		// 배열이란 : 대량의 데이터를 하나의 이름으로 저장한 곳
		// 1차원 배열 : 선형적으로 데이터를 저장하고 가져오기 위해서 사용한다.
		// 중요 , 배열은 객체입니다!
		// 배열을 생성할 때는, 객체를 생성하듯이.
		
		//데이터타입[] 배열이름 = new 데이터타입[배열 요소 갯수];
		int[] nums = new int[15];
		// int 형의 값 10개가, nums 라는 배열에 담겨 있다!
		// 배열의 길이를 구하려면, 배열이름.length 를 쓰면 된다.
		
		System.out.println(nums.length);
		// 배열은, 각각의 값이  인덱스라는 방 번호로 찾아갈 수 있다.
		char[] hotel = new char[4];
		// ctrl + alt + 아래화살표
		hotel[0] = 'A';
		hotel[1] = 'B';
		hotel[2] = 'C';
		hotel[3] = 'D';	
		// 0 : A, 1 : B, 2 : C, 3 : D
		
		for(int roomNo = 0; roomNo < hotel.length; roomNo++) {
			// roomNo 0에서 시작해서,
			// roomNo 가 hotel 의 길이보다(방의 갯수보다) 작을 동안
			// roomNo를 1씩 더해주면서 찾아보자.
			char person = hotel[roomNo]; // roomNo 번의 방에 있는 사람!
			System.out.println(person);
			if(person == 'C') {
				System.out.println(roomNo + "번 방에 있다!");
				break;
			}
		}
		// 호텔에 있는 모든 사람의 이름을 출력하고 싶다.
		// hotel 배열의 데이터타입과, person 의 데이터타입을 갖게 해야한다.
		for(char person : hotel) {
			System.out.println(person); // 인덱스를 못쓴다(방번호를 못쓴다)
		}
		
		// 로또 번호!
		Random random = new Random(); //  Random 타입의 random 이라는 변수에, new Random() 을 통해서, Random 인스턴스를 부여한다. 새로운 객체를 만든 거다.
		int next = random.nextInt(45) + 1; // 1부터 45까지.
		System.out.println(next);
		// 1번 과제 : 6개의 로또 번호를 랜덤으로 생성해주는 로또 번호 제작 클래스 만들기
		
		// 배열의 단점 : 한 번 만든 사이즈로 고정되어 있다.
		// 호텔을 만들었으면, 방을 늘릴 수가 없다. 그래서 나온게 -> ArrayList
		
		// 알고리즘에서 "시뮬레이션(구현)" 문제에서, 많이 쓰이는 배열 deep copy!
		char[] arr1 = new char[3];
		arr1[0] = 'A';
		arr1[1] = 'B';
		arr1[2] = 'C';
		char[] arr2 = arr1;
		System.out.println("============");
		for(int i = 0; i < 3; i++) {
			System.out.println(arr1[i]);
		}
		System.out.println("============");
		for(int i = 0; i < 3; i++) {
			System.out.println(arr2[i]);
		}
		arr1[0] = 'F';
		// arr1 의 0번 "만" F로 바뀌는 것
		// arr2 의 0번은 안 바뀌었으면 좋겠다.
		System.out.println("============");
		for(int i = 0; i < 3; i++) {
			System.out.println(arr1[i]);
		}
		System.out.println("============");
		for(int i = 0; i < 3; i++) {
			System.out.println(arr2[i]);
		}
		// 왜 이러냐면
		// arr2 = arr1 을 했다는 건
		// arr2 가 arr1 의 메모리 주소를 참조한다. 는 의미이다.
		// shallow copy 얕은 복사
		
		// 깊은 복사를 하려면,
		char[] arr3 = new char[3];
		// 1번 : 반복문 돌면서 하나하나 넣어주기
		for(int i = 0; i < 3; i++) {
			arr3[i] = arr1[i];
		}
		System.out.println("============");
		for(int i = 0; i < 3; i++) {
			System.out.println(arr3[i]);
		}
		arr1[1] = 'G';
		System.out.println("============");
		for(int i = 0; i < 3; i++) {
			System.out.println(arr1[i]);
		}
		System.out.println("============");
		for(int i = 0; i < 3; i++) {
			System.out.println(arr3[i]);
		}
		// 2번 : 메서드 쓰기.
		char[] arr4 = arr1.clone();
		arr1[2] = 'H';
		System.out.println("============");
		for(int i = 0; i < 3; i++) {
			System.out.println(arr1[i]);
		}
		System.out.println("============");
		for(int i = 0; i < 3; i++) {
			System.out.println(arr4[i]);
		}
		
		// 다차원 배열
		// 호텔의 복도가 여러 층 있는 것
		int[][] hotel2 = new int[5][10]; // 앞에 나오는 숫자는 층의 갯수, 뒤에 나오는 숫자가 한 층당 방의 개수.
		// 다차원 배열의 조회는, 2중 for문을 통해서 조회를 해준다.
		for(int floorNo = 0; floorNo < hotel2.length; floorNo++) {
			System.out.print(floorNo + " 층 : ");
			for(int roomNo = 0; roomNo < hotel2[floorNo].length; roomNo++) {
				// 층 내에서 보는건 방의 갯수다.
				// System.out.println(); 
				// println 은 줄바꿈이 자동으로 적용.
				// 줄바꿈 안하려면 print
				System.out.print(hotel2[floorNo][roomNo] + " ");
			}
			System.out.println();
		}
	}
}
