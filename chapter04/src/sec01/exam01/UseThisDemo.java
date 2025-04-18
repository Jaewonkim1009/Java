package sec01.exam01;

interface UseThis {
	void use();
}

public class UseThisDemo {
	public void lambda() {
		String hi = "HI";

		UseThis u1 = new UseThis() {
			public void use() {
				System.out.println(this); // 익명 구현체의 this 익명 구현체 자기자신
//				hi = hi + "Lambda."; // 람다식의 변수는 외부에서 선언된 변수와 동일한 이름의 변수를 사용못함 
			}
		};
		u1.use();

		UseThis u2 = () -> {
			System.out.println(this); // 람다 this : 람다를 실행한 외부 객체
//			hi = hi + "Lambda.";
		};
		u2.use();
	}

	public String toString() {
		return "UseThisDemo";
	}

	public static void main(String[] args) {
		int one = 1;
		new UseThisDemo().lambda();
//		Comparator<String> c = (one, two) -> one.length() - two.length();
	}

//	
//	람다식 유의 사항
//	람다식 외부에서 선언된 변수와 동일한 이름의 변수를 람다식에서 선언할 수 없다.
//	람다식에 사용된 지역변수는 final이다
//	람다식의 this 키워드는 람다식을 실행한 외부 객체를 의미한다.
}