package sec03.exam02;

public class VehicleTest {

	public static void main(String[] args) {

		Vehicle[] vehicles = new Vehicle[2];
		vehicles[0] = new Car();
		vehicles[1] = new Bicycle();

		for (Vehicle v : vehicles) {
			v.start();
			v.stop();
			if (v instanceof Car) {
				((Car) v).checkFuel(50);
			}
		}
	}
}
