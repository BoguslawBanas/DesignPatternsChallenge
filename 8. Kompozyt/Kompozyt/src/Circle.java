public class Circle implements Figure {
    private double radius;
    private Point coordinates;

    public Circle(double radius, double x, double y) {
        this.radius = radius;
        this.coordinates=new Point(x,y);
    }

    @Override
    public void move(double x, double y) {
        this.coordinates=new Point(x,y);
        System.out.println("Nowe koordynaty: " + this.coordinates);
    }

    @Override
    public void draw() {
        System.out.println("Narysowalem kolo o promieniu: " + this.radius + " i koordynatach: " + this.coordinates);
    }
}
