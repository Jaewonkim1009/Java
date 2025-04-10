package sec01.exam07;

public class MyThread2 extends Thread {
	private Counter counter;

	public MyThread2(Counter counter) {
		this.counter = counter;
		setName("스레드 2번");
	}

	public void run() {
		for (int i = 0; i < 100; i++) {
			counter.counter();
			System.out.println("스레드 2에서 실행 중 -  스레드 이름: " + getName() + ", " + "스레드 ID: " + getId());
		}
		System.out.println(getName() + "=>" + counter.getCount());
	}

}
