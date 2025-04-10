package sec01.exam07;

public class Counter {
	private int count;

	public synchronized void counter() {
		count++;
	}

	public int getCount() {
		return count;
	}

}
