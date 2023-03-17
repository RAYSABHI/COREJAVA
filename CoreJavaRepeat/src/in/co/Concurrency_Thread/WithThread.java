package in.co.Concurrency_Thread;

public class WithThread extends Thread {

	private String name = null;
	
	public WithThread(String name) {
		this.name = name;
	}
	
	public void run () {
		for (int i =0;i<100;i++) {
			System.out.println(i+ " "+ name);
		}
	}
	
	
	
}
