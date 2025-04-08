package sec02.exam01;

public class AnimalTest {

	public static void main(String[] args) {
		Dog dog = new Dog("흰둥이", 5);
		Cat cat = new Cat("치즈", 2);
		
		System.out.println(dog.getName() + " " + dog.getAge() + "살" + "이(가) " + dog.makeSound() + "하고 짖습니다.");
		System.out.println(cat.getName() + " " + cat.getAge() + "살" + "이(가) " + cat.makeSound() + "하고 울고 있습니다.");

	}

}
