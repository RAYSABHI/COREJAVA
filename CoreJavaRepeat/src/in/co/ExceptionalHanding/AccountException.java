package in.co.ExceptionalHanding;

public class AccountException {
	
	private String number;
	private String accountType;
	private double balance;
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public double deposit (double amount) {
		balance = getBalance()+amount;
		return balance;
		
	}
	public void withdrawl (double amount) throws AccountExceptionParent {
		balance = getBalance()-amount;
		
		if (balance<2000) {
			throw new AccountExceptionParent();
			}else {
				System.out.println(balance);
				setBalance(balance);
		}
	}
	public double fundTransfer (double amount) {
	balance = getBalance() - amount;
	return balance;

}
}

