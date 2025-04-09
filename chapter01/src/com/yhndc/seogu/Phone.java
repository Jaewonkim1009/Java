package com.yhndc.seogu;

public class Phone {
	String brand;
	int batteryLevel;
	boolean isOn;

	Phone() {
	}

	Phone(String brand) {
		this.brand = brand;
		this.batteryLevel = 100;
		this.isOn = false;
	}

	Phone(String brand, int batteryLevel) {
		this.brand = brand;
		this.batteryLevel = batteryLevel;
		this.isOn = false;
	}

	Phone(String brand, int batteryLevel, boolean isOn) {
		this.brand = brand;
		this.batteryLevel = batteryLevel;
		this.isOn = isOn;
	}

}
