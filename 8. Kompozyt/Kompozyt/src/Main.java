public class Main {
    public static void main(String[] args) {
        Composite c=new Composite();
        Square s1=new Square(5.0,0.0,2.0);
        Square s2=new Square(10.0,10.0,32.3);
        Circle c1=new Circle(4.2,5.5,8.7);
        Circle c2=new Circle(30.7,4.6,2.3);
        s1.draw();
        c1.move(3.4,67.8);
        System.out.println();
        c.addFigure(s1);
        c.addFigure(s2);
        c.addFigure(c1);
        c.addFigure(c2);
        c.move(10.0,10.0);
        c.draw();
        System.out.println();
        c.removeAllFigures();
        c.draw();
    }
}