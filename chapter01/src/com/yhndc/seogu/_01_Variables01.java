package com.yhndc.seogu;

public class _01_Variables01 {

	public static void main(String[] args) {
		int result = 0;
		int num1 = 100;
		int num2 = 10;
		result = num1 + num2;
		System.out.println("num1+num2 = " + result);
		// 자동 형변환, str을 입력 안해도 자동으로 jdk에서 알아서 바뀜
		System.out.println(num1 + "+" + num2 + "=" + result);
		System.out.println("num1 * num2 = " + num1 * num2);
		result = num1 - num2;
		System.out.println("num1 - num2 = " + result);
		result = num1 / num2;
		System.out.println("num1 / num2 = " + result);

		int v1 = 15;
		if (v1 > 10) {
			int v2 = v1 - 10;
			System.out.println("v2 : " + v2);
			System.out.println("v1 : " + v1);
		}
		// System.out.println("v2 : " + v2); v2는 if블럭안의 지역변수이므로 if문 밖에서 못 읽어옴
		System.out.println("v1 : " + v1);

		for (int i = 0; i < 10; i++) { // i= 0~9까지 증가하며 실행
			int v3 = v1 + i;
			System.out.println(v1 + "+" + i + "=" + v3);
		}
		// System.out.println(v3); 위와 같이 v3은 for문의 지역변수이므로 블럭 밖에서 동작이 안됨

	}

}
