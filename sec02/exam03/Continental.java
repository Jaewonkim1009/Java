package sec02.exam03;

public class Continental extends Tire {
	public Continental(String location, int maxRotation) {
		super(location, maxRotation);
	}

	@Override
	public boolean roll() {
		++accumulatedRotation;
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + " ContinentalTire 수명: " + (maxRotation - accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + " ContinentalTire 펑크 ***");
			return false;
		}
	}
}
