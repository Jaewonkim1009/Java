package com.yhndc.seogu;

public class PetTest {

	public static void main(String[] args) {
		Pet myPet = new Pet("초코", 2, "강아지");

		myPet.printInfo();
		myPet.makeSound();
		myPet.play();
		myPet.play();
		myPet.eat();
		myPet.play();
		myPet.printInfo();

		Pet myPet2 = new Pet("쿠키", 5, "고양이");

		myPet2.printInfo();
		myPet2.makeSound();
		myPet2.play();
		myPet2.eat();
		myPet2.printInfo();
	}
}
