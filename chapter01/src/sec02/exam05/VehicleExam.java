package sec02.exam05;

public class VehicleExam {

	public static void main(String[] args) {
		VehicleService vs = new VehicleService();
		Car car = new Car();
		Motorcycle mc = new Motorcycle();
		Vehicle ve = new Vehicle("차량");

		vs.serviceVehicle(ve);
		vs.serviceVehicle(car);
		vs.serviceVehicle(mc);

	}

}
