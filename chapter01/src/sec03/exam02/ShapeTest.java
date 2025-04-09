package sec03.exam02;

public class ShapeTest {

	public static void main(String[] args) {
		Shape[] shapes = new Shape[2];
		shapes[0] = new Circle(5.0);
		shapes[1] = new Rectangle(4, 3);

		for (Shape shape : shapes) {
			shape.describe();

			if (shape instanceof Resizeable) {
				((Resizeable) shape).resize(3.0);
				shape.describe();
			}
		}

	}

}
