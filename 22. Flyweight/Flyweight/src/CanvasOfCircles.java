import java.util.ArrayList;

public class CanvasOfCircles {
    private ArrayList<Circle> circles;

    public CanvasOfCircles() {
        circles=new ArrayList<>();
    }

    public void addCircleToCanvas(Circle c){
        circles.add(c);
    }

    public void drawCircles(){
        circles.forEach(System.out::println);
    }
}
