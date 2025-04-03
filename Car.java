package com.yhndc.seogu;

public class Car {

	// 필드 선언
	String company;
	String model;
	String color;
	int maxSpeed = 350;
	int speed;

	// 생성자
	Car() {
		company = "현대자동차";
		model = "그랜저";
		color = "black";
	}

	// 매개변수가 있는 생성자
	Car(String company, String model, String color) {
		this.company = company;
		this.model = model;
		this.color = color;
	}

	// 메소드
	void carPrint() {
		System.out.println(company + ", " + model + ", " + color + ", " + maxSpeed);
	}

	String carPrint2() {
		return (company + ", " + model + ", " + color + ", " + maxSpeed);
	}

}
