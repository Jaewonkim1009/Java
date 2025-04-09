package sec02.exam04;

public class Circle extends Shape {
	double radius;

	public Circle(double radius) {
		this.radius = radius;

	}

	@Override
	public double calculateArea() {
		double result = (Math.PI * radius * radius);
		System.out.println("원의 면적 = " + result);
		return result;
	}

}
