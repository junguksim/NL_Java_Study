package nl_study_02;

// 1. 파일명이 곧 클래스명이 된다. (안 맞으면 컴파일 에러)
public class Movie { // "영화를 나타내는 객체"
	String title; 
	String director;
	int grade;
	String genre;
	String summary;
	// 멤버 변수(필드)
	// 필드란, 객체 내에서 정의되는 변수이다.
	
	// 생성자
	// 리턴 타입이 없어야 함.
	Movie() {
		System.out.println("디폴트 생성자로 생성됐습니다!");
	}
	
	Movie(String title, String summary) {
		// 오버로딩 생성자
		this.title = title;
		this.summary = summary;
		System.out.println("오버로딩 생성자로 생성됐습니다!");
		// this 라는 것은,
		// 자기 자신을 나타낸다.
		// this 가 없으면, 필드명만 같으면 자동으로 자기 자신을 나타낸
	}
	
	
	
	public Movie(String title, String director, int grade, String genre, String summary) {
		super();
		this.title = title;
		this.director = director;
		this.grade = grade;
		this.genre = genre;
		this.summary = summary;
	}

	// Movie movie = new Movie(); // Movie 객체가 생성 된다.
	// movie.title => movie 라는 Movie 객체의, title 이라는 필드를 가져온다.
	
	void movieInfo() {
		// default 생성자!
		// 아무런 arguments 가 없다.
		// 단순하게 Movie 를 참조하는 객체를 생성하는 역할만 한다.
		
	}
	
	
	
	
	// 메서드
	// 메서드란? 객체가 할 수 있는 기능
	// movieInfo 메서드의 경우는, 영화의 정보를 출력하는 기능
	
	void showMovie() {
		System.out.println(title + "을(를) 보여줬습니다~");
	}
	// showMovie 메서드는, "영화를 보여줬습니다~" 를 출력하는 기능!
	
	void moveTheater(String newTheater) { // newTheater -> Argument 라고도 하고, Parameter 라고도 한다.
		// 상영관을 옮기는 메서드
		// newTheater 로 옮길 것이다.
		System.out.println(newTheater + " 로 상영관을 옮겼습니다!");
	}

	
	//String toString() {} // Object 에서 상속받은 메서드의 visibility 를 줄일 수 없다.
	//toString 은 Object (최상위 객체) 가 기본적으로 가지고 있는 메서드(기능) 이다.
	// 자동완성을 제공합니다. (IDE에서)
	// Alt+Shift+S 를 누르면
	@Override // 뭔지 모를 이상한게 붙어있다.
	public String toString() {
		return "Movie [title=" + title + ", director=" + director + ", grade=" + grade + ", genre=" + genre
				+ ", summary=" + summary + "]";
		// 필드 명이랑 그 값을 출력해주는 메서드
	}
	
}
