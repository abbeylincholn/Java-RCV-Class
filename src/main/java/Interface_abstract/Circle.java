package Interface_abstract;

public class Circle implements Shapes {

	public static void main(String[] args) {
		Circle c = new Circle();
		c.drawShapes();

	}

	@Override
	public void drawShapes() {

		System.out.println("Draw circle");

	}

	@Override
	public void colorShapes() {

		System.out.println("Coloring circle");

	}

	@Override
	public void moveShapes() {

		System.out.println("Move circle");
	}

}
