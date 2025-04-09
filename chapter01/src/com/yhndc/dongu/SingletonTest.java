package com.yhndc.dongu;

public class SingletonTest {

	public static void main(String[] args) {
		/*
		 * 컴파일 에러 : Private로 만들어서 new로 접근이 불가능 Singleton obj1 = new Singleton();
		 * Singleton obj2 = new Singleton();
		 */

		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();

		if (obj1 == obj2) {
			System.out.println("같은 Singleton 객체 입니다.");
		} else {
			System.out.println("다른 Singleton 객체 입니다.");
		}
	}

}
