package sec02.exam04;

public class totalExam {

	public static void main(String[] args) {
		totalThread totalthread = new totalThread();
		totalthread.start();

		try {
			totalthread.join();
			System.out.println("스레드 작업종료 대기");
		} catch (Exception e) {
		}

		System.out.println("총합: " + totalthread.total);
	}

}
