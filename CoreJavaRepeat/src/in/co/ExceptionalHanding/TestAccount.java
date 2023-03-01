package in.co.ExceptionalHanding;

public class TestAccount {
	public static void main(String[] args){
		
		AccountException a = new AccountException();
		
		a.setBalance(5000);
		a.deposit(1000);
		//a.withdraw(4500);
		
		System.out.println(a.getBalance());
		try {
			a.withdrawl(5000);
		} catch (AccountExceptionParent e) {
			
			System.out.println("insufficient balance : " + e.getMessage());
		}
	}

}
