package sec03.exam02;

public class Bicycle implements Vehicle {

	@Override
	public void start() {
		System.out.println("자전거가 출발합니다.");

	}

	@Override
	public void stop() {
		System.out.println("자전거가 멈춥니다.");

	}

	@Override
	public void checkFuel(int fuel) {
		// TODO Auto-generated method stub

	}

}
