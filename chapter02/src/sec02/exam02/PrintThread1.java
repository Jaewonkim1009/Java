package sec02.exam02;

// 무한 반복 출력 스레드

public class PrintThread1 extends Thread {
	private boolean stop;

	public void setStop(boolean stop) {
		this.stop = stop;
	}

	public void run() {
		// stop이 아닐때 (false) while 반복문
		while (!stop) {
			System.out.println("실행 중");
		}
		// stop이 true가 되면 반복문 종료
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}

}
