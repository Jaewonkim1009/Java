package sec02.exam03;

public class AnimalExam {

	public static void main(String[] args) {

		String[][] data = { { "Dog", "바둑이" }, { "Cat", "나비" }, { "Dog", "구름이" }, { "Cat", "치즈" } };
		Animal[] animals = new Animal[data.length];

		for (int i = 0; i < data.length; i++) {
			String type = data[i][0];
			String name = data[i][1];

			if (type.equals("Dog")) {
				animals[i] = new Dog(name);
			} else if (type.equals("Cat")) {
				animals[i] = new Cat(name);
			}
		}

		for (Animal ani : animals) {
			ani.makeSound();
		}
	}
}
