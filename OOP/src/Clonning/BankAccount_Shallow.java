package Clonning;

public class BankAccount_Shallow implements Cloneable  {
	
	public double balance = 0;
	public BankAccount_Shallow(double balance) {
		super();
		this.balance = balance;
		
	}
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	
		public static void main(String[] args) throws CloneNotSupportedException {
			BankAccount_Shallow b1 = new BankAccount_Shallow (5000);
		BankAccount_Shallow b2 = (BankAccount_Shallow) b1.clone();
		
		b2.balance = 7000;
		System.out.println(b1.balance);
		System.out.println(b2.balance);
			
		
}
}