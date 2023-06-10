public class DrawVisitor implements Visitor {
	@Override
	public void drawCircle(Circle c) {
		System.out.println("Narysowałem koło.");
	}

	@Override
	public void drawRectangle(Rectangle r) {
		System.out.println("Narysowałem prostokąt.");
	}

	@Override
	public void drawTriangle(Triangle t) {
		System.out.println("Narysowałem trójkąt.");
	}
}
