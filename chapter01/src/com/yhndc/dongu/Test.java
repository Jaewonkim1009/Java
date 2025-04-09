package com.yhndc.dongu;

public class Test {
	static int x = 10;

	int a = 5;

	static void printA() {
		/*
		 * System.out.println(a); 컴파일 에러 : int a = 5;는 인스턴스 필드이므로 static이 선언 된
		 * printA()에서 사용시 new를 사용하여 사용해야한다.
		 */
		Test obj = new Test();
		System.out.println(obj.a);
	}

	public static void main(String[] args) {
		Test t1 = new Test();
		Test t2 = new Test();
		t1.x = 20;
		System.out.println(t1.x);
		System.out.println(t2.x);
		// Test t1 = new Test();과 t2는 별개의 인스턴스를 만든다.
		// t1.x = 20에서 static의 int x = 10을 20으로 변경하여 t2.x도 20으로 변경됨
		Test obj2 = new Test();
		System.out.println(obj2.a);
		printA();

	}

}
