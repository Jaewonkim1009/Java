package sec01.exam01;

@FunctionalInterface
interface Mathematical {
	double calculate(double d);
}

@FunctionalInterface
interface Pickable {
	char pick(String s, int i);
}

@FunctionalInterface
interface Computable {
	int compute(int x, int y);
}

class Utils {
	int add(int a, int b) {
		return a + b;
	}
}

public class MethodRefDemo {

	public static void main(String[] args) {
		Mathematical m;
		Pickable p;
		Computable c;

		// m = d -> Math.abs(d);
		m = Math::abs; // 정적 메소드 참조
		System.out.println(m.calculate(-50.3));

		// p = (a, b) -> a.charAt(b);
		p = String::charAt;
		System.out.println(p.pick("안녕, 인스턴스 메소드 참조", 5));

		Utils utils = new Utils();
		// c = (a, b) -> utils.add(a, b);
		c = utils::add; // 인스턴스 메소드 참조
		System.out.println(c.compute(20, 30));
	}

}
