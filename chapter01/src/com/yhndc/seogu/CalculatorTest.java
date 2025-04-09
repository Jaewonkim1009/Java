package com.yhndc.seogu;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator myCal = new Calculator();

		String myCal1 = myCal.add("Hello, ", "World");
		System.out.println("문자열 연결: " + myCal1);

		int myCal2 = myCal.add(new int[] { 1, 2, 3, 4, 5, 6, 7 });
		System.out.println("배열의 총합: " + myCal2);

		System.out.println("정수 + 실수의 합: " + myCal.add(2, 3.5));

		System.out.println("입력값 + 10: " + myCal.add(5));
	}
}
