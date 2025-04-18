package sec01.exam01;

@FunctionalInterface
// 제네릭 기반의 함수형 인터페이스
interface Calculate<T> {
	T cal(T a, T b);
}

public class LambdaDemo3 {
	public static void main(String[] args) {
		Calculate<Integer> ci = (a, b) -> a + b;
		System.out.println(ci.cal(4, 3));

		Calculate<Double> cd = (a, b) -> a + b;
		System.out.println(cd.cal(4.32, 3.45));

	}

}
