package in.co.Encapsulation;

public class Account {
	
	private String number;
	private String type;
	private double balance;
	private double deposit;
	private double withdraw;
	
	
	public String getNumber() {
		return number;
	}
		public void setNumber(String number) {
			this.number = number;
		}
		
				
	public String getType() {
		return type;
	}
		public void setType (String type) {
			this.type = type;
		}
		
				
	public double getBalance() {
		return balance;
	}
		public void setBalance (double balance) {
			this.balance = balance;
		}
		
	public double deposit (double balance) {
		this.balance = this.balance + balance;
		return this.balance;
	}
	
	public double withdraw (double withdraw) {
		this.balance = this.balance - withdraw;
		return this.balance;
	}
	
	public void fundTransfer (String accnum, double balance) {
		System.out.println("account number: " + accnum);
		System.out.println("amount is: "+ balance);
		
	}
		
	}
	


