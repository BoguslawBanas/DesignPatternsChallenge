public class Circle extends Shape{
    private double radius;

    public Circle(Point p, double radius) {
        super(p);
        this.radius = radius;
    }

    public void change_radius(double r){
        radius=r;
    }

    @Override
    public void show() {
        System.out.println("Koło o punkcie: x=" + getP().getX() + ", y=" + getP().getY() + " i promieniu r=" + radius);
    }

    @Override
    public double find_field() {
        return Math.PI*radius*radius;
    }

    @Override
    public double find_circumference() {
        return 2*Math.PI*radius;
    }
}
