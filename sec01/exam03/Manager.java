package sec01.exam03;

public class Manager extends Employee {

	@Override
	double calculateBonus() {
		double bonus = salary * 0.1;
		System.out.println(name + " 매너지 보너스 : " + bonus + " 원");
		return bonus;
	}
}