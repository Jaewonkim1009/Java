package sec02.exam05;

public class Car extends Vehicle {

	public Car() {
		super("자동차");
	}

	@Override
	public void drive() {
		System.out.println(type + "이(가) 주행 합니다.");
	}

}
