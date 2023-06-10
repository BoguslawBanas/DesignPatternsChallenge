public class Circle extends Shape {
	public Circle(double x, double y) {
		super(x, y);
	}

	@Override
	public void move(double x, double y) {
		System.out.println("Zmienilem pozycje koła.");
		System.out.println("Nowe koordynaty: x = " + x + ", y = " + y);
	}

	@Override
	public void draw(Visitor v) {
		v.drawCircle(this);
	}
}
