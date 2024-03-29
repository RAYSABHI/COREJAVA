package in.co.collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueuePriority {
public static void main(String[] args) {
	
	Queue name = new PriorityQueue();
	name.add("123");
	name.add("abc");
	System.out.println(name);
	name.offer("123456"); // for adding element in a queue
	System.out.println(name);

	name.peek();
	System.out.println(name);
	
	// poll remove one by one elements
	name.poll();
	System.out.println(name);
	name.poll();
	System.out.println(name);
	
	// 
	name.offer("ram");
	name.offer("lakhan");
	System.out.println(name);
	name.element();
	System.out.println(name);
	name.remove();
	System.out.println(name);
}
}
