package sec03.exam02;

/* Shape 인터페이스를 정의하고, calculateArea()와 describe() 메서드를 포함하세요
 * 이를 구현하는 Circle과 Rectangle 클래스를 작성하고, 각 도형의 넓이를 계산(calculateArea())하고
 * 설명 (describe())을 출력
 * Resizeable 인터페이스를 만들어 resize(double factor) 메서드를 정의하고, Rectangle 클래스에만 이를 구현
 * 가로 세로에 각각 factor를 곱함
 * 실행 클래스 ShapeTest에서 다형성을 활용해 배열에 도형을 넣고 꺼내어 도형을 출력
 * 크기 조절이 가능한 도형(Rectangle)만 크기를 변경하세요.
 */
public interface Shape {

	// 추상 메소드
	double calculateArea();

	void describe();

}
