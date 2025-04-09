package com.yhndc.seogu;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class _13_practice2 {

	public static void main(String[] args) {

		/*
		 * 학생 점수 관리 프로그램 5명의 학생의 시험 점수를 입력받아 배열에 저장 저장된 점수를 이용해 다음을 계산하고 출력하세요. 1. 모든학생의
		 * 점수를 출력 2. 평균 점수 3. 최고 점수와 그 학생의 번호 (1번부터 시작) - 조건 배열과 for문을 사용 입력은 Scanner를
		 * 사용 80점 이상인 학생 수를 계산해 출력하는 기능을 추가 점수를 내림차순으로 정렬하여 출력하는 기능을 추가 (버블정렬사용)
		 * Arrays.sort(strArr, CollectionsreverseOrder());
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("5명의 학생 점수를 입력하세요 : ");
		System.out.println("학생 1의 점수 : ");
		int num1 = scan.nextInt();
		System.out.println("학생 2의 점수 : ");
		int num2 = scan.nextInt();
		System.out.println("학생 3의 점수 : ");
		int num3 = scan.nextInt();
		System.out.println("학생 4의 점수 : ");
		int num4 = scan.nextInt();
		System.out.println("학생 5의 점수 : ");
		int num5 = scan.nextInt();

		Integer[] scores = { num1, num2, num3, num4, num5 };

		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("### 모든 학생의 점수 ###");
		System.out.println("학생 1 : " + num1);
		System.out.println("학생 2 : " + num2);
		System.out.println("학생 3 : " + num3);
		System.out.println("학생 4 : " + num4);
		System.out.println("학생 5 : " + num5);

		double avg = (double) sum / scores.length;
		System.out.println("평균 점수 : " + avg);

		int max = scores[0];
		int student = 1;
		for (int i = 1; i < scores.length; i++) {
			if (scores[i] > max) {
				max = scores[i];
				student = i + 1;
			}
		}
		System.out.println("최고 점수 : " + max + "(학생 : " + student + ")");

		int min = scores[0];
		for (int i = 1; i < scores.length; i++) {
			if (scores[i] < min) {
				min = scores[i];
				student = i + 1;
			}
		}
		System.out.println("최저 점수 : " + min + "(학생 : " + student + ")");

		int highScore = 0;
		for (int i = 1; i < scores.length; i++) {
			if (scores[i] >= 80) {
				highScore++;
			}
		}
		System.out.println("80점 이상인 학생 수 : " + highScore + "명");

//		// 버블 정렬
//		for (int i = 0; i < scores.length - 1; i++) {
//			for (int j = 0; j < scores.length -1 - i; j++) {
//				if (scores[j] < scores[j + 1]) {
//					// 내림차순이므로 작은 값이 뒤로 가게 정렬
//					int temp = scores[j];
//					scores[j] = scores[j + 1];
////					scores[j + 1] = temp;
//				}
//			}
//		}

		System.out.println("### 내림차순으로 정렬된 점수###");
		Arrays.sort(scores, Collections.reverseOrder());
		for (int i : scores)
			System.out.printf(i + "점");
	}
}
