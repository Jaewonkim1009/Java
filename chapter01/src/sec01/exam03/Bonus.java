package sec01.exam03;

public class Bonus {

	public static void main(String[] args) {

		Employee emp = new Employee();
		emp.info("홍길동", 500000);
		emp.calculateBonus();

		Manager mag = new Manager();
		mag.info("김연희", 600000);
		mag.calculateBonus();
	}

}
