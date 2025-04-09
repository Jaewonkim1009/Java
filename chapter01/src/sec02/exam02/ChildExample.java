package sec02.exam02;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();

		Parent parent = child;
		parent.method1();
		// Override 된 Child의 method2가 호출 됨
		parent.method2();
		// 호출 불가능
		// parent.method3();

		Parent parent1 = new Parent();
		parent1.method1();
		parent1.method2();

		Parent parent2 = child;
		parent2.method1();
		parent2.method2();
		// 호출 불가능
		// parent2.method3();

	}
}
