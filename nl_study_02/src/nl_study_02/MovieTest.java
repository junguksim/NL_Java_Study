package nl_study_02;

public class MovieTest {
	public static void main(String[] args) {
		// 1. 객체를 사용하려면, 먼저 객체를 기반으로 인스턴스를 생성 해야 한다.
		// 생성자 , 즉 new 클래스명() 을 통해서 클래스를 참조하는 busanhang 이라는 인스턴스를 만든다.
		
		Movie busanhang = new Movie();
		Movie interstella = new Movie();
		Movie sherlock = new Movie("셜록 홈즈", "셜록이 추리하는 내용");
		Movie sevenNumber = new Movie("7번방의 선물", "민정욱", 15, "드라마", "슬퍼요");
		
		// 호출하는 이름은 똑같은데, argument 만 다르다
		// 이것을 오버로딩이라고 한다.
		
		System.out.println(sevenNumber);
		System.out.println(busanhang.title);
		System.out.println(sherlock.title); // 1. null 2. 셜록 홈즈
		// toString 이 없을 경우에, 인스턴스를 출력하면 메모리주소가 뜬다.
//		System.out.println(busanhang.toString());
//		System.out.println(interstella.toString());
//		
//		busanhang.title = "부산행";
//		busanhang.summary = "좀비가 나왔다..";
//		interstella.title = "인터스텔라";
//		interstella.summary = "지구가 망했다..";
//		System.out.println(busanhang.toString());
//		System.out.println(interstella.toString());
//		
//		// 인스턴스.필드명 으로 인스턴스의 필드값을 수정할 수 있다.
//		
//		// 인스턴스.메서드명() 로 인스턴스의 메서드를 호출할 수 있다.
//		busanhang.showMovie();
//		interstella.showMovie();
//		busanhang.moveTheater("CGV 서울 상봉점");
		
	
	}
}
