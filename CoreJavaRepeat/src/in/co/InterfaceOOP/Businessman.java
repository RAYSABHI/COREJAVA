package in.co.InterfaceOOP;

public class Businessman extends Person implements Richman, SocialWorker {

	@Override
	public void helpToOthers() {
		System.out.println("Help others Social");
		
	}

	public void earnMoney() {
		System.out.println("earn money");
		
		
	}

	
	public void donation() {
		System.out.println("donation...");
		
		
	}

	
	public void party() {
		
		System.out.println("Party hard..");
	}

}
