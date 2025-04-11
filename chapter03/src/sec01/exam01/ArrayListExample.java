package sec01.exam01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

		// list에 String 객체 저장
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("iBATIS");

		// 2에 Python을 넣고 2에있던 값을 리턴
		System.out.println("set() ==> " + list.set(2, "Python"));

		int size = list.size(); // 저장된 총 객체 수 얻기

		System.out.println("총 객체수: " + size);
		System.out.println();

		String skill = list.get(2);
		System.out.println("2: " + skill);
		System.out.println();

		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ": " + str);
		}
		System.out.println();

		System.out.println("list.remove(2)==>" + list.remove(2));
		System.out.println("list.remove(2)==>" + list.remove(2));
		list.remove(2);
		list.remove("iBATIS");

		int index = 0;
		for (String str : list) {
			System.out.println(index + ": " + str);
			index++;
		}
	}

}
