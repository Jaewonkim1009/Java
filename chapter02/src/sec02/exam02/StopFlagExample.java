package sec02.exam02;

public class StopFlagExample {

	public static void main(String[] args) {
		// PrintThread1은 while 반복문으로 true가 될때 빠져나오게 설정함
		PrintThread1 printThread = new PrintThread1();
		printThread.start();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		// sleep 1000이후 true로 바꾸어 반복문 종료
		printThread.setStop(true);

	}

}
