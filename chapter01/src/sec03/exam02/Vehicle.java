package sec03.exam02;

/* Vehicle 인터페이스를 정의하고, start()와 stop()메서드를 포함하세요.
 * 이를 구현하는 Car와 Bicycle 클래스를 만들고, Car에는 연료 잔량을 확인하는 추가메서드
 * checkFuel()을 포함하세요.
 * 실행클래스 VehicleTest에서 다형성을 활용해 Car와 Bicycle을 작동시키고
 * Car 객체만 연료를 확인하세요(instanceof 사용)
 */

public interface Vehicle {

	// 상수
	public int MAX_CHECKFUEL = 100;
	public int MIN_CHECKFUEL = 0;

	// 추상 메소드
	public void start();

	public void stop();

	public void checkFuel(int fuel);

}
