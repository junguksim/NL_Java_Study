package nl_study_03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class CarTest {
	public static void main(String[] args) throws IOException {
		// 미션 1 : 입출력 방식으로, 우리가 원하는 차의 이름을 설정해줄 수 있어야 한다.
		// 1번 : 입출력 설정하기
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		// bufferedReader 만들기
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		// bufferedWriter 설정하기
		System.out.print("차 이름을 입력하세요! : ");
		String carName = bufferedReader.readLine();
		// BufferedReader, Writer 는 IOException 이라는 예외를 발생시킬 수 있다.
		Car c1 = new Car();
		// c1 이라는 Car 인스턴스를 만들었다.
		//Car c2 = new Car(carName, 150, 0);
		
		// c1 의 이름을 Setter 로 바꾸고, Getter 로 바뀐 값을 가져오기
		System.out.println("c1의 차이름을 설정하기 전, c1 의 차 이름은 : " + c1.getName());
		c1.setName(carName);
		c1.setSpeed(150);
		System.out.println("c1 의 차 이름은 : " + c1.getName());
		System.out.print("얼마나 운전하시겠어요 ? : ");
		int time = Integer.parseInt(bufferedReader.readLine());
		System.out.println("운전할 시간은 : " + time);
		c1.drive();
		c1.drive(time); // time 초 동안 가속도 없이 운전
		c1.drive(time, 5); // time 초 동안 5의 가속도로 운전
		bufferedReader.close();
		bufferedWriter.close();
		// 이 둘은 반드시 close 를 해줘야 한다.
	}
}
