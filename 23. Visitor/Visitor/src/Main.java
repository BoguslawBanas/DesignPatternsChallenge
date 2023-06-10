public class Main {
    public static void main(String[] args) {
        Visitor v=new DrawVisitor();
        Shape s1=new Circle(10,20);
        Shape s2=new Rectangle(43.5,23.8);
        Shape s3=new Triangle(100,200);

        s2.move(50,100);

        s1.draw(v);
        s2.draw(v);
        s3.draw(v);
    }
}