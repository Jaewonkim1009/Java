package sec01.exam03;

public class AnimalTest {

	public static void main(String[] args) {
		AnimalSound[] animalsound = new AnimalSound[2];
		animalsound[0] = new Dog();
		animalsound[1] = new Cat();

		for (AnimalSound animal : animalsound) {
			animal.makeSound();
		}

	}

}
