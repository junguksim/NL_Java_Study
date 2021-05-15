package nl_study_03;

public class Car {
	String name;
	int speed;
	int location;
	// �ʵ� : � Ŭ������ ���� ��, �� Ŭ������ ������ ������ ��Ÿ���� ����
	// �޼��� : � Ŭ������ ���� ��, �� Ŭ������ �� �� �ִ� ��ɵ��� ��Ÿ��.
	
	// �ʵ忡 � ���� �Ҵ��س�����, �� ���� default ���� �ȴ�.
	// �Ҵ��س��� �ʴ´ٸ�, java �������� �� Ÿ�Կ� �´� default ���� ������ ���ش�.
	
	// �Ҵ����� �ʾ��� ����� ����Ʈ ��
	// int �� 0
	// String �� null
	// boolean �� false
	// char �� '' (����)
	
	// �⺻ ������
	Car() {
		// Car c1 = new Car();
		// ���⼭ this ��, Car ������(new Car() ) �� ȣ���� �� ��
		// ��������� c1 �̶�� �ν��Ͻ� ��ü�� ����Ų��.
		// �� this ��  c1�� ����Ų��.
		System.out.println("���� ���� �Ǿ���, �� ���� �̸��� " + this.name + " �Դϴ�. �ӵ��� " + this.speed + "�Դϴ�.");
	}
	
	// �ʵ忡 ���ϴ� ���� �ִ� 2���� ���
	// 1��° : ������ �����ε�
	// Alt + Shift + S �� ������, Generate Constructor with fields �� �ϸ�
	// �ʵ带 argument �� �޴� �����ڸ� ���� �� �ִ�.
	// �����ε��̶�? �޼����, �����ڵ� �̸��� ���� �ϰ�, ������ �ٸ��� �ؼ�, ����� ����� ���� �̸����� ������ �ʰ� ���ϰ� ����ϱ� ����.
	
	// �����ε� �� ������
//	Car(String ���̸�, int ���ӵ�, int ����ġ) {
//		super();
//		System.out.println("name = " + name);
//		System.out.println("�캯�� ���̸� = " + ���̸�);
//		name = ���̸�;
//		System.out.println("speed = " + speed);
//		System.out.println("�캯�� ���ӵ� = " + ���ӵ�);
//		speed = ���ӵ�;
//		location = ����ġ;
//		System.out.println("���� �����ε����� ���� �Ǿ���, �� ���� �̸��� : " +name + "�Դϴ�.");
//	}
	
	public Car(String name, int speed, int location) {
		super();
		this.name = name;
		this.speed = speed;
		this.location = location;
	}

	// 2��° : Getter / Setter ( �� �������� �� / �� �����ϴ� �� )
	// �Ȱ��� Alt + Shift + S ������, Generate Getters and Setters �� ����

	public String getName() {
		return name; // Getter : name �� �������� �޼���
	}

	public void setName(String ���̸�) {
		name = ���̸�; // Setter : name �� �����ϴ� �޼���
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
	
	//���� 2. �޼��� �����ε��� � ������� ����ؾ� �ϴ���??? ���� �� �ȿͿ�.
	//Java �۸�� !! => Ŭ�� �ڵ����� ������ �߿��� ���
	// Ŭ�� �ڵ��� ���ĸ� ? �ڵ��� ����ϰ�(�����ϱ� ����) �ϴ� ��
	
	// �۸��
	// camelCase, kebab-case, snake_case
	// camelCase �� �ܾ�1�� �ܾ�2�� �̾��� ��, �ܾ�2�� ù ���ڸ� �빮�ڷ� ���� ��
	// �ܾ� 1�� ������ �ҹ��ڷ� ���� (��Ÿ�� ���츮�� �����ϼ���)
	// �츮�� camelCase �� ���ϴ�!
	
	// 1. Ŭ������ ù ���ڴ� ������ �빮��
	// 2. �ʵ峪, ������, �޼ҵ��� ù ���ڴ� ������ �ҹ���(camelCase)
	// 3. Ŭ������ ���� �ܾ �̷���� �ִٸ�, ù ���� �빮��, ������ camelCase => PascalCase
	
	// ���� �����ϴ� ����� ���� ��
	
	// �޼ҵ� �ۼ���
	// ������ (static) ����Ÿ�� �޼����̸�
	
	void drive() {
		System.out.println("���� ���~");
	}
	
	void drive(int time) {
		System.out.println("���� �ڵ����� ��ġ : " + this.location);
		this.location += this.speed * time; // �ӷ� * �ð� �� ���� location �� �����ش�.
		System.out.println("speed : " + this.speed );
		System.out.println("time : " + time);
		System.out.println("���� ���� �ڵ����� ��ġ : " + this.location);
	}
	
	// �޼ҵ� �����ε�
	// �Ȱ��� ��������ε�, ���ӵ��� �ٴ� �ɷ�
	void drive(int time, int acc) {
		// ����, ���ӵ��� �پ �ӵ��� �����ؾ���.
		System.out.println("���� �ڵ����� ��ġ : " + this.location);
		System.out.println("acc : " + acc);
		int speed = this.speed;
		for(int i = 1; i <= time; i++) {
			// 1�ʺ��� time ����,
			// ������ �ӵ����� ���ӵ���ŭ �� �پ�� ��.
			// �ð��� 10, ���ӵ��� 5
			// 150, 155, 160, 165, ...
			
			// �� �� �����ؾ� �� ����,
			// �⺻ �ӵ��� ���������� �����ع����ٸ�?
			// c1.drive(10, 5);
			// ��������� �ӵ��� 150,155,160,165..., �ʱ�ӵ��� 150�� �ƴ϶� 200�� �Ǿ������.
			
			// �״ϱ�, �� �޼��� �������� 150,155,160 �̷��� ���� �ϰ�,
			// �ʵ��� �⺻ speed �� 150�� �ǵ帮�� ����!
			
			speed += acc;
			// speed : 150, 155, 160, ...
			location += speed;
		}
		System.out.println("���ӵ��� �ٴ� ���� ���� �ڵ����� ��ġ : " + this.location);
	}
} 