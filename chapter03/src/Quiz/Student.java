package Quiz;

/* 학생 성적 관리 시스템
 * 1. Student 클래스
 * - 속성 : name(문자열), score(정수)
 * - 생성자 : 이름과 성적을 초기화
 * - getter : 이름과 성적을 반환
 * - toString() : 객체 정보를 문자열로 반환 (예: "이름: 홍길동, 성적: 85")
 * 2. StudentManager 클래스 (실행 클래스)
 * - ArrayList를 제네릭으로 사용해 Student 객체를 저장
 * - 학생 추가: 새로운 학생을 리스트에 추가
 * - 모든 학생 출력: 리스트에 저장된 모든 학생 정보를 출력
 * - 평균 성적 계산: 모든 학생의 성적 평균을 계산해 출력
 * 3. 메인 메서드
 * - 최소 3명의 학생을 추가하고, 모든 학생 정보와 평균 성적을 출력
 */

public class Student {

	// 속성
	private String name;
	private int score;

	// 생성자
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}

	// getter
	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

	// toSting
	@Override
	public String toString() {
		return "이름: " + name + ", " + "성적: " + score;

	}

}
