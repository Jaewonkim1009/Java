package sec01.exam03;

public class Employee {
	public String name;
	public double salary;

	void info(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	double calculateBonus() {
		double bonus = salary * 0.05;
		System.out.println(name + " 직원 보너스 : " + bonus + " 원");
		return bonus;
	}
}
