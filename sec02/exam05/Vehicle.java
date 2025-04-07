package sec02.exam05;

/* 차량 관리 시스템
 * 차량(Vehicle 이라는 부모 클래스를 만들고
 * 이를 상속받는 자동차(Car)와 오토바이(Motorcycle) 자식 클래스를 작성
 * 
 * 각 차량은 주행한다(drive)라는 메서드를 가지고
 * 차량마다 다른 방식으로 주행하는 메시지를 출력해야 합니다.
 * 
 * 차량 관리소(VehicleService) 라는 클래스를 만들어 serviceVehicle(Vehicle vehicle) 메서드를 정의하고
 * 이 메서드를 통해 다양한 차량 객체를 받아 주행 동작을 호출하세요
 * 매개변수 다형성을 활용하여 Vehicle 타입 매개변수로 모든 차량 객체를 처리 할 수 있도록 구현하세요
 */

public class Vehicle {
	String type;

	public Vehicle(String type) {
		this.type = type;
	}

	public void drive() {
		System.out.println(type + "이 주행 합니다.");
	}

}
