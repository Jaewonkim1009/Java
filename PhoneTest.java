package com.yhndc.seogu;

public class PhoneTest {

	public static void main(String[] args) {
		Phone myPhone1 = new Phone("samsung");

		System.out.println("브랜드 : " + myPhone1.brand);
		System.out.println("배터리 잔량 : " + myPhone1.batteryLevel);
		System.out.println("전원상태 : " + myPhone1.isOn);

		Phone myPhone2 = new Phone("Apple", 80);

		System.out.println("브랜드 : " + myPhone2.brand);
		System.out.println("배터리 잔량 : " + myPhone2.batteryLevel);
		System.out.println("전원상태 : " + myPhone2.isOn);

		Phone myPhone3 = new Phone("Samsung", 60, true);

		System.out.println("브랜드 : " + myPhone3.brand);
		System.out.println("배터리 잔량 : " + myPhone3.batteryLevel);
		System.out.println("전원상태 : " + myPhone3.isOn);

		Phone myPhone4 = new Phone(); // error

	}

}
