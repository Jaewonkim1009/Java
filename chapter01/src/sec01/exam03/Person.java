package sec01.exam03;

public class Person {

	public String name;
	public int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	void displayInfo() {
		System.out.println("=== 일반인 정보 ===");
		System.out.println("이름: " + name + ", " + "나이: " + age);

	}
}
