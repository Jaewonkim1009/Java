package com.yhndc.dongu;

public class Car {
	// 제조사, 모델, 컬러, 최고속도
	String company;
	String model;
	String color;
	int maxSpeed;

	// this() : 같은 클래스의 다른 생성자를 호출 할 때 사용
	// 가장 처음으로 호출한다
	Car() {
		this("아반테", "blue", 200);
		this.company = "현대자동차";
//		this.model = "아반테";
//		this.color = "blue";
//		this.maxSpeed = 200;
	}

	Car(String model) {
		this("blue", model, 350);
		this.company = "기아자동차";
//		this.model = model;
//		this.color = "blue";
//		this.maxSpeed = 350;
	}

	Car(String model, String color) {
		this(model, color, 350);
		this.company = "BMW";

//		this.model = model;
//		this.color = color;
//		this.maxSpeed = 350;
	}

	Car(String model, String color, int maxSpeed) {
		this.company = "BENZ";
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

// 리턴값이 없을 때 void를 사용 
	void carPrint() {
		System.out.println(company + ", " + model + ", " + color + ", " + maxSpeed);
	}

}
