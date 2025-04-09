package com.yhndc.seogu;

public class Phone1 {

	// 필드
	String brand;
	int batteryLevel;
	boolean isOn;

	Phone1() {
	}

	Phone1(String brand) {
		this.brand = brand;
		this.batteryLevel = 100;
		this.isOn = false;
	}

	Phone1(String brand, int batteryLevel) {
		this.brand = brand;
		this.batteryLevel = batteryLevel;
		this.isOn = false;
	}

	Phone1(String brand, int batteryLevel, boolean isOn) {
		this.brand = brand;
		this.batteryLevel = batteryLevel;
		this.isOn = isOn;
	}

	void turnOn() {
		if (isOn == false && batteryLevel > 0) {
			isOn = true;
			System.out.println(brand + " 전원이 켜졌습니다.");
		}
	}

	void useBattery(int amount) {
		if (isOn == true) {
			batteryLevel -= amount;
			System.out.println(brand + "배터리가 " + amount + "% 사용 되었습니다. 남은 배터리 : " + batteryLevel + "%");
		}

	}

	void turnOff() {
		if (isOn == true && batteryLevel <= 0) {
			isOn = false;
			System.out.println("핸드폰 전원이 꺼져있습니다.");
		}
	}
}
