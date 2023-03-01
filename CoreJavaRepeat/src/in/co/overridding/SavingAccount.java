package in.co.overridding;

public class SavingAccount extends Account{

	public int getAmount(String[] args) {
		int total = super.getAmount() +Integer.parseInt(args[0]);
		return total;
	}

}
