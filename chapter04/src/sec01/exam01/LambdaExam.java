package sec01.exam01;

public class LambdaExam {

	public static void main(String[] args) {

//		int max(int a, int b) {
//			return a > b ? a : b;
//		}

		(a, b) -> a > b ? a : b;

//		void printVar(String name, int i) {
//			System.out.println(name+"="+i);
//		}

		(name, i) -> System.out.println(name+ "=" + i);

//		int square(int x) {
//			return x * x
//		}
		x -> x * x;

//		int roll() {
//			return (int)(Math.random() * 6);
//		}
		
		() -> (int) (Math.random() * 6);
	}

}
