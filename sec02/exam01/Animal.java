package sec02.exam01;

public class Animal {
	private String name;
	private int age;
	
	// 생성자
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// getter
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	// setter
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String makeSound() {
		return "동물이 소리를 냅니다.";
	}

}
