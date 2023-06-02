public class Rectangle implements Shape{
    private int x;
    private int y;
    private int x1;
    private int y1;

    NewRectangle oldRect=null;

    public Rectangle(int x, int y, int x1, int y1) {
        this.x = x;
        this.y = y;
        this.x1 = x1;
        this.y1 = y1;
    }

    @Override
    public void draw() {
        int w=x1-x;
        int h=y1-y;
        oldRect=new NewRectangle(x,y,w,h);
        oldRect.draw();
    }
}
