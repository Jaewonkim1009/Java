package com.yhndc.seogu;

import java.util.Scanner;

public class _05_Scanner {

	public static void main(String[] args) {
		// 실습
		// 정수를 입력받아 제곱값을 출력하는 식을 만들기
		Scanner scan = new Scanner(System.in);
		// System.out.print("숫자를 입력 해주세요. => ");
		// int number = scan.nextInt();
		// System.out.println("입력한 수의 제곱은 : " + number * number);

		// 정수를 입력 받아
		// 1. 4와 5로 나누어 지는지
		// 2. 4 또는 5로 나누어 지는지
		// 3. 4나 5중 하나로 나누어 지지만 두 수 모두로는 나누어지지 않는지를 true false 로 출력하는 식 작성

		System.out.print("숫자를 입력 해주세요. => ");
		int num = scan.nextInt();

		boolean result1 = (num % 4 == 0 && num % 5 == 0);
		boolean result2 = (num % 4 == 0 || num % 5 == 0);
		boolean result3 = (num % 4 == 0 ^ num % 5 == 0);
		System.out.println("숫자가 4와 5로 나누어 집니까 ? " + result1);
		System.out.println("숫자가 4 또는 5로 나누어 집니까 ? " + result2);
		System.out.println("숫자가 4나 5로 나누어 지지만 두 수 모두로 나누어 지지 않습니까? " + result3);

		// 대학을 졸업하려면 최소 140 학점을 이수해야 한다
		// 이수한 학점 중 전공은 70 학점 이상이어야 하며
		// 교양과 일반은 각각 30 학점 이상이거나 두 영역이 80 학점 이상이어야 한다.
		// 이수한 세 개의 학점을 각각 입력 받아 졸업 여부를 출력하는 프로그램을 작성하자.

		System.out.println("전공 학점을 입력 해주세요 : ");
		int num1 = scan.nextInt();
		System.out.println("교양 학점을 입력 해주세요 : ");
		int num2 = scan.nextInt();
		System.out.println("일반 학점을 입력 해주세요 : ");
		int num3 = scan.nextInt();

		int total = num1 + num2 + num3;

		if (total >= 140 && num1 >= 70 && (num2 >= 30 && num3 >= 30) || (num2 + num3 >= 80)) {
			System.out.println("전공 학점 : " + num1);
			System.out.println("교양 학점 : " + num2);
			System.out.println("일반 학점 : " + num3);
			System.out.println("졸업 가능 학점입니다.");
		} else {
			System.out.println("전공 학점 : " + num1);
			System.out.println("교양 학점 : " + num2);
			System.out.println("일반 학점 : " + num3);
			System.out.println("졸업 불가");
		}

		scan.nextLine();

		// 0 ~ 999 사이의 정수를 입력 받아 각 자리수를 더한 결과를 출력하는 프로그램을 작성하자.
		System.out.println("0 ~ 999 사이의 숫자를 입력해주세요 : ");
		int number = scan.nextInt();
		int sum = (number / 100) + ((number / 10) % 10) + (number % 10);
		System.out.println("각 자릿수의 합 = " + sum);
	}
}
