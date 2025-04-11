package sec01.exam03;

/* ArrayList와 LinkedList의 실행 성능 비교
 * Arraylist는 중간 인덱스의 객체를 제거하면 뒤에 있는 객체의 인덱스가 1 씩 앞으로 당겨지기 때문에 
 * 빈번한 객체 삭제 와 삽입이 일어나는 곳에서는 Arraylist보다 Linkedlist가 좋은 성능을 발휘합니다.
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();

		long startTime;
		long endTime;

		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list1.add(0, String.valueOf(i));
		}

		endTime = System.nanoTime();
		System.out.println("ArrayList 걸린시간: " + (endTime - startTime) + " ns");

		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 걸린시간: " + (endTime - startTime) + " ns");

	}

}
