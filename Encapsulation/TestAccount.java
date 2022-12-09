package in.co.Encapsulation;

public class TestAccount {
	public static void main(String[] args) {
		
		Account acc = new Account();
		
		acc.setNumber("123456789");
		acc.setType("saving");
		acc.setBalance(5000.50);
		
		
		String number = acc.getNumber();
		System.out.println(number);
		
		String type = acc.getType();
		System.out.println(type);
		
		
		double balance = acc.getBalance();
		System.out.println(balance);
		
		double deposite = acc.deposit(1000.50);
		System.out.println("amount after deposite :" + deposite);
		
		double withdraw = acc.withdraw(1000.50);
		System.out.println("amount after withdraw :" + withdraw);
		
		acc.fundTransfer("123456789", withdraw);
		
	}

}
