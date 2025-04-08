package sec03.exam02;

public class Circle implements Shape {

	double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		double circle = (Math.PI * radius * radius);
		return circle;

	}

	@Override
	public void describe() {
		System.out.println("이것은 반지름 " + radius + " 인 원입니다.");
		System.out.println("넓이: " + calculateArea());

	}

}
