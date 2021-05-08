package nl_study_02;

import java.util.Arrays;
import java.util.Scanner;

public class Main_������Ѱ���_4344_1�� {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int C = scanner.nextInt(); // �׽�Ʈ ���̽� ��
		for(int i = 0; i < C; i++) {
			// C �� ����
			int N = scanner.nextInt(); // �л��� ��
			int[] scores = new int[N]; // �л����� ����
			for(int j = 0 ; j < N; j++) {
				// �л��� �� N ����
				scores[j] = scanner.nextInt();
			}
			// answer : ����� �Ѵ� �л����� ����
			/**
			 * 1. ����� ���� ���Ѵ�.
			 * 2. �ݺ����� ���鼭 ��հ� �񱳸� �ϸ鼭
			 * 3. ��պ��� ���� ������ ���� �л����� ���� ����.
			 * 4. ��� : (��պ��� ���� ������ ���� �л����� �� / ��ü �л� ��)
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
