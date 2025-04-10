package sec01.exam02;

import java.awt.Toolkit;

/* 기본 쓰레드 생성 및 실행
 * 익명을 사용
 * "안녕하세요!" 라는 메시지를 5번 출력하는 쓰레드(helloThread)를 생성하고 실행하는 프로그램을 작성하세요
 * 메인 쓰레드에서는 helloThread를 동작시키고, "메인 쓰레드 종료!"를 출력합니다.
 */

public class helloThread2 {
	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for (int i = 0; i < 5; i++) {
					toolkit.beep();
					try {
						Thread.sleep(100);
					} catch (Exception e) {
					}
				}
				for (int i = 0; i < 5; i++) {
					System.out.println("안녕하세요!");
					try {
						Thread.sleep(100);
					} catch (Exception e) {
					}
				}
			}
		});

		thread.start();
		System.out.println("메인 쓰레드 종료!");
	}
}