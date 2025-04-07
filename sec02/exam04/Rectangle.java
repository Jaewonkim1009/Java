package sec02.exam04;

public class Rectangle extends Shape {

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	@Override
	public double calculateArea() {
		double result = length * width;
		System.out.println("사각형의 면적 = " + result);
		return result;
	}
}
