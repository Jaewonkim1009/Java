package sec01.exam07;

import java.util.HashMap;
import java.util.Map;

public class StudentTest {

	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<>();

		map.put(new Student(1, "홍길동"), 95);
		map.put(new Student(2, "김자바"), 70);
		map.put(new Student(1, "홍길동"), 100);

		System.out.println("홍길동의 점수 : " + map.get(new Student(1, "홍길동")));
		System.out.println("김자바의 점수 : " + map.get(new Student(2, "김자바")));

		System.out.println("홍길동이 map에 있는가? " + map.containsKey(new Student(3, "홍길동")));
		System.out.println("김자바가 map에 있는가? " + map.containsKey(new Student(2, "김자바")));

		System.out.println(map.size());
	}

}
