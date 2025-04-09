package com.yhndc.seogu;

import java.util.Arrays;

public class _14_multi_Array {

	public static void main(String[] args) {
		/*
		 * 학생별 시험 점수 관리 (열의 길이가 다른 2차원 배열) 한 반에 3명의 학생이 있고, 각 학생은 서로 다른 횟수의 시험을 봤다 이 시험
		 * 점수를 2차원 배열에 저장하고 다음을 계산하시오 1. 각 학생의 시험 점수를 출력 2. 각 학생의 평균 점수 3. 전체 학생의 최고 점수와
		 * 그 학생의 번호 (1번부터) -조건 1. 2차원 배열을 사용, 각 행(학생)의 열 길이(시험 횟수)는 다르게 설정 2. 배열과 for문을
		 * 활용 3. 입력은 미리 정의 된 값으로 사용 추가 각 학생의 최저 점수를 출력하도록 코드를 추가 전체 학생 중 90점 이상인 시험의 개수를
		 * 계산해보기 학생별로 점수를 오름차순으로 정렬하여 출력 (각 행별로 정렬)
		 */

		int[][] scores = { { 85, 90, 78 }, { 92, 88 }, { 95, 87, 91, 89 } };
		int max = 0;
		int student = 0;
		double[] avg = new double[scores.length];
		System.out.println("### 각 학생의 시험 점수 ###");

		for (int i = 0; i < scores.length; i++) {
			System.out.print("학생 " + (i + 1) + ": ");
			int sum = 0;

			for (int j = 0; j < scores[i].length; j++) {
				System.out.print(scores[i][j] + "점 ");
				sum += scores[i][j];

				if (scores[i][j] > max) {
					max = scores[i][j];
					student = i + 1;
				}
			}
			avg[i] = (double) sum / scores[i].length;
			System.out.println();
		}
		System.out.println();
		System.out.println("### 각 학생의 평균 점수 ###");
		for (int i = 0; i < scores.length; i++) {
			System.out.println("학생 " + (i + 1) + ": " + String.format("%.2f", avg[i]) + "점");
		}
		System.out.println();
		System.out.println("### 전체 최고 점수###");
		System.out.println("최고 점수 : " + max + "점" + "(학생 " + student + ")");

		System.out.println();
		System.out.println("### 각 학생의 최저 점수 ###");
		for (int i = 0; i < scores.length; i++) {
			int min = scores[i][0];
			System.out.print("학생 " + (i + 1) + ": ");
			for (int j = 0; j < scores[i].length; j++) {

				if (scores[i][j] < min) {
					min = scores[i][j];
				}
			}
			System.out.println(min + "점");
		}
		System.out.println();
		System.out.println("### 90점 이상인 시험 개수 ###");
		int totalHighScore = 0;
		for (int i = 0; i < scores.length; i++) {
			int highScore = 0;
			for (int j = 0; j < scores[i].length; j++) {
				if (scores[i][j] >= 90) {
					highScore++;
					totalHighScore++;
				}
			}
		}
		System.out.println("90점 이상 시험 수 : " + totalHighScore);
		System.out.println();

		System.out.println("### 오름차순으로 정렬 된 점수 ###");
		for (int i = 0; i < scores.length; i++) {
			Arrays.sort(scores[i]);
			System.out.print("학생 " + (i + 1) + ": ");

			for (int j = 0; j < scores[i].length; j++) {
				System.out.print(scores[i][j] + "점 ");
			}
			System.out.println();
		}
	}
}
