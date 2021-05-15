package nl_study_03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class CarTest {
	public static void main(String[] args) throws IOException {
		// �̼� 1 : ����� �������, �츮�� ���ϴ� ���� �̸��� �������� �� �־�� �Ѵ�.
		// 1�� : ����� �����ϱ�
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		// bufferedReader �����
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		// bufferedWriter �����ϱ�
		System.out.print("�� �̸��� �Է��ϼ���! : ");
		String carName = bufferedReader.readLine();
		// BufferedReader, Writer �� IOException �̶�� ���ܸ� �߻���ų �� �ִ�.
		Car c1 = new Car();
		// c1 �̶�� Car �ν��Ͻ��� �������.
		//Car c2 = new Car(carName, 150, 0);
		
		// c1 �� �̸��� Setter �� �ٲٰ�, Getter �� �ٲ� ���� ��������
		System.out.println("c1�� ���̸��� �����ϱ� ��, c1 �� �� �̸��� : " + c1.getName());
		c1.setName(carName);
		c1.setSpeed(150);
		System.out.println("c1 �� �� �̸��� : " + c1.getName());
		System.out.print("�󸶳� �����Ͻðھ�� ? : ");
		int time = Integer.parseInt(bufferedReader.readLine());
		System.out.println("������ �ð��� : " + time);
		c1.drive();
		c1.drive(time); // time �� ���� ���ӵ� ���� ����
		c1.drive(time, 5); // time �� ���� 5�� ���ӵ��� ����
		bufferedReader.close();
		bufferedWriter.close();
		// �� ���� �ݵ�� close �� ����� �Ѵ�.
	}
}
