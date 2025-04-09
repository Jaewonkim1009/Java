package sec01.exam02;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {
		// Key 객체를 식별키로 사용하여 String 값을 저장하는 HashMap 객체 생성
		// < > : Generics (제네릭)
		// Key는 타입, 값은 String으로 사용
		HashMap<Key, String> hashMap = new HashMap<Key, String>();

		// 식별키 new Key(1)로 "홍길동"을 저장함
		hashMap.put(new Key(1), "홍길동");

//		hashCode() 라는 메소드를 추가하여 필드값의 number를 리턴
//		@Override
//		public int hashCode() {
//			return number;

		// 위 코드를 Class Key에 추가하여 해시코드를 같은 값으로 리턴
		// 식별키 new Key(1)로 "홍길동을 읽어옴
		String value = hashMap.get(new Key(1));
		System.out.println(value);

	}

}
