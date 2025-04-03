package com.yhndc.seogu;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class _07_DoWhile {

	public static void main(String[] args) {
//		int num = 0;
//
//		do {
//			System.out.println("I Like Java " + num);
//			num++;
//
//		} while (num < 10);
//
//		while (num < 20) {
//			System.out.println("I Like Java " + num);
//			num++;
//		}

		// 1 ~ 100사이의 랜덤 숫자를 생성 합니다.
		// 사용자가 숫자를 입력하면 입력 값이 정답보다 큰지 작은지 힌트를 주고
		// 정답을 맞출 때 까지 반복
		// 정답을 맞추면 시도를 횟수를 출력하고 게임을 종료
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		int targetNumber = random.nextInt(100) + 1; // 0 ~ 99까지의 수를 랜덤으로 가져옴 +1을 해 1~100까지 설정
		int count = 0;
		System.out.println("1 ~ 100 숫자 맞추기 게임을 시작합니다.");
		while (true) {
			int number = 0;
			try {
				System.out.println("숫자를 입력 해주세요. : ");
				number = scan.nextInt();
				if (number < 1 || number > 100) {
					System.out.println("1 ~ 100까지의 숫자만을 입력 해주세요");
					continue;
				}
			} catch (InputMismatchException e) {
				System.out.println("잘못 입력하셨습니다. 숫자를 입력 해주세요.");
				scan.nextLine();
				continue;
			}
			count++;
			if (number > targetNumber) {
				System.out.println("더 작은 숫자를 입력 해주세요.");
			} else if (number < targetNumber) {
				System.out.println("더 큰 숫자를 입력 해주세요.");
			} else {
				System.out.println("정답입니다! " + count + "번 만에 맞췄습니다.");
				System.out.println("게임을 다시 시작하시겠습니까? (y/n)");
				char re = scan.next().charAt(0);
				if (re == 'y') {
					System.out.println("게임을 다시 시작합니다.");
					targetNumber = random.nextInt(100) + 1;
					count = 0;
					continue;
				} else {
					System.out.println("게임을 종료 합니다.");
					break;
				}
			}
		}
		scan.close();
	}

}
