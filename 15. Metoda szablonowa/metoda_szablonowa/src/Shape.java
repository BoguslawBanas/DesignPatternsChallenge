public abstract class Shape {
    private Point p;

    public Shape(Point p) {
        this.p = p;
    }

    public Point getP() {
        return p;
    }

    public void change_position(Point p2){
        p=p2;
    }
    public abstract void show();
    public abstract double find_field();
    public abstract double find_circumference();
}
