public class Main {
    public static void main(String[] args) {
        CanvasOfCircles canvasOfCircles=new CanvasOfCircles();
        canvasOfCircles.addCircleToCanvas(new Circle(30,20,10,10,10));
        canvasOfCircles.addCircleToCanvas(new Circle(45.5,23.6,100,200,50));
        canvasOfCircles.addCircleToCanvas(new Circle(56,76,100,200,50));
        canvasOfCircles.addCircleToCanvas(new Circle(78,100.7,10,10,10));

        canvasOfCircles.drawCircles();
    }
}