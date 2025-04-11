package Quiz;

import java.util.ArrayList;

public class StudentManager {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
		// List<Student> list = new ArrayList<>();

		// 리스트에 Student추가
		list.add(new Student("홍길동", 85));
		list.add(new Student("김영희", 92));
		list.add(new Student("이철수", 78));
		list.add(new Student("고길동", 87));

		// 4명 추가하기
		list.add(new Student("이미나", 87));
		list.add(new Student("이연희", 52));
		list.add(new Student("김민수", 76));
		list.add(new Student("박진희", 76));

		// list에 add 된 개수 확인
		System.out.println("등록 학생 수: " + list.size() + "명");

		// 학생 정보와 전체 평균 계산
		double grade = 0;
		for (Student student : list) {
			// toString을 통해 전체 학생 정보 출력
			System.out.println(student);

			// 평균 성적 계산을 위해 score를 받아 grade에 더해주기
			grade += student.getScore();
		}
		// 전체 평균 계산
		double average = (double) grade / list.size();
		System.out.println("전체 성적 평균: " + average);

	}

}
