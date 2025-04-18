package sec01.exam01;

import java.util.Arrays;

class Rectangle {

	private double width;
	private double height;

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public String toString() {
		return String.format("사각형[폭=%d, 높이=%d]", width, height);
	}
}

public class ComparableDemo {

	public static void main(String[] args) {
		Rectangle[] rectangles = { new Rectangle(3, 5), new Rectangle(2, 10), new Rectangle(5, 5) };

		Arrays.sort(rectangles);

		for (Rectangle r : rectangles)
			System.out.println(r);
	}

}
