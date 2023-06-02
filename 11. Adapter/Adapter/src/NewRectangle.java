public class NewRectangle implements Shape{
    private int x;
    private int y;
    private int w;
    private int h;

    public NewRectangle(int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    @Override
    public String toString() {
        return "Naysowalem prostokat: " +
                "x=" + x +
                ", y=" + y +
                ", w=" + w +
                ", h=" + h;
    }

    @Override
    public void draw() {
        System.out.println(this);
    }
}
