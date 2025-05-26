package src.main.java;

public class Counter {

	private int count;
	
	public Counter() {
		this.reset();
	}
		
	public void reset() {
		count = 0;
	}
	
	public void increment() {
		count++;
	}
	
	public void decrement() {
		count--;
	}
	
	public int getCount() {
		return count;
	}

	public void incrementBy(int i) {
		if (i < 0) {
			throw new IllegalArgumentException("Increment value must be non-negative");
		}
		count += i;
	}

	public void decrementBy(int i) {
		if (i < 0) {
			throw new IllegalArgumentException("Decrement value must be non-negative");
		}
		count -= i;
		if (count < 0) {
			count = 0; // Prevent count from going negative
		}
	}
}
