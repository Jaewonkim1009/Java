package sec01.exam01;

import java.util.Arrays;

public class LambdaDemo {

	public static void main(String[] args) {
		String[] strings = { "로마에 가면 로마법을 따르라.", "시간은 금이다.", "펜은 칼보다 강하다." };

//		Arrays.sort(strings, new Comparator<String>() {
//			public int compare(String first, String second) {
//				return first.length() - second.length();
//			}
// 람다식을 적용하면 위의 코드가 아래 형식으로 사용 할 수 있다.
// 1. 메소드 이름, 매개변수의 타입은 생략 가능
// 2. 매개변수가 1개이면 괄호 생략가능
// 3. 실행문이 하나라면 중괄호, 세미콜론, return문 생략가능
// 4. return문이 있으면 {} 생략불가.

		Arrays.sort(strings, (first, second) -> first.length() - second.length());

		for (String s : strings)
			System.out.println(s);

	}

}
