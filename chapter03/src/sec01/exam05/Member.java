package sec01.exam05;

// HashCode와 equals 메소드 재정의

public class Member {
	public String name;
	public int age;

	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// name과 age 값이 같으면 true를 리턴
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member) obj;
			return member.name.equals(name) && (member.age == age);
		} else {
			return false;
		}
	}

	// name과 age 값이 같으면 동일한 hashcode를 리턴
	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}

}
