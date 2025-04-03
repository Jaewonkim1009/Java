package com.yhndc.seogu;

public class Computer {

	int sum1(int[] values) {

		int sum = 0;
		for (int num : values) {
			sum += num;
		}
		return sum;
	}

	int sum2(int... values) {
		int sum = 0;
		for (int num : values) {
			sum += num;
		}
		return sum;
	}

	// 가변 매개 변수의 순서는 최후미이다.
	/*
	 * int sum2(String name, int... values) { int sum = 0; for (int num : values) {
	 * sum += num; } return sum; }
	 */
	int sumInterface(int[] values) {
		int sum = 0;
		for (int num : values) {
			sum += num;
		}
		return sum;
	}

}
