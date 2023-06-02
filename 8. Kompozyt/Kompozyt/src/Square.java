public class Square implements Figure{
    private double size;
    private Point coordinates;

    public Square(double size, double x, double y) {
        this.size = size;
        this.coordinates=new Point(x,y);
    }

    @Override
    public void move(double x, double y) {
        this.coordinates=new Point(x,y);
        System.out.println("Nowe koordynaty: " + this.coordinates);
    }

    @Override
    public void draw() {
        System.out.println("Narysowalem kwadrat o rozmiarze: " + this.size + " i koordynatach: " + this.coordinates);
    }
}
