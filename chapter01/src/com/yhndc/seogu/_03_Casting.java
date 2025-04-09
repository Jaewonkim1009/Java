package com.yhndc.seogu;

public class _03_Casting {

	public static void main(String[] args) {
		byte x = 10;
		byte y = 20;
		// byte result = x + y; 연산자는 int타입으로 자동 형변환이 되기 때문에 int로 해야한다
		int result = x + y;
		System.out.println(x + "+" + y + "=" + result);

		byte bResult = (byte) (x + y);
		System.out.printf("%2$d + %1$d = %3$d\n", x, y, result); // x = 1, y = 2, result = 3에 대입

		// double 타입과 int 타입의 계산
		int iValue = 10;
		double dValue = 3.14;
		Double dResult = iValue + dValue;
		System.out.println(dResult);

		// double 타입을 int에 대입하는것은 불가하다
		// result = iValue + dValue;
		// 앞에 (int)를 입력해 int로 형변환을 시켜주어 int인 result에 대입을 할 수 있다.
		result = (int) (iValue + dValue);
		System.out.println(result);

		// 함수의 타입을 확인하기
		Object obj = result;
		System.out.println("result의 타입 : " + obj.getClass().getSimpleName());

		// String -> int
		int iX = 10;
		int iY = 20;

		// dResult = iX + iY; (Type mismatch: cannot convert from int to Double)
		dResult = (double) iX + iY;
		System.out.println(dResult);

		long lResult = iX + iY;

		// String str = "150";
		// iX = Integer.parseInt(str); // iX의 타입이 int이기 때문에 Integer를 작성, double이면
		// Double.parsedouble
		result = iX + iY;
		System.out.println(result);

		// String -> byte
		String str2 = "5";
		x = Byte.parseByte(str2);
		result = x + y;
		System.out.println(result);

		// 연산 실습
		int value = 3 + 7;
		System.out.println(value);

		String str = 1 + 2 + "3";
		System.out.println(str); // 1 + 2이 계산되어 3이되고 문자열 3은 뒤에 따라붙음

	}

}
