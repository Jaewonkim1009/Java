package com.yhndc.seogu;

public class CarTest {

	public static void main(String[] args) {
		// 객체 생성
		Car myCar = new Car();

		// 필드값 읽기
		System.out.println(myCar.model);
		System.out.println(myCar.maxSpeed);
		myCar.carPrint();

		// 필드값 변경
		myCar.speed = 60;
		System.out.println("현재 속도는 " + myCar.speed);

		Car myCar2 = new Car("기아자동차", "K9", "red");
		System.out.println(myCar2.model);
		System.out.println(myCar2.color);
		myCar2.carPrint();

	}

}
