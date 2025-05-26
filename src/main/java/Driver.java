import src.main.java.Counter;

public class Driver {

	public static void main(String[] args) {
		
		Counter counter = new Counter();
		
		System.out.println("Count:" + counter.getCount());
		
		counter.increment();
		
		System.out.println("Count:" + counter.getCount());
		
		counter.decrement();
		
		System.out.println("Count:" + counter.getCount());
		counter.increaseBy(5);
		System.out.println("Count after increase by 5: " + counter.getCount());
		counter.decreaseBy(3);
		System.out.println("Count after decrease by 3: " + counter.getCount());
		counter.multiplyBy(2);
		System.out.println("Count after multiply by 2: " + counter.getCount());
		counter.reset();
		System.out.println("Count after reset: " + counter.getCount());
		
	}

}
