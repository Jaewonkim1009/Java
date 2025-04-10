package sec02.exam04;

public class totalThread extends Thread {
	int total;

	public void run() {
		for (int i = 1; i <= 100; i++) {
			total += i;
			System.out.println("1부터 100까지의 합계: " + total);
		}
	}

}
