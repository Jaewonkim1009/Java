package sec01.exam03;

public class AccountExam {

	public static void main(String[] args) {

		Account acc = new Account("123-45-678", 1000000);
		acc.calculateInterest();

		System.out.println();

		VIPAccount vip = new VIPAccount("000-12-345", 1000000);
		vip.calculateInterest();

	}

}
