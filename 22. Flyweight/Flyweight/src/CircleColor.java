public class CircleColor {
    private Color color;

    public CircleColor(int r, int g, int b) {
        this.color=new Color(r,g,b);
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "CircleColor{" +
                "color=" + color +
                '}';
    }
}
