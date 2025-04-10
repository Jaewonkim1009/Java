package sec02.exam04;

public class WaitNotifyTest {

	public static void main(String[] args) {
		WaitNotify w = new WaitNotify();
		w.start();
		synchronized (w) {

			try {
				System.out.println("스레드 작업종료 대기");
				w.wait();
			} catch (Exception e) {
				e.printStackTrace();
			}

			System.out.println("총합: " + w.total);
		}
	}
}
