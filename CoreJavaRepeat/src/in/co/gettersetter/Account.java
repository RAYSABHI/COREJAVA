package in.co.gettersetter;

public class Account {
	
	private String number;
	private String type;
	private double balance;
	
	
	// getter setter 
	
	public void setNumber(String number) {
		this.number = number;
	}
		public String getNumber() {
			return number;
			
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public double getBalance() {
			return balance;
		}
		public void setBalance(double balance) {
			this.balance = balance;
		}
		public double deposit(double amount) {
			this.balance = this.balance + amount;
			return this.balance;
		}

}
