package com.yhndc.seogu;

public class Calculator {

	// 문자열 연결 계산
	// 두 문자열은 연결하는 add 메서드를 오버로딩
	String add(String values1, String values2) {
		return values1 + values2;
	}

	// 정수 배열의 합
	// 정수 배열을 받아 모든 요소의 합을 계산하는 add 메서드를 오버로딩
	// 예: {1, 2, 3} = 6
	int add(int[] number) {
		int sum = 0;
		for (int num : number) {
			sum += num;
		}
		return sum;
	}

	// 혼합 타입 계산
	// 정수(int)와 실수(double)을 받아 합을 계산하는 add 메서드를 오버로딩
	// 예 : 2 + 3.5 = 5.5
	double add(int num1, double num2) {
		return num1 + num2;
	}

	// 일반 타입 계산
	// 정수를 입력 받아 10을 더한 값을 반환
	// 예 : 5 -> 15
	int add(int num1) {
		return num1 + 10;
	}
}
