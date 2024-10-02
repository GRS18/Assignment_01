package Assignment_30;

public class BankC extends Bank {

	private double balance;

	public BankC(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public double applyInterest() {
		return balance + balance * interest / 100;
	}

}
