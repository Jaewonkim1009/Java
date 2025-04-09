package com.yhndc.dongu;

public class CarTest {

	public static void main(String[] args) {
		Car myCar1 = new Car();
		myCar1.carPrint();

		Car myCar2 = new Car("그랜저");
		myCar2.carPrint();

		Car myCar3 = new Car("제네시스", "red");
		myCar3.carPrint();

		Car myCar4 = new Car("소나타", "black", 200);
		myCar4.carPrint();

	}

}
