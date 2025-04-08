package sec02.exam01;

public class Dog extends Animal implements AnimalSound {

	public Dog(String name, int age) {
		super(name, age);
		
	}

	@Override
	public String makeSound() {
		return "멍멍";
	}
}
