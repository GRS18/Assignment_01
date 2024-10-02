package Assignment_30;

public class BankCall {

	public static void main(String[] args) {
		BankA L = new BankA(1000);
		BankB M = new BankB(1500);
		BankC N = new BankC(2000);

		System.out.println("For Bank A ");
		System.out.println("Balance is : " + L.getBalance());
		System.out.println("After applying interest: " + L.applyInterest());
		System.out.println("==============================================");
		System.out.println("For Bank B ");
		System.out.println("Balance is : " + M.getBalance());
		System.out.println("After applying interest: " + M.applyInterest());
		System.out.println("==============================================");
		System.out.println("For Bank C ");
		System.out.println("Balance is : " + N.getBalance());
		System.out.println("After appyling interest: " + N.applyInterest());
		System.out.println("==============================================");

	}

}
