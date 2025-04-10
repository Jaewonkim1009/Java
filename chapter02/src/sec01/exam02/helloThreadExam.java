package sec01.exam02;

public class helloThreadExam {

	public static void main(String[] args) {
		Runnable hello = new helloThread();
		Thread thread = new Thread(hello);
		thread.start();

		System.out.println("메인 쓰레드 종료");

	}

}
