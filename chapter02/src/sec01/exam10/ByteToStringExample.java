package sec01.exam10;

// 바이트 배열을 문장열로 변환
public class ByteToStringExample {

	public static void main(String[] args) {
		// 아스키코드 참고
		byte[] bytes = { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97 };

		String str1 = new String(bytes);
		System.out.println(str1);

		// bytes의 인덱스위치(6), 개수(4)
		String str2 = new String(bytes, 6, 4);
		System.out.println(str2);

	}

}
