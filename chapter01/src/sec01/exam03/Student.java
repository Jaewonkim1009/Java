package sec01.exam03;

public class Student extends Person {
	public String studentId;
	public String major;

	public Student(String name, int age, String studentId, String major) {
		super(name, age);
		this.studentId = studentId;
		this.major = major;
	}

	@Override
	void displayInfo() {
		System.out.println("=== 학생 정보 ===");
		System.out.println("이름: " + name + ", " + "나이: " + age);
		System.out.println("학번: " + studentId + ", " + "전공: " + major);
	}
}
