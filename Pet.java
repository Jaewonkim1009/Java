package com.yhndc.seogu;

public class Pet {

	String name;
	int age;
	String type;
	int energy;

	Pet() {
	}

	Pet(String name, int age, String type) {
		this.name = name;
		this.age = age;
		this.type = type;
		this.energy = 100;
	}

	void makeSound() {
		if (type.equals("강아지")) {
			System.out.println(name + "이(가) 멍멍 짖습니다");
		} else {
			System.out.println(name + "이(가) 울고 있습니다.");
		}
	}

	void eat() {
		energy += 10;
		System.out.println(name + "이(가) 먹이를 먹었습니다." + "에너지: " + energy + "%");
	}

	void play() {
		energy -= 20;
		System.out.println(name + "이(가) 신나게 놀았습니다." + "에너지: " + energy + "%");
	}

	void printInfo() {
		System.out.println("이름: " + name + ", " + "나이: " + age + "세, " + "종류: " + type + ", " + "에너지: " + energy + "%");
	}
}
