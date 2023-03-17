package in.co.Concurrency_Thread;

public class TestWithThread {
public static void main(String[] args) {
	
	
	
	WithThread w1 = new WithThread("rays_indore");
	
	WithThread w2 = new WithThread("SunilOS");
	
	// Start thread
	w1.start();
	w2.start();
	
	
	
}
}
