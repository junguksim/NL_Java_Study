package nl_study_02;

// 1. ���ϸ��� �� Ŭ�������� �ȴ�. (�� ������ ������ ����)
public class Movie { // "��ȭ�� ��Ÿ���� ��ü"
	String title; 
	String director;
	int grade;
	String genre;
	String summary;
	// ��� ����(�ʵ�)
	// �ʵ��, ��ü ������ ���ǵǴ� �����̴�.
	
	// ������
	// ���� Ÿ���� ����� ��.
	Movie() {
		System.out.println("����Ʈ �����ڷ� �����ƽ��ϴ�!");
	}
	
	Movie(String title, String summary) {
		// �����ε� ������
		this.title = title;
		this.summary = summary;
		System.out.println("�����ε� �����ڷ� �����ƽ��ϴ�!");
		// this ��� ����,
		// �ڱ� �ڽ��� ��Ÿ����.
		// this �� ������, �ʵ�� ������ �ڵ����� �ڱ� �ڽ��� ��Ÿ��
	}
	
	
	
	public Movie(String title, String director, int grade, String genre, String summary) {
		super();
		this.title = title;
		this.director = director;
		this.grade = grade;
		this.genre = genre;
		this.summary = summary;
	}

	// Movie movie = new Movie(); // Movie ��ü�� ���� �ȴ�.
	// movie.title => movie ��� Movie ��ü��, title �̶�� �ʵ带 �����´�.
	
	void movieInfo() {
		// default ������!
		// �ƹ��� arguments �� ����.
		// �ܼ��ϰ� Movie �� �����ϴ� ��ü�� �����ϴ� ���Ҹ� �Ѵ�.
		
	}
	
	
	
	
	// �޼���
	// �޼����? ��ü�� �� �� �ִ� ���
	// movieInfo �޼����� ����, ��ȭ�� ������ ����ϴ� ���
	
	void showMovie() {
		System.out.println(title + "��(��) ��������ϴ�~");
	}
	// showMovie �޼����, "��ȭ�� ��������ϴ�~" �� ����ϴ� ���!
	
	void moveTheater(String newTheater) { // newTheater -> Argument ��� �ϰ�, Parameter ��� �Ѵ�.
		// �󿵰��� �ű�� �޼���
		// newTheater �� �ű� ���̴�.
		System.out.println(newTheater + " �� �󿵰��� �Ű���ϴ�!");
	}

	
	//String toString() {} // Object ���� ��ӹ��� �޼����� visibility �� ���� �� ����.
	//toString �� Object (�ֻ��� ��ü) �� �⺻������ ������ �ִ� �޼���(���) �̴�.
	// �ڵ��ϼ��� �����մϴ�. (IDE����)
	// Alt+Shift+S �� ������
	@Override // ���� �� �̻��Ѱ� �پ��ִ�.
	public String toString() {
		return "Movie [title=" + title + ", director=" + director + ", grade=" + grade + ", genre=" + genre
				+ ", summary=" + summary + "]";
		// �ʵ� ���̶� �� ���� ������ִ� �޼���
	}
	
}
