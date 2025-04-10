package sec02.exam04;

public class WaitNotify extends Thread {
	int total;

	@Override
	public void run() {
		synchronized (this) {

			for (int i = 1; i <= 100; i++) {
				total += i;
				System.out.println("1부터 100까지의 합계: " + total);
			}
			notify();
		}
	}
}
