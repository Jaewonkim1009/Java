package com.yhndc.seogu;

import java.util.Scanner;

public class _06_Char {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 아스키코드표를 참고하여 대문자를 소문자로 바꾸기
		System.out.println("알파벳 소문자로 변환 할 대문자를 입력 해주세요 : ");
		char input = scan.next().charAt(0);
		char lowerInput;

		if (input >= 'A' && input <= 'Z') {
			// 소문자로 변환하기
			lowerInput = (char) (input + 32);
			System.out.println(lowerInput);
		} else {
			System.out.println("대문자를 입력 해주세요.");
		}
		// 3항 연산자 사용
		char lowerInput2 = (input >= 'A' && input <= 'Z') ? (char) (input + 32) : input;
		if (input == lowerInput2) {
			System.out.println("입력 오류");
		} else {
			System.out.println(lowerInput2);
		}

	}

}
