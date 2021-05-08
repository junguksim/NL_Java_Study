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
 * 1.Java ����¿���, ���� ���� ���̴� �ΰ����� Scanner, BufferedReader (�Է�)
 * ����� System.out.println, BufferedWriter (���)
 * �ٵ� �ӵ�, �޸� �� ��� �鿡�� BufferedWriter/Reader �е������� ����.
 * �� ����� ���� Ǯ����, �ð� ������ ������ �����ų�, �Է�, ����� �����Ͱ� ���� ��� 
 * BufferedReader, BufferedWriter �� ����!
 * 
 * 2. 
 * 5 50 50 70 80 100
 * ������ �������� �Է��� ������ ���,
 * StringTokenizer ��� Ŭ������ �ִµ� �̰� ���°� ����. (�̰� �� ������)
 * 
 * 3. ����� ���� BufferedWriter ���� StringBuffer �� StringBuilder �� �ִµ�,
 * �̰� �ʿ��� �� ���� �˴ϴ�.
 */

// Exception �̶� : �ش� �޼��忡��, �Ͼ �� �ִ� ���� ��Ȳ
// ���� �޼�����,
// ���� 10 �̶�� ���ڸ� �޾Ƽ� 20�� ������ �����̾���.
// �׷���, int 10 �� �ȵ����� String "10" �� ���Դ�.
// �׷��� ���� 10�� ������ �ƴϴϱ� 20�� ������ ���� ����.

// �̷� ��Ȳ�� ���ܻ�Ȳ

// try catch -> ���� å������ ����ó���Ѵ�.
// throws -> ���� ����ϴ� �������� �˾Ƽ� ����ó���ض�!

public class Main_������Ѱ���_4344_2�� {
	public static void main(String[] args) throws IOException {
		// ���ø����� ���� ���ø��� �����صθ� ���� Ǯ������ ���ϰ� �� �� �ִ�.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int C = Integer.parseInt(br.readLine()); // readLine �� String ���·� �ҷ��´�.
		for(int i = 0; i < C; i++) {
			// C �� ����
			StringTokenizer line = new StringTokenizer(br.readLine());
			// new StringTokenizer(String�� ����)
			// String�� ���𰡸� -> �ι� ° ���ڷ� delimeter �� �� ��� �� delimeter �� �������� �����ش�
			// �ι�° ���ڸ� �� �� ���, " " ��ĭ ���� �������� �ɰ��ش�.
			// line.nextToken(); // �׳� �̷��Ը� ���� skip ����
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
			bw.write("�ȳ��ϼ���!\n");
		}
		br.close();
		bw.close();
		// close �� ���ش� -> �޸𸮸� ��ȯ���ش�.
		// Ư�� bw �� close �� �����ָ� ����� �ȵǴϱ� �� close ���ִ� ����
	}
}
