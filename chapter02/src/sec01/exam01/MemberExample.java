package sec01.exam01;

public class MemberExample {

	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");

		// 해시코드 확인
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());

		if (obj1.equals(obj2)) {
			System.out.println("obj1과 obj2의 값은 동일합니다.");
		} else {
			System.out.println("obj1과 obj2의 값은 다릅니다.");
		}

		if (obj1.equals(obj3)) {
			System.out.println("obj1과 obj3의 값은 동일합니다.");

		} else {
			System.out.println("obj1과 obj3의 값은 다릅니다.");
		}

		System.out.println(obj1);
		String str = obj1.toString();
		System.out.println(str);

	}

}
