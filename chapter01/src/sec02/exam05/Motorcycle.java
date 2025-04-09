package sec02.exam05;

public class Motorcycle extends Vehicle {

	public Motorcycle() {
		super("오토바이");
	}

	@Override
	public void drive() {
		System.out.println(type + "이(가) 주행 합니다.");
	}
}
