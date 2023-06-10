public class Triangle extends Shape {

	public Triangle(double x, double y) {
		super(x, y);
	}

	@Override
	public void move(double x, double y) {
		System.out.println("Zmienilem pozycje trójkąta.");
		System.out.println("Nowe koordynaty: x = " + x + ", y = " + y);
	}

	@Override
	public void draw(Visitor v) {
		v.drawTriangle(this);
	}
}
