package in.co.overridding;

public class TestSavingAccount {
	public static void main(String[] args) {
		
		SavingAccount sa = new SavingAccount();
		
		sa.getAmount(args);
		System.out.println(sa.getAmount(args));
	}

}
