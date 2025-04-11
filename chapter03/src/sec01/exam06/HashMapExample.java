package sec01.exam06;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// 이름을 키, 점수를 값 으로 저장하기

public class HashMapExample {

	public static void main(String[] args) {
		// Map 컬렉션 생성
		Map<String, Integer> map = new HashMap<String, Integer>();

		// 객체 저장
		map.put("신용권", 85);
		map.put("홍길동", 90); // 키가 같기 때문에 마지막에 put으로 저장한 값으로 바뀜
		map.put("동장군", 80);
		map.put("홍길동", 95); //
		System.out.println("총 Entry 수: " + map.size());

		// 객체 찾기
		System.out.println("\t홍길동: " + map.get("홍길동")); // 이름(키) 로 점수(값) 을 검색
		System.out.println();

		// 객체를 하나씩 처리하기
		Set<String> keySet = map.keySet(); // Keyset 얻기

		// 반복해서 키를 얻고 값을 Map에서 얻음
		Iterator<String> keyIterator = keySet.iterator();
		while (keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();

		// 객체 삭제
		map.remove("홍길동"); // 홍길동 객체 삭제
		System.out.println("총 Entry 수: " + map.size());

		// 객체를 하나씩 처리하기
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet(); // Map.Entry set얻기
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();

		while (entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();

		// 객체 전체 삭제
		map.clear();
		System.out.println("총 Entry 수 : " + map.size());
	}

}
