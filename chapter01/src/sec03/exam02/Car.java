package sec03.exam02;

public class Car implements Vehicle {

	public int fuel;

	@Override
	public void start() {
		System.out.println("자동차가 출발합니다.");

	}

	@Override
	public void stop() {
		System.out.println("자동차가 멈춥니다.");

	}

	@Override
	public void checkFuel(int fuel) {
		if (fuel > Vehicle.MAX_CHECKFUEL) {
			this.fuel = Vehicle.MAX_CHECKFUEL;
		} else if (fuel < Vehicle.MIN_CHECKFUEL) {
			this.fuel = Vehicle.MIN_CHECKFUEL;
		} else {
			this.fuel = fuel;
		}
		System.out.println("남은 연료: " + this.fuel + " %");
	}
}
