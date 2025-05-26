import src.main.java.Counter;

public class Driver {

	public static void main(String[] args) {
		
		Counter counter = new Counter();
		
		System.out.println("Count:" + counter.getCount());
		
		counter.increment();
		
		System.out.println("Count:" + counter.getCount());
		
		counter.decrement();
		
		System.out.println("Count:" + counter.getCount());
		counter.incrementBy(5);
		System.out.println("Count after incrementing by 5: " + counter.getCount());
		counter.decrementBy(3);
		System.out.println("Count after decrementing by 3: " + counter.getCount());
		counter.reset();

		System.out.println("Count after reset: " + counter.getCount());
		
	}

}
