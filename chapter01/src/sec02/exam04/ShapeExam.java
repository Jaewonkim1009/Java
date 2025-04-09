package sec02.exam04;

public class ShapeExam {

	public static void main(String[] args) {
		ShapePrinter sp = new ShapePrinter();
		Rectangle rec = new Rectangle(5, 3);
		Circle cir = new Circle(4);

		sp.printArea(rec);
		sp.printArea(cir);

	}

}
