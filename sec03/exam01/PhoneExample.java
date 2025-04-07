package sec03.exam01;

public class PhoneExample {

	public static void main(String[] args) {
		// Phone phone = new Phone(); 추상 클래스 Phone은 new 불가능
		SmartPhone smartphone = new SmartPhone("홍길동");

		smartphone.turnOn();
		smartphone.turnOff();
		smartphone.internetSearch();

	}

}
