public class Rectangle extends Shape {
	public Rectangle(double x, double y) {
		super(x, y);
	}

	@Override
	public void move(double x, double y) {
		System.out.println("Zmienilem pozycje prostokata.");
		System.out.println("Nowe koordynaty: x = " + x + ", y = " + y);
	}

	@Override
	public void draw(Visitor v) {
		v.drawRectangle(this);
	}
}
