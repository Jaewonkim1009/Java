package sec02.exam01;

public class Cat extends Animal implements AnimalSound{

	public Cat(String name, int age) {
		super(name, age);
		
	}
	
	@Override
	public String makeSound() {
		return "야옹";
	}

}
