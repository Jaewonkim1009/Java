package sec01.exam03;

public class Account {

	public String accountNumber;
	public int balance;

	public Account(String accountNumber, int balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	double calculateInterest() {
		double interest = balance * 0.01;
		System.out.println("일반 계좌 : " + accountNumber + "이자: " + interest);
		return interest;
	}
}
