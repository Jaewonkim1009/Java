package sec01.exam07;

/* 스레드 간 동기화 
 * 두개의 스레드가 공유 변수 count를 각각 100번씩 증가시키는 프로그램을 만들기
 * 단, synchronized를 사용해 스레드 간 경합 조건 (race condition)을 방지
 * Main 스레드에는 스레드의 상태를 출력하는 printThreadInfo()를 추가
 */

public class Main {
	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		System.out.println("메인 스레드에서 실행 중 - 스레드 이름: " + mainThread.getName() + ", " + "스레드 ID: " + mainThread.getId());

		Counter counter = new Counter();
		MyThread1 mythread1 = new MyThread1(counter);
		MyThread2 mythread2 = new MyThread2(counter);

		mythread1.start();
		mythread2.start();

		// 스레드의 작업이 끝날때 까지 기다리는 작업
		try {
			mythread1.join(); // 스레드1이 끝날때 까지 대기
			mythread2.join(); // 스레드2가 끝날때 까지 대기

			// 중간에 스레드가 깨지면 예외 발생가능이 있음
		} catch (Exception e) {
		}

		printThreadInfo(mythread1, mythread2, counter);

	}

	private static void printThreadInfo(MyThread1 mythread1, MyThread2 mythread2, Counter counter) {
//		System.out.println(mythread1.getName());
//		System.out.println(mythread2.getName());
		System.out.println("총 카운트 횟수: " + counter.getCount());
	}

}
