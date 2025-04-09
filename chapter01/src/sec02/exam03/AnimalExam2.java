package sec02.exam03;

public class AnimalExam2 {

	public static void main(String[] args) {
		Animal[] animal1 = new Animal[4];
		animal1[0] = new Cat("나비");
		animal1[1] = new Dog("바둑이");
		animal1[2] = new Cat("치즈");
		animal1[3] = new Dog("구름이");

		for (Animal animal2 : animal1) {
			animal2.makeSound();
		}

	}

}
