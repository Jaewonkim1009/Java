package sec01.exam02;

public class StudentExample {

	public static void main(String[] args) {
		Student student = new Student("홍길동", "123456-1234567", 1);
		System.out.println("이름: " + student.name);
		System.out.println("주민등록번호: " + student.ssn);
		System.out.println("학생번호: " + student.getStudentNo());

		student.ssn = "123456-2345678";
		System.out.println("주민등록번호: " + student.ssn);
		// student.studentNo = 150; // Private 영역이라 접근이 불가능

		student.setStudentNo(150);
		System.out.println("학생번호: " + student.getStudentNo());
	}
}
