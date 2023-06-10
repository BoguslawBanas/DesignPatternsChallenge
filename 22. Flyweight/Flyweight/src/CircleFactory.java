import java.util.ArrayList;

public class CircleFactory {
    private static ArrayList<CircleColor>colors=new ArrayList<>();

    public CircleFactory() {
    }

    public CircleColor getColorFromFactory(int r, int g, int b){
        for(var i : colors){
            if(i.getColor().equals(new Color(r,g,b))){
                System.out.println("Użyłem pyłka.");
                return i;
            }
        }
        return createNewColor(r,g,b);
    }

    private CircleColor createNewColor(int r, int g, int b){
        CircleColor circleColor=new CircleColor(r,g,b);
        colors.add(circleColor);
        return circleColor;
    }
}
