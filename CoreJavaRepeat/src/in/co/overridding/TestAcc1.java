package in.co.overridding;

public class TestAcc1 {
	public static void main(String[] args) {
		
		SavingAcc1 s = new SavingAcc1();
		Acc1 a = new Acc1();
		Acc1 sa = new SavingAcc1();
		
		System.out.println(s.getAmount());
		
		System.out.println(a.getAmount());
		
		System.out.println(sa.getAmount());
	}

}
