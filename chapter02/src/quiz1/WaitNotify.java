package quiz1;

/* 생산자 - 소비자 문제
 * 생산자(Producer) 쓰레드가 1부터 5까지의 숫자를 하나씩 생성해 공유 변수에 저장
 * 소비자(Consumer) 쓰레드가 그 숫자를 읽어 출력하는 프로그램을 작성
 * 단, 생산자가 값을 생성한 후 소비자가 읽을 때 까지 대기
 * 소비자가 값을 읽은 후 생산자가 다음 값을 생성하도록 wait()와 notify()를 사용해 동기화
 */
public class WaitNotify {
	public static void main(String[] args) {
		// 공유 자원 객체 생성
		SharedResource shared = new SharedResource();

		// 생산자 스레드
		Thread Producer = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 1; i <= 5; i++) {
					try {
						shared.produce(i);
					} catch (InterruptedException e) {
					}
				}
			}
		});
		// 소비자 스레드
		Thread Consumer = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 1; i <= 5; i++) {
					try {
						shared.consume();
					} catch (InterruptedException e) {
					}
				}

			}
		});

		// 스레드 시작
		Producer.start();
		Consumer.start();

	}
}

class SharedResource {
	private int sharedValue = 0;
	private boolean isValue = false;

	// 생산자 메서드
	public synchronized void produce(int value) throws InterruptedException {
		while (isValue) {
			System.out.println("생산자: 값이 이미 존재합니다. 대기 중입니다...");
			wait();
		}
		// 값 생산
		sharedValue = value;
		isValue = true;
		System.out.println("생산자: " + value + "을(를) 생산했습니다.");

		// 소비자에게 알림
		notify();
	}

	// 소비자 메서드
	public synchronized void consume() throws InterruptedException {
		while (!isValue) {
			System.out.println("소비자: 값이 없습니다. 대기 중입니다...");
			wait();
		}
		// 값 소비
		System.out.println("소비자: " + sharedValue + "을(를) 소비했습니다.");
		isValue = false;

		// 생산자에게 알림
		notify();
	}

}
