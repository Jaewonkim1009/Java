package sec02.exam04;

public class Shape {

	double length;
	double width;

	public double calculateArea() {
		double result = length * width;
		System.out.println("도형의 면적 = " + result);
		return result;
	}

}
