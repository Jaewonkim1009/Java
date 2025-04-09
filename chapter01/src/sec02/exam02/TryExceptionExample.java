package sec02.exam02;

/* Null 참조와 산술 예외 처리
 * 프로그램 실행 시 하나의 args 값을 받아 실행하도록 함.
 * 문자열 배열을 만들고 String 넣기.
 * args[0] 배열의 인덱스를 사용하여 배열에서 꺼내옴
 * 꺼낸 문자열 길이를 가져와, 그 길이를 0으로 나누는 연산을 수행하세요.
 * 배열이 null이거나 인덱스가 범위를 벗어나거나, 0으로 나누는 경우를 예외처리 해보자.
 */

public class TryExceptionExample {

	public static void main(String[] args) {
		String[] str = new String[] { "Apple", "Banana", "Cherry", null, "Grape" };
		try {
			int num = Integer.parseInt(args[0]);
			String strArray = str[num];

			int length = strArray.length();
			int result = length / 0;

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족하거나 범위를 벗어났습니다..");
			return;
		} catch (NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		} catch (NullPointerException e) {
			System.out.println("Null값이 있습니다.");
		} catch (Exception e) {
			System.out.println("알 수 없는 오류가 발생했습니다: " + e.getMessage());
		}
	}
}
