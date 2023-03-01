package in.co.overridding;

public class SavingAcc1 extends Acc1 {
	
	public int getAmount () {
		int i = super.getAmount()+10;
		return i;
	}

	
}
