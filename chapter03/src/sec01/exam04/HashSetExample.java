package sec01.exam04;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// String 객체를 중복 없이 저장하는 HashSet

public class HashSetExample {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();

		set.add("Java");
		set.add("JDBC");
		set.add("Servlet / JSP");
		set.add("Java"); // 첫번째 Java와 중복
		set.add("iBATIS");

		int size = set.size();
		System.out.println("총 객체 수: " + size); // Java가 중복되므로 하나만 입력됨

		// 반복자 얻기
		Iterator<String> iterator = set.iterator();

		// 객체 수 만큼 루프
		while (iterator.hasNext()) {
			String element = iterator.next();

			System.out.println("\t" + element);
		}

		// 객체 삭제
		set.remove("JDBC");
		set.remove("iBATIS");

		System.out.println("총 객체 수: " + set.size());

		// 반복자 얻기
		iterator = set.iterator();
		for (String element : set) {
			System.out.println("\t" + element);
		}

		// 모든 객체를 제거하고 비움
		set.clear();
		if (set.isEmpty()) {
			System.out.println("비어 있음");
		}

	}

}
