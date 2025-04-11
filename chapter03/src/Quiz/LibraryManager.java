package Quiz;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LibraryManager {
	// Map 컬렉션 생성
	Map<String, String> bookStatus = new HashMap<>();

	public static void main(String[] args) {
		LibraryManager manager = new LibraryManager();

		// 책 추가
		manager.addBook("B001");
		manager.addBook("B002");
		manager.addBook("B003");

		// 책 대여
		manager.rentalBook("B001", "김철수");
		manager.rentalBook("B002", "이영희");
		manager.rentalBook("B003", "홍길동");
		manager.rentalBook("B004", "이미나");

		// 책 반납
		manager.returnBook("B001", "김철수");
		manager.returnBook("B001", "홍길동");
		manager.returnBook("B004", "이미나");

		// 책 대여 현황
		manager.BookStatus();
	}

	// 책 추가
	public void addBook(String bookId) {
		bookStatus.put(bookId, null);
		System.out.println("책 ID " + bookId + " 가 추가되었습니다.");

	}

	// 책 대여
	public void rentalBook(String bookId, String name) {
		Set<String> keySet = bookStatus.keySet();
		Iterator<String> keyIterator = keySet.iterator();

		boolean rent = false;

		while (keyIterator.hasNext()) {
			String book = keyIterator.next();
			String value = bookStatus.get(book);

			if (book.equals(bookId)) {
				rent = true;
				if (value == null) {
					bookStatus.put(book, name);
					System.out.println(book + "이 " + name + "님에게 대여됐습니다.");
				} else {
					System.out.println(book + "은 " + value + "님이 대여 중 입니다.");
				}

			}
		}
		if (!rent) {
			System.out.println("책 ID " + bookId + "는 존재하지 않습니다.");
		}
	}

	// 책 반납
	public void returnBook(String bookId, String name) {
		Set<String> keySet = bookStatus.keySet();
		Iterator<String> keyIterator = keySet.iterator();

		boolean rent = false;

		while (keyIterator.hasNext()) {
			String book = keyIterator.next();
			String value = bookStatus.get(book);

			if (book.equals(bookId)) {
				rent = true;
				if (value != null) {
					bookStatus.put(book, null);
					System.out.println(name + "님이 " + book + "을 반납하였습니다.");
				} else if (value == null) {
					System.out.println(book + "은 대여 중이 아닙니다.");

				}

			}
		}
		if (!rent) {
			System.out.println("책 ID " + bookId + "는 존재하지 않습니다.");
		}
	}

	// 모든 책의 대여 상태를 출력
	public void BookStatus() {
		System.out.println("=== 책 대여 상태 ===");
		Set<Entry<String, String>> entrySet = bookStatus.entrySet(); // Map.Entry set얻기
		Iterator<Map.Entry<String, String>> entryIterator = entrySet.iterator();

		while (entryIterator.hasNext()) {
			Map.Entry<String, String> entry = entryIterator.next();
			String bookId = entry.getKey();
			String name = entry.getValue();

			if (name == null) {
				System.out.println("책 ID " + bookId + " - 대여가능");
			} else {
				System.out.println("책 ID " + bookId + " - 대여 중 (" + name + ")");
			}

		}

	}

}
