package in.co.Clonning;

public class TestClonning {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		BankAccount a1 = new BankAccount(10);
		BankAccount a2 = (BankAccount) a1.clone();
		a2.balance = 20;
		System.err.println(a1.balance);
		System.out.println(a2.balance);
		
	}

}
