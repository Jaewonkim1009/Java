package sec03.exam02;

public class Rectangle implements Shape, Resizeable {

	double length;
	double width;
	double factor;

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	@Override
	public double calculateArea() {
		double rec = (length * width);
		return rec;
	}

	@Override
	public void describe() {
		System.out.println("이것은 가로 " + length + ", " + "세로 " + width + "인 사각형입니다.");
		System.out.println("넓이: " + calculateArea());

	}

	@Override
	public void resize(double factor) {
		length *= factor;
		width *= factor;
		System.out.println("사각형의 크기가 " + factor + "배로 조절 되었습니다.");

	}

}
