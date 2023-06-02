public class Square extends Shape{
    private final double length;

    public Square(Point p, double length) {
        super(p);
        this.length = length;
    }

    @Override
    public void show() {
        System.out.println("Kwadrat o punkcie: x=" + getP().getX() + ", y=" + getP().getY() + " i dlugosci boku l=" + length);
    }

    @Override
    public double find_field() {
        return length*length;
    }

    @Override
    public double find_circumference() {
        return 4*length;
    }
}
