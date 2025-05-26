package src.main.java;

public class Counter {

	private int count;
	
	public Counter() {
		this.reset();
	}
		
	public void reset() {
		count = 42;
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

	public void increaseBy(int i) {
		if (i < 0) {
			throw new IllegalArgumentException("Value must be non-negative");
		}
		count += i;
	}

	public void decreaseBy(int i) {
		if (i < 0) {
			throw new IllegalArgumentException("Value must be non-negative");
		}
		count -= i;
	}

	public void multiplyBy(int i) {
		if (i < 0) {
			throw new IllegalArgumentException("Value must be non-negative");
		}
		count *= i;
	}
}
