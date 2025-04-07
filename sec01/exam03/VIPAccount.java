package sec01.exam03;

public class VIPAccount extends Account {

	int interest2;

	public VIPAccount(String accountNumber, int balance) {
		super(accountNumber, balance);
	}

	@Override
	double calculateInterest() {
		double interest = super.calculateInterest();
		double vipInterest = interest + (balance * 0.05);

		System.out.println("VIP 계좌: " + accountNumber + "이자: " + vipInterest);
		return vipInterest;
	}
}
