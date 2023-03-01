package in.co.Clonning;

public class Customer11 implements Cloneable{
	
	public String name = null;
	public BankAccount account = null;
	
	public Customer11 (String n) {
		name = n;
		account = new BankAccount(10);
	}
		
		public Object clone() throws CloneNotSupportedException{
			Customer11 c = (Customer11) super.clone();
			c.account = (BankAccount) account.clone();
			return c;
			
			
		}
	}
	


