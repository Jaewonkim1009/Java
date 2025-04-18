package sec01.exam01;

// 함수형 인터페이스 (@FunctionalInterface) - 추상 메소드가 딱 하나만 존재하는 인터페이스
@FunctionalInterface
interface Negative {
	int neg(int x);
}

@FunctionalInterface
interface Printable {
	void print();
}

public class LambdaDemo2 {

	public static void main(String[] args) {
		Negative n;

		n = (int x) -> {
			return -x;
		};
		n = (x) -> {
			return -x;
		};
		n = x -> {
			return -x;
		};
		n = (int x) -> -x;
		n = (x) -> -x;
		n = x -> -x;

		Printable p;

		p = () -> {
			System.out.println("안녕!");
		};

		p = () -> System.out.println("안녕!");

		p.print();
	}
}
