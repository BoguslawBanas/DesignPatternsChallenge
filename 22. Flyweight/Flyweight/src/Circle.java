public class Circle {
    private double x;
    private double y;
    private CircleFactory circleFactory;
    private CircleColor color;

    public Circle(double x, double y, int r, int g, int b) {
        this.x = x;
        this.y = y;
        circleFactory=new CircleFactory();
        color=circleFactory.getColorFromFactory(r,g,b);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "x=" + x +
                ", y=" + y +
                ", color=" + color +
                '}';
    }
}
