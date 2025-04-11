package Quiz;

/* 도서관 책 대여 관리 시스템
 * 도서관에서 책 대여를 관리하려고 한다
 * 각 책은 고유한 ID(String)과 대여 상태(대여자 이름 String, 없으면 null)을 가진다.
 * 1. 책의 ID와 대여 상태를 저장하는 Map을 생성
 * 2. 다음 작업을 수행하는 메서드를 구현
 * - 책을 추가하는 기능: 책 ID와 초기 대여 상태(대여자 없음, null)을 추가
 * - 책을 대여하는 기능: 책 ID와 대여자 이름을 받아 대여 상태를 업데이트, 이미 대여 중이면 대여 불가 메시지 출력
 * - 책을 반납하는 기능: 책 ID를 받아 대여 상태를 null로 변경, 대여 중이 아니면 반납 불가 메시지 출력
 * - 모든 책의 대여 상태를 출력하는 기능: 책 ID와 대여자 또는 "대여 가능" 상태를 출력
 * 3. Map의 적절한 구현체(HashMap, TreeMap 등)을 선택
 */

public class Library {

	public String bookId;
	public String name;

	public Library(String bookId, String name) {
		this.bookId = bookId;
		this.name = name;
	}

	public String getbookId() {
		return bookId;
	}

	public String getName() {
		return name;
	}

}
