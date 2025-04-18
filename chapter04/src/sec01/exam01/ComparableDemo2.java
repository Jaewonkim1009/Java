package sec01.exam01;

import java.util.Arrays;

class Rectangle2 implements Comparable<Rectangle2> {

	private int width;
	private int height;

	public Rectangle2(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public int findArea() {
		return width * height;
	}

	public String toString() {
		return String.format("사각형[폭=%d, 높이=%d]", width, height);
	}

	public int compareTo(Rectangle2 o) {
		return o.findArea() - findArea(); // 디센딩
		// return findArea() - o.findArea(); // 어센딩
	}
}

public class ComparableDemo2 {

	public static void main(String[] args) {
		Rectangle2[] rectangles = { new Rectangle2(3, 5), new Rectangle2(2, 10), new Rectangle2(5, 5) };

		Arrays.sort(rectangles);

		for (Rectangle2 r : rectangles)
			System.out.println(r);
	}

}
