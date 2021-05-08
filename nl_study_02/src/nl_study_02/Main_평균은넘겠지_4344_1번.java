package nl_study_02;

import java.util.Arrays;
import java.util.Scanner;

public class Main_평균은넘겠지_4344_1번 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int C = scanner.nextInt(); // 테스트 케이스 수
		for(int i = 0; i < C; i++) {
			// C 번 동안
			int N = scanner.nextInt(); // 학생의 수
			int[] scores = new int[N]; // 학생들의 점수
			for(int j = 0 ; j < N; j++) {
				// 학생의 수 N 동안
				scores[j] = scanner.nextInt();
			}
			// answer : 평균을 넘는 학생들의 비율
			/**
			 * 1. 평균을 먼저 구한다.
			 * 2. 반복문을 돌면서 평균과 비교를 하면서
			 * 3. 평균보다 높은 점수를 받은 학생들의 수를 센다.
			 * 4. 출력 : (평균보다 높은 점수를 받은 학생들의 수 / 전체 학생 수)
			 */
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
			System.out.printf("%.3f%%\n", result);
		}
	}
}
