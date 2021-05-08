package nl_study_02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
/**
 * 
 * @author sim
 * 1.Java 입출력에서, 가장 많이 쓰이는 두가지는 Scanner, BufferedReader (입력)
 * 출력은 System.out.println, BufferedWriter (출력)
 * 근데 속도, 메모리 등 모든 면에서 BufferedWriter/Reader 압도적으로 좋다.
 * 좀 어려운 문제 풀때나, 시간 제한이 빡빡한 문제거나, 입력, 출력할 데이터가 많은 경우 
 * BufferedReader, BufferedWriter 를 쓰자!
 * 
 * 2. 
 * 5 50 50 70 80 100
 * 공백을 기준으로 입력이 들어오는 경우,
 * StringTokenizer 라는 클래스가 있는데 이걸 쓰는게 좋다. (이게 더 빠르다)
 * 
 * 3. 출력의 경우는 BufferedWriter 말고도 StringBuffer 나 StringBuilder 가 있는데,
 * 이건 필요할 때 쓰면 됩니다.
 */

// Exception 이란 : 해당 메서드에서, 일어날 수 있는 예외 상황
// 내가 메서드라면,
// 나는 10 이라는 숫자를 받아서 20을 리턴할 예정이었다.
// 그런데, int 10 이 안들어오고 String "10" 이 들어왔다.
// 그러면 숫자 10을 받은게 아니니까 20을 리턴할 수가 없다.

// 이런 상황이 예외상황

// try catch -> 내가 책임지고 예외처리한다.
// throws -> 나를 사용하는 누군가가 알아서 예외처리해라!

public class Main_평균은넘겠지_4344_2번 {
	public static void main(String[] args) throws IOException {
		// 템플릿으로 백준 템플릿을 저장해두면 문제 풀때마다 편하게 쓸 수 있다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int C = Integer.parseInt(br.readLine()); // readLine 은 String 형태로 불러온다.
		for(int i = 0; i < C; i++) {
			// C 번 동안
			StringTokenizer line = new StringTokenizer(br.readLine());
			// new StringTokenizer(String의 무언가)
			// String의 무언가를 -> 두번 째 인자로 delimeter 를 쓸 경우 그 delimeter 를 기준으로 나눠준다
			// 두번째 인자를 안 쓴 경우, " " 한칸 공백 기준으로 쪼개준다.
			// line.nextToken(); // 그냥 이렇게만 쓰면 skip 개념
			int N = Integer.parseInt(line.nextToken());
			int[] scores = new int[N];
			for(int j = 0 ; j < N; j++) {
				scores[j] = Integer.parseInt(line.nextToken());
			}
			double avg = 0.0;
			int sum = 0;
			int higherThanAvg = 0;
			double result = 0.0;
			for(int j = 0 ; j < N; j++) {
				sum += scores[j];
			}
			avg = sum / N;
			for(int j = 0 ; j < N; j++) {
				if(scores[j] > avg) {
					higherThanAvg++;
				}
			}
			result = higherThanAvg * 100 / N;
			//System.out.printf("%.3f%%\n", result);
			bw.write("안녕하세요!\n");
		}
		br.close();
		bw.close();
		// close 를 해준다 -> 메모리를 반환해준다.
		// 특히 bw 는 close 를 안해주면 출력이 안되니까 꼭 close 해주는 습관
	}
}
