package com.yhndc.seogu;

public class PhoneTest1 {

	public static void main(String[] args) {
		Phone1 myPhone = new Phone1("Apple");

		myPhone.turnOn();
		myPhone.useBattery(50);

		Phone1 myPhone2 = new Phone1("Apple", 80, false);

		myPhone2.turnOn();
		myPhone2.useBattery(80);
		myPhone2.turnOff();
	}
}
